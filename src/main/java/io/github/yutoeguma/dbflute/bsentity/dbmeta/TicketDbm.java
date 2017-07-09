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
 * The DB meta of TICKET. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TicketDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TicketDbm _instance = new TicketDbm();
    private TicketDbm() {}
    public static TicketDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Ticket)et).getTicketId(), (et, vl) -> ((Ticket)et).setTicketId(ctl(vl)), "ticketId");
        setupEpg(_epgMap, et -> ((Ticket)et).getParentTicketId(), (et, vl) -> ((Ticket)et).setParentTicketId(ctl(vl)), "parentTicketId");
        setupEpg(_epgMap, et -> ((Ticket)et).getMemberId(), (et, vl) -> ((Ticket)et).setMemberId(ctl(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Ticket)et).getAssigneedMemberId(), (et, vl) -> ((Ticket)et).setAssigneedMemberId(ctl(vl)), "assigneedMemberId");
        setupEpg(_epgMap, et -> ((Ticket)et).getTicketTypeId(), (et, vl) -> ((Ticket)et).setTicketTypeId(ctl(vl)), "ticketTypeId");
        setupEpg(_epgMap, et -> ((Ticket)et).getTicketStatusId(), (et, vl) -> ((Ticket)et).setTicketStatusId(ctl(vl)), "ticketStatusId");
        setupEpg(_epgMap, et -> ((Ticket)et).getProjectId(), (et, vl) -> ((Ticket)et).setProjectId(ctl(vl)), "projectId");
        setupEpg(_epgMap, et -> ((Ticket)et).getTicketName(), (et, vl) -> ((Ticket)et).setTicketName((String)vl), "ticketName");
        setupEpg(_epgMap, et -> ((Ticket)et).getTicketDetail(), (et, vl) -> ((Ticket)et).setTicketDetail((String)vl), "ticketDetail");
        setupEpg(_epgMap, et -> ((Ticket)et).getRegisterDatetime(), (et, vl) -> ((Ticket)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Ticket)et).getRegisterUser(), (et, vl) -> ((Ticket)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Ticket)et).getUpdateDatetime(), (et, vl) -> ((Ticket)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Ticket)et).getUpdateUser(), (et, vl) -> ((Ticket)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Ticket)et).getVersionNo(), (et, vl) -> ((Ticket)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Ticket)et).getMemberByAssigneedMemberId(), (et, vl) -> ((Ticket)et).setMemberByAssigneedMemberId((OptionalEntity<Member>)vl), "memberByAssigneedMemberId");
        setupEfpg(_efpgMap, et -> ((Ticket)et).getMemberByMemberId(), (et, vl) -> ((Ticket)et).setMemberByMemberId((OptionalEntity<Member>)vl), "memberByMemberId");
        setupEfpg(_efpgMap, et -> ((Ticket)et).getTicketSelf(), (et, vl) -> ((Ticket)et).setTicketSelf((OptionalEntity<Ticket>)vl), "ticketSelf");
        setupEfpg(_efpgMap, et -> ((Ticket)et).getProject(), (et, vl) -> ((Ticket)et).setProject((OptionalEntity<Project>)vl), "project");
        setupEfpg(_efpgMap, et -> ((Ticket)et).getTicketStatus(), (et, vl) -> ((Ticket)et).setTicketStatus((OptionalEntity<TicketStatus>)vl), "ticketStatus");
        setupEfpg(_efpgMap, et -> ((Ticket)et).getTicketType(), (et, vl) -> ((Ticket)et).setTicketType((OptionalEntity<TicketType>)vl), "ticketType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "TICKET";
    protected final String _tableDispName = "TICKET";
    protected final String _tablePropertyName = "ticket";
    protected final TableSqlName _tableSqlName = new TableSqlName("TICKET", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "チケット";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTicketId = cci("TICKET_ID", "TICKET_ID", null, "チケットID", Long.class, "ticketId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "ticketSelfList", null, false);
    protected final ColumnInfo _columnParentTicketId = cci("PARENT_TICKET_ID", "PARENT_TICKET_ID", null, "親チケットID", Long.class, "parentTicketId", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, "ticketSelf", null, null, false);
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "メンバーID", Long.class, "memberId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "memberByMemberId", null, null, false);
    protected final ColumnInfo _columnAssigneedMemberId = cci("ASSIGNEED_MEMBER_ID", "ASSIGNEED_MEMBER_ID", null, "担当メンバーID", Long.class, "assigneedMemberId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "memberByAssigneedMemberId", null, null, false);
    protected final ColumnInfo _columnTicketTypeId = cci("TICKET_TYPE_ID", "TICKET_TYPE_ID", null, "チケットタイプID", Long.class, "ticketTypeId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "ticketType", null, null, false);
    protected final ColumnInfo _columnTicketStatusId = cci("TICKET_STATUS_ID", "TICKET_STATUS_ID", null, "チケットステータスID", Long.class, "ticketStatusId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "ticketStatus", null, null, false);
    protected final ColumnInfo _columnProjectId = cci("PROJECT_ID", "PROJECT_ID", null, "プロジェクトID", Long.class, "projectId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "project", null, null, false);
    protected final ColumnInfo _columnTicketName = cci("TICKET_NAME", "TICKET_NAME", null, "チケット名", String.class, "ticketName", null, false, false, true, "VARCHAR", 256, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTicketDetail = cci("TICKET_DETAIL", "TICKET_DETAIL", null, "チケット詳細", String.class, "ticketDetail", null, false, false, true, "TEXT", 65535, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketId() { return _columnTicketId; }
    /**
     * (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentTicketId() { return _columnParentTicketId; }
    /**
     * (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAssigneedMemberId() { return _columnAssigneedMemberId; }
    /**
     * (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketTypeId() { return _columnTicketTypeId; }
    /**
     * (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketStatusId() { return _columnTicketStatusId; }
    /**
     * (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProjectId() { return _columnProjectId; }
    /**
     * (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketName() { return _columnTicketName; }
    /**
     * (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketDetail() { return _columnTicketDetail; }
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
    /**
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTicketId());
        ls.add(columnParentTicketId());
        ls.add(columnMemberId());
        ls.add(columnAssigneedMemberId());
        ls.add(columnTicketTypeId());
        ls.add(columnTicketStatusId());
        ls.add(columnProjectId());
        ls.add(columnTicketName());
        ls.add(columnTicketDetail());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTicketId()); }
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
     * (メンバー)MEMBER by my ASSIGNEED_MEMBER_ID, named 'memberByAssigneedMemberId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberByAssigneedMemberId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAssigneedMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_TICKET_ASIGNEED_MEMBER", "memberByAssigneedMemberId", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ticketByAssigneedMemberIdList", false);
    }
    /**
     * (メンバー)MEMBER by my MEMBER_ID, named 'memberByMemberId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberByMemberId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("FK_TICKET_MEMBER", "memberByMemberId", this, MemberDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ticketByMemberIdList", false);
    }
    /**
     * (チケット)TICKET by my PARENT_TICKET_ID, named 'ticketSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTicketSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentTicketId(), TicketDbm.getInstance().columnTicketId());
        return cfi("FK_TICKET_SELF", "ticketSelf", this, TicketDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ticketSelfList", false);
    }
    /**
     * (プロジェクト)PROJECT by my PROJECT_ID, named 'project'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProject() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProjectId(), ProjectDbm.getInstance().columnProjectId());
        return cfi("FK_TICKET_PROJECT", "project", this, ProjectDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ticketList", false);
    }
    /**
     * (チケットステータス)TICKET_STATUS by my TICKET_STATUS_ID, named 'ticketStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTicketStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTicketStatusId(), TicketStatusDbm.getInstance().columnTicketStatusId());
        return cfi("FK_TICKET_TICKET_STATUS", "ticketStatus", this, TicketStatusDbm.getInstance(), mp, 4, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ticketList", false);
    }
    /**
     * (チケットタイプ)TICKET_TYPE by my TICKET_TYPE_ID, named 'ticketType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTicketType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTicketTypeId(), TicketTypeDbm.getInstance().columnTicketTypeId());
        return cfi("FK_TICKET_TICKET_TYPE", "ticketType", this, TicketTypeDbm.getInstance(), mp, 5, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ticketList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTicketSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTicketId(), TicketDbm.getInstance().columnParentTicketId());
        return cri("FK_TICKET_SELF", "ticketSelfList", this, TicketDbm.getInstance(), mp, false, "ticketSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
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
    public String getEntityTypeName() { return "io.github.yutoeguma.dbflute.exentity.Ticket"; }
    public String getConditionBeanTypeName() { return "io.github.yutoeguma.dbflute.cbean.TicketCB"; }
    public String getBehaviorTypeName() { return "io.github.yutoeguma.dbflute.exbhv.TicketBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Ticket> getEntityType() { return Ticket.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Ticket newEntity() { return new Ticket(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Ticket)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Ticket)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
