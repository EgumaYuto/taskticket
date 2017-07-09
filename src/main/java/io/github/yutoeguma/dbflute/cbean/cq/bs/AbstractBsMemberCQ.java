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
 * The abstract condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberId The value of memberId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterThan(Long memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberId The value of memberId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessThan(Long memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberId The value of memberId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_GreaterEqual(Long memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberId The value of memberId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberId_LessEqual(Long memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Long> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Long> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from PROJECT where ...)} <br>
     * (プロジェクト)PROJECT by MEMBER_ID, named 'projectAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsProject</span>(projectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     projectCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProjectList for 'exists'. (NotNull)
     */
    public void existsProject(SubQuery<ProjectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProjectCB cb = new ProjectCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_ProjectList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "projectList");
    }
    public abstract String keepMemberId_ExistsReferrer_ProjectList(ProjectCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from PROJECT_MEMBER where ...)} <br>
     * (プロジェクトメンバー)PROJECT_MEMBER by MEMBER_ID, named 'projectMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsProjectMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ProjectMemberList for 'exists'. (NotNull)
     */
    public void existsProjectMember(SubQuery<ProjectMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProjectMemberCB cb = new ProjectMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_ProjectMemberList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "projectMemberList");
    }
    public abstract String keepMemberId_ExistsReferrer_ProjectMemberList(ProjectMemberCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ASSIGNEED_MEMBER_ID from TICKET where ...)} <br>
     * (チケット)TICKET by ASSIGNEED_MEMBER_ID, named 'ticketByAssigneedMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTicketByAssigneedMemberId</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketByAssigneedMemberIdList for 'exists'. (NotNull)
     */
    public void existsTicketByAssigneedMemberId(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_TicketByAssigneedMemberIdList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "ASSIGNEED_MEMBER_ID", pp, "ticketByAssigneedMemberIdList");
    }
    public abstract String keepMemberId_ExistsReferrer_TicketByAssigneedMemberIdList(TicketCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from TICKET where ...)} <br>
     * (チケット)TICKET by MEMBER_ID, named 'ticketByMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTicketByMemberId</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketByMemberIdList for 'exists'. (NotNull)
     */
    public void existsTicketByMemberId(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_TicketByMemberIdList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketByMemberIdList");
    }
    public abstract String keepMemberId_ExistsReferrer_TicketByMemberIdList(TicketCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from TICKET_STATUS where ...)} <br>
     * (チケットステータス)TICKET_STATUS by MEMBER_ID, named 'ticketStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTicketStatus</span>(statusCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statusCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketStatusList for 'exists'. (NotNull)
     */
    public void existsTicketStatus(SubQuery<TicketStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketStatusCB cb = new TicketStatusCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_TicketStatusList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketStatusList");
    }
    public abstract String keepMemberId_ExistsReferrer_TicketStatusList(TicketStatusCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MEMBER_ID from TICKET_TYPE where ...)} <br>
     * (チケットタイプ)TICKET_TYPE by MEMBER_ID, named 'ticketTypeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTicketType</span>(typeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     typeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TicketTypeList for 'exists'. (NotNull)
     */
    public void existsTicketType(SubQuery<TicketTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketTypeCB cb = new TicketTypeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_ExistsReferrer_TicketTypeList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketTypeList");
    }
    public abstract String keepMemberId_ExistsReferrer_TicketTypeList(TicketTypeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from PROJECT where ...)} <br>
     * (プロジェクト)PROJECT by MEMBER_ID, named 'projectAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsProject</span>(projectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     projectCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_ProjectList for 'not exists'. (NotNull)
     */
    public void notExistsProject(SubQuery<ProjectCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProjectCB cb = new ProjectCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_ProjectList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "projectList");
    }
    public abstract String keepMemberId_NotExistsReferrer_ProjectList(ProjectCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from PROJECT_MEMBER where ...)} <br>
     * (プロジェクトメンバー)PROJECT_MEMBER by MEMBER_ID, named 'projectMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsProjectMember</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_ProjectMemberList for 'not exists'. (NotNull)
     */
    public void notExistsProjectMember(SubQuery<ProjectMemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProjectMemberCB cb = new ProjectMemberCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_ProjectMemberList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "projectMemberList");
    }
    public abstract String keepMemberId_NotExistsReferrer_ProjectMemberList(ProjectMemberCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ASSIGNEED_MEMBER_ID from TICKET where ...)} <br>
     * (チケット)TICKET by ASSIGNEED_MEMBER_ID, named 'ticketByAssigneedMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTicketByAssigneedMemberId</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_TicketByAssigneedMemberIdList for 'not exists'. (NotNull)
     */
    public void notExistsTicketByAssigneedMemberId(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_TicketByAssigneedMemberIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "ASSIGNEED_MEMBER_ID", pp, "ticketByAssigneedMemberIdList");
    }
    public abstract String keepMemberId_NotExistsReferrer_TicketByAssigneedMemberIdList(TicketCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from TICKET where ...)} <br>
     * (チケット)TICKET by MEMBER_ID, named 'ticketByMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTicketByMemberId</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_TicketByMemberIdList for 'not exists'. (NotNull)
     */
    public void notExistsTicketByMemberId(SubQuery<TicketCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketCB cb = new TicketCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_TicketByMemberIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketByMemberIdList");
    }
    public abstract String keepMemberId_NotExistsReferrer_TicketByMemberIdList(TicketCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from TICKET_STATUS where ...)} <br>
     * (チケットステータス)TICKET_STATUS by MEMBER_ID, named 'ticketStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTicketStatus</span>(statusCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statusCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_TicketStatusList for 'not exists'. (NotNull)
     */
    public void notExistsTicketStatus(SubQuery<TicketStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketStatusCB cb = new TicketStatusCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_TicketStatusList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketStatusList");
    }
    public abstract String keepMemberId_NotExistsReferrer_TicketStatusList(TicketStatusCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MEMBER_ID from TICKET_TYPE where ...)} <br>
     * (チケットタイプ)TICKET_TYPE by MEMBER_ID, named 'ticketTypeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTicketType</span>(typeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     typeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberId_NotExistsReferrer_TicketTypeList for 'not exists'. (NotNull)
     */
    public void notExistsTicketType(SubQuery<TicketTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TicketTypeCB cb = new TicketTypeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMemberId_NotExistsReferrer_TicketTypeList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketTypeList");
    }
    public abstract String keepMemberId_NotExistsReferrer_TicketTypeList(TicketTypeCQ sq);

    public void xsderiveProjectList(String fn, SubQuery<ProjectCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProjectCB cb = new ProjectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_ProjectList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "projectList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_ProjectList(ProjectCQ sq);

    public void xsderiveProjectMemberList(String fn, SubQuery<ProjectMemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProjectMemberCB cb = new ProjectMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_ProjectMemberList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "projectMemberList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_ProjectMemberList(ProjectMemberCQ sq);

    public void xsderiveTicketByAssigneedMemberIdList(String fn, SubQuery<TicketCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_TicketByAssigneedMemberIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "ASSIGNEED_MEMBER_ID", pp, "ticketByAssigneedMemberIdList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_TicketByAssigneedMemberIdList(TicketCQ sq);

    public void xsderiveTicketByMemberIdList(String fn, SubQuery<TicketCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_TicketByMemberIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketByMemberIdList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_TicketByMemberIdList(TicketCQ sq);

    public void xsderiveTicketStatusList(String fn, SubQuery<TicketStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketStatusCB cb = new TicketStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_TicketStatusList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketStatusList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_TicketStatusList(TicketStatusCQ sq);

    public void xsderiveTicketTypeList(String fn, SubQuery<TicketTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketTypeCB cb = new TicketTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepMemberId_SpecifyDerivedReferrer_TicketTypeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "ticketTypeList", al, op);
    }
    public abstract String keepMemberId_SpecifyDerivedReferrer_TicketTypeList(TicketTypeCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from PROJECT where ...)} <br>
     * (プロジェクト)PROJECT by MEMBER_ID, named 'projectAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedProject()</span>.<span style="color: #CC4747">max</span>(projectCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     projectCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     projectCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProjectCB> derivedProject() {
        return xcreateQDRFunctionProjectList();
    }
    protected HpQDRFunction<ProjectCB> xcreateQDRFunctionProjectList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveProjectList(fn, sq, rd, vl, op));
    }
    public void xqderiveProjectList(String fn, SubQuery<ProjectCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProjectCB cb = new ProjectCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_ProjectList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_ProjectListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "projectList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_ProjectList(ProjectCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_ProjectListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from PROJECT_MEMBER where ...)} <br>
     * (プロジェクトメンバー)PROJECT_MEMBER by MEMBER_ID, named 'projectMemberAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedProjectMember()</span>.<span style="color: #CC4747">max</span>(memberCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     memberCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     memberCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ProjectMemberCB> derivedProjectMember() {
        return xcreateQDRFunctionProjectMemberList();
    }
    protected HpQDRFunction<ProjectMemberCB> xcreateQDRFunctionProjectMemberList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveProjectMemberList(fn, sq, rd, vl, op));
    }
    public void xqderiveProjectMemberList(String fn, SubQuery<ProjectMemberCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProjectMemberCB cb = new ProjectMemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_ProjectMemberList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_ProjectMemberListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "projectMemberList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_ProjectMemberList(ProjectMemberCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_ProjectMemberListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TICKET where ...)} <br>
     * (チケット)TICKET by ASSIGNEED_MEMBER_ID, named 'ticketByAssigneedMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTicketByAssigneedMemberId()</span>.<span style="color: #CC4747">max</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ticketCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TicketCB> derivedTicketByAssigneedMemberId() {
        return xcreateQDRFunctionTicketByAssigneedMemberIdList();
    }
    protected HpQDRFunction<TicketCB> xcreateQDRFunctionTicketByAssigneedMemberIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTicketByAssigneedMemberIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTicketByAssigneedMemberIdList(String fn, SubQuery<TicketCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_TicketByAssigneedMemberIdList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_TicketByAssigneedMemberIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "ASSIGNEED_MEMBER_ID", sqpp, "ticketByAssigneedMemberIdList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_TicketByAssigneedMemberIdList(TicketCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_TicketByAssigneedMemberIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TICKET where ...)} <br>
     * (チケット)TICKET by MEMBER_ID, named 'ticketByMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTicketByMemberId()</span>.<span style="color: #CC4747">max</span>(ticketCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ticketCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     ticketCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TicketCB> derivedTicketByMemberId() {
        return xcreateQDRFunctionTicketByMemberIdList();
    }
    protected HpQDRFunction<TicketCB> xcreateQDRFunctionTicketByMemberIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTicketByMemberIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTicketByMemberIdList(String fn, SubQuery<TicketCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketCB cb = new TicketCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_TicketByMemberIdList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_TicketByMemberIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "ticketByMemberIdList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_TicketByMemberIdList(TicketCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_TicketByMemberIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TICKET_STATUS where ...)} <br>
     * (チケットステータス)TICKET_STATUS by MEMBER_ID, named 'ticketStatusAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTicketStatus()</span>.<span style="color: #CC4747">max</span>(statusCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     statusCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     statusCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TicketStatusCB> derivedTicketStatus() {
        return xcreateQDRFunctionTicketStatusList();
    }
    protected HpQDRFunction<TicketStatusCB> xcreateQDRFunctionTicketStatusList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTicketStatusList(fn, sq, rd, vl, op));
    }
    public void xqderiveTicketStatusList(String fn, SubQuery<TicketStatusCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketStatusCB cb = new TicketStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_TicketStatusList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_TicketStatusListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "ticketStatusList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_TicketStatusList(TicketStatusCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_TicketStatusListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TICKET_TYPE where ...)} <br>
     * (チケットタイプ)TICKET_TYPE by MEMBER_ID, named 'ticketTypeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTicketType()</span>.<span style="color: #CC4747">max</span>(typeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     typeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     typeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TicketTypeCB> derivedTicketType() {
        return xcreateQDRFunctionTicketTypeList();
    }
    protected HpQDRFunction<TicketTypeCB> xcreateQDRFunctionTicketTypeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTicketTypeList(fn, sq, rd, vl, op));
    }
    public void xqderiveTicketTypeList(String fn, SubQuery<TicketTypeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TicketTypeCB cb = new TicketTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepMemberId_QueryDerivedReferrer_TicketTypeList(cb.query()); String prpp = keepMemberId_QueryDerivedReferrer_TicketTypeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "ticketTypeList", rd, vl, prpp, op);
    }
    public abstract String keepMemberId_QueryDerivedReferrer_TicketTypeList(TicketTypeCQ sq);
    public abstract String keepMemberId_QueryDerivedReferrer_TicketTypeListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberId_IsNull() { regMemberId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberId_IsNotNull() { regMemberId(CK_ISNN, DOBJ); }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)}
     * @param memberName The value of memberName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setMemberName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberName_LikeSearch(memberName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), xgetCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemberName_NotLikeSearch(memberName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), xgetCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    protected void regMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberName(), "MEMBER_NAME"); }
    protected abstract ConditionValue xgetCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param password The value of password as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param password The value of password as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param passwordList The collection of password as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param passwordList The collection of password as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @param emailAddress The value of emailAddress as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_Equal(String emailAddress) {
        doSetEmailAddress_Equal(fRES(emailAddress));
    }

    protected void doSetEmailAddress_Equal(String emailAddress) {
        regEmailAddress(CK_EQ, emailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @param emailAddress The value of emailAddress as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_NotEqual(String emailAddress) {
        doSetEmailAddress_NotEqual(fRES(emailAddress));
    }

    protected void doSetEmailAddress_NotEqual(String emailAddress) {
        regEmailAddress(CK_NES, emailAddress);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @param emailAddressList The collection of emailAddress as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_InScope(Collection<String> emailAddressList) {
        doSetEmailAddress_InScope(emailAddressList);
    }

    protected void doSetEmailAddress_InScope(Collection<String> emailAddressList) {
        regINS(CK_INS, cTL(emailAddressList), xgetCValueEmailAddress(), "EMAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @param emailAddressList The collection of emailAddress as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setEmailAddress_NotInScope(Collection<String> emailAddressList) {
        doSetEmailAddress_NotInScope(emailAddressList);
    }

    protected void doSetEmailAddress_NotInScope(Collection<String> emailAddressList) {
        regINS(CK_NINS, cTL(emailAddressList), xgetCValueEmailAddress(), "EMAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setEmailAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param emailAddress The value of emailAddress as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmailAddress_LikeSearch(String emailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmailAddress_LikeSearch(emailAddress, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setEmailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param emailAddress The value of emailAddress as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEmailAddress_LikeSearch(String emailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(emailAddress), xgetCValueEmailAddress(), "EMAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @param emailAddress The value of emailAddress as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmailAddress_NotLikeSearch(String emailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmailAddress_NotLikeSearch(emailAddress, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @param emailAddress The value of emailAddress as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEmailAddress_NotLikeSearch(String emailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(emailAddress), xgetCValueEmailAddress(), "EMAIL_ADDRESS", likeSearchOption);
    }

    protected void regEmailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmailAddress(), "EMAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueEmailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Provisional (PRV). And OnlyOnceRegistered. <br>
     * Provisional: 正式な会員としてサイトサービスが利用可能
     */
    public void setMemberStatusCode_Equal_Provisional() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    /**
     * Equal(=). As Withdrawal (WDL). And OnlyOnceRegistered. <br>
     * Withdrawal: 退会が確定した会員でサイトサービスはダメ
     */
    public void setMemberStatusCode_Equal_Withdrawal() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Equal(=). As Formalized (FMV). And OnlyOnceRegistered. <br>
     * Formalized: 入会直後のステータスで一部のサイトサービスが利用可能
     */
    public void setMemberStatusCode_Equal_Formalized() {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, memberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Provisional (PRV). And OnlyOnceRegistered. <br>
     * Provisional: 正式な会員としてサイトサービスが利用可能
     */
    public void setMemberStatusCode_NotEqual_Provisional() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    /**
     * NotEqual(&lt;&gt;). As Withdrawal (WDL). And OnlyOnceRegistered. <br>
     * Withdrawal: 退会が確定した会員でサイトサービスはダメ
     */
    public void setMemberStatusCode_NotEqual_Withdrawal() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * NotEqual(&lt;&gt;). As Formalized (FMV). And OnlyOnceRegistered. <br>
     * Formalized: 入会直後のステータスで一部のサイトサービスが利用可能
     */
    public void setMemberStatusCode_NotEqual_Formalized() {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, memberStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status of member from entry to withdrawal <br>
     * means member that can use services <br>
     * The group elements:[Formalized, Provisional]
     */
    public void setMemberStatusCode_InScope_ServiceAvailable() {
        setMemberStatusCode_InScope_AsMemberStatus(CDef.MemberStatus.listOfServiceAvailable());
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * status of member from entry to withdrawal <br>
     * Members are not formalized yet <br>
     * The group elements:[Provisional]
     */
    public void setMemberStatusCode_InScope_ShortOfFormalized() {
        setMemberStatusCode_InScope_AsMemberStatus(CDef.MemberStatus.listOfShortOfFormalized());
    }

    protected void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    protected void regMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueMemberStatusCode();

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
    public HpSLCFunction<MemberCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MemberCB.class);
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
    public HpSLCFunction<MemberCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MemberCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MemberCQ sq);

    protected MemberCB xcreateScalarConditionCB() {
        MemberCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberCB xcreateScalarConditionPartitionByCB() {
        MemberCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberCQ sq);

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
    protected MemberCB newMyCB() {
        return new MemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
