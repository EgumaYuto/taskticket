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
package io.github.yutoeguma.mylasta.direction;

import javax.annotation.Resource;

import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketActionAdjustmentProvider;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketApiFailureHook;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketCookieResourceProvider;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketCurtainBeforeHook;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketJsonResourceProvider;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketListedClassificationProvider;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketMailDeliveryDepartmentCreator;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketMultipartRequestHandler;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketSecurityResourceProvider;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketTimeResourceProvider;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketUserLocaleProcessProvider;
import io.github.yutoeguma.mylasta.direction.sponsor.TaskticketUserTimeZoneProcessProvider;
import org.lastaflute.core.direction.CachedFwAssistantDirector;
import org.lastaflute.core.direction.CurtainBeforeHook;
import org.lastaflute.core.direction.FwAssistDirection;
import org.lastaflute.core.direction.FwCoreDirection;
import org.lastaflute.core.json.JsonResourceProvider;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.core.security.OneWayCryptographer;
import org.lastaflute.core.security.SecurityResourceProvider;
import org.lastaflute.core.time.TimeResourceProvider;
import org.lastaflute.db.dbflute.classification.ListedClassificationProvider;
import org.lastaflute.db.direction.FwDbDirection;
import org.lastaflute.thymeleaf.ThymeleafRenderingProvider;
import org.lastaflute.web.api.ApiFailureHook;
import org.lastaflute.web.direction.FwWebDirection;
import org.lastaflute.web.path.ActionAdjustmentProvider;
import org.lastaflute.web.ruts.multipart.MultipartResourceProvider;
import org.lastaflute.web.ruts.renderer.HtmlRenderingProvider;
import org.lastaflute.web.servlet.cookie.CookieResourceProvider;
import org.lastaflute.web.servlet.request.UserLocaleProcessProvider;
import org.lastaflute.web.servlet.request.UserTimeZoneProcessProvider;

/**
 * @author jflute
 * @author cabos
 */
public class TaskticketFwAssistantDirector extends CachedFwAssistantDirector {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** secret key */
    private static final String SECRET_KEY = "12345678901$3456";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TaskticketConfig config;

    // ===================================================================================
    //                                                                              Assist
    //                                                                              ======
    @Override
    protected void prepareAssistDirection(FwAssistDirection direction) {
        direction.directConfig(nameList -> nameList.add("taskticket_config.properties"), "taskticket_env.properties");
    }

    // ===================================================================================
    //                                                                               Core
    //                                                                              ======
    @Override
    protected void prepareCoreDirection(FwCoreDirection direction) {
        // this configuration is on taskticket_env.properties because this is true only when development
        direction.directDevelopmentHere(config.isDevelopmentHere());

        // titles of the application for logging are from configurations
        direction.directLoggingTitle(config.getDomainTitle(), config.getEnvironmentTitle());

        // this configuration is on sea_env.properties because it has no influence to production
        // even if you set true manually and forget to set false back
        direction.directFrameworkDebug(config.isFrameworkDebug()); // basically false

        // you can add your own process when your application is booting
        direction.directCurtainBefore(createCurtainBeforeHook());

        direction.directSecurity(createSecurityResourceProvider());
        direction.directTime(createTimeResourceProvider());
        direction.directJson(createJsonResourceProvider());
        direction.directMail(createMailDeliveryDepartmentCreator().create());
    }

    protected CurtainBeforeHook createCurtainBeforeHook() {
        return new TaskticketCurtainBeforeHook();
    }

    protected SecurityResourceProvider createSecurityResourceProvider() {
        final InvertibleCryptographer inver = InvertibleCryptographer.createAesCipher(SECRET_KEY);
        final OneWayCryptographer oneWay = OneWayCryptographer.createSha256Cryptographer();
        return new TaskticketSecurityResourceProvider(inver, oneWay);
    }

    protected TimeResourceProvider createTimeResourceProvider() {
        return new TaskticketTimeResourceProvider(config);
    }

    protected JsonResourceProvider createJsonResourceProvider() {
        return new TaskticketJsonResourceProvider();
    }

    protected TaskticketMailDeliveryDepartmentCreator createMailDeliveryDepartmentCreator() {
        return new TaskticketMailDeliveryDepartmentCreator(config);
    }

    // ===================================================================================
    //                                                                                 DB
    //                                                                                ====
    @Override
    protected void prepareDbDirection(FwDbDirection direction) {
        direction.directClassification(createListedClassificationProvider());
    }

    protected ListedClassificationProvider createListedClassificationProvider() {
        return new TaskticketListedClassificationProvider();
    }

    // ===================================================================================
    //                                                                                Web
    //                                                                               =====
    @Override
    protected void prepareWebDirection(FwWebDirection direction) {
        direction.directRequest(createUserLocaleProcessProvider(), createUserTimeZoneProcessProvider());
        direction.directCookie(createCookieResourceProvider());
        direction.directAdjustment(createActionAdjustmentProvider());
        direction.directMessage(nameList -> nameList.add("taskticket_message"), "taskticket_label");
        direction.directApiCall(createApiFailureHook());
        direction.directHtmlRendering(createHtmlRenderingProvider());
        direction.directMultipart(createMultipartResourceProvider());
    }

    protected UserLocaleProcessProvider createUserLocaleProcessProvider() {
        return new TaskticketUserLocaleProcessProvider();
    }

    protected UserTimeZoneProcessProvider createUserTimeZoneProcessProvider() {
        return new TaskticketUserTimeZoneProcessProvider();
    }

    protected CookieResourceProvider createCookieResourceProvider() {
        final InvertibleCryptographer cr = InvertibleCryptographer.createAesCipher(SECRET_KEY);
        return new TaskticketCookieResourceProvider(config, cr);
    }

    protected ActionAdjustmentProvider createActionAdjustmentProvider() {
        return new TaskticketActionAdjustmentProvider();
    }

    protected ApiFailureHook createApiFailureHook() {
        return new TaskticketApiFailureHook();
    }

    protected HtmlRenderingProvider createHtmlRenderingProvider() {
        return new ThymeleafRenderingProvider().asDevelopment(config.isDevelopmentHere());
    }

    protected MultipartResourceProvider createMultipartResourceProvider() {
        return () -> new TaskticketMultipartRequestHandler();
    }
}
