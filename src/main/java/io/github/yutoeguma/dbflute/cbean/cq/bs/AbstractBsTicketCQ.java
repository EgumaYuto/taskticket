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
 * The abstract condition-query of TICKET.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTicketCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTicketCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "TICKET";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketId The value of ticketId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketId_Equal(Long ticketId) {
        doSetTicketId_Equal(ticketId);
    }

    protected void doSetTicketId_Equal(Long ticketId) {
        regTicketId(CK_EQ, ticketId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketId The value of ticketId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketId_NotEqual(Long ticketId) {
        doSetTicketId_NotEqual(ticketId);
    }

    protected void doSetTicketId_NotEqual(Long ticketId) {
        regTicketId(CK_NES, ticketId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketId The value of ticketId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketId_GreaterThan(Long ticketId) {
        regTicketId(CK_GT, ticketId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketId The value of ticketId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketId_LessThan(Long ticketId) {
        regTicketId(CK_LT, ticketId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketId The value of ticketId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketId_GreaterEqual(Long ticketId) {
        regTicketId(CK_GE, ticketId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketId The value of ticketId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketId_LessEqual(Long ticketId) {
        regTicketId(CK_LE, ticketId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of ticketId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of ticketId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTicketId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTicketId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of ticketId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of ticketId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTicketId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTicketId(), "TICKET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketIdList The collection of ticketId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketId_InScope(Collection<Long> ticketIdList) {
        doSetTicketId_InScope(ticketIdList);
    }

    protected void doSetTicketId_InScope(Collection<Long> ticketIdList) {
        regINS(CK_INS, cTL(ticketIdList), xgetCValueTicketId(), "TICKET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param ticketIdList The collection of ticketId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketId_NotInScope(Collection<Long> ticketIdList) {
        doSetTicketId_NotInScope(ticketIdList);
    }

    protected void doSetTicketId_NotInScope(Collection<Long> ticketIdList) {
        regINS(CK_NINS, cTL(ticketIdList), xgetCValueTicketId(), "TICKET_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PARENT_TICKET_ID from TICKET where ...)} <br>
     * (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTicketSelf</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketSelfList for 'exists'. (NotNull)
     */
    public void existsTicketSelf(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTicketId_ExistsReferrer_TicketSelfList(cb.query());
        registerExistsReferrer(cb.query(), "TICKET_ID", "PARENT_TICKET_ID", pp, "ticketSelfList");
    }
    public abstract String keepTicketId_ExistsReferrer_TicketSelfList(TicketCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PARENT_TICKET_ID from TICKET where ...)} <br>
     * (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTicketSelf</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketId_NotExistsReferrer_TicketSelfList for 'not exists'. (NotNull)
     */
    public void notExistsTicketSelf(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTicketId_NotExistsReferrer_TicketSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "TICKET_ID", "PARENT_TICKET_ID", pp, "ticketSelfList");
    }
    public abstract String keepTicketId_NotExistsReferrer_TicketSelfList(TicketCQ sq);

    public void xsderiveTicketSelfList(String fn, SubQuery<TicketCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTicketId_SpecifyDerivedReferrer_TicketSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TICKET_ID", "PARENT_TICKET_ID", pp, "ticketSelfList", al, op);
    }
    public abstract String keepTicketId_SpecifyDerivedReferrer_TicketSelfList(TicketCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TICKET where ...)} <br>
     * (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTicketSelf()</span>.<span style="color: #CC4747">max</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ticketCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TicketCB> derivedTicketSelf() {
        return xcreateQDRFunctionTicketSelfList();
    }
    protected HpQDRFunction<TicketCB> xcreateQDRFunctionTicketSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTicketSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveTicketSelfList(String fn, SubQuery<TicketCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTicketId_QueryDerivedReferrer_TicketSelfList(cb.query()); String prpp = keepTicketId_QueryDerivedReferrer_TicketSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TICKET_ID", "PARENT_TICKET_ID", sqpp, "ticketSelfList", rd, vl, prpp, op);
    }
    public abstract String keepTicketId_QueryDerivedReferrer_TicketSelfList(TicketCQ sq);
    public abstract String keepTicketId_QueryDerivedReferrer_TicketSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTicketId_IsNull() { regTicketId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTicketId_IsNotNull() { regTicketId(CK_ISNN, DOBJ); }

    protected void regTicketId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketId(), "TICKET_ID"); }
    protected abstract ConditionValue xgetCValueTicketId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param parentTicketId The value of parentTicketId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentTicketId_Equal(Long parentTicketId) {
        doSetParentTicketId_Equal(parentTicketId);
    }

    protected void doSetParentTicketId_Equal(Long parentTicketId) {
        regParentTicketId(CK_EQ, parentTicketId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param parentTicketId The value of parentTicketId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentTicketId_NotEqual(Long parentTicketId) {
        doSetParentTicketId_NotEqual(parentTicketId);
    }

    protected void doSetParentTicketId_NotEqual(Long parentTicketId) {
        regParentTicketId(CK_NES, parentTicketId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param parentTicketId The value of parentTicketId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentTicketId_GreaterThan(Long parentTicketId) {
        regParentTicketId(CK_GT, parentTicketId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param parentTicketId The value of parentTicketId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentTicketId_LessThan(Long parentTicketId) {
        regParentTicketId(CK_LT, parentTicketId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param parentTicketId The value of parentTicketId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentTicketId_GreaterEqual(Long parentTicketId) {
        regParentTicketId(CK_GE, parentTicketId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param parentTicketId The value of parentTicketId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParentTicketId_LessEqual(Long parentTicketId) {
        regParentTicketId(CK_LE, parentTicketId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param minNumber The min number of parentTicketId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of parentTicketId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParentTicketId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParentTicketId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param minNumber The min number of parentTicketId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of parentTicketId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setParentTicketId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParentTicketId(), "PARENT_TICKET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param parentTicketIdList The collection of parentTicketId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentTicketId_InScope(Collection<Long> parentTicketIdList) {
        doSetParentTicketId_InScope(parentTicketIdList);
    }

    protected void doSetParentTicketId_InScope(Collection<Long> parentTicketIdList) {
        regINS(CK_INS, cTL(parentTicketIdList), xgetCValueParentTicketId(), "PARENT_TICKET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @param parentTicketIdList The collection of parentTicketId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setParentTicketId_NotInScope(Collection<Long> parentTicketIdList) {
        doSetParentTicketId_NotInScope(parentTicketIdList);
    }

    protected void doSetParentTicketId_NotInScope(Collection<Long> parentTicketIdList) {
        regINS(CK_NINS, cTL(parentTicketIdList), xgetCValueParentTicketId(), "PARENT_TICKET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     */
    public void setParentTicketId_IsNull() { regParentTicketId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     */
    public void setParentTicketId_IsNotNull() { regParentTicketId(CK_ISNN, DOBJ); }

    protected void regParentTicketId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParentTicketId(), "PARENT_TICKET_ID"); }
    protected abstract ConditionValue xgetCValueParentTicketId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_Equal(Long memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Long memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_NotEqual(Long memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Long memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Long> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Long> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param assigneedMemberId The value of assigneedMemberId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssigneedMemberId_Equal(Long assigneedMemberId) {
        doSetAssigneedMemberId_Equal(assigneedMemberId);
    }

    protected void doSetAssigneedMemberId_Equal(Long assigneedMemberId) {
        regAssigneedMemberId(CK_EQ, assigneedMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param assigneedMemberId The value of assigneedMemberId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssigneedMemberId_NotEqual(Long assigneedMemberId) {
        doSetAssigneedMemberId_NotEqual(assigneedMemberId);
    }

    protected void doSetAssigneedMemberId_NotEqual(Long assigneedMemberId) {
        regAssigneedMemberId(CK_NES, assigneedMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param assigneedMemberId The value of assigneedMemberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssigneedMemberId_GreaterThan(Long assigneedMemberId) {
        regAssigneedMemberId(CK_GT, assigneedMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param assigneedMemberId The value of assigneedMemberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssigneedMemberId_LessThan(Long assigneedMemberId) {
        regAssigneedMemberId(CK_LT, assigneedMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param assigneedMemberId The value of assigneedMemberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssigneedMemberId_GreaterEqual(Long assigneedMemberId) {
        regAssigneedMemberId(CK_GE, assigneedMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param assigneedMemberId The value of assigneedMemberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssigneedMemberId_LessEqual(Long assigneedMemberId) {
        regAssigneedMemberId(CK_LE, assigneedMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param minNumber The min number of assigneedMemberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of assigneedMemberId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAssigneedMemberId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAssigneedMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param minNumber The min number of assigneedMemberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of assigneedMemberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAssigneedMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssigneedMemberId(), "ASSIGNEED_MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param assigneedMemberIdList The collection of assigneedMemberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAssigneedMemberId_InScope(Collection<Long> assigneedMemberIdList) {
        doSetAssigneedMemberId_InScope(assigneedMemberIdList);
    }

    protected void doSetAssigneedMemberId_InScope(Collection<Long> assigneedMemberIdList) {
        regINS(CK_INS, cTL(assigneedMemberIdList), xgetCValueAssigneedMemberId(), "ASSIGNEED_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @param assigneedMemberIdList The collection of assigneedMemberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAssigneedMemberId_NotInScope(Collection<Long> assigneedMemberIdList) {
        doSetAssigneedMemberId_NotInScope(assigneedMemberIdList);
    }

    protected void doSetAssigneedMemberId_NotInScope(Collection<Long> assigneedMemberIdList) {
        regINS(CK_NINS, cTL(assigneedMemberIdList), xgetCValueAssigneedMemberId(), "ASSIGNEED_MEMBER_ID");
    }

    protected void regAssigneedMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssigneedMemberId(), "ASSIGNEED_MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueAssigneedMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
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
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
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
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @param ticketTypeId The value of ticketTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_GreaterThan(Long ticketTypeId) {
        regTicketTypeId(CK_GT, ticketTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @param ticketTypeId The value of ticketTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_LessThan(Long ticketTypeId) {
        regTicketTypeId(CK_LT, ticketTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @param ticketTypeId The value of ticketTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_GreaterEqual(Long ticketTypeId) {
        regTicketTypeId(CK_GE, ticketTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @param ticketTypeId The value of ticketTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketTypeId_LessEqual(Long ticketTypeId) {
        regTicketTypeId(CK_LE, ticketTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
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
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @param minNumber The min number of ticketTypeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of ticketTypeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTicketTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTicketTypeId(), "TICKET_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
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
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @param ticketTypeIdList The collection of ticketTypeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketTypeId_NotInScope(Collection<Long> ticketTypeIdList) {
        doSetTicketTypeId_NotInScope(ticketTypeIdList);
    }

    protected void doSetTicketTypeId_NotInScope(Collection<Long> ticketTypeIdList) {
        regINS(CK_NINS, cTL(ticketTypeIdList), xgetCValueTicketTypeId(), "TICKET_TYPE_ID");
    }

    protected void regTicketTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketTypeId(), "TICKET_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueTicketTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
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
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
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
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @param ticketStatusId The value of ticketStatusId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_GreaterThan(Long ticketStatusId) {
        regTicketStatusId(CK_GT, ticketStatusId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @param ticketStatusId The value of ticketStatusId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_LessThan(Long ticketStatusId) {
        regTicketStatusId(CK_LT, ticketStatusId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @param ticketStatusId The value of ticketStatusId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_GreaterEqual(Long ticketStatusId) {
        regTicketStatusId(CK_GE, ticketStatusId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @param ticketStatusId The value of ticketStatusId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTicketStatusId_LessEqual(Long ticketStatusId) {
        regTicketStatusId(CK_LE, ticketStatusId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
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
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @param minNumber The min number of ticketStatusId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of ticketStatusId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTicketStatusId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTicketStatusId(), "TICKET_STATUS_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
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
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @param ticketStatusIdList The collection of ticketStatusId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketStatusId_NotInScope(Collection<Long> ticketStatusIdList) {
        doSetTicketStatusId_NotInScope(ticketStatusIdList);
    }

    protected void doSetTicketStatusId_NotInScope(Collection<Long> ticketStatusIdList) {
        regINS(CK_NINS, cTL(ticketStatusIdList), xgetCValueTicketStatusId(), "TICKET_STATUS_ID");
    }

    protected void regTicketStatusId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketStatusId(), "TICKET_STATUS_ID"); }
    protected abstract ConditionValue xgetCValueTicketStatusId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
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
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
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
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_GreaterThan(Long projectId) {
        regProjectId(CK_GT, projectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_LessThan(Long projectId) {
        regProjectId(CK_LT, projectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_GreaterEqual(Long projectId) {
        regProjectId(CK_GE, projectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
     * @param projectId The value of projectId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProjectId_LessEqual(Long projectId) {
        regProjectId(CK_LE, projectId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
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
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
     * @param minNumber The min number of projectId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of projectId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setProjectId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProjectId(), "PROJECT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
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
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
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
     * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)}
     * @param ticketName The value of ticketName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketName_Equal(String ticketName) {
        doSetTicketName_Equal(fRES(ticketName));
    }

    protected void doSetTicketName_Equal(String ticketName) {
        regTicketName(CK_EQ, ticketName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setTicketName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ticketName The value of ticketName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketName_LikeSearch(String ticketName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketName_LikeSearch(ticketName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)} <br>
     * <pre>e.g. setTicketName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ticketName The value of ticketName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTicketName_LikeSearch(String ticketName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ticketName), xgetCValueTicketName(), "TICKET_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)}
     * @param ticketName The value of ticketName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketName_NotLikeSearch(String ticketName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketName_NotLikeSearch(ticketName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)}
     * @param ticketName The value of ticketName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTicketName_NotLikeSearch(String ticketName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ticketName), xgetCValueTicketName(), "TICKET_NAME", likeSearchOption);
    }

    protected void regTicketName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketName(), "TICKET_NAME"); }
    protected abstract ConditionValue xgetCValueTicketName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)}
     * @param ticketDetail The value of ticketDetail as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTicketDetail_Equal(String ticketDetail) {
        doSetTicketDetail_Equal(fRES(ticketDetail));
    }

    protected void doSetTicketDetail_Equal(String ticketDetail) {
        regTicketDetail(CK_EQ, ticketDetail);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setTicketDetail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param ticketDetail The value of ticketDetail as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketDetail_LikeSearch(String ticketDetail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketDetail_LikeSearch(ticketDetail, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setTicketDetail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ticketDetail The value of ticketDetail as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTicketDetail_LikeSearch(String ticketDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ticketDetail), xgetCValueTicketDetail(), "TICKET_DETAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)}
     * @param ticketDetail The value of ticketDetail as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTicketDetail_NotLikeSearch(String ticketDetail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTicketDetail_NotLikeSearch(ticketDetail, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)}
     * @param ticketDetail The value of ticketDetail as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTicketDetail_NotLikeSearch(String ticketDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ticketDetail), xgetCValueTicketDetail(), "TICKET_DETAIL", likeSearchOption);
    }

    protected void regTicketDetail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTicketDetail(), "TICKET_DETAIL"); }
    protected abstract ConditionValue xgetCValueTicketDetail();

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

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

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
    public HpSLCFunction<TicketCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TicketCB.class);
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
    public HpSLCFunction<TicketCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TicketCB.class);
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
    public HpSLCFunction<TicketCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TicketCB.class);
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
    public HpSLCFunction<TicketCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TicketCB.class);
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
    public HpSLCFunction<TicketCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TicketCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TicketCB&gt;() {
     *     public void query(TicketCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TicketCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TicketCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TicketCQ sq);

    protected TicketCB xcreateScalarConditionCB() {
        TicketCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TicketCB xcreateScalarConditionPartitionByCB() {
        TicketCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TicketCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TICKET_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TicketCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TicketCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TicketCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TICKET_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TicketCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TicketCQ sq);

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
    protected TicketCB newMyCB() {
        return new TicketCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TicketCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
