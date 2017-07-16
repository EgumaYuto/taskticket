/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package io.github.yutoeguma.app.web.base;

import javax.annotation.Resource;

import io.github.yutoeguma.app.logic.context.AccessContextLogic;
import io.github.yutoeguma.app.web.base.login.TaskticketLoginAssist;
import io.github.yutoeguma.app.web.base.view.HeaderBean;
import io.github.yutoeguma.mylasta.action.TaskticketHtmlPath;
import io.github.yutoeguma.mylasta.action.TaskticketMessages;
import io.github.yutoeguma.mylasta.action.TaskticketUserBean;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.db.dbflute.accesscontext.AccessContextArranger;
import org.lastaflute.web.TypicalAction;
import org.lastaflute.web.login.LoginManager;
import org.lastaflute.web.response.ActionResponse;
import org.lastaflute.web.ruts.process.ActionRuntime;
import org.lastaflute.web.token.DoubleSubmitManager;
import org.lastaflute.web.validation.ActionValidator;
import org.lastaflute.web.validation.LaValidatable;

/**
 * @author jflute
 */
public abstract class TaskticketBaseAction extends TypicalAction // has several interfaces for direct use
        implements LaValidatable<TaskticketMessages>, TaskticketHtmlPath {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The application type */
    protected static final String APP_TYPE = "API";

    /** The user type for Member */
    protected static final String USER_TYPE = "M";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private DoubleSubmitManager doubleSubmitManager;
    @Resource
    private AccessContextLogic accessContextLogic;
    @Resource
    private TaskticketLoginAssist loginAssist;

    // ===================================================================================
    //                                                                               Hook
    //                                                                              ======
    // to suppress unexpected override by sub-class
    @Override
    public final ActionResponse godHandPrologue(ActionRuntime runtime) {
        return super.godHandPrologue(runtime);
    }

    @Override
    public final ActionResponse godHandMonologue(ActionRuntime runtime) {
        return super.godHandMonologue(runtime);
    }

    @Override
    public final void godHandEpilogue(ActionRuntime runtime) {
        super.godHandEpilogue(runtime);
    }

    // #app_customize you can customize the action hook
    @Override
    public ActionResponse hookBefore(ActionRuntime runtime) { // application may override
        return super.hookBefore(runtime);
    }

    @Override
    public void hookFinally(ActionRuntime runtime) { // application may override
        if (runtime.isForwardToHtml()) { // #delete_ifapi
            runtime.registerData("headerBean", getUserBean().map(userBean -> {
                return new HeaderBean(userBean);
            }).orElse(HeaderBean.empty()));
        }
        super.hookFinally(runtime);
    }

    // ===================================================================================
    //                                                                      Access Context
    //                                                                      ==============
    @Override
    protected AccessContextArranger newAccessContextArranger() { // for framework
        return resource -> {
            return accessContextLogic.create(resource, () -> myUserType(), () -> getUserBean().map(userBean -> {
                return userBean.getUserId(); // as user expression
            }), () -> myAppType());
        };
    }

    // ===================================================================================
    //                                                                           IUser Info
    //                                                                           =========
    // -----------------------------------------------------
    //                                      Application Info
    //                                      ----------------
    @Override
    protected String myAppType() { // for framework
        return APP_TYPE;
    }

    // -----------------------------------------------------
    //                                            Login Info
    //                                            ----------
    // #app_customize return empty if login is unused
    @Override
    protected OptionalThing<TaskticketUserBean> getUserBean() { // application may call, overriding for co-variant
        return loginAssist.getSavedUserBean();
    }

    @Override
    protected OptionalThing<String> myUserType() { // for framework
        return OptionalThing.of(USER_TYPE);
    }

    @Override
    protected OptionalThing<LoginManager> myLoginManager() { // for framework
        return OptionalThing.of(loginAssist);
    }

    // ===================================================================================
    //                                                                          Validation
    //                                                                          ==========
    @SuppressWarnings("unchecked")
    @Override
    public ActionValidator<TaskticketMessages> createValidator() { // for co-variant
        return super.createValidator();
    }

    @Override
    public TaskticketMessages createMessages() { // application may call
        return new TaskticketMessages(); // overriding to change return type to concrete-class
    }

    // ===================================================================================
    //                                                                            Document
    //                                                                            ========
    // #app_customize you should override javadoc when you add new methods for sub class at super class.
    ///**
    // * {@inheritDoc} <br>
    // * Application Native Methods:
    // * <pre>
    // * <span style="font-size: 130%; color: #553000">[xxx]</span>
    // * o xxx() <span style="color: #3F7E5E">// xxx</span>
    // * </pre>
    // */
    //@Override
    //public void document1_CallableSuperMethod() {
    //    super.document1_CallableSuperMethod();
    //}
}
