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
package io.github.yutoeguma.dbflute.cbean.nss;

import io.github.yutoeguma.dbflute.cbean.cq.TicketTypeCQ;

/**
 * The nest select set-upper of TICKET_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class TicketTypeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TicketTypeCQ _query;
    public TicketTypeNss(TicketTypeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (プロジェクト)PROJECT by my PROJECT_ID, named 'project'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProjectNss withProject() {
        _query.xdoNss(() -> _query.queryProject());
        return new ProjectNss(_query.queryProject());
    }
}
