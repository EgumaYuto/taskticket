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

import io.github.yutoeguma.dbflute.cbean.cq.TicketCQ;

/**
 * The nest select set-upper of TICKET.
 * @author DBFlute(AutoGenerator)
 */
public class TicketNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TicketCQ _query;
    public TicketNss(TicketCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (メンバー)MEMBER by my ASSIGNEED_MEMBER_ID, named 'memberByAssigneedMemberId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMemberByAssigneedMemberId() {
        _query.xdoNss(() -> _query.queryMemberByAssigneedMemberId());
        return new MemberNss(_query.queryMemberByAssigneedMemberId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (メンバー)MEMBER by my MEMBER_ID, named 'memberByMemberId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMemberByMemberId() {
        _query.xdoNss(() -> _query.queryMemberByMemberId());
        return new MemberNss(_query.queryMemberByMemberId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (チケット)TICKET by my PARENT_TICKET_ID, named 'ticketSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TicketNss withTicketSelf() {
        _query.xdoNss(() -> _query.queryTicketSelf());
        return new TicketNss(_query.queryTicketSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (プロジェクト)PROJECT by my PROJECT_ID, named 'project'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProjectNss withProject() {
        _query.xdoNss(() -> _query.queryProject());
        return new ProjectNss(_query.queryProject());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (チケットステータス)TICKET_STATUS by my TICKET_STATUS_ID, named 'ticketStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TicketStatusNss withTicketStatus() {
        _query.xdoNss(() -> _query.queryTicketStatus());
        return new TicketStatusNss(_query.queryTicketStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (チケットタイプ)TICKET_TYPE by my TICKET_TYPE_ID, named 'ticketType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TicketTypeNss withTicketType() {
        _query.xdoNss(() -> _query.queryTicketType());
        return new TicketTypeNss(_query.queryTicketType());
    }
}
