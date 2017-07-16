package io.github.yutoeguma.app.web.auth.signup;

import io.github.yutoeguma.app.web.base.login.LoginResultModel;
import org.lastaflute.web.validation.Required;

/**
 * @author yuto.eguma
 */
public class SignupResult {

    @Required
    public Long memberId;
    @Required
    public String accessToken;

    public SignupResult(LoginResultModel model) {
        this.memberId = model.memberId;
        this.accessToken = model.accessToken;
    }
}
