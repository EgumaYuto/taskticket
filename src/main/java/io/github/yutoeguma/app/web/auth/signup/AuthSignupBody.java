package io.github.yutoeguma.app.web.auth.signup;

import org.hibernate.validator.constraints.Length;
import org.lastaflute.web.validation.Required;

/**
 * @author yuto.eguma
 */
public class AuthSignupBody {

    @Required
    public String email;
    @Required
    public String name;
    @Required
    @Length(min = 7)
    public String password;
}
