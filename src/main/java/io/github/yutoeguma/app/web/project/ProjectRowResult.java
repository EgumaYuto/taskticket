package io.github.yutoeguma.app.web.project;

import javax.validation.Valid;

import io.github.yutoeguma.dbflute.exentity.Project;
import org.lastaflute.web.validation.Required;

/**
 * @author yuto.eguma
 */
public class ProjectRowResult {

    @Valid
    @Required
    public Long projectId;
    @Valid
    @Required
    public String projectName;
    @Valid
    public String projectDetail;

    public ProjectRowResult(Project project) {
        this.projectId = project.getProjectId();
        this.projectName = project.getProjectName();
        this.projectDetail = project.getProjectDetail();
    }
}
