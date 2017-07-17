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
 * The entity of (プロジェクト)PROJECT as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *     PROJECT_MEMBER, TICKET
 *
 * [foreign property]
 *     member
 *
 * [referrer property]
 *     projectMemberList, ticketList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long projectId = entity.getProjectId();
 * Long memberId = entity.getMemberId();
 * String projectName = entity.getProjectName();
 * String projectDetail = entity.getProjectDetail();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setProjectId(projectId);
 * entity.setMemberId(memberId);
 * entity.setProjectName(projectName);
 * entity.setProjectDetail(projectDetail);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProject extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (プロジェクトID)PROJECT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _projectId;

    /** (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} */
    protected Long _memberId;

    /** (プロジェクト名)PROJECT_NAME: {NotNull, VARCHAR(256)} */
    protected String _projectName;

    /** (プロジェクト詳細)PROJECT_DETAIL: {NotNull, TEXT(65535)} */
    protected String _projectDetail;

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
        return "PROJECT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_projectId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (メンバー)MEMBER by my MEMBER_ID, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] (メンバー)MEMBER by my MEMBER_ID, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (メンバー)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (プロジェクトメンバー)PROJECT_MEMBER by PROJECT_ID, named 'projectMemberList'. */
    protected List<ProjectMember> _projectMemberList;

    /**
     * [get] (プロジェクトメンバー)PROJECT_MEMBER by PROJECT_ID, named 'projectMemberList'.
     * @return The entity list of referrer property 'projectMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ProjectMember> getProjectMemberList() {
        if (_projectMemberList == null) { _projectMemberList = newReferrerList(); }
        return _projectMemberList;
    }

    /**
     * [set] (プロジェクトメンバー)PROJECT_MEMBER by PROJECT_ID, named 'projectMemberList'.
     * @param projectMemberList The entity list of referrer property 'projectMemberList'. (NullAllowed)
     */
    public void setProjectMemberList(List<ProjectMember> projectMemberList) {
        _projectMemberList = projectMemberList;
    }

    /** (チケット)TICKET by PROJECT_ID, named 'ticketList'. */
    protected List<Ticket> _ticketList;

    /**
     * [get] (チケット)TICKET by PROJECT_ID, named 'ticketList'.
     * @return The entity list of referrer property 'ticketList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Ticket> getTicketList() {
        if (_ticketList == null) { _ticketList = newReferrerList(); }
        return _ticketList;
    }

    /**
     * [set] (チケット)TICKET by PROJECT_ID, named 'ticketList'.
     * @param ticketList The entity list of referrer property 'ticketList'. (NullAllowed)
     */
    public void setTicketList(List<Ticket> ticketList) {
        _ticketList = ticketList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsProject) {
            BsProject other = (BsProject)obj;
            if (!xSV(_projectId, other._projectId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _projectId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_projectMemberList != null) { for (ProjectMember et : _projectMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "projectMemberList")); } } }
        if (_ticketList != null) { for (Ticket et : _ticketList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ticketList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_projectId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_projectName));
        sb.append(dm).append(xfND(_projectDetail));
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
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_projectMemberList != null && !_projectMemberList.isEmpty())
        { sb.append(dm).append("projectMemberList"); }
        if (_ticketList != null && !_ticketList.isEmpty())
        { sb.append(dm).append("ticketList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Project clone() {
        return (Project)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (プロジェクトID)PROJECT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'PROJECT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProjectId() {
        checkSpecifiedProperty("projectId");
        return _projectId;
    }

    /**
     * [set] (プロジェクトID)PROJECT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param projectId The value of the column 'PROJECT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProjectId(Long projectId) {
        registerModifiedProperty("projectId");
        _projectId = projectId;
    }

    /**
     * [get] (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * プロジェクトを作成したメンバーのID
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * プロジェクトを作成したメンバーのID
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (プロジェクト名)PROJECT_NAME: {NotNull, VARCHAR(256)} <br>
     * @return The value of the column 'PROJECT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getProjectName() {
        checkSpecifiedProperty("projectName");
        return convertEmptyToNull(_projectName);
    }

    /**
     * [set] (プロジェクト名)PROJECT_NAME: {NotNull, VARCHAR(256)} <br>
     * @param projectName The value of the column 'PROJECT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setProjectName(String projectName) {
        registerModifiedProperty("projectName");
        _projectName = projectName;
    }

    /**
     * [get] (プロジェクト詳細)PROJECT_DETAIL: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'PROJECT_DETAIL'. (basically NotNull if selected: for the constraint)
     */
    public String getProjectDetail() {
        checkSpecifiedProperty("projectDetail");
        return convertEmptyToNull(_projectDetail);
    }

    /**
     * [set] (プロジェクト詳細)PROJECT_DETAIL: {NotNull, TEXT(65535)} <br>
     * @param projectDetail The value of the column 'PROJECT_DETAIL'. (basically NotNull if update: for the constraint)
     */
    public void setProjectDetail(String projectDetail) {
        registerModifiedProperty("projectDetail");
        _projectDetail = projectDetail;
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
