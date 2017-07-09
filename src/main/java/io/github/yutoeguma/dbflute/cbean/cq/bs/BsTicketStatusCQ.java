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
 * The base condition-query of TICKET_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class BsTicketStatusCQ extends AbstractBsTicketStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TicketStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTicketStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TICKET_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TicketStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TicketStatusCIQ xcreateCIQ() {
        TicketStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TicketStatusCIQ xnewCIQ() {
        return new TicketStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TICKET_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TicketStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TicketStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ticketStatusId;
    public ConditionValue xdfgetTicketStatusId()
    { if (_ticketStatusId == null) { _ticketStatusId = nCV(); }
      return _ticketStatusId; }
    protected ConditionValue xgetCValueTicketStatusId() { return xdfgetTicketStatusId(); }

    public Map<String, TicketCQ> xdfgetTicketStatusId_ExistsReferrer_TicketList() { return xgetSQueMap("ticketStatusId_ExistsReferrer_TicketList"); }
    public String keepTicketStatusId_ExistsReferrer_TicketList(TicketCQ sq) { return xkeepSQue("ticketStatusId_ExistsReferrer_TicketList", sq); }

    public Map<String, TicketCQ> xdfgetTicketStatusId_NotExistsReferrer_TicketList() { return xgetSQueMap("ticketStatusId_NotExistsReferrer_TicketList"); }
    public String keepTicketStatusId_NotExistsReferrer_TicketList(TicketCQ sq) { return xkeepSQue("ticketStatusId_NotExistsReferrer_TicketList", sq); }

    public Map<String, TicketCQ> xdfgetTicketStatusId_SpecifyDerivedReferrer_TicketList() { return xgetSQueMap("ticketStatusId_SpecifyDerivedReferrer_TicketList"); }
    public String keepTicketStatusId_SpecifyDerivedReferrer_TicketList(TicketCQ sq) { return xkeepSQue("ticketStatusId_SpecifyDerivedReferrer_TicketList", sq); }

    public Map<String, TicketCQ> xdfgetTicketStatusId_QueryDerivedReferrer_TicketList() { return xgetSQueMap("ticketStatusId_QueryDerivedReferrer_TicketList"); }
    public String keepTicketStatusId_QueryDerivedReferrer_TicketList(TicketCQ sq) { return xkeepSQue("ticketStatusId_QueryDerivedReferrer_TicketList", sq); }
    public Map<String, Object> xdfgetTicketStatusId_QueryDerivedReferrer_TicketListParameter() { return xgetSQuePmMap("ticketStatusId_QueryDerivedReferrer_TicketList"); }
    public String keepTicketStatusId_QueryDerivedReferrer_TicketListParameter(Object pm) { return xkeepSQuePm("ticketStatusId_QueryDerivedReferrer_TicketList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_TicketStatusId_Asc() { regOBA("TICKET_STATUS_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_TicketStatusId_Desc() { regOBD("TICKET_STATUS_ID"); return this; }

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
    public BsTicketStatusCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _ticketStatusIcon;
    public ConditionValue xdfgetTicketStatusIcon()
    { if (_ticketStatusIcon == null) { _ticketStatusIcon = nCV(); }
      return _ticketStatusIcon; }
    protected ConditionValue xgetCValueTicketStatusIcon() { return xdfgetTicketStatusIcon(); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_TicketStatusIcon_Asc() { regOBA("TICKET_STATUS_ICON"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_TicketStatusIcon_Desc() { regOBD("TICKET_STATUS_ICON"); return this; }

    protected ConditionValue _ticketStatusName;
    public ConditionValue xdfgetTicketStatusName()
    { if (_ticketStatusName == null) { _ticketStatusName = nCV(); }
      return _ticketStatusName; }
    protected ConditionValue xgetCValueTicketStatusName() { return xdfgetTicketStatusName(); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットステータス名)TICKET_STATUS_NAME: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_TicketStatusName_Asc() { regOBA("TICKET_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットステータス名)TICKET_STATUS_NAME: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_TicketStatusName_Desc() { regOBD("TICKET_STATUS_NAME"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTicketStatusCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsTicketStatusCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsTicketStatusCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsTicketStatusCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTicketStatusCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsTicketStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTicketStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TicketStatusCQ bq = (TicketStatusCQ)bqs;
        TicketStatusCQ uq = (TicketStatusCQ)uqs;
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
        String nrp = xresolveNRP("TICKET_STATUS", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TicketStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TicketStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TicketStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TicketStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TicketStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TicketStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TicketStatusCQ> _myselfExistsMap;
    public Map<String, TicketStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TicketStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TicketStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TicketStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TicketStatusCB.class.getName(); }
    protected String xCQ() { return TicketStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
