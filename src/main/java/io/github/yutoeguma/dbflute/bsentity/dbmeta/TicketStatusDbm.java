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
package io.github.yutoeguma.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import io.github.yutoeguma.dbflute.allcommon.*;
import io.github.yutoeguma.dbflute.exentity.*;

/**
 * The DB meta of TICKET_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TicketStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TicketStatusDbm _instance = new TicketStatusDbm();
    private TicketStatusDbm() {}
    public static TicketStatusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TicketStatus)et).getTicketStatusId(), (et, vl) -> ((TicketStatus)et).setTicketStatusId(ctl(vl)), "ticketStatusId");
        setupEpg(_epgMap, et -> ((TicketStatus)et).getMemberId(), (et, vl) -> ((TicketStatus)et).setMemberId(ctl(vl)), "memberId");
        setupEpg(_epgMap, et -> ((TicketStatus)et).getTicketStatusIcon(), (et, vl) -> ((TicketStatus)et).setTicketStatusIcon((String)vl), "ticketStatusIcon");
        setupEpg(_epgMap, et -> ((TicketStatus)et).getTicketStatusName(), (et, vl) -> ((TicketStatus)et).setTicketStatusName((String)vl), "ticketStatusName");
        setupEpg(_epgMap, et -> ((TicketStatus)et).getDelFlg(), (et, vl) -> {
            ((TicketStatus)et).setDelFlg((Boolean)vl);
        }, "delFlg");
        setupEpg(_epgMap, et -> ((TicketStatus)et).getRegisterDatetime(), (et, vl) -> ((TicketStatus)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((TicketStatus)et).getRegisterUser(), (et, vl) -> ((TicketStatus)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((TicketStatus)et).getUpdateDatetime(), (et, vl) -> ((TicketStatus)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((TicketStatus)et).getUpdateUser(), (et, vl) -> ((TicketStatus)et).setUpdateUser((String)vl), "updateUser");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TicketStatus)et).getMember(), (et, vl) -> ((TicketStatus)et).setMember((OptionalEntity<Member>)vl), "member");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "TICKET_STATUS";
    protected final String _tableDispName = "TICKET_STATUS";
    protected final String _tablePropertyName = "ticketStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("TICKET_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "チケットステータス";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTicketStatusId = cci("TICKET_STATUS_ID", "TICKET_STATUS_ID", null, "チケットステータスID", Long.class, "ticketStatusId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "ticketList", null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "メンバーID", Long.class, "memberId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnTicketStatusIcon = cci("TICKET_STATUS_ICON", "TICKET_STATUS_ICON", null, "チケットステータスアイコン", String.class, "ticketStatusIcon", null, false, false, true, "VARCHAR", 128, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTicketStatusName = cci("TICKET_STATUS_NAME", "TICKET_STATUS_NAME", null, "チケットステータス名", String.class, "ticketStatusName", null, false, false, true, "VARCHAR", 128, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, "削除フラグ", Boolean.class, "delFlg", null, false, false, true, "BIT", null, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);

    /**
     * (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketStatusId() { return _columnTicketStatusId; }
    /**
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketStatusIcon() { return _columnTicketStatusIcon; }
    /**
     * (チケットステータス名)TICKET_STATUS_NAME: {NotNull, VARCHAR(128)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketStatusName() { return _columnTicketStatusName; }
    /**
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTicketStatusId());
        ls.add(columnMemberId());
        ls.add(columnTicketStatusIcon());
        ls.add(columnTicketStatusName());
        ls.add(columnDelFlg());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTicketStatusId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (メンバー)MEMBER by my MEMBER_ID, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_TICKET_STATUS_MEMBER", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ticketStatusList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (チケット)TICKET by TICKET_STATUS_ID, named 'ticketList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTicketList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTicketStatusId(), TicketDbm.getInstance().columnTicketStatusId());
        return cri("FK_TICKET_TICKET_STATUS", "ticketList", this, TicketDbm.getInstance(), mp, false, "ticketStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "io.github.yutoeguma.dbflute.exentity.TicketStatus"; }
    public String getConditionBeanTypeName() { return "io.github.yutoeguma.dbflute.cbean.TicketStatusCB"; }
    public String getBehaviorTypeName() { return "io.github.yutoeguma.dbflute.exbhv.TicketStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TicketStatus> getEntityType() { return TicketStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TicketStatus newEntity() { return new TicketStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TicketStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TicketStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
