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
 * The base condition-query of TICKET_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsTicketTypeCQ extends AbstractBsTicketTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TicketTypeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTicketTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TICKET_TYPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TicketTypeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TicketTypeCIQ xcreateCIQ() {
        TicketTypeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TicketTypeCIQ xnewCIQ() {
        return new TicketTypeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TICKET_TYPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TicketTypeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TicketTypeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _ticketTypeId;
    public ConditionValue xdfgetTicketTypeId()
    { if (_ticketTypeId == null) { _ticketTypeId = nCV(); }
      return _ticketTypeId; }
    protected ConditionValue xgetCValueTicketTypeId() { return xdfgetTicketTypeId(); }

    public Map<String, TicketCQ> xdfgetTicketTypeId_ExistsReferrer_TicketList() { return xgetSQueMap("ticketTypeId_ExistsReferrer_TicketList"); }
    public String keepTicketTypeId_ExistsReferrer_TicketList(TicketCQ sq) { return xkeepSQue("ticketTypeId_ExistsReferrer_TicketList", sq); }

    public Map<String, TicketCQ> xdfgetTicketTypeId_NotExistsReferrer_TicketList() { return xgetSQueMap("ticketTypeId_NotExistsReferrer_TicketList"); }
    public String keepTicketTypeId_NotExistsReferrer_TicketList(TicketCQ sq) { return xkeepSQue("ticketTypeId_NotExistsReferrer_TicketList", sq); }

    public Map<String, TicketCQ> xdfgetTicketTypeId_SpecifyDerivedReferrer_TicketList() { return xgetSQueMap("ticketTypeId_SpecifyDerivedReferrer_TicketList"); }
    public String keepTicketTypeId_SpecifyDerivedReferrer_TicketList(TicketCQ sq) { return xkeepSQue("ticketTypeId_SpecifyDerivedReferrer_TicketList", sq); }

    public Map<String, TicketCQ> xdfgetTicketTypeId_QueryDerivedReferrer_TicketList() { return xgetSQueMap("ticketTypeId_QueryDerivedReferrer_TicketList"); }
    public String keepTicketTypeId_QueryDerivedReferrer_TicketList(TicketCQ sq) { return xkeepSQue("ticketTypeId_QueryDerivedReferrer_TicketList", sq); }
    public Map<String, Object> xdfgetTicketTypeId_QueryDerivedReferrer_TicketListParameter() { return xgetSQuePmMap("ticketTypeId_QueryDerivedReferrer_TicketList"); }
    public String keepTicketTypeId_QueryDerivedReferrer_TicketListParameter(Object pm) { return xkeepSQuePm("ticketTypeId_QueryDerivedReferrer_TicketList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_TicketTypeId_Asc() { regOBA("TICKET_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_TicketTypeId_Desc() { regOBD("TICKET_TYPE_ID"); return this; }

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
    public BsTicketTypeCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _ticketTypeIcon;
    public ConditionValue xdfgetTicketTypeIcon()
    { if (_ticketTypeIcon == null) { _ticketTypeIcon = nCV(); }
      return _ticketTypeIcon; }
    protected ConditionValue xgetCValueTicketTypeIcon() { return xdfgetTicketTypeIcon(); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_TicketTypeIcon_Asc() { regOBA("TICKET_TYPE_ICON"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_TicketTypeIcon_Desc() { regOBD("TICKET_TYPE_ICON"); return this; }

    protected ConditionValue _ticketTypeName;
    public ConditionValue xdfgetTicketTypeName()
    { if (_ticketTypeName == null) { _ticketTypeName = nCV(); }
      return _ticketTypeName; }
    protected ConditionValue xgetCValueTicketTypeName() { return xdfgetTicketTypeName(); }

    /** 
     * Add order-by as ascend. <br>
     * (チケットタイプ名)TICKET_TYPE_NAME: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_TicketTypeName_Asc() { regOBA("TICKET_TYPE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (チケットタイプ名)TICKET_TYPE_NAME: {NotNull, VARCHAR(128)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_TicketTypeName_Desc() { regOBD("TICKET_TYPE_NAME"); return this; }

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
    public BsTicketTypeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTicketTypeCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsTicketTypeCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsTicketTypeCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsTicketTypeCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTicketTypeCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsTicketTypeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTicketTypeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TicketTypeCQ bq = (TicketTypeCQ)bqs;
        TicketTypeCQ uq = (TicketTypeCQ)uqs;
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
        String nrp = xresolveNRP("TICKET_TYPE", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TicketTypeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TicketTypeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TicketTypeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TicketTypeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TicketTypeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TicketTypeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TicketTypeCQ> _myselfExistsMap;
    public Map<String, TicketTypeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TicketTypeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TicketTypeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TicketTypeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TicketTypeCB.class.getName(); }
    protected String xCQ() { return TicketTypeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
