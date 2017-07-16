package io.github.yutoeguma.app.web.base.login;

import org.lastaflute.web.validation.Required;

/**
 * @author yuto.eguma
 */
public class LoginResultModel {

    @Required
    public Long memberId;
    @Required
    public String accessToken;

    public LoginResultModel(Long memberId, String accessToken) {
        this.memberId = memberId;
        this.accessToken = accessToken;
    }
}
