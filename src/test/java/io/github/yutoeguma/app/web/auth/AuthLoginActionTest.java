package io.github.yutoeguma.app.web.auth;

import io.github.yutoeguma.unit.UnitTaskticketTestCase;

/**
 * FIX_ME
 *
 * @author cabos
 */
public class AuthLoginActionTest extends UnitTaskticketTestCase {

    //    public void test_signin_success() {
    //        // ## Arrange ##
    //        AuthLoginAction action = new AuthLoginAction();
    //        inject(action);
    //        AuthLoginBody form = new AuthLoginBody();
    //        form.email = "touyumague@gmail.com";
    //        form.password = "password";
    //
    //        // ## Act ##
    //        HtmlResponse response = action.post$index(form);
    //
    //        // ## Assert ##
    //        TestingHtmlData htmlData = validateHtmlData(response);
    //        htmlData.assertRedirect(MypageAction.class);
    //    }
    //
    //    public void test_signin_validationError_required() {
    //        // ## Arrange ##
    //        AuthLoginAction action = new AuthLoginAction();
    //        inject(action);
    //        AuthLoginBody form = new AuthLoginBody();
    //
    //        // ## Act ##
    //        // ## Assert ##
    //        assertValidationError(() -> action.login(form)).handle(data -> {
    //            data.requiredMessageOf("email", Required.class);
    //            data.requiredMessageOf("password", Required.class);
    //            TestingHtmlData htmlData = validateHtmlData(data.hookError());
    //            htmlData.assertHtmlForward(TaskticketHtmlPath.path_Login_LoginHtml);
    //        });
    //    }
    //
    //    public void test_signin_validationError_loginFailure() {
    //        // ## Arrange ##
    //        AuthLoginAction action = new AuthLoginAction();
    //        inject(action);
    //        AuthLoginBody form = new AuthLoginBody();
    //        form.email = "touyumague@gmail.com";
    //        form.password = "land";
    //
    //        // ## Act ##
    //        // ## Assert ##
    //        assertValidationError(() -> action.login(form)).handle(data -> {
    //            data.requiredMessageOf("email", TaskticketMessages.ERRORS_LOGIN_FAILURE);
    //            TestingHtmlData htmlData = validateHtmlData(data.hookError());
    //            htmlData.assertHtmlForward(TaskticketHtmlPath.path_Login_LoginHtml);
    //        });
    //    }
}
