package io.github.yutoeguma.app.web.logout;

import io.github.yutoeguma.app.web.base.TaskticketBaseAction;
import io.github.yutoeguma.app.web.base.login.TaskticketLoginAssist;
import io.github.yutoeguma.app.web.login.LoginAction;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

import javax.annotation.Resource;

/**
 * @author yuto.eguma
 */
public class LogoutAction extends TaskticketBaseAction {

    @Resource
    private TaskticketLoginAssist loginAssist;

    @Execute
    public HtmlResponse index() {
        loginAssist.logout();
        return redirect(LoginAction.class);
    }
}
