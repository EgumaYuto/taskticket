package io.github.yutoeguma.app.web.project;

import org.lastaflute.web.validation.Required;

/**
 * @author yuto.eguma
 */
public class ProjectPostBody {

    @Required
    public String projectName;
    @Required
    public String projectDetail;
}
