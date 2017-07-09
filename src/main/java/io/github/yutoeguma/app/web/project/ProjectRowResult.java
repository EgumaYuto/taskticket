package io.github.yutoeguma.app.web.project;

import io.github.yutoeguma.dbflute.exentity.Project;
import org.lastaflute.web.validation.Required;

import javax.validation.Valid;

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

    public ProjectRowResult(Project project) {
        this.projectId = project.getProjectId();
        this.projectName = project.getProjectName();
    }
}
