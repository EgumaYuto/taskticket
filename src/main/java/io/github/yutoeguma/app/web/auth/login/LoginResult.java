package io.github.yutoeguma.app.web.auth.login;

import org.lastaflute.web.validation.Required;

/**
 * @author yuto.eguma
 */
public class LoginResult {

    @Required
    public Long memberId;
    @Required
    public String accessToken;

    public LoginResult(Long memberId, String accessToken) {
        this.memberId = memberId;
        this.accessToken = accessToken;
    }
}
