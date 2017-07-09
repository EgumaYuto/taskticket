package io.github.yutoeguma.app.web.auth;

import io.github.yutoeguma.app.web.login.LoginAction;
import io.github.yutoeguma.app.web.login.LoginForm;
import org.dbflute.utflute.lastaflute.mock.TestingHtmlData;
import io.github.yutoeguma.app.web.mypage.MypageAction;
import io.github.yutoeguma.mylasta.action.TaskticketHtmlPath;
import io.github.yutoeguma.mylasta.action.TaskticketMessages;
import io.github.yutoeguma.unit.UnitTaskticketTestCase;
import org.lastaflute.web.response.HtmlResponse;
import org.lastaflute.web.validation.Required;

/**
 * @author jflute
 */
public class LoginActionTest extends UnitTaskticketTestCase {

    public void test_signin_success() {
        // ## Arrange ##
        LoginAction action = new LoginAction();
        inject(action);
        LoginForm form = new LoginForm();
        form.email = "touyumague@gmail.com";
        form.password = "password";

        // ## Act ##
        HtmlResponse response = action.doLogin(form);

        // ## Assert ##
        TestingHtmlData htmlData = validateHtmlData(response);
        htmlData.assertRedirect(MypageAction.class);
    }

    public void test_signin_validationError_required() {
        // ## Arrange ##
        LoginAction action = new LoginAction();
        inject(action);
        LoginForm form = new LoginForm();

        // ## Act ##
        // ## Assert ##
        assertValidationError(() -> action.doLogin(form)).handle(data -> {
            data.requiredMessageOf("email", Required.class);
            data.requiredMessageOf("password", Required.class);
            TestingHtmlData htmlData = validateHtmlData(data.hookError());
            htmlData.assertHtmlForward(TaskticketHtmlPath.path_Login_LoginHtml);
        });
    }

    public void test_signin_validationError_loginFailure() {
        // ## Arrange ##
        LoginAction action = new LoginAction();
        inject(action);
        LoginForm form = new LoginForm();
        form.email = "touyumague@gmail.com";
        form.password = "land";

        // ## Act ##
        // ## Assert ##
        assertValidationError(() -> action.doLogin(form)).handle(data -> {
            data.requiredMessageOf("email", TaskticketMessages.ERRORS_LOGIN_FAILURE);
            TestingHtmlData htmlData = validateHtmlData(data.hookError());
            htmlData.assertHtmlForward(TaskticketHtmlPath.path_Login_LoginHtml);
        });
    }
}
