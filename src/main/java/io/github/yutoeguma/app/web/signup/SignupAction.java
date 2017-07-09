package io.github.yutoeguma.app.web.signup;

import io.github.yutoeguma.app.web.base.TaskticketBaseAction;
import io.github.yutoeguma.app.web.base.login.TaskticketLoginAssist;
import io.github.yutoeguma.app.web.mypage.MypageAction;
import io.github.yutoeguma.dbflute.exbhv.MemberBhv;
import io.github.yutoeguma.dbflute.exentity.Member;
import io.github.yutoeguma.mylasta.action.TaskticketMessages;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.response.HtmlResponse;

import javax.annotation.Resource;

/**
 * @author yuto.eguma
 */
@AllowAnyoneAccess
public class SignupAction extends TaskticketBaseAction {

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
    public HtmlResponse post$index(SignupForm form) {
        validate(form, messages -> moreValidate(form, messages), () -> {
            return asHtml(path_IndexHtml);
        });
        registerMember(form);
        return loginAssist.loginRedirect(createCredential(form), op -> op.rememberMe(true), () -> {
            return redirect(MypageAction.class);
        });
    }

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    private void moreValidate(SignupForm form, TaskticketMessages messages) {
        if (loginAssist.checkUserLoginable(createCredential(form))) {
            messages.addErrorsAppDbAlreadyExists("email");
        }
    }

    private UserPasswordCredential createCredential(SignupForm form) {
        return new UserPasswordCredential(form.email, form.password);
    }

    private void registerMember(SignupForm form) {
        insertMember(form);
        // TODO yuto メール送信 (2017/06/15)
    }

    private void insertMember(SignupForm form) {
        Member member = new Member();
        member.setMemberName(form.name);
        member.setPassword(loginAssist.encryptPassword(form.password));
        member.setEmailAddress(form.email);
        member.setMemberStatusCode_Provisional();
        memberBhv.insert(member);
    }
}
