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
package io.github.yutoeguma.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import io.github.yutoeguma.dbflute.allcommon.DBFluteConfig;
import io.github.yutoeguma.dbflute.allcommon.DBMetaInstanceHandler;
import io.github.yutoeguma.dbflute.allcommon.ImplementedInvokerAssistant;
import io.github.yutoeguma.dbflute.allcommon.ImplementedSqlClauseCreator;
import io.github.yutoeguma.dbflute.cbean.*;
import io.github.yutoeguma.dbflute.cbean.cq.*;
import io.github.yutoeguma.dbflute.cbean.nss.*;

/**
 * The base condition-bean of TICKET.
 * @author DBFlute(AutoGenerator)
 */
public class BsTicketCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TicketCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTicketCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "TICKET";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param ticketId (チケットID): PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public TicketCB acceptPK(Long ticketId) {
        assertObjectNotNull("ticketId", ticketId);
        BsTicketCB cb = this;
        cb.query().setTicketId_Equal(ticketId);
        return (TicketCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_TicketId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_TicketId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public TicketCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public TicketCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TicketCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TicketCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TicketCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TicketCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TicketCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TicketCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TicketCB> unionCBLambda) {
        final TicketCB cb = new TicketCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TicketCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<TicketCB> unionCBLambda) {
        final TicketCB cb = new TicketCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TicketCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MemberNss _nssMemberByAssigneedMemberId;
    public MemberNss xdfgetNssMemberByAssigneedMemberId() {
        if (_nssMemberByAssigneedMemberId == null) { _nssMemberByAssigneedMemberId = new MemberNss(null); }
        return _nssMemberByAssigneedMemberId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (メンバー)MEMBER by my ASSIGNEED_MEMBER_ID, named 'memberByAssigneedMemberId'.
     * <pre>
     * <span style="color: #0000C0">ticketBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberByAssigneedMemberId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">ticket</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">ticket</span>.<span style="color: #CC4747">getMemberByAssigneedMemberId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberNss setupSelect_MemberByAssigneedMemberId() {
        assertSetupSelectPurpose("memberByAssigneedMemberId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnAssigneedMemberId();
        }
        doSetupSelect(() -> query().queryMemberByAssigneedMemberId());
        if (_nssMemberByAssigneedMemberId == null || !_nssMemberByAssigneedMemberId.hasConditionQuery())
        { _nssMemberByAssigneedMemberId = new MemberNss(query().queryMemberByAssigneedMemberId()); }
        return _nssMemberByAssigneedMemberId;
    }

    protected MemberNss _nssMemberByMemberId;
    public MemberNss xdfgetNssMemberByMemberId() {
        if (_nssMemberByMemberId == null) { _nssMemberByMemberId = new MemberNss(null); }
        return _nssMemberByMemberId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (メンバー)MEMBER by my MEMBER_ID, named 'memberByMemberId'.
     * <pre>
     * <span style="color: #0000C0">ticketBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberByMemberId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">ticket</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">ticket</span>.<span style="color: #CC4747">getMemberByMemberId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberNss setupSelect_MemberByMemberId() {
        assertSetupSelectPurpose("memberByMemberId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMemberId();
        }
        doSetupSelect(() -> query().queryMemberByMemberId());
        if (_nssMemberByMemberId == null || !_nssMemberByMemberId.hasConditionQuery())
        { _nssMemberByMemberId = new MemberNss(query().queryMemberByMemberId()); }
        return _nssMemberByMemberId;
    }

    protected TicketNss _nssTicketSelf;
    public TicketNss xdfgetNssTicketSelf() {
        if (_nssTicketSelf == null) { _nssTicketSelf = new TicketNss(null); }
        return _nssTicketSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (チケット)TICKET by my PARENT_TICKET_ID, named 'ticketSelf'.
     * <pre>
     * <span style="color: #0000C0">ticketBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TicketSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">ticket</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">ticket</span>.<span style="color: #CC4747">getTicketSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TicketNss setupSelect_TicketSelf() {
        assertSetupSelectPurpose("ticketSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnParentTicketId();
        }
        doSetupSelect(() -> query().queryTicketSelf());
        if (_nssTicketSelf == null || !_nssTicketSelf.hasConditionQuery())
        { _nssTicketSelf = new TicketNss(query().queryTicketSelf()); }
        return _nssTicketSelf;
    }

    protected ProjectNss _nssProject;
    public ProjectNss xdfgetNssProject() {
        if (_nssProject == null) { _nssProject = new ProjectNss(null); }
        return _nssProject;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (プロジェクト)PROJECT by my PROJECT_ID, named 'project'.
     * <pre>
     * <span style="color: #0000C0">ticketBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Project()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">ticket</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">ticket</span>.<span style="color: #CC4747">getProject()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public ProjectNss setupSelect_Project() {
        assertSetupSelectPurpose("project");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProjectId();
        }
        doSetupSelect(() -> query().queryProject());
        if (_nssProject == null || !_nssProject.hasConditionQuery())
        { _nssProject = new ProjectNss(query().queryProject()); }
        return _nssProject;
    }

    protected TicketStatusNss _nssTicketStatus;
    public TicketStatusNss xdfgetNssTicketStatus() {
        if (_nssTicketStatus == null) { _nssTicketStatus = new TicketStatusNss(null); }
        return _nssTicketStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (チケットステータス)TICKET_STATUS by my TICKET_STATUS_ID, named 'ticketStatus'.
     * <pre>
     * <span style="color: #0000C0">ticketBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TicketStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">ticket</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">ticket</span>.<span style="color: #CC4747">getTicketStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TicketStatusNss setupSelect_TicketStatus() {
        assertSetupSelectPurpose("ticketStatus");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTicketStatusId();
        }
        doSetupSelect(() -> query().queryTicketStatus());
        if (_nssTicketStatus == null || !_nssTicketStatus.hasConditionQuery())
        { _nssTicketStatus = new TicketStatusNss(query().queryTicketStatus()); }
        return _nssTicketStatus;
    }

    protected TicketTypeNss _nssTicketType;
    public TicketTypeNss xdfgetNssTicketType() {
        if (_nssTicketType == null) { _nssTicketType = new TicketTypeNss(null); }
        return _nssTicketType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (チケットタイプ)TICKET_TYPE by my TICKET_TYPE_ID, named 'ticketType'.
     * <pre>
     * <span style="color: #0000C0">ticketBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TicketType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">ticket</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">ticket</span>.<span style="color: #CC4747">getTicketType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TicketTypeNss setupSelect_TicketType() {
        assertSetupSelectPurpose("ticketType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnTicketTypeId();
        }
        doSetupSelect(() -> query().queryTicketType());
        if (_nssTicketType == null || !_nssTicketType.hasConditionQuery())
        { _nssTicketType = new TicketTypeNss(query().queryTicketType()); }
        return _nssTicketType;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<TicketCQ> {
        protected MemberCB.HpSpecification _memberByAssigneedMemberId;
        protected MemberCB.HpSpecification _memberByMemberId;
        protected TicketCB.HpSpecification _ticketSelf;
        protected ProjectCB.HpSpecification _project;
        protected TicketStatusCB.HpSpecification _ticketStatus;
        protected TicketTypeCB.HpSpecification _ticketType;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TicketCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTicketId() { return doColumn("TICKET_ID"); }
        /**
         * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnParentTicketId() { return doColumn("PARENT_TICKET_ID"); }
        /**
         * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberId() { return doColumn("MEMBER_ID"); }
        /**
         * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAssigneedMemberId() { return doColumn("ASSIGNEED_MEMBER_ID"); }
        /**
         * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTicketTypeId() { return doColumn("TICKET_TYPE_ID"); }
        /**
         * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTicketStatusId() { return doColumn("TICKET_STATUS_ID"); }
        /**
         * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProjectId() { return doColumn("PROJECT_ID"); }
        /**
         * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTicketName() { return doColumn("TICKET_NAME"); }
        /**
         * (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTicketDetail() { return doColumn("TICKET_DETAIL"); }
        /**
         * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnTicketId(); // PK
            if (qyCall().qy().hasConditionQueryMemberByAssigneedMemberId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberCQ) {
                columnAssigneedMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMemberByMemberId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberCQ) {
                columnMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTicketSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof TicketCQ) {
                columnParentTicketId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryProject()
                    || qyCall().qy().xgetReferrerQuery() instanceof ProjectCQ) {
                columnProjectId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTicketStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof TicketStatusCQ) {
                columnTicketStatusId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTicketType()
                    || qyCall().qy().xgetReferrerQuery() instanceof TicketTypeCQ) {
                columnTicketTypeId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "TICKET"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * (メンバー)MEMBER by my ASSIGNEED_MEMBER_ID, named 'memberByAssigneedMemberId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberCB.HpSpecification specifyMemberByAssigneedMemberId() {
            assertRelation("memberByAssigneedMemberId");
            if (_memberByAssigneedMemberId == null) {
                _memberByAssigneedMemberId = new MemberCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberByAssigneedMemberId()
                                    , () -> _qyCall.qy().queryMemberByAssigneedMemberId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberByAssigneedMemberId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberByAssigneedMemberId()
                      , () -> xsyncQyCall().qy().queryMemberByAssigneedMemberId()));
                }
            }
            return _memberByAssigneedMemberId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (メンバー)MEMBER by my MEMBER_ID, named 'memberByMemberId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberCB.HpSpecification specifyMemberByMemberId() {
            assertRelation("memberByMemberId");
            if (_memberByMemberId == null) {
                _memberByMemberId = new MemberCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberByMemberId()
                                    , () -> _qyCall.qy().queryMemberByMemberId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberByMemberId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberByMemberId()
                      , () -> xsyncQyCall().qy().queryMemberByMemberId()));
                }
            }
            return _memberByMemberId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (チケット)TICKET by my PARENT_TICKET_ID, named 'ticketSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TicketCB.HpSpecification specifyTicketSelf() {
            assertRelation("ticketSelf");
            if (_ticketSelf == null) {
                _ticketSelf = new TicketCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTicketSelf()
                                    , () -> _qyCall.qy().queryTicketSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _ticketSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTicketSelf()
                      , () -> xsyncQyCall().qy().queryTicketSelf()));
                }
            }
            return _ticketSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (プロジェクト)PROJECT by my PROJECT_ID, named 'project'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ProjectCB.HpSpecification specifyProject() {
            assertRelation("project");
            if (_project == null) {
                _project = new ProjectCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryProject()
                                    , () -> _qyCall.qy().queryProject())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _project.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryProject()
                      , () -> xsyncQyCall().qy().queryProject()));
                }
            }
            return _project;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (チケットステータス)TICKET_STATUS by my TICKET_STATUS_ID, named 'ticketStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TicketStatusCB.HpSpecification specifyTicketStatus() {
            assertRelation("ticketStatus");
            if (_ticketStatus == null) {
                _ticketStatus = new TicketStatusCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTicketStatus()
                                    , () -> _qyCall.qy().queryTicketStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _ticketStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTicketStatus()
                      , () -> xsyncQyCall().qy().queryTicketStatus()));
                }
            }
            return _ticketStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (チケットタイプ)TICKET_TYPE by my TICKET_TYPE_ID, named 'ticketType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TicketTypeCB.HpSpecification specifyTicketType() {
            assertRelation("ticketType");
            if (_ticketType == null) {
                _ticketType = new TicketTypeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTicketType()
                                    , () -> _qyCall.qy().queryTicketType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _ticketType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTicketType()
                      , () -> xsyncQyCall().qy().queryTicketType()));
                }
            }
            return _ticketType;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from TICKET where ...) as FOO_MAX} <br>
         * (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     ticketCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     ticketCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, Ticket.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TicketCB, TicketCQ> derivedTicketSelf() {
            assertDerived("ticketSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TicketCB> sq, TicketCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTicketSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TicketCB, TicketCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TicketCB> sq, TicketCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public TicketCB dreamCruiseCB() {
        TicketCB cb = new TicketCB();
        cb.xsetupForDreamCruise((TicketCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<TicketCB> columnQuery(final SpecifyQuery<TicketCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TicketCB xcreateColumnQueryCB() {
        TicketCB cb = new TicketCB();
        cb.xsetupForColumnQuery((TicketCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<TicketCB> orCBLambda) {
        xorSQ((TicketCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<TicketCB> andCBLambda) {
        xorSQAP((TicketCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    public void customizeCursorSelect(SVOptionCall<CursorSelectOption> opLambda) {
        doAcceptCursorSelectOption(opLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final TicketCB cb;
        if (mainCB != null) {
            cb = (TicketCB)mainCB;
        } else {
            cb = new TicketCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TicketCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TicketCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
