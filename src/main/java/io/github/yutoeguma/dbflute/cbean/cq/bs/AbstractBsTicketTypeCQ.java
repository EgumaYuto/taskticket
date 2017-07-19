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
 * The abstract condition-query of TICKET_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTicketTypeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTicketTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "TICKET_TYPE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketTypeId The value of ticketTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_Equal(Long ticketTypeId) {
        doSetTicketTypeId_Equal(ticketTypeId);
    }

    protected void doSetTicketTypeId_Equal(Long ticketTypeId) {
        regTicketTypeId(CK_EQ, ticketTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketTypeId The value of ticketTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_NotEqual(Long ticketTypeId) {
        doSetTicketTypeId_NotEqual(ticketTypeId);
    }

    protected void doSetTicketTypeId_NotEqual(Long ticketTypeId) {
        regTicketTypeId(CK_NES, ticketTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketTypeId The value of ticketTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_GreaterThan(Long ticketTypeId) {
        regTicketTypeId(CK_GT, ticketTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketTypeId The value of ticketTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_LessThan(Long ticketTypeId) {
        regTicketTypeId(CK_LT, ticketTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketTypeId The value of ticketTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_GreaterEqual(Long ticketTypeId) {
        regTicketTypeId(CK_GE, ticketTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketTypeId The value of ticketTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_LessEqual(Long ticketTypeId) {
        regTicketTypeId(CK_LE, ticketTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of ticketTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of ticketTypeId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTicketTypeId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTicketTypeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of ticketTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of ticketTypeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTicketTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTicketTypeId(), "TICKET_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketTypeIdList The collection of ticketTypeId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketTypeId_InScope(Collection<Long> ticketTypeIdList) {
        doSetTicketTypeId_InScope(ticketTypeIdList);
    }

    protected void doSetTicketTypeId_InScope(Collection<Long> ticketTypeIdList) {
        regINS(CK_INS, cTL(ticketTypeIdList), xgetCValueTicketTypeId(), "TICKET_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketTypeIdList The collection of ticketTypeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketTypeId_NotInScope(Collection<Long> ticketTypeIdList) {
        doSetTicketTypeId_NotInScope(ticketTypeIdList);
    }

    protected void doSetTicketTypeId_NotInScope(Collection<Long> ticketTypeIdList) {
        regINS(CK_NINS, cTL(ticketTypeIdList), xgetCValueTicketTypeId(), "TICKET_TYPE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TICKET_TYPE_ID from TICKET where ...)} <br>
     * (チケット)TICKET by TICKET_TYPE_ID, named 'ticketAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTicketTypeId_ExistsReferrer_TicketList(cb.query());
        registerExistsReferrer(cb.query(), "TICKET_TYPE_ID", "TICKET_TYPE_ID", pp, "ticketList");
    }
    public abstract String keepTicketTypeId_ExistsReferrer_TicketList(TicketCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TICKET_TYPE_ID from TICKET where ...)} <br>
     * (チケット)TICKET by TICKET_TYPE_ID, named 'ticketAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTicket</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketTypeId_NotExistsReferrer_TicketList for 'not exists'. (NotNull)
     */
    public void notExistsTicket(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTicketTypeId_NotExistsReferrer_TicketList(cb.query());
        registerNotExistsReferrer(cb.query(), "TICKET_TYPE_ID", "TICKET_TYPE_ID", pp, "ticketList");
    }
    public abstract String keepTicketTypeId_NotExistsReferrer_TicketList(TicketCQ sq);

    public void xsderiveTicketList(String fn, SubQuery<TicketCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTicketTypeId_SpecifyDerivedReferrer_TicketList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TICKET_TYPE_ID", "TICKET_TYPE_ID", pp, "ticketList", al, op);
    }
    public abstract String keepTicketTypeId_SpecifyDerivedReferrer_TicketList(TicketCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TICKET where ...)} <br>
     * (チケット)TICKET by TICKET_TYPE_ID, named 'ticketAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepTicketTypeId_QueryDerivedReferrer_TicketList(cb.query()); String prpp = keepTicketTypeId_QueryDerivedReferrer_TicketListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TICKET_TYPE_ID", "TICKET_TYPE_ID", sqpp, "ticketList", rd, vl, prpp, op);
    }
    public abstract String keepTicketTypeId_QueryDerivedReferrer_TicketList(TicketCQ sq);
    public abstract String keepTicketTypeId_QueryDerivedReferrer_TicketListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTicketTypeId_IsNull() { regTicketTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTicketTypeId_IsNotNull() { regTicketTypeId(CK_ISNN, DOBJ); }

    protected void regTicketTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketTypeId(), "TICKET_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueTicketTypeId();

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
     * (チケットタイプ名)TICKET_TYPE_NAME: {+UQ, NotNull, VARCHAR(128)}
     * @param ticketTypeName The value of ticketTypeName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketTypeName_Equal(String ticketTypeName) {
        doSetTicketTypeName_Equal(fRES(ticketTypeName));
    }

    protected void doSetTicketTypeName_Equal(String ticketTypeName) {
        regTicketTypeName(CK_EQ, ticketTypeName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットタイプ名)TICKET_TYPE_NAME: {+UQ, NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setTicketTypeName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ticketTypeName The value of ticketTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketTypeName_LikeSearch(String ticketTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketTypeName_LikeSearch(ticketTypeName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットタイプ名)TICKET_TYPE_NAME: {+UQ, NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setTicketTypeName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ticketTypeName The value of ticketTypeName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTicketTypeName_LikeSearch(String ticketTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ticketTypeName), xgetCValueTicketTypeName(), "TICKET_TYPE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットタイプ名)TICKET_TYPE_NAME: {+UQ, NotNull, VARCHAR(128)}
     * @param ticketTypeName The value of ticketTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketTypeName_NotLikeSearch(String ticketTypeName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketTypeName_NotLikeSearch(ticketTypeName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットタイプ名)TICKET_TYPE_NAME: {+UQ, NotNull, VARCHAR(128)}
     * @param ticketTypeName The value of ticketTypeName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTicketTypeName_NotLikeSearch(String ticketTypeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ticketTypeName), xgetCValueTicketTypeName(), "TICKET_TYPE_NAME", likeSearchOption);
    }

    protected void regTicketTypeName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketTypeName(), "TICKET_TYPE_NAME"); }
    protected abstract ConditionValue xgetCValueTicketTypeName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @param ticketTypeIcon The value of ticketTypeIcon as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketTypeIcon_Equal(String ticketTypeIcon) {
        doSetTicketTypeIcon_Equal(fRES(ticketTypeIcon));
    }

    protected void doSetTicketTypeIcon_Equal(String ticketTypeIcon) {
        regTicketTypeIcon(CK_EQ, ticketTypeIcon);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @param ticketTypeIcon The value of ticketTypeIcon as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketTypeIcon_NotEqual(String ticketTypeIcon) {
        doSetTicketTypeIcon_NotEqual(fRES(ticketTypeIcon));
    }

    protected void doSetTicketTypeIcon_NotEqual(String ticketTypeIcon) {
        regTicketTypeIcon(CK_NES, ticketTypeIcon);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @param ticketTypeIconList The collection of ticketTypeIcon as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketTypeIcon_InScope(Collection<String> ticketTypeIconList) {
        doSetTicketTypeIcon_InScope(ticketTypeIconList);
    }

    protected void doSetTicketTypeIcon_InScope(Collection<String> ticketTypeIconList) {
        regINS(CK_INS, cTL(ticketTypeIconList), xgetCValueTicketTypeIcon(), "TICKET_TYPE_ICON");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @param ticketTypeIconList The collection of ticketTypeIcon as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketTypeIcon_NotInScope(Collection<String> ticketTypeIconList) {
        doSetTicketTypeIcon_NotInScope(ticketTypeIconList);
    }

    protected void doSetTicketTypeIcon_NotInScope(Collection<String> ticketTypeIconList) {
        regINS(CK_NINS, cTL(ticketTypeIconList), xgetCValueTicketTypeIcon(), "TICKET_TYPE_ICON");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setTicketTypeIcon_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ticketTypeIcon The value of ticketTypeIcon as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketTypeIcon_LikeSearch(String ticketTypeIcon, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketTypeIcon_LikeSearch(ticketTypeIcon, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setTicketTypeIcon_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ticketTypeIcon The value of ticketTypeIcon as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTicketTypeIcon_LikeSearch(String ticketTypeIcon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ticketTypeIcon), xgetCValueTicketTypeIcon(), "TICKET_TYPE_ICON", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @param ticketTypeIcon The value of ticketTypeIcon as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketTypeIcon_NotLikeSearch(String ticketTypeIcon, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketTypeIcon_NotLikeSearch(ticketTypeIcon, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @param ticketTypeIcon The value of ticketTypeIcon as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTicketTypeIcon_NotLikeSearch(String ticketTypeIcon, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ticketTypeIcon), xgetCValueTicketTypeIcon(), "TICKET_TYPE_ICON", likeSearchOption);
    }

    protected void regTicketTypeIcon(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketTypeIcon(), "TICKET_TYPE_ICON"); }
    protected abstract ConditionValue xgetCValueTicketTypeIcon();

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
    public HpSLCFunction<TicketTypeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TicketTypeCB.class);
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
    public HpSLCFunction<TicketTypeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TicketTypeCB.class);
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
    public HpSLCFunction<TicketTypeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TicketTypeCB.class);
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
    public HpSLCFunction<TicketTypeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TicketTypeCB.class);
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
    public HpSLCFunction<TicketTypeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TicketTypeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TicketTypeCB&gt;() {
     *     public void query(TicketTypeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TicketTypeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TicketTypeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketTypeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TicketTypeCQ sq);

    protected TicketTypeCB xcreateScalarConditionCB() {
        TicketTypeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TicketTypeCB xcreateScalarConditionPartitionByCB() {
        TicketTypeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TicketTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketTypeCB cb = new TicketTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TICKET_TYPE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TicketTypeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TicketTypeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TicketTypeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketTypeCB cb = new TicketTypeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TICKET_TYPE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TicketTypeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TicketTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketTypeCB cb = new TicketTypeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TicketTypeCQ sq);

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
    protected TicketTypeCB newMyCB() {
        return new TicketTypeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TicketTypeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
