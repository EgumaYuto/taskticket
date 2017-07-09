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
 * The referrer loader of (チケット)TICKET as TABLE. <br>
 * <pre>
 * [primary key]
 *     TICKET_ID
 *
 * [column]
 *     TICKET_ID, PARENT_TICKET_ID, MEMBER_ID, ASSIGNEED_MEMBER_ID, TICKET_TYPE_ID, TICKET_STATUS_ID, PROJECT_ID, TICKET_NAME, TICKET_DETAIL, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TICKET_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, TICKET, PROJECT, TICKET_STATUS, TICKET_TYPE
 *
 * [referrer table]
 *     TICKET
 *
 * [foreign property]
 *     memberByAssigneedMemberId, memberByMemberId, ticketSelf, project, ticketStatus, ticketType
 *
 * [referrer property]
 *     ticketSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTicket {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Ticket> _selectedList;
    protected BehaviorSelector _selector;
    protected TicketBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTicket ready(List<Ticket> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TicketBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TicketBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Ticket> _referrerTicketSelf;

    /**
     * Load referrer of ticketSelfList by the set-upper of referrer. <br>
     * (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfList'.
     * <pre>
     * <span style="color: #0000C0">ticketBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">ticketList</span>, <span style="color: #553000">ticketLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ticketLoader</span>.<span style="color: #CC4747">loadTicketSelf</span>(<span style="color: #553000">ticketCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ticketCB</span>.setupSelect...
     *         <span style="color: #553000">ticketCB</span>.query().set...
     *         <span style="color: #553000">ticketCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ticketLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ticketLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Ticket ticket : <span style="color: #553000">ticketList</span>) {
     *     ... = ticket.<span style="color: #CC4747">getTicketSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentTicketId_InScope(pkList);
     * cb.query().addOrderBy_ParentTicketId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTicket> loadTicketSelf(ReferrerConditionSetupper<TicketCB> refCBLambda) {
        myBhv().loadTicketSelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTicketSelf = refLs);
        return hd -> hd.handle(new LoaderOfTicket().ready(_referrerTicketSelf, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberByAssigneedMemberIdLoader;
    public LoaderOfMember pulloutMemberByAssigneedMemberId() {
        if (_foreignMemberByAssigneedMemberIdLoader == null)
        { _foreignMemberByAssigneedMemberIdLoader = new LoaderOfMember().ready(myBhv().pulloutMemberByAssigneedMemberId(_selectedList), _selector); }
        return _foreignMemberByAssigneedMemberIdLoader;
    }

    protected LoaderOfMember _foreignMemberByMemberIdLoader;
    public LoaderOfMember pulloutMemberByMemberId() {
        if (_foreignMemberByMemberIdLoader == null)
        { _foreignMemberByMemberIdLoader = new LoaderOfMember().ready(myBhv().pulloutMemberByMemberId(_selectedList), _selector); }
        return _foreignMemberByMemberIdLoader;
    }

    protected LoaderOfTicket _foreignTicketSelfLoader;
    public LoaderOfTicket pulloutTicketSelf() {
        if (_foreignTicketSelfLoader == null)
        { _foreignTicketSelfLoader = new LoaderOfTicket().ready(myBhv().pulloutTicketSelf(_selectedList), _selector); }
        return _foreignTicketSelfLoader;
    }

    protected LoaderOfProject _foreignProjectLoader;
    public LoaderOfProject pulloutProject() {
        if (_foreignProjectLoader == null)
        { _foreignProjectLoader = new LoaderOfProject().ready(myBhv().pulloutProject(_selectedList), _selector); }
        return _foreignProjectLoader;
    }

    protected LoaderOfTicketStatus _foreignTicketStatusLoader;
    public LoaderOfTicketStatus pulloutTicketStatus() {
        if (_foreignTicketStatusLoader == null)
        { _foreignTicketStatusLoader = new LoaderOfTicketStatus().ready(myBhv().pulloutTicketStatus(_selectedList), _selector); }
        return _foreignTicketStatusLoader;
    }

    protected LoaderOfTicketType _foreignTicketTypeLoader;
    public LoaderOfTicketType pulloutTicketType() {
        if (_foreignTicketTypeLoader == null)
        { _foreignTicketTypeLoader = new LoaderOfTicketType().ready(myBhv().pulloutTicketType(_selectedList), _selector); }
        return _foreignTicketTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Ticket> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
