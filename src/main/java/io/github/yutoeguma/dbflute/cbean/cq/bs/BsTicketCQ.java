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
package io.github.yutoeguma.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import io.github.yutoeguma.dbflute.cbean.cq.ciq.*;
import io.github.yutoeguma.dbflute.cbean.*;
import io.github.yutoeguma.dbflute.cbean.cq.*;

/**
 * The base condition-query of TICKET.
 * @author DBFlute(AutoGenerator)
 */
public class BsTicketCQ extends AbstractBsTicketCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TicketCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTicketCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TICKET) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TicketCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TicketCIQ xcreateCIQ() {
        TicketCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TicketCIQ xnewCIQ() {
        return new TicketCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TICKET on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TicketCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TicketCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ticketId;
    public ConditionValue xdfgetTicketId()
    { if (_ticketId == null) { _ticketId = nCV(); }
      return _ticketId; }
    protected ConditionValue xgetCValueTicketId() { return xdfgetTicketId(); }

    public Map<String, TicketCQ> xdfgetTicketId_ExistsReferrer_TicketSelfList() { return xgetSQueMap("ticketId_ExistsReferrer_TicketSelfList"); }
    public String keepTicketId_ExistsReferrer_TicketSelfList(TicketCQ sq) { return xkeepSQue("ticketId_ExistsReferrer_TicketSelfList", sq); }

    public Map<String, TicketCQ> xdfgetTicketId_NotExistsReferrer_TicketSelfList() { return xgetSQueMap("ticketId_NotExistsReferrer_TicketSelfList"); }
    public String keepTicketId_NotExistsReferrer_TicketSelfList(TicketCQ sq) { return xkeepSQue("ticketId_NotExistsReferrer_TicketSelfList", sq); }

    public Map<String, TicketCQ> xdfgetTicketId_SpecifyDerivedReferrer_TicketSelfList() { return xgetSQueMap("ticketId_SpecifyDerivedReferrer_TicketSelfList"); }
    public String keepTicketId_SpecifyDerivedReferrer_TicketSelfList(TicketCQ sq) { return xkeepSQue("ticketId_SpecifyDerivedReferrer_TicketSelfList", sq); }

    public Map<String, TicketCQ> xdfgetTicketId_QueryDerivedReferrer_TicketSelfList() { return xgetSQueMap("ticketId_QueryDerivedReferrer_TicketSelfList"); }
    public String keepTicketId_QueryDerivedReferrer_TicketSelfList(TicketCQ sq) { return xkeepSQue("ticketId_QueryDerivedReferrer_TicketSelfList", sq); }
    public Map<String, Object> xdfgetTicketId_QueryDerivedReferrer_TicketSelfListParameter() { return xgetSQuePmMap("ticketId_QueryDerivedReferrer_TicketSelfList"); }
    public String keepTicketId_QueryDerivedReferrer_TicketSelfListParameter(Object pm) { return xkeepSQuePm("ticketId_QueryDerivedReferrer_TicketSelfList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_TicketId_Asc() { regOBA("TICKET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_TicketId_Desc() { regOBD("TICKET_ID"); return this; }

    protected ConditionValue _parentTicketId;
    public ConditionValue xdfgetParentTicketId()
    { if (_parentTicketId == null) { _parentTicketId = nCV(); }
      return _parentTicketId; }
    protected ConditionValue xgetCValueParentTicketId() { return xdfgetParentTicketId(); }

    /** 
     * Add order-by as ascend. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_ParentTicketId_Asc() { regOBA("PARENT_TICKET_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_ParentTicketId_Desc() { regOBD("PARENT_TICKET_ID"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /** 
     * Add order-by as ascend. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _assigneedMemberId;
    public ConditionValue xdfgetAssigneedMemberId()
    { if (_assigneedMemberId == null) { _assigneedMemberId = nCV(); }
      return _assigneedMemberId; }
    protected ConditionValue xgetCValueAssigneedMemberId() { return xdfgetAssigneedMemberId(); }

    /** 
     * Add order-by as ascend. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_AssigneedMemberId_Asc() { regOBA("ASSIGNEED_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_AssigneedMemberId_Desc() { regOBD("ASSIGNEED_MEMBER_ID"); return this; }

    protected ConditionValue _ticketTypeId;
    public ConditionValue xdfgetTicketTypeId()
    { if (_ticketTypeId == null) { _ticketTypeId = nCV(); }
      return _ticketTypeId; }
    protected ConditionValue xgetCValueTicketTypeId() { return xdfgetTicketTypeId(); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_TicketTypeId_Asc() { regOBA("TICKET_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_TicketTypeId_Desc() { regOBD("TICKET_TYPE_ID"); return this; }

    protected ConditionValue _ticketStatusId;
    public ConditionValue xdfgetTicketStatusId()
    { if (_ticketStatusId == null) { _ticketStatusId = nCV(); }
      return _ticketStatusId; }
    protected ConditionValue xgetCValueTicketStatusId() { return xdfgetTicketStatusId(); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_TicketStatusId_Asc() { regOBA("TICKET_STATUS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_TicketStatusId_Desc() { regOBD("TICKET_STATUS_ID"); return this; }

    protected ConditionValue _projectId;
    public ConditionValue xdfgetProjectId()
    { if (_projectId == null) { _projectId = nCV(); }
      return _projectId; }
    protected ConditionValue xgetCValueProjectId() { return xdfgetProjectId(); }

    /** 
     * Add order-by as ascend. <br>
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_ProjectId_Asc() { regOBA("PROJECT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_ProjectId_Desc() { regOBD("PROJECT_ID"); return this; }

    protected ConditionValue _ticketName;
    public ConditionValue xdfgetTicketName()
    { if (_ticketName == null) { _ticketName = nCV(); }
      return _ticketName; }
    protected ConditionValue xgetCValueTicketName() { return xdfgetTicketName(); }

    /** 
     * Add order-by as ascend. <br>
     * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_TicketName_Asc() { regOBA("TICKET_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_TicketName_Desc() { regOBD("TICKET_NAME"); return this; }

    protected ConditionValue _ticketDetail;
    public ConditionValue xdfgetTicketDetail()
    { if (_ticketDetail == null) { _ticketDetail = nCV(); }
      return _ticketDetail; }
    protected ConditionValue xgetCValueTicketDetail() { return xdfgetTicketDetail(); }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTicketCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTicketCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTicketCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TicketCQ bq = (TicketCQ)bqs;
        TicketCQ uq = (TicketCQ)uqs;
        if (bq.hasConditionQueryMemberByAssigneedMemberId()) {
            uq.queryMemberByAssigneedMemberId().reflectRelationOnUnionQuery(bq.queryMemberByAssigneedMemberId(), uq.queryMemberByAssigneedMemberId());
        }
        if (bq.hasConditionQueryMemberByMemberId()) {
            uq.queryMemberByMemberId().reflectRelationOnUnionQuery(bq.queryMemberByMemberId(), uq.queryMemberByMemberId());
        }
        if (bq.hasConditionQueryTicketSelf()) {
            uq.queryTicketSelf().reflectRelationOnUnionQuery(bq.queryTicketSelf(), uq.queryTicketSelf());
        }
        if (bq.hasConditionQueryProject()) {
            uq.queryProject().reflectRelationOnUnionQuery(bq.queryProject(), uq.queryProject());
        }
        if (bq.hasConditionQueryTicketStatus()) {
            uq.queryTicketStatus().reflectRelationOnUnionQuery(bq.queryTicketStatus(), uq.queryTicketStatus());
        }
        if (bq.hasConditionQueryTicketType()) {
            uq.queryTicketType().reflectRelationOnUnionQuery(bq.queryTicketType(), uq.queryTicketType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (メンバー)MEMBER by my ASSIGNEED_MEMBER_ID, named 'memberByAssigneedMemberId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMemberByAssigneedMemberId() {
        return xdfgetConditionQueryMemberByAssigneedMemberId();
    }
    public MemberCQ xdfgetConditionQueryMemberByAssigneedMemberId() {
        String prop = "memberByAssigneedMemberId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberByAssigneedMemberId()); xsetupOuterJoinMemberByAssigneedMemberId(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMemberByAssigneedMemberId() {
        String nrp = xresolveNRP("TICKET", "memberByAssigneedMemberId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberByAssigneedMemberId", nrp);
    }
    protected void xsetupOuterJoinMemberByAssigneedMemberId() { xregOutJo("memberByAssigneedMemberId"); }
    public boolean hasConditionQueryMemberByAssigneedMemberId() { return xhasQueRlMap("memberByAssigneedMemberId"); }

    /**
     * Get the condition-query for relation table. <br>
     * (メンバー)MEMBER by my MEMBER_ID, named 'memberByMemberId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMemberByMemberId() {
        return xdfgetConditionQueryMemberByMemberId();
    }
    public MemberCQ xdfgetConditionQueryMemberByMemberId() {
        String prop = "memberByMemberId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberByMemberId()); xsetupOuterJoinMemberByMemberId(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMemberByMemberId() {
        String nrp = xresolveNRP("TICKET", "memberByMemberId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberByMemberId", nrp);
    }
    protected void xsetupOuterJoinMemberByMemberId() { xregOutJo("memberByMemberId"); }
    public boolean hasConditionQueryMemberByMemberId() { return xhasQueRlMap("memberByMemberId"); }

    /**
     * Get the condition-query for relation table. <br>
     * (チケット)TICKET by my PARENT_TICKET_ID, named 'ticketSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public TicketCQ queryTicketSelf() {
        return xdfgetConditionQueryTicketSelf();
    }
    public TicketCQ xdfgetConditionQueryTicketSelf() {
        String prop = "ticketSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTicketSelf()); xsetupOuterJoinTicketSelf(); }
        return xgetQueRlMap(prop);
    }
    protected TicketCQ xcreateQueryTicketSelf() {
        String nrp = xresolveNRP("TICKET", "ticketSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TicketCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "ticketSelf", nrp);
    }
    protected void xsetupOuterJoinTicketSelf() { xregOutJo("ticketSelf"); }
    public boolean hasConditionQueryTicketSelf() { return xhasQueRlMap("ticketSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * (プロジェクト)PROJECT by my PROJECT_ID, named 'project'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProjectCQ queryProject() {
        return xdfgetConditionQueryProject();
    }
    public ProjectCQ xdfgetConditionQueryProject() {
        String prop = "project";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProject()); xsetupOuterJoinProject(); }
        return xgetQueRlMap(prop);
    }
    protected ProjectCQ xcreateQueryProject() {
        String nrp = xresolveNRP("TICKET", "project"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ProjectCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "project", nrp);
    }
    protected void xsetupOuterJoinProject() { xregOutJo("project"); }
    public boolean hasConditionQueryProject() { return xhasQueRlMap("project"); }

    /**
     * Get the condition-query for relation table. <br>
     * (チケットステータス)TICKET_STATUS by my TICKET_STATUS_ID, named 'ticketStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public TicketStatusCQ queryTicketStatus() {
        return xdfgetConditionQueryTicketStatus();
    }
    public TicketStatusCQ xdfgetConditionQueryTicketStatus() {
        String prop = "ticketStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTicketStatus()); xsetupOuterJoinTicketStatus(); }
        return xgetQueRlMap(prop);
    }
    protected TicketStatusCQ xcreateQueryTicketStatus() {
        String nrp = xresolveNRP("TICKET", "ticketStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TicketStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "ticketStatus", nrp);
    }
    protected void xsetupOuterJoinTicketStatus() { xregOutJo("ticketStatus"); }
    public boolean hasConditionQueryTicketStatus() { return xhasQueRlMap("ticketStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * (チケットタイプ)TICKET_TYPE by my TICKET_TYPE_ID, named 'ticketType'.
     * @return The instance of condition-query. (NotNull)
     */
    public TicketTypeCQ queryTicketType() {
        return xdfgetConditionQueryTicketType();
    }
    public TicketTypeCQ xdfgetConditionQueryTicketType() {
        String prop = "ticketType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTicketType()); xsetupOuterJoinTicketType(); }
        return xgetQueRlMap(prop);
    }
    protected TicketTypeCQ xcreateQueryTicketType() {
        String nrp = xresolveNRP("TICKET", "ticketType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TicketTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "ticketType", nrp);
    }
    protected void xsetupOuterJoinTicketType() { xregOutJo("ticketType"); }
    public boolean hasConditionQueryTicketType() { return xhasQueRlMap("ticketType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TicketCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TicketCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TicketCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TicketCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TicketCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TicketCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TicketCQ> _myselfExistsMap;
    public Map<String, TicketCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TicketCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TicketCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TicketCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TicketCB.class.getName(); }
    protected String xCQ() { return TicketCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
