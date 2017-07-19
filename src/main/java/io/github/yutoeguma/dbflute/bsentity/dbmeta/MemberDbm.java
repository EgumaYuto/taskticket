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
 * The DB meta of MEMBER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberDbm _instance = new MemberDbm();
    private MemberDbm() {}
    public static MemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Member)et).getMemberId(), (et, vl) -> ((Member)et).setMemberId(ctl(vl)), "memberId");
        setupEpg(_epgMap, et -> ((Member)et).getMemberName(), (et, vl) -> ((Member)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((Member)et).getPassword(), (et, vl) -> ((Member)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((Member)et).getEmailAddress(), (et, vl) -> ((Member)et).setEmailAddress((String)vl), "emailAddress");
        setupEpg(_epgMap, et -> ((Member)et).getMemberStatusCode(), (et, vl) -> {
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(et, columnMemberStatusCode(), vl);
            if (cls != null) {
                ((Member)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((Member)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
        setupEpg(_epgMap, et -> ((Member)et).getRegisterDatetime(), (et, vl) -> ((Member)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getRegisterUser(), (et, vl) -> ((Member)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Member)et).getUpdateDatetime(), (et, vl) -> ((Member)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Member)et).getUpdateUser(), (et, vl) -> ((Member)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Member)et).getVersionNo(), (et, vl) -> ((Member)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberStatus(), (et, vl) -> ((Member)et).setMemberStatus((OptionalEntity<MemberStatus>)vl), "memberStatus");
        setupEfpg(_efpgMap, et -> ((Member)et).getMemberAccessTokenAsOne(), (et, vl) -> ((Member)et).setMemberAccessTokenAsOne((OptionalEntity<MemberAccessToken>)vl), "memberAccessTokenAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER";
    protected final String _tableDispName = "MEMBER";
    protected final String _tablePropertyName = "member";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "メンバー";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, "メンバーID", Long.class, "memberId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, "projectList,projectMemberList,ticketByAssigneedMemberIdList,ticketByMemberIdList", null, false);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, "メンバー名", String.class, "memberName", null, false, false, true, "VARCHAR", 100, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, "パスワード", String.class, "password", null, false, false, true, "VARCHAR", 64, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmailAddress = cci("EMAIL_ADDRESS", "EMAIL_ADDRESS", null, "メールアドレス", String.class, "emailAddress", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "メンバーステータスコード", String.class, "memberStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザー", String.class, "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザー", String.class, "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, "バージョン番号", Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);

    /**
     * (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmailAddress() { return _columnEmailAddress; }
    /**
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
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
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnPassword());
        ls.add(columnEmailAddress());
        ls.add(columnMemberStatusCode());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnEmailAddress()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberList", false);
    }
    /**
     * (メンバーアクセストークン)MEMBER_ACCESS_TOKEN by MEMBER_ID, named 'memberAccessTokenAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMemberAccessTokenAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberAccessTokenDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_ACCESS_TOKEN_MEMBER", "memberAccessTokenAsOne", this, MemberAccessTokenDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "member", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (プロジェクト)PROJECT by MEMBER_ID, named 'projectList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProjectList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), ProjectDbm.getInstance().columnMemberId());
        return cri("FK_PROJECT_MEMBER", "projectList", this, ProjectDbm.getInstance(), mp, false, "member");
    }
    /**
     * (プロジェクトメンバー)PROJECT_MEMBER by MEMBER_ID, named 'projectMemberList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProjectMemberList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), ProjectMemberDbm.getInstance().columnMemberId());
        return cri("FK_PROJECT_MEMBER_MEMBER", "projectMemberList", this, ProjectMemberDbm.getInstance(), mp, false, "member");
    }
    /**
     * (チケット)TICKET by ASSIGNEED_MEMBER_ID, named 'ticketByAssigneedMemberIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTicketByAssigneedMemberIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), TicketDbm.getInstance().columnAssigneedMemberId());
        return cri("FK_TICKET_ASIGNEED_MEMBER", "ticketByAssigneedMemberIdList", this, TicketDbm.getInstance(), mp, false, "memberByAssigneedMemberId");
    }
    /**
     * (チケット)TICKET by MEMBER_ID, named 'ticketByMemberIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTicketByMemberIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), TicketDbm.getInstance().columnMemberId());
        return cri("FK_TICKET_MEMBER", "ticketByMemberIdList", this, TicketDbm.getInstance(), mp, false, "memberByMemberId");
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
    public String getEntityTypeName() { return "io.github.yutoeguma.dbflute.exentity.Member"; }
    public String getConditionBeanTypeName() { return "io.github.yutoeguma.dbflute.cbean.MemberCB"; }
    public String getBehaviorTypeName() { return "io.github.yutoeguma.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Member> getEntityType() { return Member.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Member newEntity() { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Member)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Member)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
