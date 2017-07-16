/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package io.github.yutoeguma.app.web.base.login;

import javax.annotation.Resource;

import io.github.yutoeguma.app.web.auth.login.AuthLoginAction;
import io.github.yutoeguma.dbflute.cbean.MemberCB;
import io.github.yutoeguma.dbflute.exbhv.MemberBhv;
import io.github.yutoeguma.dbflute.exentity.Member;
import io.github.yutoeguma.mylasta.action.TaskticketUserBean;
import io.github.yutoeguma.mylasta.direction.TaskticketConfig;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.magic.async.AsyncManager;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.web.login.LoginHandlingResource;
import org.lastaflute.web.login.PrimaryLoginManager;
import org.lastaflute.web.login.TypicalLoginAssist;
import org.lastaflute.web.login.credential.LoginCredential;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.login.exception.LoginFailureException;
import org.lastaflute.web.login.option.LoginSpecifiedOption;
import org.lastaflute.web.servlet.request.RequestManager;

/**
 * @author jflute
 * @author cabos
 */
public class TaskticketLoginAssist extends TypicalLoginAssist<Long, TaskticketUserBean, Member> implements PrimaryLoginManager {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private AsyncManager asyncManager;
    @Resource
    private RequestManager requestManager;
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private TaskticketConfig config;
    @Resource
    private MemberBhv memberBhv;
    @Resource
    private AuthInfoLogic authInfoLogic;

    // ===================================================================================
    //                                                                           Find IUser
    //                                                                           =========
    @Override
    protected void checkCredential(CredentialChecker checker) {
        checker.check(UserPasswordCredential.class, credential -> {
            return memberBhv.selectCount(cb -> arrangeLoginByCredential(cb, credential)) > 0;
        });
    }

    @Override
    protected void resolveCredential(CredentialResolver resolver) {
        resolver.resolve(UserPasswordCredential.class, credential -> {
            return memberBhv.selectEntity(cb -> arrangeLoginByCredential(cb, credential));
        });
    }

    private void arrangeLoginByCredential(MemberCB cb, UserPasswordCredential credential) {
        cb.query().arrangeLogin(credential.getUser(), encryptPassword(credential.getPassword()));
    }

    @Override
    protected OptionalEntity<Member> doFindLoginUser(Long userId) {
        return memberBhv.selectEntity(cb -> cb.query().arrangeLoginByIdentity(userId));
    }

    // ===================================================================================
    //                                                                      Login Resource
    //                                                                      ==============
    @Override
    protected Class<TaskticketUserBean> getUserBeanType() {
        return TaskticketUserBean.class;
    }

    @Override
    protected Class<?> getLoginActionType() {
        return AuthLoginAction.class;
    }

    // ===================================================================================
    //                                                                       Login Process
    //                                                                       =============
    // TODO yuto Model クラスを作って返す (これが、jsonの戻り値と同じクラスなのがちょっと...) (2017/07/16)
    public LoginResultModel login(LoginCredential credential) throws LoginFailureException {
        return handleLoginSuccess(findLoginUser(credential).orElseThrow(() -> {
            final String msg = "Not found the user by the credential: " + credential;
            return handleLoginFailure(msg, credential, OptionalThing.empty());
        }));
    }

    protected LoginResultModel handleLoginSuccess(Member userEntity) {
        assertUserEntityRequired(userEntity);
        final TaskticketUserBean userBean = createUserBean(userEntity);
        String accessToken = provideAndRegisterAccessToken(userBean);
        return new LoginResultModel(userBean.getMemberId(), accessToken);
    }

    private String provideAndRegisterAccessToken(TaskticketUserBean userBean) {
        return authInfoLogic.registerAccessTokenIfNeeds(userBean.getMemberId());
    }

    @Override
    protected TaskticketUserBean createUserBean(Member userEntity) {
        return new TaskticketUserBean(userEntity);
    }

    @Override
    protected Long toTypedUserId(String userKey) {
        return Long.valueOf(userKey);
    }

    @Override
    protected OptionalThing<String> getCookieRememberMeKey() {
        return OptionalThing.of(config.getCookieRememberMeTaskticketKey());
    }

    @Override
    protected boolean doTryAlreadyLogin(LoginHandlingResource resource) {
        return requestManager.getHeader("Authorization").map(auth -> {
            return authInfoLogic.getSavedUserBean(auth).isPresent();
        }).orElse(false);
    }

    @Override
    protected void saveLoginHistory(Member member, TaskticketUserBean userBean, LoginSpecifiedOption option) {
        asyncManager.async(() -> {
            transactionStage.requiresNew(tx -> {
                // do nothing
            });
        });
    }

    // ===================================================================================
    //                                                                  User Bean Accessor
    //                                                                  ==================
    @Override
    public OptionalThing<TaskticketUserBean> getSavedUserBean() { // use covariant generic type
        return requestManager.getHeader("Authorization").flatMap(token -> {
            return authInfoLogic.getSavedUserBean(token);
        });
    }
}
