package io.github.yutoeguma.app.web.auth.signup;

import javax.annotation.Resource;

import io.github.yutoeguma.app.web.base.TaskticketBaseAction;
import io.github.yutoeguma.app.web.base.login.TaskticketLoginAssist;
import io.github.yutoeguma.dbflute.exbhv.MemberBhv;
import io.github.yutoeguma.dbflute.exentity.Member;
import io.github.yutoeguma.mylasta.action.TaskticketMessages;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.response.JsonResponse;

/**
 * @author yuto.eguma
 */
@AllowAnyoneAccess
public class AuthSignupAction extends TaskticketBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TaskticketLoginAssist loginAssist;
    @Resource
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<Void> post$index(AuthSignupBody form) {
        validate(form, messages -> moreValidate(form, messages), () -> {
            return JsonResponse.asEmptyBody();
        });
        registerMember(form);
        loginAssist.login(createCredential(form), op -> op.rememberMe(true));
        return JsonResponse.asEmptyBody();
    }

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    private void moreValidate(AuthSignupBody form, TaskticketMessages messages) {
        if (loginAssist.checkUserLoginable(createCredential(form))) {
            messages.addErrorsAppDbAlreadyExists("email");
        }
    }

    private UserPasswordCredential createCredential(AuthSignupBody form) {
        return new UserPasswordCredential(form.email, form.password);
    }

    private void registerMember(AuthSignupBody form) {
        insertMember(form);
        // TODO yuto メール送信 (2017/06/15)
    }

    private void insertMember(AuthSignupBody form) {
        Member member = new Member();
        member.setMemberName(form.name);
        member.setPassword(loginAssist.encryptPassword(form.password));
        member.setEmailAddress(form.email);
        member.setMemberStatusCode_Provisional();
        memberBhv.insert(member);
    }
}
