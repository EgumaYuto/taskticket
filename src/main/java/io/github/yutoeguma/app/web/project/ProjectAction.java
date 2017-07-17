package io.github.yutoeguma.app.web.project;

import javax.annotation.Resource;

import io.github.yutoeguma.app.web.base.TaskticketBaseAction;
import io.github.yutoeguma.dbflute.exbhv.ProjectBhv;
import io.github.yutoeguma.dbflute.exentity.Project;
import org.dbflute.cbean.result.ListResultBean;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;

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
    // --------------------------------------------
    //                                          GET
    //                                          ---
    /**
     * プロジェクトの取得
     */
    @Execute
    public JsonResponse<ProjectListResult> get$index() {
        return asJson(generateProjectBean());
    }

    private ProjectListResult generateProjectBean() {
        return new ProjectListResult(searchAssignedProjectList());
    }

    private ListResultBean<Project> searchAssignedProjectList() {
        return projectBhv.selectList(cb -> {
            cb.orScopeQuery(orCB -> {
                orCB.query().setMemberId_Equal(getUserBean().get().getMemberId());
                orCB.query().existsProjectMember(projectMemberCB -> {
                    projectMemberCB.query().setMemberId_Equal(getUserBean().get().getMemberId());
                    projectMemberCB.query().setDelFlg_Equal_False();
                });
            });
        });
    }

    // --------------------------------------------
    //                                         POST
    //                                         ----
    /**
     * プロジェクトの作成
     */
    @Execute
    public JsonResponse<Void> post$index(ProjectPostBody body) {
        validateApi(body, messages -> {});
        getUserBean().ifPresent(userBean -> {
            Project project = new Project();
            project.setMemberId(userBean.getMemberId());
            project.setProjectName(body.projectName);
            project.setProjectDetail(body.projectDetail);
            projectBhv.insert(project);
        });
        return JsonResponse.asEmptyBody();
    }
}
