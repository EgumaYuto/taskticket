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
 * The referrer loader of (プロジェクト)PROJECT as TABLE. <br>
 * <pre>
 * [primary key]
 *     PROJECT_ID
 *
 * [column]
 *     PROJECT_ID, MEMBER_ID, PROJECT_NAME, PROJECT_DETAIL, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PROJECT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     PROJECT_MEMBER, TICKET, TICKET_STATUS, TICKET_TYPE
 *
 * [foreign property]
 *     member
 *
 * [referrer property]
 *     projectMemberList, ticketList, ticketStatusList, ticketTypeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfProject {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Project> _selectedList;
    protected BehaviorSelector _selector;
    protected ProjectBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfProject ready(List<Project> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ProjectBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ProjectBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ProjectMember> _referrerProjectMember;

    /**
     * Load referrer of projectMemberList by the set-upper of referrer. <br>
     * (プロジェクトメンバー)PROJECT_MEMBER by PROJECT_ID, named 'projectMemberList'.
     * <pre>
     * <span style="color: #0000C0">projectBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">projectList</span>, <span style="color: #553000">projectLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">projectLoader</span>.<span style="color: #CC4747">loadProjectMember</span>(<span style="color: #553000">memberCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">memberCB</span>.setupSelect...
     *         <span style="color: #553000">memberCB</span>.query().set...
     *         <span style="color: #553000">memberCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">memberLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    memberLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Project project : <span style="color: #553000">projectList</span>) {
     *     ... = project.<span style="color: #CC4747">getProjectMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProjectId_InScope(pkList);
     * cb.query().addOrderBy_ProjectId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfProjectMember> loadProjectMember(ReferrerConditionSetupper<ProjectMemberCB> refCBLambda) {
        myBhv().loadProjectMember(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProjectMember = refLs);
        return hd -> hd.handle(new LoaderOfProjectMember().ready(_referrerProjectMember, _selector));
    }

    protected List<Ticket> _referrerTicket;

    /**
     * Load referrer of ticketList by the set-upper of referrer. <br>
     * (チケット)TICKET by PROJECT_ID, named 'ticketList'.
     * <pre>
     * <span style="color: #0000C0">projectBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">projectList</span>, <span style="color: #553000">projectLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">projectLoader</span>.<span style="color: #CC4747">loadTicket</span>(<span style="color: #553000">ticketCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ticketCB</span>.setupSelect...
     *         <span style="color: #553000">ticketCB</span>.query().set...
     *         <span style="color: #553000">ticketCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ticketLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ticketLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Project project : <span style="color: #553000">projectList</span>) {
     *     ... = project.<span style="color: #CC4747">getTicketList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProjectId_InScope(pkList);
     * cb.query().addOrderBy_ProjectId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTicket> loadTicket(ReferrerConditionSetupper<TicketCB> refCBLambda) {
        myBhv().loadTicket(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTicket = refLs);
        return hd -> hd.handle(new LoaderOfTicket().ready(_referrerTicket, _selector));
    }

    protected List<TicketStatus> _referrerTicketStatus;

    /**
     * Load referrer of ticketStatusList by the set-upper of referrer. <br>
     * (チケットステータス)TICKET_STATUS by PROJECT_ID, named 'ticketStatusList'.
     * <pre>
     * <span style="color: #0000C0">projectBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">projectList</span>, <span style="color: #553000">projectLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">projectLoader</span>.<span style="color: #CC4747">loadTicketStatus</span>(<span style="color: #553000">statusCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">statusCB</span>.setupSelect...
     *         <span style="color: #553000">statusCB</span>.query().set...
     *         <span style="color: #553000">statusCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">statusLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    statusLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Project project : <span style="color: #553000">projectList</span>) {
     *     ... = project.<span style="color: #CC4747">getTicketStatusList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProjectId_InScope(pkList);
     * cb.query().addOrderBy_ProjectId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTicketStatus> loadTicketStatus(ReferrerConditionSetupper<TicketStatusCB> refCBLambda) {
        myBhv().loadTicketStatus(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTicketStatus = refLs);
        return hd -> hd.handle(new LoaderOfTicketStatus().ready(_referrerTicketStatus, _selector));
    }

    protected List<TicketType> _referrerTicketType;

    /**
     * Load referrer of ticketTypeList by the set-upper of referrer. <br>
     * (チケットタイプ)TICKET_TYPE by PROJECT_ID, named 'ticketTypeList'.
     * <pre>
     * <span style="color: #0000C0">projectBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">projectList</span>, <span style="color: #553000">projectLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">projectLoader</span>.<span style="color: #CC4747">loadTicketType</span>(<span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">typeCB</span>.setupSelect...
     *         <span style="color: #553000">typeCB</span>.query().set...
     *         <span style="color: #553000">typeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">typeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    typeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Project project : <span style="color: #553000">projectList</span>) {
     *     ... = project.<span style="color: #CC4747">getTicketTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProjectId_InScope(pkList);
     * cb.query().addOrderBy_ProjectId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTicketType> loadTicketType(ReferrerConditionSetupper<TicketTypeCB> refCBLambda) {
        myBhv().loadTicketType(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTicketType = refLs);
        return hd -> hd.handle(new LoaderOfTicketType().ready(_referrerTicketType, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Project> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
