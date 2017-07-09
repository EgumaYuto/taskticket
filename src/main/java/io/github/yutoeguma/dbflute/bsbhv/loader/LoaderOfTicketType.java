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
 * The referrer loader of (チケットタイプ)TICKET_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     TICKET_TYPE_ID
 *
 * [column]
 *     TICKET_TYPE_ID, MEMBER_ID, TICKET_TYPE_ICON, TICKET_TYPE_NAME, DEL_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TICKET_TYPE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     TICKET
 *
 * [foreign property]
 *     member
 *
 * [referrer property]
 *     ticketList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTicketType {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TicketType> _selectedList;
    protected BehaviorSelector _selector;
    protected TicketTypeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTicketType ready(List<TicketType> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TicketTypeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TicketTypeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Ticket> _referrerTicket;

    /**
     * Load referrer of ticketList by the set-upper of referrer. <br>
     * (チケット)TICKET by TICKET_TYPE_ID, named 'ticketList'.
     * <pre>
     * <span style="color: #0000C0">ticketTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">ticketTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadTicket</span>(<span style="color: #553000">ticketCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ticketCB</span>.setupSelect...
     *         <span style="color: #553000">ticketCB</span>.query().set...
     *         <span style="color: #553000">ticketCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ticketLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ticketLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TicketType ticketType : <span style="color: #553000">ticketTypeList</span>) {
     *     ... = ticketType.<span style="color: #CC4747">getTicketList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTicketTypeId_InScope(pkList);
     * cb.query().addOrderBy_TicketTypeId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTicket> loadTicket(ReferrerConditionSetupper<TicketCB> refCBLambda) {
        myBhv().loadTicket(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTicket = refLs);
        return hd -> hd.handle(new LoaderOfTicket().ready(_referrerTicket, _selector));
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
    public List<TicketType> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}