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
 * The base condition-query of PROJECT.
 * @author DBFlute(AutoGenerator)
 */
public class BsProjectCQ extends AbstractBsProjectCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProjectCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProjectCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from PROJECT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProjectCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProjectCIQ xcreateCIQ() {
        ProjectCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProjectCIQ xnewCIQ() {
        return new ProjectCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join PROJECT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProjectCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProjectCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _projectId;
    public ConditionValue xdfgetProjectId()
    { if (_projectId == null) { _projectId = nCV(); }
      return _projectId; }
    protected ConditionValue xgetCValueProjectId() { return xdfgetProjectId(); }

    public Map<String, ProjectMemberCQ> xdfgetProjectId_ExistsReferrer_ProjectMemberList() { return xgetSQueMap("projectId_ExistsReferrer_ProjectMemberList"); }
    public String keepProjectId_ExistsReferrer_ProjectMemberList(ProjectMemberCQ sq) { return xkeepSQue("projectId_ExistsReferrer_ProjectMemberList", sq); }

    public Map<String, TicketCQ> xdfgetProjectId_ExistsReferrer_TicketList() { return xgetSQueMap("projectId_ExistsReferrer_TicketList"); }
    public String keepProjectId_ExistsReferrer_TicketList(TicketCQ sq) { return xkeepSQue("projectId_ExistsReferrer_TicketList", sq); }

    public Map<String, ProjectMemberCQ> xdfgetProjectId_NotExistsReferrer_ProjectMemberList() { return xgetSQueMap("projectId_NotExistsReferrer_ProjectMemberList"); }
    public String keepProjectId_NotExistsReferrer_ProjectMemberList(ProjectMemberCQ sq) { return xkeepSQue("projectId_NotExistsReferrer_ProjectMemberList", sq); }

    public Map<String, TicketCQ> xdfgetProjectId_NotExistsReferrer_TicketList() { return xgetSQueMap("projectId_NotExistsReferrer_TicketList"); }
    public String keepProjectId_NotExistsReferrer_TicketList(TicketCQ sq) { return xkeepSQue("projectId_NotExistsReferrer_TicketList", sq); }

    public Map<String, ProjectMemberCQ> xdfgetProjectId_SpecifyDerivedReferrer_ProjectMemberList() { return xgetSQueMap("projectId_SpecifyDerivedReferrer_ProjectMemberList"); }
    public String keepProjectId_SpecifyDerivedReferrer_ProjectMemberList(ProjectMemberCQ sq) { return xkeepSQue("projectId_SpecifyDerivedReferrer_ProjectMemberList", sq); }

    public Map<String, TicketCQ> xdfgetProjectId_SpecifyDerivedReferrer_TicketList() { return xgetSQueMap("projectId_SpecifyDerivedReferrer_TicketList"); }
    public String keepProjectId_SpecifyDerivedReferrer_TicketList(TicketCQ sq) { return xkeepSQue("projectId_SpecifyDerivedReferrer_TicketList", sq); }

    public Map<String, ProjectMemberCQ> xdfgetProjectId_QueryDerivedReferrer_ProjectMemberList() { return xgetSQueMap("projectId_QueryDerivedReferrer_ProjectMemberList"); }
    public String keepProjectId_QueryDerivedReferrer_ProjectMemberList(ProjectMemberCQ sq) { return xkeepSQue("projectId_QueryDerivedReferrer_ProjectMemberList", sq); }
    public Map<String, Object> xdfgetProjectId_QueryDerivedReferrer_ProjectMemberListParameter() { return xgetSQuePmMap("projectId_QueryDerivedReferrer_ProjectMemberList"); }
    public String keepProjectId_QueryDerivedReferrer_ProjectMemberListParameter(Object pm) { return xkeepSQuePm("projectId_QueryDerivedReferrer_ProjectMemberList", pm); }

    public Map<String, TicketCQ> xdfgetProjectId_QueryDerivedReferrer_TicketList() { return xgetSQueMap("projectId_QueryDerivedReferrer_TicketList"); }
    public String keepProjectId_QueryDerivedReferrer_TicketList(TicketCQ sq) { return xkeepSQue("projectId_QueryDerivedReferrer_TicketList", sq); }
    public Map<String, Object> xdfgetProjectId_QueryDerivedReferrer_TicketListParameter() { return xgetSQuePmMap("projectId_QueryDerivedReferrer_TicketList"); }
    public String keepProjectId_QueryDerivedReferrer_TicketListParameter(Object pm) { return xkeepSQuePm("projectId_QueryDerivedReferrer_TicketList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (プロジェクトID)PROJECT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_ProjectId_Asc() { regOBA("PROJECT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (プロジェクトID)PROJECT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_ProjectId_Desc() { regOBD("PROJECT_ID"); return this; }

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
    public BsProjectCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _projectName;
    public ConditionValue xdfgetProjectName()
    { if (_projectName == null) { _projectName = nCV(); }
      return _projectName; }
    protected ConditionValue xgetCValueProjectName() { return xdfgetProjectName(); }

    /** 
     * Add order-by as ascend. <br>
     * (プロジェクト名)PROJECT_NAME: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_ProjectName_Asc() { regOBA("PROJECT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (プロジェクト名)PROJECT_NAME: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_ProjectName_Desc() { regOBD("PROJECT_NAME"); return this; }

    protected ConditionValue _projectDetail;
    public ConditionValue xdfgetProjectDetail()
    { if (_projectDetail == null) { _projectDetail = nCV(); }
      return _projectDetail; }
    protected ConditionValue xgetCValueProjectDetail() { return xdfgetProjectDetail(); }

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
    public BsProjectCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsProjectCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsProjectCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsProjectCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsProjectCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsProjectCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsProjectCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsProjectCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ProjectCQ bq = (ProjectCQ)bqs;
        ProjectCQ uq = (ProjectCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (メンバー)MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public MemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("PROJECT", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ProjectCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ProjectCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ProjectCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ProjectCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ProjectCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ProjectCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ProjectCQ> _myselfExistsMap;
    public Map<String, ProjectCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ProjectCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ProjectCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ProjectCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProjectCB.class.getName(); }
    protected String xCQ() { return ProjectCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
