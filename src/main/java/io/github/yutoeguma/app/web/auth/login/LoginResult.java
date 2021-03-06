package io.github.yutoeguma.app.web.auth.login;

import io.github.yutoeguma.app.web.base.login.LoginResultModel;
import org.lastaflute.web.validation.Required;

/**
 * @author yuto.eguma
 */
public class LoginResult {

    @Required
    public Long memberId;
    @Required
    public String accessToken;

    public LoginResult(LoginResultModel model) {
        this.memberId = model.memberId;
        this.accessToken = model.accessToken;
    }
}