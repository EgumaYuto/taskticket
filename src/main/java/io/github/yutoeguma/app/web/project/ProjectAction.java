package io.github.yutoeguma.app.web.project;

import io.github.yutoeguma.app.web.base.TaskticketBaseAction;
import io.github.yutoeguma.dbflute.exbhv.ProjectBhv;
import io.github.yutoeguma.dbflute.exentity.Project;
import org.dbflute.cbean.result.ListResultBean;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;

import javax.annotation.Resource;

/**
 * @author yuto.eguma
 */
public class ProjectAction extends TaskticketBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private ProjectBhv projectBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<ProjectListResult> get$index() {
        return asJson(generateProjectBean());
    }

    private ProjectListResult generateProjectBean() {
        return new ProjectListResult(searchAssignedProjectList());
    }

    private ListResultBean<Project> searchAssignedProjectList() {
        return projectBhv.selectList(cb -> {
            cb.query().existsProjectMember(projectMemberCB -> {
                projectMemberCB.query().setMemberId_Equal(getUserBean().get().getMemberId());
                projectMemberCB.query().setDelFlg_Equal_False();
            });
        });
    }
}
