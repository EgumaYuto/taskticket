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
 * The DB meta of TICKET_TYPE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TicketTypeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TicketTypeDbm _instance = new TicketTypeDbm();
    private TicketTypeDbm() {}
    public static TicketTypeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TicketType)et).getTicketTypeId(), (et, vl) -> ((TicketType)et).setTicketTypeId(ctl(vl)), "ticketTypeId");
        setupEpg(_epgMap, et -> ((TicketType)et).getProjectId(), (et, vl) -> ((TicketType)et).setProjectId(ctl(vl)), "projectId");
        setupEpg(_epgMap, et -> ((TicketType)et).getTicketTypeName(), (et, vl) -> ((TicketType)et).setTicketTypeName((String)vl), "ticketTypeName");
        setupEpg(_epgMap, et -> ((TicketType)et).getTicketTypeIcon(), (et, vl) -> ((TicketType)et).setTicketTypeIcon((String)vl), "ticketTypeIcon");
        setupEpg(_epgMap, et -> ((TicketType)et).getDelFlg(), (et, vl) -> {
            ((TicketType)et).setDelFlg((Boolean)vl);
        }, "delFlg");
        setupEpg(_epgMap, et -> ((TicketType)et).getRegisterDatetime(), (et, vl) -> ((TicketType)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((TicketType)et).getRegisterUser(), (et, vl) -> ((TicketType)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((TicketType)et).getUpdateDatetime(), (et, vl) -> ((TicketType)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((TicketType)et).getUpdateUser(), (et, vl) -> ((TicketType)et).setUpdateUser((String)vl), "updateUser");
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
        setupEfpg(_efpgMap, et -> ((TicketType)et).getProject(), (et, vl) -> ((TicketType)et).setProject((OptionalEntity<Project>)vl), "project");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "TICKET_TYPE";
    protected final String _tableDispName = "TICKET_TYPE";
    protected final String _tablePropertyName = "ticketType";
    protected final TableSqlName _tableSqlName = new TableSqlName("TICKET_TYPE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "チケットタイプ";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTicketTypeId = cci("TICKET_TYPE_ID", "TICKET_TYPE_ID", null, "チケットタイプID", Long.class, "ticketTypeId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "ticketList", null, false);
    protected final ColumnInfo _columnProjectId = cci("PROJECT_ID", "PROJECT_ID", null, "プロジェクトID", Long.class, "projectId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "project", null, null, false);
    protected final ColumnInfo _columnTicketTypeName = cci("TICKET_TYPE_NAME", "TICKET_TYPE_NAME", null, "チケットタイプ名", String.class, "ticketTypeName", null, false, false, true, "VARCHAR", 128, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTicketTypeIcon = cci("TICKET_TYPE_ICON", "TICKET_TYPE_ICON", null, "チケットタイプアイコン", String.class, "ticketTypeIcon", null, false, false, true, "VARCHAR", 128, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, "削除フラグ", Boolean.class, "delFlg", null, false, false, true, "BIT", null, null, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);

    /**
     * (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketTypeId() { return _columnTicketTypeId; }
    /**
     * (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProjectId() { return _columnProjectId; }
    /**
     * (チケットタイプ名)TICKET_TYPE_NAME: {+UQ, NotNull, VARCHAR(128)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketTypeName() { return _columnTicketTypeName; }
    /**
     * (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTicketTypeIcon() { return _columnTicketTypeIcon; }
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
        ls.add(columnTicketTypeId());
        ls.add(columnProjectId());
        ls.add(columnTicketTypeName());
        ls.add(columnTicketTypeIcon());
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
    protected UniqueInfo cpui() { return hpcpui(columnTicketTypeId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnProjectId());
        ls.add(columnTicketTypeName());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (プロジェクト)PROJECT by my PROJECT_ID, named 'project'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProject() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProjectId(), ProjectDbm.getInstance().columnProjectId());
        return cfi("FK_TICKET_TYPE_PROJECT", "project", this, ProjectDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ticketTypeList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (チケット)TICKET by TICKET_TYPE_ID, named 'ticketList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTicketList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTicketTypeId(), TicketDbm.getInstance().columnTicketTypeId());
        return cri("FK_TICKET_TICKET_TYPE", "ticketList", this, TicketDbm.getInstance(), mp, false, "ticketType");
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
    public String getEntityTypeName() { return "io.github.yutoeguma.dbflute.exentity.TicketType"; }
    public String getConditionBeanTypeName() { return "io.github.yutoeguma.dbflute.cbean.TicketTypeCB"; }
    public String getBehaviorTypeName() { return "io.github.yutoeguma.dbflute.exbhv.TicketTypeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TicketType> getEntityType() { return TicketType.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TicketType newEntity() { return new TicketType(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TicketType)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TicketType)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
