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
package io.github.yutoeguma.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import io.github.yutoeguma.dbflute.allcommon.EntityDefinedCommonColumn;
import io.github.yutoeguma.dbflute.allcommon.DBMetaInstanceHandler;
import io.github.yutoeguma.dbflute.exentity.*;

/**
 * The entity of (チケット)TICKET as TABLE. <br>
 * タスクが格納されるチケットです。
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long ticketId = entity.getTicketId();
 * Long parentTicketId = entity.getParentTicketId();
 * Long memberId = entity.getMemberId();
 * Long assigneedMemberId = entity.getAssigneedMemberId();
 * Long ticketTypeId = entity.getTicketTypeId();
 * Long ticketStatusId = entity.getTicketStatusId();
 * Long projectId = entity.getProjectId();
 * String ticketName = entity.getTicketName();
 * String ticketDetail = entity.getTicketDetail();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setTicketId(ticketId);
 * entity.setParentTicketId(parentTicketId);
 * entity.setMemberId(memberId);
 * entity.setAssigneedMemberId(assigneedMemberId);
 * entity.setTicketTypeId(ticketTypeId);
 * entity.setTicketStatusId(ticketStatusId);
 * entity.setProjectId(projectId);
 * entity.setTicketName(ticketName);
 * entity.setTicketDetail(ticketDetail);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTicket extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _ticketId;

    /** (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET} */
    protected Long _parentTicketId;

    /** (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} */
    protected Long _memberId;

    /** (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} */
    protected Long _assigneedMemberId;

    /** (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE} */
    protected Long _ticketTypeId;

    /** (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS} */
    protected Long _ticketStatusId;

    /** (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT} */
    protected Long _projectId;

    /** (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)} */
    protected String _ticketName;

    /** (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)} */
    protected String _ticketDetail;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TICKET";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_ticketId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (メンバー)MEMBER by my ASSIGNEED_MEMBER_ID, named 'memberByAssigneedMemberId'. */
    protected OptionalEntity<Member> _memberByAssigneedMemberId;

    /**
     * [get] (メンバー)MEMBER by my ASSIGNEED_MEMBER_ID, named 'memberByAssigneedMemberId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberByAssigneedMemberId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMemberByAssigneedMemberId() {
        if (_memberByAssigneedMemberId == null) { _memberByAssigneedMemberId = OptionalEntity.relationEmpty(this, "memberByAssigneedMemberId"); }
        return _memberByAssigneedMemberId;
    }

    /**
     * [set] (メンバー)MEMBER by my ASSIGNEED_MEMBER_ID, named 'memberByAssigneedMemberId'.
     * @param memberByAssigneedMemberId The entity of foreign property 'memberByAssigneedMemberId'. (NullAllowed)
     */
    public void setMemberByAssigneedMemberId(OptionalEntity<Member> memberByAssigneedMemberId) {
        _memberByAssigneedMemberId = memberByAssigneedMemberId;
    }

    /** (メンバー)MEMBER by my MEMBER_ID, named 'memberByMemberId'. */
    protected OptionalEntity<Member> _memberByMemberId;

    /**
     * [get] (メンバー)MEMBER by my MEMBER_ID, named 'memberByMemberId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberByMemberId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMemberByMemberId() {
        if (_memberByMemberId == null) { _memberByMemberId = OptionalEntity.relationEmpty(this, "memberByMemberId"); }
        return _memberByMemberId;
    }

    /**
     * [set] (メンバー)MEMBER by my MEMBER_ID, named 'memberByMemberId'.
     * @param memberByMemberId The entity of foreign property 'memberByMemberId'. (NullAllowed)
     */
    public void setMemberByMemberId(OptionalEntity<Member> memberByMemberId) {
        _memberByMemberId = memberByMemberId;
    }

    /** (チケット)TICKET by my PARENT_TICKET_ID, named 'ticketSelf'. */
    protected OptionalEntity<Ticket> _ticketSelf;

    /**
     * [get] (チケット)TICKET by my PARENT_TICKET_ID, named 'ticketSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'ticketSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Ticket> getTicketSelf() {
        if (_ticketSelf == null) { _ticketSelf = OptionalEntity.relationEmpty(this, "ticketSelf"); }
        return _ticketSelf;
    }

    /**
     * [set] (チケット)TICKET by my PARENT_TICKET_ID, named 'ticketSelf'.
     * @param ticketSelf The entity of foreign property 'ticketSelf'. (NullAllowed)
     */
    public void setTicketSelf(OptionalEntity<Ticket> ticketSelf) {
        _ticketSelf = ticketSelf;
    }

    /** (プロジェクト)PROJECT by my PROJECT_ID, named 'project'. */
    protected OptionalEntity<Project> _project;

    /**
     * [get] (プロジェクト)PROJECT by my PROJECT_ID, named 'project'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'project'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Project> getProject() {
        if (_project == null) { _project = OptionalEntity.relationEmpty(this, "project"); }
        return _project;
    }

    /**
     * [set] (プロジェクト)PROJECT by my PROJECT_ID, named 'project'.
     * @param project The entity of foreign property 'project'. (NullAllowed)
     */
    public void setProject(OptionalEntity<Project> project) {
        _project = project;
    }

    /** (チケットステータス)TICKET_STATUS by my TICKET_STATUS_ID, named 'ticketStatus'. */
    protected OptionalEntity<TicketStatus> _ticketStatus;

    /**
     * [get] (チケットステータス)TICKET_STATUS by my TICKET_STATUS_ID, named 'ticketStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'ticketStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<TicketStatus> getTicketStatus() {
        if (_ticketStatus == null) { _ticketStatus = OptionalEntity.relationEmpty(this, "ticketStatus"); }
        return _ticketStatus;
    }

    /**
     * [set] (チケットステータス)TICKET_STATUS by my TICKET_STATUS_ID, named 'ticketStatus'.
     * @param ticketStatus The entity of foreign property 'ticketStatus'. (NullAllowed)
     */
    public void setTicketStatus(OptionalEntity<TicketStatus> ticketStatus) {
        _ticketStatus = ticketStatus;
    }

    /** (チケットタイプ)TICKET_TYPE by my TICKET_TYPE_ID, named 'ticketType'. */
    protected OptionalEntity<TicketType> _ticketType;

    /**
     * [get] (チケットタイプ)TICKET_TYPE by my TICKET_TYPE_ID, named 'ticketType'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'ticketType'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<TicketType> getTicketType() {
        if (_ticketType == null) { _ticketType = OptionalEntity.relationEmpty(this, "ticketType"); }
        return _ticketType;
    }

    /**
     * [set] (チケットタイプ)TICKET_TYPE by my TICKET_TYPE_ID, named 'ticketType'.
     * @param ticketType The entity of foreign property 'ticketType'. (NullAllowed)
     */
    public void setTicketType(OptionalEntity<TicketType> ticketType) {
        _ticketType = ticketType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfList'. */
    protected List<Ticket> _ticketSelfList;

    /**
     * [get] (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfList'.
     * @return The entity list of referrer property 'ticketSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Ticket> getTicketSelfList() {
        if (_ticketSelfList == null) { _ticketSelfList = newReferrerList(); }
        return _ticketSelfList;
    }

    /**
     * [set] (チケット)TICKET by PARENT_TICKET_ID, named 'ticketSelfList'.
     * @param ticketSelfList The entity list of referrer property 'ticketSelfList'. (NullAllowed)
     */
    public void setTicketSelfList(List<Ticket> ticketSelfList) {
        _ticketSelfList = ticketSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTicket) {
            BsTicket other = (BsTicket)obj;
            if (!xSV(_ticketId, other._ticketId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ticketId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberByAssigneedMemberId != null && _memberByAssigneedMemberId.isPresent())
        { sb.append(li).append(xbRDS(_memberByAssigneedMemberId, "memberByAssigneedMemberId")); }
        if (_memberByMemberId != null && _memberByMemberId.isPresent())
        { sb.append(li).append(xbRDS(_memberByMemberId, "memberByMemberId")); }
        if (_ticketSelf != null && _ticketSelf.isPresent())
        { sb.append(li).append(xbRDS(_ticketSelf, "ticketSelf")); }
        if (_project != null && _project.isPresent())
        { sb.append(li).append(xbRDS(_project, "project")); }
        if (_ticketStatus != null && _ticketStatus.isPresent())
        { sb.append(li).append(xbRDS(_ticketStatus, "ticketStatus")); }
        if (_ticketType != null && _ticketType.isPresent())
        { sb.append(li).append(xbRDS(_ticketType, "ticketType")); }
        if (_ticketSelfList != null) { for (Ticket et : _ticketSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ticketSelfList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_ticketId));
        sb.append(dm).append(xfND(_parentTicketId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_assigneedMemberId));
        sb.append(dm).append(xfND(_ticketTypeId));
        sb.append(dm).append(xfND(_ticketStatusId));
        sb.append(dm).append(xfND(_projectId));
        sb.append(dm).append(xfND(_ticketName));
        sb.append(dm).append(xfND(_ticketDetail));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberByAssigneedMemberId != null && _memberByAssigneedMemberId.isPresent())
        { sb.append(dm).append("memberByAssigneedMemberId"); }
        if (_memberByMemberId != null && _memberByMemberId.isPresent())
        { sb.append(dm).append("memberByMemberId"); }
        if (_ticketSelf != null && _ticketSelf.isPresent())
        { sb.append(dm).append("ticketSelf"); }
        if (_project != null && _project.isPresent())
        { sb.append(dm).append("project"); }
        if (_ticketStatus != null && _ticketStatus.isPresent())
        { sb.append(dm).append("ticketStatus"); }
        if (_ticketType != null && _ticketType.isPresent())
        { sb.append(dm).append("ticketType"); }
        if (_ticketSelfList != null && !_ticketSelfList.isEmpty())
        { sb.append(dm).append("ticketSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Ticket clone() {
        return (Ticket)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TICKET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTicketId() {
        checkSpecifiedProperty("ticketId");
        return _ticketId;
    }

    /**
     * [set] (チケットID)TICKET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param ticketId The value of the column 'TICKET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTicketId(Long ticketId) {
        registerModifiedProperty("ticketId");
        _ticketId = ticketId;
    }

    /**
     * [get] (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET} <br>
     * @return The value of the column 'PARENT_TICKET_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getParentTicketId() {
        checkSpecifiedProperty("parentTicketId");
        return _parentTicketId;
    }

    /**
     * [set] (親チケットID)PARENT_TICKET_ID: {IX, BIGINT(19), FK to TICKET} <br>
     * @param parentTicketId The value of the column 'PARENT_TICKET_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParentTicketId(Long parentTicketId) {
        registerModifiedProperty("parentTicketId");
        _parentTicketId = parentTicketId;
    }

    /**
     * [get] (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * タスクを作成したメンバーのID
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * タスクを作成したメンバーのID
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * タスクの担当者のメンバーID
     * @return The value of the column 'ASSIGNEED_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getAssigneedMemberId() {
        checkSpecifiedProperty("assigneedMemberId");
        return _assigneedMemberId;
    }

    /**
     * [set] (担当メンバーID)ASSIGNEED_MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * タスクの担当者のメンバーID
     * @param assigneedMemberId The value of the column 'ASSIGNEED_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAssigneedMemberId(Long assigneedMemberId) {
        registerModifiedProperty("assigneedMemberId");
        _assigneedMemberId = assigneedMemberId;
    }

    /**
     * [get] (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE} <br>
     * @return The value of the column 'TICKET_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTicketTypeId() {
        checkSpecifiedProperty("ticketTypeId");
        return _ticketTypeId;
    }

    /**
     * [set] (チケットタイプID)TICKET_TYPE_ID: {IX, NotNull, BIGINT(19), FK to TICKET_TYPE} <br>
     * @param ticketTypeId The value of the column 'TICKET_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTicketTypeId(Long ticketTypeId) {
        registerModifiedProperty("ticketTypeId");
        _ticketTypeId = ticketTypeId;
    }

    /**
     * [get] (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS} <br>
     * @return The value of the column 'TICKET_STATUS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTicketStatusId() {
        checkSpecifiedProperty("ticketStatusId");
        return _ticketStatusId;
    }

    /**
     * [set] (チケットステータスID)TICKET_STATUS_ID: {IX, NotNull, BIGINT(19), FK to TICKET_STATUS} <br>
     * @param ticketStatusId The value of the column 'TICKET_STATUS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTicketStatusId(Long ticketStatusId) {
        registerModifiedProperty("ticketStatusId");
        _ticketStatusId = ticketStatusId;
    }

    /**
     * [get] (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT} <br>
     * @return The value of the column 'PROJECT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProjectId() {
        checkSpecifiedProperty("projectId");
        return _projectId;
    }

    /**
     * [set] (プロジェクトID)PROJECT_ID: {IX, NotNull, BIGINT(19), FK to PROJECT} <br>
     * @param projectId The value of the column 'PROJECT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProjectId(Long projectId) {
        registerModifiedProperty("projectId");
        _projectId = projectId;
    }

    /**
     * [get] (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)} <br>
     * @return The value of the column 'TICKET_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getTicketName() {
        checkSpecifiedProperty("ticketName");
        return convertEmptyToNull(_ticketName);
    }

    /**
     * [set] (チケット名)TICKET_NAME: {NotNull, VARCHAR(256)} <br>
     * @param ticketName The value of the column 'TICKET_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setTicketName(String ticketName) {
        registerModifiedProperty("ticketName");
        _ticketName = ticketName;
    }

    /**
     * [get] (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)} <br>
     * チケットの詳細を書き込むためのフィールドです
     * @return The value of the column 'TICKET_DETAIL'. (basically NotNull if selected: for the constraint)
     */
    public String getTicketDetail() {
        checkSpecifiedProperty("ticketDetail");
        return convertEmptyToNull(_ticketDetail);
    }

    /**
     * [set] (チケット詳細)TICKET_DETAIL: {NotNull, TEXT(65535)} <br>
     * チケットの詳細を書き込むためのフィールドです
     * @param ticketDetail The value of the column 'TICKET_DETAIL'. (basically NotNull if update: for the constraint)
     */
    public void setTicketDetail(String ticketDetail) {
        registerModifiedProperty("ticketDetail");
        _ticketDetail = ticketDetail;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * 排他制御用、更新されるごとにインクリメントされる
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョン番号)VERSION_NO: {NotNull, BIGINT(19)} <br>
     * 排他制御用、更新されるごとにインクリメントされる
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
