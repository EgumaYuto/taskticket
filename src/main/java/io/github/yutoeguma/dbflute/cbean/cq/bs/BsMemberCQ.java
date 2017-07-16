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
 * The base condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCQ extends AbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberCIQ xcreateCIQ() {
        MemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberCIQ xnewCIQ() {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    public Map<String, ProjectCQ> xdfgetMemberId_ExistsReferrer_ProjectList() { return xgetSQueMap("memberId_ExistsReferrer_ProjectList"); }
    public String keepMemberId_ExistsReferrer_ProjectList(ProjectCQ sq) { return xkeepSQue("memberId_ExistsReferrer_ProjectList", sq); }

    public Map<String, ProjectMemberCQ> xdfgetMemberId_ExistsReferrer_ProjectMemberList() { return xgetSQueMap("memberId_ExistsReferrer_ProjectMemberList"); }
    public String keepMemberId_ExistsReferrer_ProjectMemberList(ProjectMemberCQ sq) { return xkeepSQue("memberId_ExistsReferrer_ProjectMemberList", sq); }

    public Map<String, TicketCQ> xdfgetMemberId_ExistsReferrer_TicketByAssigneedMemberIdList() { return xgetSQueMap("memberId_ExistsReferrer_TicketByAssigneedMemberIdList"); }
    public String keepMemberId_ExistsReferrer_TicketByAssigneedMemberIdList(TicketCQ sq) { return xkeepSQue("memberId_ExistsReferrer_TicketByAssigneedMemberIdList", sq); }

    public Map<String, TicketCQ> xdfgetMemberId_ExistsReferrer_TicketByMemberIdList() { return xgetSQueMap("memberId_ExistsReferrer_TicketByMemberIdList"); }
    public String keepMemberId_ExistsReferrer_TicketByMemberIdList(TicketCQ sq) { return xkeepSQue("memberId_ExistsReferrer_TicketByMemberIdList", sq); }

    public Map<String, TicketStatusCQ> xdfgetMemberId_ExistsReferrer_TicketStatusList() { return xgetSQueMap("memberId_ExistsReferrer_TicketStatusList"); }
    public String keepMemberId_ExistsReferrer_TicketStatusList(TicketStatusCQ sq) { return xkeepSQue("memberId_ExistsReferrer_TicketStatusList", sq); }

    public Map<String, TicketTypeCQ> xdfgetMemberId_ExistsReferrer_TicketTypeList() { return xgetSQueMap("memberId_ExistsReferrer_TicketTypeList"); }
    public String keepMemberId_ExistsReferrer_TicketTypeList(TicketTypeCQ sq) { return xkeepSQue("memberId_ExistsReferrer_TicketTypeList", sq); }

    public Map<String, ProjectCQ> xdfgetMemberId_NotExistsReferrer_ProjectList() { return xgetSQueMap("memberId_NotExistsReferrer_ProjectList"); }
    public String keepMemberId_NotExistsReferrer_ProjectList(ProjectCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_ProjectList", sq); }

    public Map<String, ProjectMemberCQ> xdfgetMemberId_NotExistsReferrer_ProjectMemberList() { return xgetSQueMap("memberId_NotExistsReferrer_ProjectMemberList"); }
    public String keepMemberId_NotExistsReferrer_ProjectMemberList(ProjectMemberCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_ProjectMemberList", sq); }

    public Map<String, TicketCQ> xdfgetMemberId_NotExistsReferrer_TicketByAssigneedMemberIdList() { return xgetSQueMap("memberId_NotExistsReferrer_TicketByAssigneedMemberIdList"); }
    public String keepMemberId_NotExistsReferrer_TicketByAssigneedMemberIdList(TicketCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_TicketByAssigneedMemberIdList", sq); }

    public Map<String, TicketCQ> xdfgetMemberId_NotExistsReferrer_TicketByMemberIdList() { return xgetSQueMap("memberId_NotExistsReferrer_TicketByMemberIdList"); }
    public String keepMemberId_NotExistsReferrer_TicketByMemberIdList(TicketCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_TicketByMemberIdList", sq); }

    public Map<String, TicketStatusCQ> xdfgetMemberId_NotExistsReferrer_TicketStatusList() { return xgetSQueMap("memberId_NotExistsReferrer_TicketStatusList"); }
    public String keepMemberId_NotExistsReferrer_TicketStatusList(TicketStatusCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_TicketStatusList", sq); }

    public Map<String, TicketTypeCQ> xdfgetMemberId_NotExistsReferrer_TicketTypeList() { return xgetSQueMap("memberId_NotExistsReferrer_TicketTypeList"); }
    public String keepMemberId_NotExistsReferrer_TicketTypeList(TicketTypeCQ sq) { return xkeepSQue("memberId_NotExistsReferrer_TicketTypeList", sq); }

    public Map<String, ProjectCQ> xdfgetMemberId_SpecifyDerivedReferrer_ProjectList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_ProjectList"); }
    public String keepMemberId_SpecifyDerivedReferrer_ProjectList(ProjectCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_ProjectList", sq); }

    public Map<String, ProjectMemberCQ> xdfgetMemberId_SpecifyDerivedReferrer_ProjectMemberList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_ProjectMemberList"); }
    public String keepMemberId_SpecifyDerivedReferrer_ProjectMemberList(ProjectMemberCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_ProjectMemberList", sq); }

    public Map<String, TicketCQ> xdfgetMemberId_SpecifyDerivedReferrer_TicketByAssigneedMemberIdList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_TicketByAssigneedMemberIdList"); }
    public String keepMemberId_SpecifyDerivedReferrer_TicketByAssigneedMemberIdList(TicketCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_TicketByAssigneedMemberIdList", sq); }

    public Map<String, TicketCQ> xdfgetMemberId_SpecifyDerivedReferrer_TicketByMemberIdList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_TicketByMemberIdList"); }
    public String keepMemberId_SpecifyDerivedReferrer_TicketByMemberIdList(TicketCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_TicketByMemberIdList", sq); }

    public Map<String, TicketStatusCQ> xdfgetMemberId_SpecifyDerivedReferrer_TicketStatusList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_TicketStatusList"); }
    public String keepMemberId_SpecifyDerivedReferrer_TicketStatusList(TicketStatusCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_TicketStatusList", sq); }

    public Map<String, TicketTypeCQ> xdfgetMemberId_SpecifyDerivedReferrer_TicketTypeList() { return xgetSQueMap("memberId_SpecifyDerivedReferrer_TicketTypeList"); }
    public String keepMemberId_SpecifyDerivedReferrer_TicketTypeList(TicketTypeCQ sq) { return xkeepSQue("memberId_SpecifyDerivedReferrer_TicketTypeList", sq); }

    public Map<String, ProjectCQ> xdfgetMemberId_QueryDerivedReferrer_ProjectList() { return xgetSQueMap("memberId_QueryDerivedReferrer_ProjectList"); }
    public String keepMemberId_QueryDerivedReferrer_ProjectList(ProjectCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_ProjectList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_ProjectListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_ProjectList"); }
    public String keepMemberId_QueryDerivedReferrer_ProjectListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_ProjectList", pm); }

    public Map<String, ProjectMemberCQ> xdfgetMemberId_QueryDerivedReferrer_ProjectMemberList() { return xgetSQueMap("memberId_QueryDerivedReferrer_ProjectMemberList"); }
    public String keepMemberId_QueryDerivedReferrer_ProjectMemberList(ProjectMemberCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_ProjectMemberList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_ProjectMemberListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_ProjectMemberList"); }
    public String keepMemberId_QueryDerivedReferrer_ProjectMemberListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_ProjectMemberList", pm); }

    public Map<String, TicketCQ> xdfgetMemberId_QueryDerivedReferrer_TicketByAssigneedMemberIdList() { return xgetSQueMap("memberId_QueryDerivedReferrer_TicketByAssigneedMemberIdList"); }
    public String keepMemberId_QueryDerivedReferrer_TicketByAssigneedMemberIdList(TicketCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_TicketByAssigneedMemberIdList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_TicketByAssigneedMemberIdListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_TicketByAssigneedMemberIdList"); }
    public String keepMemberId_QueryDerivedReferrer_TicketByAssigneedMemberIdListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_TicketByAssigneedMemberIdList", pm); }

    public Map<String, TicketCQ> xdfgetMemberId_QueryDerivedReferrer_TicketByMemberIdList() { return xgetSQueMap("memberId_QueryDerivedReferrer_TicketByMemberIdList"); }
    public String keepMemberId_QueryDerivedReferrer_TicketByMemberIdList(TicketCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_TicketByMemberIdList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_TicketByMemberIdListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_TicketByMemberIdList"); }
    public String keepMemberId_QueryDerivedReferrer_TicketByMemberIdListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_TicketByMemberIdList", pm); }

    public Map<String, TicketStatusCQ> xdfgetMemberId_QueryDerivedReferrer_TicketStatusList() { return xgetSQueMap("memberId_QueryDerivedReferrer_TicketStatusList"); }
    public String keepMemberId_QueryDerivedReferrer_TicketStatusList(TicketStatusCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_TicketStatusList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_TicketStatusListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_TicketStatusList"); }
    public String keepMemberId_QueryDerivedReferrer_TicketStatusListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_TicketStatusList", pm); }

    public Map<String, TicketTypeCQ> xdfgetMemberId_QueryDerivedReferrer_TicketTypeList() { return xgetSQueMap("memberId_QueryDerivedReferrer_TicketTypeList"); }
    public String keepMemberId_QueryDerivedReferrer_TicketTypeList(TicketTypeCQ sq) { return xkeepSQue("memberId_QueryDerivedReferrer_TicketTypeList", sq); }
    public Map<String, Object> xdfgetMemberId_QueryDerivedReferrer_TicketTypeListParameter() { return xgetSQuePmMap("memberId_QueryDerivedReferrer_TicketTypeList"); }
    public String keepMemberId_QueryDerivedReferrer_TicketTypeListParameter(Object pm) { return xkeepSQuePm("memberId_QueryDerivedReferrer_TicketTypeList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue xdfgetMemberName()
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected ConditionValue xgetCValueMemberName() { return xdfgetMemberName(); }

    /** 
     * Add order-by as ascend. <br>
     * (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /** 
     * Add order-by as ascend. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _emailAddress;
    public ConditionValue xdfgetEmailAddress()
    { if (_emailAddress == null) { _emailAddress = nCV(); }
      return _emailAddress; }
    protected ConditionValue xgetCValueEmailAddress() { return xdfgetEmailAddress(); }

    /** 
     * Add order-by as ascend. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_EmailAddress_Asc() { regOBA("EMAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_EmailAddress_Desc() { regOBD("EMAIL_ADDRESS"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue xdfgetMemberStatusCode()
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected ConditionValue xgetCValueMemberStatusCode() { return xdfgetMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

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
    public BsMemberCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsMemberCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsMemberCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsMemberCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsMemberCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberCQ bq = (MemberCQ)bqs;
        MemberCQ uq = (MemberCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberAccessTokenAsOne()) {
            uq.queryMemberAccessTokenAsOne().reflectRelationOnUnionQuery(bq.queryMemberAccessTokenAsOne(), uq.queryMemberAccessTokenAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return xdfgetConditionQueryMemberStatus();
    }
    public MemberStatusCQ xdfgetConditionQueryMemberStatus() {
        String prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = xresolveNRP("MEMBER", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * (メンバーアクセストークン)MEMBER_ACCESS_TOKEN by MEMBER_ID, named 'memberAccessTokenAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberAccessTokenCQ queryMemberAccessTokenAsOne() { return xdfgetConditionQueryMemberAccessTokenAsOne(); }
    public MemberAccessTokenCQ xdfgetConditionQueryMemberAccessTokenAsOne() {
        String prop = "memberAccessTokenAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberAccessTokenAsOne()); xsetupOuterJoinMemberAccessTokenAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MemberAccessTokenCQ xcreateQueryMemberAccessTokenAsOne() {
        String nrp = xresolveNRP("MEMBER", "memberAccessTokenAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberAccessTokenCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberAccessTokenAsOne", nrp);
    }
    protected void xsetupOuterJoinMemberAccessTokenAsOne() { xregOutJo("memberAccessTokenAsOne"); }
    public boolean hasConditionQueryMemberAccessTokenAsOne() { return xhasQueRlMap("memberAccessTokenAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberCQ> _myselfExistsMap;
    public Map<String, MemberCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberCB.class.getName(); }
    protected String xCQ() { return MemberCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
