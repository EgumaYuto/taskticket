package io.github.yutoeguma.app.web.project;

import io.github.yutoeguma.dbflute.exentity.Project;
import org.dbflute.cbean.result.ListResultBean;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author yuto.eguma
 */
public class ProjectListResult {

    @Valid
    @NotNull
    public ListResultBean<ProjectRowResult> projectList;

    public ProjectListResult(ListResultBean<Project> projectList) {
        this.projectList = projectList.mappingList(ProjectRowResult::new);
    }
}
