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
package io.github.yutoeguma.app.web.auth.login;

import javax.annotation.Resource;

import io.github.yutoeguma.app.web.base.TaskticketBaseAction;
import io.github.yutoeguma.app.web.base.login.TaskticketLoginAssist;
import io.github.yutoeguma.mylasta.action.TaskticketMessages;
import org.lastaflute.core.util.LaStringUtil;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.response.JsonResponse;

/**
 * @author cabos
 */
@AllowAnyoneAccess
public class AuthLoginAction extends TaskticketBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TaskticketLoginAssist loginAssist;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<LoginResult> post$index(AuthLoginBody form) {
        validateApi(form, messages -> moreValidate(form, messages));
        LoginResult result = loginAssist.login(createCredential(form));
        return asJson(result);
    }

    @Execute
    public JsonResponse<LoginCheckResult> check() {
        LoginCheckResult result = new LoginCheckResult();
        result.isLogin = loginAssist.getSavedUserBean().isPresent();
        return asJson(result);
    }

    // ===================================================================================
    //                                                                          Validation
    //                                                                          ==========
    private void moreValidate(AuthLoginBody form, TaskticketMessages messages) {
        if (LaStringUtil.isNotEmpty(form.email) && LaStringUtil.isNotEmpty(form.password)) {
            if (!loginAssist.checkUserLoginable(createCredential(form))) {
                messages.addErrorsLoginFailure("email");
            }
        }
    }

    private UserPasswordCredential createCredential(AuthLoginBody form) {
        return new UserPasswordCredential(form.email, form.password);
    }
}