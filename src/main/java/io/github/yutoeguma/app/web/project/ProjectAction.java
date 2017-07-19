package io.github.yutoeguma.app.web.project;

import javax.annotation.Resource;

import io.github.yutoeguma.app.web.base.TaskticketBaseAction;
import io.github.yutoeguma.dbflute.exbhv.ProjectBhv;
import io.github.yutoeguma.dbflute.exentity.Project;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;
import org.lastaflute.web.validation.Required;

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
    public JsonResponse<ProjectRowResult> get$index(@Required Long projectId) {
        OptionalEntity<ProjectRowResult> optBean = generateOptProjectBean(projectId);
        if (optBean.isPresent()) {
            return asJson(optBean.get());
        }
        throwValidationErrorApi(messages -> {});
        return JsonResponse.asEmptyBody(); // dummy path
    }

    private OptionalEntity<ProjectRowResult> generateOptProjectBean(Long projectId) {
        return findProject(projectId).map(project -> {
            return new ProjectRowResult(project);
        });
    }

    private OptionalEntity<Project> findProject(Long projectId) {
        return projectBhv.selectEntity(cb -> {
            cb.query().setProjectId_Equal(projectId);
            cb.arrangeApprovalProject(getUserBean().get().getMemberId());
        });
    }

    /**
     * プロジェクトの取得 (リスト)
     */
    @Execute
    public JsonResponse<ProjectListResult> get$list() {
        return asJson(generateProjectListBean());
    }

    private ProjectListResult generateProjectListBean() {
        return new ProjectListResult(searchAssignedProjectList());
    }

    private ListResultBean<Project> searchAssignedProjectList() {
        return projectBhv.selectList(cb -> {
            cb.arrangeApprovalProject(getUserBean().get().getMemberId());
        });
    }

    // --------------------------------------------
    //                                         POST
    //                                         ----
    /**
     * プロジェクトの作成
     */
    @Execute
    public JsonResponse<ProjectRowResult> post$index(ProjectPostBody body) {
        validateApi(body, messages -> {});
        Project project = new Project();
        project.setMemberId(getUserBean().get().getMemberId());
        project.setProjectName(body.projectName);
        project.setProjectDetail(body.projectDetail);
        projectBhv.insert(project);
        return asJson(new ProjectRowResult(project));
    }
}
