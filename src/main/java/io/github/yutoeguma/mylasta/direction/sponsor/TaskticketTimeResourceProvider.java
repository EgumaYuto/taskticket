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
package io.github.yutoeguma.mylasta.direction.sponsor;

import java.util.TimeZone;

import io.github.yutoeguma.mylasta.direction.TaskticketConfig;
import org.lastaflute.core.time.TypicalTimeResourceProvider;

/**
 * @author jflute
 */
public class TaskticketTimeResourceProvider extends TypicalTimeResourceProvider {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TaskticketConfig config;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TaskticketTimeResourceProvider(TaskticketConfig config) {
        this.config = config;
    }

    // ===================================================================================
    //                                                                      Basic Handling
    //                                                                      ==============
    @Override
    protected TimeZone getCentralTimeZone() {
        return TaskticketUserTimeZoneProcessProvider.centralTimeZone;
    }

    // ===================================================================================
    //                                                                     Time Adjustment
    //                                                                     ===============
    @Override
    protected String getTimeAdjustTimeMillis() {
        return config.getTimeAdjustTimeMillis();
    }

    @Override
    protected Long getTimeAdjustTimeMillisAsLong() {
        return config.getTimeAdjustTimeMillisAsLong();
    }
}
