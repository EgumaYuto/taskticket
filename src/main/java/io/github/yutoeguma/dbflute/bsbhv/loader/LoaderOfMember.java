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
package io.github.yutoeguma.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import io.github.yutoeguma.dbflute.exbhv.*;
import io.github.yutoeguma.dbflute.exentity.*;
import io.github.yutoeguma.dbflute.cbean.*;

/**
 * The referrer loader of (メンバー)MEMBER as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PASSWORD, EMAIL_ADDRESS, MEMBER_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_ACCESS_TOKEN(AsOne)
 *
 * [referrer table]
 *     PROJECT, PROJECT_MEMBER, TICKET, MEMBER_ACCESS_TOKEN
 *
 * [foreign property]
 *     memberStatus, memberAccessTokenAsOne
 *
 * [referrer property]
 *     projectList, projectMemberList, ticketByAssigneedMemberIdList, ticketByMemberIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Member> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMember ready(List<Member> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Project> _referrerProject;

    /**
     * Load referrer of projectList by the set-upper of referrer. <br>
     * (プロジェクト)PROJECT by MEMBER_ID, named 'projectList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadProject</span>(<span style="color: #553000">projectCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">projectCB</span>.setupSelect...
     *         <span style="color: #553000">projectCB</span>.query().set...
     *         <span style="color: #553000">projectCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">projectLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    projectLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getProjectList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfProject> loadProject(ReferrerConditionSetupper<ProjectCB> refCBLambda) {
        myBhv().loadProject(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProject = refLs);
        return hd -> hd.handle(new LoaderOfProject().ready(_referrerProject, _selector));
    }

    protected List<ProjectMember> _referrerProjectMember;

    /**
     * Load referrer of projectMemberList by the set-upper of referrer. <br>
     * (プロジェクトメンバー)PROJECT_MEMBER by MEMBER_ID, named 'projectMemberList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadProjectMember</span>(<span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">memberCB</span>.setupSelect...
     *         <span style="color: #553000">memberCB</span>.query().set...
     *         <span style="color: #553000">memberCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">memberLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    memberLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getProjectMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfProjectMember> loadProjectMember(ReferrerConditionSetupper<ProjectMemberCB> refCBLambda) {
        myBhv().loadProjectMember(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProjectMember = refLs);
        return hd -> hd.handle(new LoaderOfProjectMember().ready(_referrerProjectMember, _selector));
    }

    protected List<Ticket> _referrerTicketByAssigneedMemberId;

    /**
     * Load referrer of ticketByAssigneedMemberIdList by the set-upper of referrer. <br>
     * (チケット)TICKET by ASSIGNEED_MEMBER_ID, named 'ticketByAssigneedMemberIdList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadTicketByAssigneedMemberId</span>(<span style="color: #553000">ticketCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ticketCB</span>.setupSelect...
     *         <span style="color: #553000">ticketCB</span>.query().set...
     *         <span style="color: #553000">ticketCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ticketLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ticketLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getTicketByAssigneedMemberIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAssigneedMemberId_InScope(pkList);
     * cb.query().addOrderBy_AssigneedMemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTicket> loadTicketByAssigneedMemberId(ReferrerConditionSetupper<TicketCB> refCBLambda) {
        myBhv().loadTicketByAssigneedMemberId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTicketByAssigneedMemberId = refLs);
        return hd -> hd.handle(new LoaderOfTicket().ready(_referrerTicketByAssigneedMemberId, _selector));
    }

    protected List<Ticket> _referrerTicketByMemberId;

    /**
     * Load referrer of ticketByMemberIdList by the set-upper of referrer. <br>
     * (チケット)TICKET by MEMBER_ID, named 'ticketByMemberIdList'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadTicketByMemberId</span>(<span style="color: #553000">ticketCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ticketCB</span>.setupSelect...
     *         <span style="color: #553000">ticketCB</span>.query().set...
     *         <span style="color: #553000">ticketCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ticketLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ticketLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     ... = member.<span style="color: #CC4747">getTicketByMemberIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTicket> loadTicketByMemberId(ReferrerConditionSetupper<TicketCB> refCBLambda) {
        myBhv().loadTicketByMemberId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTicketByMemberId = refLs);
        return hd -> hd.handle(new LoaderOfTicket().ready(_referrerTicketByMemberId, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberStatus _foreignMemberStatusLoader;
    public LoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader == null)
        { _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(myBhv().pulloutMemberStatus(_selectedList), _selector); }
        return _foreignMemberStatusLoader;
    }

    protected LoaderOfMemberAccessToken _foreignMemberAccessTokenAsOneLoader;
    public LoaderOfMemberAccessToken pulloutMemberAccessTokenAsOne() {
        if (_foreignMemberAccessTokenAsOneLoader == null)
        { _foreignMemberAccessTokenAsOneLoader = new LoaderOfMemberAccessToken().ready(myBhv().pulloutMemberAccessTokenAsOne(_selectedList), _selector); }
        return _foreignMemberAccessTokenAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Member> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
