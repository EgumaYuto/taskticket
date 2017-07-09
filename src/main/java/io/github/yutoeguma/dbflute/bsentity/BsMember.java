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
import io.github.yutoeguma.dbflute.allcommon.CDef;
import io.github.yutoeguma.dbflute.exentity.*;

/**
 * The entity of (メンバー)MEMBER as TABLE. <br>
 * 会員のプロフィールやアカウントなどの基本情報を保持する。<br>
 * 基本的に物理削除はなく、退会したらステータスが退会会員になる。<br>
 * ライフサイクルやカテゴリの違う会員情報は、one-to-oneなどの関連テーブルにて。
 * <pre>
 * [primary-key]
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
 *     MEMBER_STATUS
 *
 * [referrer table]
 *     PROJECT, PROJECT_MEMBER, TICKET, TICKET_STATUS, TICKET_TYPE
 *
 * [foreign property]
 *     memberStatus
 *
 * [referrer property]
 *     projectList, projectMemberList, ticketByAssigneedMemberIdList, ticketByMemberIdList, ticketStatusList, ticketTypeList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String password = entity.getPassword();
 * String emailAddress = entity.getEmailAddress();
 * String memberStatusCode = entity.getMemberStatusCode();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setPassword(password);
 * entity.setEmailAddress(emailAddress);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMember extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _memberId;

    /** (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)} */
    protected String _memberName;

    /** (パスワード)PASSWORD: {NotNull, VARCHAR(64)} */
    protected String _password;

    /** (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)} */
    protected String _emailAddress;

    /** (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected String _memberStatusCode;

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
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param emailAddress (メールアドレス): UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String emailAddress) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("emailAddress");
        setEmailAddress(emailAddress);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br>
     * Provisional: 正式な会員としてサイトサービスが利用可能
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br>
     * Withdrawal: 退会が確定した会員でサイトサービスはダメ
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of memberStatusCode as Formalized (FMV). <br>
     * Formalized: 入会直後のステータスで一部のサイトサービスが利用可能
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Provisional? <br>
     * Provisional: 正式な会員としてサイトサービスが利用可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Provisional) : false;
    }

    /**
     * Is the value of memberStatusCode Withdrawal? <br>
     * Withdrawal: 退会が確定した会員でサイトサービスはダメ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of memberStatusCode Formalized? <br>
     * Formalized: 入会直後のステータスで一部のサイトサービスが利用可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.Formalized) : false;
    }

    /**
     * means member that can use services <br>
     * The group elements:[Formalized, Provisional]
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCode_ServiceAvailable() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null && cdef.isServiceAvailable();
    }

    /**
     * Members are not formalized yet <br>
     * The group elements:[Provisional]
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCode_ShortOfFormalized() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null && cdef.isShortOfFormalized();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected OptionalEntity<MemberStatus> _memberStatus;

    /**
     * [get] (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'memberStatus'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<MemberStatus> getMemberStatus() {
        if (_memberStatus == null) { _memberStatus = OptionalEntity.relationEmpty(this, "memberStatus"); }
        return _memberStatus;
    }

    /**
     * [set] (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (NullAllowed)
     */
    public void setMemberStatus(OptionalEntity<MemberStatus> memberStatus) {
        _memberStatus = memberStatus;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (プロジェクト)PROJECT by MEMBER_ID, named 'projectList'. */
    protected List<Project> _projectList;

    /**
     * [get] (プロジェクト)PROJECT by MEMBER_ID, named 'projectList'.
     * @return The entity list of referrer property 'projectList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Project> getProjectList() {
        if (_projectList == null) { _projectList = newReferrerList(); }
        return _projectList;
    }

    /**
     * [set] (プロジェクト)PROJECT by MEMBER_ID, named 'projectList'.
     * @param projectList The entity list of referrer property 'projectList'. (NullAllowed)
     */
    public void setProjectList(List<Project> projectList) {
        _projectList = projectList;
    }

    /** (プロジェクトメンバー)PROJECT_MEMBER by MEMBER_ID, named 'projectMemberList'. */
    protected List<ProjectMember> _projectMemberList;

    /**
     * [get] (プロジェクトメンバー)PROJECT_MEMBER by MEMBER_ID, named 'projectMemberList'.
     * @return The entity list of referrer property 'projectMemberList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ProjectMember> getProjectMemberList() {
        if (_projectMemberList == null) { _projectMemberList = newReferrerList(); }
        return _projectMemberList;
    }

    /**
     * [set] (プロジェクトメンバー)PROJECT_MEMBER by MEMBER_ID, named 'projectMemberList'.
     * @param projectMemberList The entity list of referrer property 'projectMemberList'. (NullAllowed)
     */
    public void setProjectMemberList(List<ProjectMember> projectMemberList) {
        _projectMemberList = projectMemberList;
    }

    /** (チケット)TICKET by ASSIGNEED_MEMBER_ID, named 'ticketByAssigneedMemberIdList'. */
    protected List<Ticket> _ticketByAssigneedMemberIdList;

    /**
     * [get] (チケット)TICKET by ASSIGNEED_MEMBER_ID, named 'ticketByAssigneedMemberIdList'.
     * @return The entity list of referrer property 'ticketByAssigneedMemberIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Ticket> getTicketByAssigneedMemberIdList() {
        if (_ticketByAssigneedMemberIdList == null) { _ticketByAssigneedMemberIdList = newReferrerList(); }
        return _ticketByAssigneedMemberIdList;
    }

    /**
     * [set] (チケット)TICKET by ASSIGNEED_MEMBER_ID, named 'ticketByAssigneedMemberIdList'.
     * @param ticketByAssigneedMemberIdList The entity list of referrer property 'ticketByAssigneedMemberIdList'. (NullAllowed)
     */
    public void setTicketByAssigneedMemberIdList(List<Ticket> ticketByAssigneedMemberIdList) {
        _ticketByAssigneedMemberIdList = ticketByAssigneedMemberIdList;
    }

    /** (チケット)TICKET by MEMBER_ID, named 'ticketByMemberIdList'. */
    protected List<Ticket> _ticketByMemberIdList;

    /**
     * [get] (チケット)TICKET by MEMBER_ID, named 'ticketByMemberIdList'.
     * @return The entity list of referrer property 'ticketByMemberIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Ticket> getTicketByMemberIdList() {
        if (_ticketByMemberIdList == null) { _ticketByMemberIdList = newReferrerList(); }
        return _ticketByMemberIdList;
    }

    /**
     * [set] (チケット)TICKET by MEMBER_ID, named 'ticketByMemberIdList'.
     * @param ticketByMemberIdList The entity list of referrer property 'ticketByMemberIdList'. (NullAllowed)
     */
    public void setTicketByMemberIdList(List<Ticket> ticketByMemberIdList) {
        _ticketByMemberIdList = ticketByMemberIdList;
    }

    /** (チケットステータス)TICKET_STATUS by MEMBER_ID, named 'ticketStatusList'. */
    protected List<TicketStatus> _ticketStatusList;

    /**
     * [get] (チケットステータス)TICKET_STATUS by MEMBER_ID, named 'ticketStatusList'.
     * @return The entity list of referrer property 'ticketStatusList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TicketStatus> getTicketStatusList() {
        if (_ticketStatusList == null) { _ticketStatusList = newReferrerList(); }
        return _ticketStatusList;
    }

    /**
     * [set] (チケットステータス)TICKET_STATUS by MEMBER_ID, named 'ticketStatusList'.
     * @param ticketStatusList The entity list of referrer property 'ticketStatusList'. (NullAllowed)
     */
    public void setTicketStatusList(List<TicketStatus> ticketStatusList) {
        _ticketStatusList = ticketStatusList;
    }

    /** (チケットタイプ)TICKET_TYPE by MEMBER_ID, named 'ticketTypeList'. */
    protected List<TicketType> _ticketTypeList;

    /**
     * [get] (チケットタイプ)TICKET_TYPE by MEMBER_ID, named 'ticketTypeList'.
     * @return The entity list of referrer property 'ticketTypeList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TicketType> getTicketTypeList() {
        if (_ticketTypeList == null) { _ticketTypeList = newReferrerList(); }
        return _ticketTypeList;
    }

    /**
     * [set] (チケットタイプ)TICKET_TYPE by MEMBER_ID, named 'ticketTypeList'.
     * @param ticketTypeList The entity list of referrer property 'ticketTypeList'. (NullAllowed)
     */
    public void setTicketTypeList(List<TicketType> ticketTypeList) {
        _ticketTypeList = ticketTypeList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMember) {
            BsMember other = (BsMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberStatus != null && _memberStatus.isPresent())
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_projectList != null) { for (Project et : _projectList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "projectList")); } } }
        if (_projectMemberList != null) { for (ProjectMember et : _projectMemberList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "projectMemberList")); } } }
        if (_ticketByAssigneedMemberIdList != null) { for (Ticket et : _ticketByAssigneedMemberIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ticketByAssigneedMemberIdList")); } } }
        if (_ticketByMemberIdList != null) { for (Ticket et : _ticketByMemberIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ticketByMemberIdList")); } } }
        if (_ticketStatusList != null) { for (TicketStatus et : _ticketStatusList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ticketStatusList")); } } }
        if (_ticketTypeList != null) { for (TicketType et : _ticketTypeList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "ticketTypeList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_emailAddress));
        sb.append(dm).append(xfND(_memberStatusCode));
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
        if (_memberStatus != null && _memberStatus.isPresent())
        { sb.append(dm).append("memberStatus"); }
        if (_projectList != null && !_projectList.isEmpty())
        { sb.append(dm).append("projectList"); }
        if (_projectMemberList != null && !_projectMemberList.isEmpty())
        { sb.append(dm).append("projectMemberList"); }
        if (_ticketByAssigneedMemberIdList != null && !_ticketByAssigneedMemberIdList.isEmpty())
        { sb.append(dm).append("ticketByAssigneedMemberIdList"); }
        if (_ticketByMemberIdList != null && !_ticketByMemberIdList.isEmpty())
        { sb.append(dm).append("ticketByMemberIdList"); }
        if (_ticketStatusList != null && !_ticketStatusList.isEmpty())
        { sb.append(dm).append("ticketStatusList"); }
        if (_ticketTypeList != null && !_ticketTypeList.isEmpty())
        { sb.append(dm).append("ticketTypeList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Member clone() {
        return (Member)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (メンバーID)MEMBER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return convertEmptyToNull(_memberName);
    }

    /**
     * [set] (メンバー名)MEMBER_NAME: {IX, NotNull, VARCHAR(100)} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] (パスワード)PASSWORD: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return convertEmptyToNull(_password);
    }

    /**
     * [set] (パスワード)PASSWORD: {NotNull, VARCHAR(64)} <br>
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)} <br>
     * ログインIDとして利用する。<br>
     * 昨今メールアドレスをログインIDとすることが多いので、あまり見かけないかも!?
     * @return The value of the column 'EMAIL_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getEmailAddress() {
        checkSpecifiedProperty("emailAddress");
        return convertEmptyToNull(_emailAddress);
    }

    /**
     * [set] (メールアドレス)EMAIL_ADDRESS: {UQ, NotNull, VARCHAR(50)} <br>
     * ログインIDとして利用する。<br>
     * 昨今メールアドレスをログインIDとすることが多いので、あまり見かけないかも!?
     * @param emailAddress The value of the column 'EMAIL_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setEmailAddress(String emailAddress) {
        registerModifiedProperty("emailAddress");
        _emailAddress = emailAddress;
    }

    /**
     * [get] (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * 会員ステータスを参照するコード。<br>
     * ステータスが変わるたびに、このカラムが更新される。
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        checkSpecifiedProperty("memberStatusCode");
        return convertEmptyToNull(_memberStatusCode);
    }

    /**
     * [set] (メンバーステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br>
     * 会員ステータスを参照するコード。<br>
     * ステータスが変わるたびに、このカラムが更新される。
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setMemberStatusCode(String memberStatusCode) {
        checkClassificationCode("MEMBER_STATUS_CODE", CDef.DefMeta.MemberStatus, memberStatusCode);
        registerModifiedProperty("memberStatusCode");
        _memberStatusCode = memberStatusCode;
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

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingMemberStatusCode(String memberStatusCode) {
        setMemberStatusCode(memberStatusCode);
    }
}
