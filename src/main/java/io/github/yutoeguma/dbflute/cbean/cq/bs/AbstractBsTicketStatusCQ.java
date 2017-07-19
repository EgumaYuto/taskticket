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

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import io.github.yutoeguma.dbflute.allcommon.*;
import io.github.yutoeguma.dbflute.cbean.*;
import io.github.yutoeguma.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of TICKET_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTicketStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTicketStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "TICKET_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketStatusId The value of ticketStatusId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_Equal(Long ticketStatusId) {
        doSetTicketStatusId_Equal(ticketStatusId);
    }

    protected void doSetTicketStatusId_Equal(Long ticketStatusId) {
        regTicketStatusId(CK_EQ, ticketStatusId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketStatusId The value of ticketStatusId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_NotEqual(Long ticketStatusId) {
        doSetTicketStatusId_NotEqual(ticketStatusId);
    }

    protected void doSetTicketStatusId_NotEqual(Long ticketStatusId) {
        regTicketStatusId(CK_NES, ticketStatusId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketStatusId The value of ticketStatusId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_GreaterThan(Long ticketStatusId) {
        regTicketStatusId(CK_GT, ticketStatusId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketStatusId The value of ticketStatusId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_LessThan(Long ticketStatusId) {
        regTicketStatusId(CK_LT, ticketStatusId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketStatusId The value of ticketStatusId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_GreaterEqual(Long ticketStatusId) {
        regTicketStatusId(CK_GE, ticketStatusId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketStatusId The value of ticketStatusId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_LessEqual(Long ticketStatusId) {
        regTicketStatusId(CK_LE, ticketStatusId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of ticketStatusId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of ticketStatusId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTicketStatusId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTicketStatusId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of ticketStatusId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of ticketStatusId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTicketStatusId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTicketStatusId(), "TICKET_STATUS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketStatusIdList The collection of ticketStatusId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketStatusId_InScope(Collection<Long> ticketStatusIdList) {
        doSetTicketStatusId_InScope(ticketStatusIdList);
    }

    protected void doSetTicketStatusId_InScope(Collection<Long> ticketStatusIdList) {
        regINS(CK_INS, cTL(ticketStatusIdList), xgetCValueTicketStatusId(), "TICKET_STATUS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketStatusIdList The collection of ticketStatusId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketStatusId_NotInScope(Collection<Long> ticketStatusIdList) {
        doSetTicketStatusId_NotInScope(ticketStatusIdList);
    }

    protected void doSetTicketStatusId_NotInScope(Collection<Long> ticketStatusIdList) {
        regINS(CK_NINS, cTL(ticketStatusIdList), xgetCValueTicketStatusId(), "TICKET_STATUS_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TICKET_STATUS_ID from TICKET where ...)} <br>
     * (チケット)TICKET by TICKET_STATUS_ID, named 'ticketAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTicket</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketList for 'exists'. (NotNull)
     */
    public void existsTicket(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTicketStatusId_ExistsReferrer_TicketList(cb.query());
        registerExistsReferrer(cb.query(), "TICKET_STATUS_ID", "TICKET_STATUS_ID", pp, "ticketList");
    }
    public abstract String keepTicketStatusId_ExistsReferrer_TicketList(TicketCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TICKET_STATUS_ID from TICKET where ...)} <br>
     * (チケット)TICKET by TICKET_STATUS_ID, named 'ticketAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTicket</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketStatusId_NotExistsReferrer_TicketList for 'not exists'. (NotNull)
     */
    public void notExistsTicket(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTicketStatusId_NotExistsReferrer_TicketList(cb.query());
        registerNotExistsReferrer(cb.query(), "TICKET_STATUS_ID", "TICKET_STATUS_ID", pp, "ticketList");
    }
    public abstract String keepTicketStatusId_NotExistsReferrer_TicketList(TicketCQ sq);

    public void xsderiveTicketList(String fn, SubQuery<TicketCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTicketStatusId_SpecifyDerivedReferrer_TicketList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TICKET_STATUS_ID", "TICKET_STATUS_ID", pp, "ticketList", al, op);
    }
    public abstract String keepTicketStatusId_SpecifyDerivedReferrer_TicketList(TicketCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TICKET where ...)} <br>
     * (チケット)TICKET by TICKET_STATUS_ID, named 'ticketAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTicket()</span>.<span style="color: #CC4747">max</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ticketCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TicketCB> derivedTicket() {
        return xcreateQDRFunctionTicketList();
    }
    protected HpQDRFunction<TicketCB> xcreateQDRFunctionTicketList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTicketList(fn, sq, rd, vl, op));
    }
    public void xqderiveTicketList(String fn, SubQuery<TicketCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTicketStatusId_QueryDerivedReferrer_TicketList(cb.query()); String prpp = keepTicketStatusId_QueryDerivedReferrer_TicketListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TICKET_STATUS_ID", "TICKET_STATUS_ID", sqpp, "ticketList", rd, vl, prpp, op);
    }
    public abstract String keepTicketStatusId_QueryDerivedReferrer_TicketList(TicketCQ sq);
    public abstract String keepTicketStatusId_QueryDerivedReferrer_TicketListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTicketStatusId_IsNull() { regTicketStatusId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTicketStatusId_IsNotNull() { regTicketStatusId(CK_ISNN, DOBJ); }

    protected void regTicketStatusId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketStatusId(), "TICKET_STATUS_ID"); }
    protected abstract ConditionValue xgetCValueTicketStatusId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_Equal(Long projectId) {
        doSetProjectId_Equal(projectId);
    }

    protected void doSetProjectId_Equal(Long projectId) {
        regProjectId(CK_EQ, projectId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_NotEqual(Long projectId) {
        doSetProjectId_NotEqual(projectId);
    }

    protected void doSetProjectId_NotEqual(Long projectId) {
        regProjectId(CK_NES, projectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_GreaterThan(Long projectId) {
        regProjectId(CK_GT, projectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_LessThan(Long projectId) {
        regProjectId(CK_LT, projectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_GreaterEqual(Long projectId) {
        regProjectId(CK_GE, projectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_LessEqual(Long projectId) {
        regProjectId(CK_LE, projectId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param minNumber The min number of projectId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of projectId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setProjectId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setProjectId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param minNumber The min number of projectId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of projectId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setProjectId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProjectId(), "PROJECT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectIdList The collection of projectId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProjectId_InScope(Collection<Long> projectIdList) {
        doSetProjectId_InScope(projectIdList);
    }

    protected void doSetProjectId_InScope(Collection<Long> projectIdList) {
        regINS(CK_INS, cTL(projectIdList), xgetCValueProjectId(), "PROJECT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectIdList The collection of projectId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProjectId_NotInScope(Collection<Long> projectIdList) {
        doSetProjectId_NotInScope(projectIdList);
    }

    protected void doSetProjectId_NotInScope(Collection<Long> projectIdList) {
        regINS(CK_NINS, cTL(projectIdList), xgetCValueProjectId(), "PROJECT_ID");
    }

    protected void regProjectId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProjectId(), "PROJECT_ID"); }
    protected abstract ConditionValue xgetCValueProjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (チケットステータス名)TICKET_STATUS_NAME: {+UQ, NotNull, VARCHAR(128)}
     * @param ticketStatusName The value of ticketStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketStatusName_Equal(String ticketStatusName) {
        doSetTicketStatusName_Equal(fRES(ticketStatusName));
    }

    protected void doSetTicketStatusName_Equal(String ticketStatusName) {
        regTicketStatusName(CK_EQ, ticketStatusName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットステータス名)TICKET_STATUS_NAME: {+UQ, NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setTicketStatusName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ticketStatusName The value of ticketStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketStatusName_LikeSearch(String ticketStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketStatusName_LikeSearch(ticketStatusName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットステータス名)TICKET_STATUS_NAME: {+UQ, NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setTicketStatusName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ticketStatusName The value of ticketStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTicketStatusName_LikeSearch(String ticketStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ticketStatusName), xgetCValueTicketStatusName(), "TICKET_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットステータス名)TICKET_STATUS_NAME: {+UQ, NotNull, VARCHAR(128)}
     * @param ticketStatusName The value of ticketStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketStatusName_NotLikeSearch(String ticketStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketStatusName_NotLikeSearch(ticketStatusName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットステータス名)TICKET_STATUS_NAME: {+UQ, NotNull, VARCHAR(128)}
     * @param ticketStatusName The value of ticketStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTicketStatusName_NotLikeSearch(String ticketStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ticketStatusName), xgetCValueTicketStatusName(), "TICKET_STATUS_NAME", likeSearchOption);
    }

    protected void regTicketStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketStatusName(), "TICKET_STATUS_NAME"); }
    protected abstract ConditionValue xgetCValueTicketStatusName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @param ticketStatusIcon The value of ticketStatusIcon as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketStatusIcon_Equal(String ticketStatusIcon) {
        doSetTicketStatusIcon_Equal(fRES(ticketStatusIcon));
    }

    protected void doSetTicketStatusIcon_Equal(String ticketStatusIcon) {
        regTicketStatusIcon(CK_EQ, ticketStatusIcon);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @param ticketStatusIcon The value of ticketStatusIcon as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketStatusIcon_NotEqual(String ticketStatusIcon) {
        doSetTicketStatusIcon_NotEqual(fRES(ticketStatusIcon));
    }

    protected void doSetTicketStatusIcon_NotEqual(String ticketStatusIcon) {
        regTicketStatusIcon(CK_NES, ticketStatusIcon);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @param ticketStatusIconList The collection of ticketStatusIcon as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketStatusIcon_InScope(Collection<String> ticketStatusIconList) {
        doSetTicketStatusIcon_InScope(ticketStatusIconList);
    }

    protected void doSetTicketStatusIcon_InScope(Collection<String> ticketStatusIconList) {
        regINS(CK_INS, cTL(ticketStatusIconList), xgetCValueTicketStatusIcon(), "TICKET_STATUS_ICON");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @param ticketStatusIconList The collection of ticketStatusIcon as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketStatusIcon_NotInScope(Collection<String> ticketStatusIconList) {
        doSetTicketStatusIcon_NotInScope(ticketStatusIconList);
    }

    protected void doSetTicketStatusIcon_NotInScope(Collection<String> ticketStatusIconList) {
        regINS(CK_NINS, cTL(ticketStatusIconList), xgetCValueTicketStatusIcon(), "TICKET_STATUS_ICON");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setTicketStatusIcon_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ticketStatusIcon The value of ticketStatusIcon as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketStatusIcon_LikeSearch(String ticketStatusIcon, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketStatusIcon_LikeSearch(ticketStatusIcon, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setTicketStatusIcon_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ticketStatusIcon The value of ticketStatusIcon as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTicketStatusIcon_LikeSearch(String ticketStatusIcon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ticketStatusIcon), xgetCValueTicketStatusIcon(), "TICKET_STATUS_ICON", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @param ticketStatusIcon The value of ticketStatusIcon as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketStatusIcon_NotLikeSearch(String ticketStatusIcon, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketStatusIcon_NotLikeSearch(ticketStatusIcon, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @param ticketStatusIcon The value of ticketStatusIcon as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTicketStatusIcon_NotLikeSearch(String ticketStatusIcon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ticketStatusIcon), xgetCValueTicketStatusIcon(), "TICKET_STATUS_ICON", likeSearchOption);
    }

    protected void regTicketStatusIcon(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketStatusIcon(), "TICKET_STATUS_ICON"); }
    protected abstract ConditionValue xgetCValueTicketStatusIcon();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg}
     * @param delFlg The value of delFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(Boolean delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    /**
     * Equal(=). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetDelFlg_Equal(cdef != null ? Boolean.valueOf(cdef.code()) : null);
    }

    /**
     * Equal(=). As True. And OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setDelFlg_Equal_True() {
        doSetDelFlg_Equal(Boolean.valueOf(CDef.Flg.True.code()));
    }

    /**
     * Equal(=). As False. And OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setDelFlg_Equal_False() {
        doSetDelFlg_Equal(Boolean.valueOf(CDef.Flg.False.code()));
    }

    protected void doSetDelFlg_Equal(Boolean delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TicketStatusCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TicketStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TicketStatusCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TicketStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TicketStatusCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TicketStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TicketStatusCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TicketStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TicketStatusCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TicketStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TicketStatusCB&gt;() {
     *     public void query(TicketStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TicketStatusCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TicketStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketStatusCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TicketStatusCQ sq);

    protected TicketStatusCB xcreateScalarConditionCB() {
        TicketStatusCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TicketStatusCB xcreateScalarConditionPartitionByCB() {
        TicketStatusCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TicketStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketStatusCB cb = new TicketStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TICKET_STATUS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TicketStatusCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TicketStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TicketStatusCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketStatusCB cb = new TicketStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TICKET_STATUS_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TicketStatusCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TicketStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketStatusCB cb = new TicketStatusCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TicketStatusCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TicketStatusCB newMyCB() {
        return new TicketStatusCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TicketStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
