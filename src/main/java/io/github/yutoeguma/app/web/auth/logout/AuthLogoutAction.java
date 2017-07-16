package io.github.yutoeguma.app.web.auth.logout;

import javax.annotation.Resource;

import io.github.yutoeguma.app.web.base.TaskticketBaseAction;
import io.github.yutoeguma.app.web.base.login.TaskticketLoginAssist;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;

/**
 * @author yuto.eguma
 */
public class AuthLogoutAction extends TaskticketBaseAction {

    @Resource
    private TaskticketLoginAssist loginAssist;

    @Execute
    public JsonResponse<Void> index() {
        loginAssist.logout();
        return JsonResponse.asEmptyBody();
    }
}
