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
 * The entity of (チケットステータス)TICKET_STATUS as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TICKET_STATUS_ID
 *
 * [column]
 *     TICKET_STATUS_ID, PROJECT_ID, TICKET_STATUS_NAME, TICKET_STATUS_ICON, DEL_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TICKET_STATUS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PROJECT
 *
 * [referrer table]
 *     TICKET
 *
 * [foreign property]
 *     project
 *
 * [referrer property]
 *     ticketList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long ticketStatusId = entity.getTicketStatusId();
 * Long projectId = entity.getProjectId();
 * String ticketStatusName = entity.getTicketStatusName();
 * String ticketStatusIcon = entity.getTicketStatusIcon();
 * Boolean delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setTicketStatusId(ticketStatusId);
 * entity.setProjectId(projectId);
 * entity.setTicketStatusName(ticketStatusName);
 * entity.setTicketStatusIcon(ticketStatusIcon);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTicketStatus extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _ticketStatusId;

    /** (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT} */
    protected Long _projectId;

    /** (チケットステータス名)TICKET_STATUS_NAME: {+UQ, NotNull, VARCHAR(128)} */
    protected String _ticketStatusName;

    /** (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)} */
    protected String _ticketStatusIcon;

    /** (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg} */
    protected Boolean _delFlg;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TICKET_STATUS";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_ticketStatusId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param projectId (プロジェクトID): UQ+, NotNull, BIGINT(19), FK to PROJECT. (NotNull)
     * @param ticketStatusName (チケットステータス名): +UQ, NotNull, VARCHAR(128). (NotNull)
     */
    public void uniqueBy(Long projectId, String ticketStatusName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("projectId");
        __uniqueDrivenProperties.addPropertyName("ticketStatusName");
        setProjectId(projectId);setTicketStatusName(ticketStatusName);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of Flg. <br>
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getDelFlgAsFlg() {
        return CDef.Flg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of Flg. <br>
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsFlg(CDef.Flg cdef) {
        setDelFlg(cdef != null ? toBoolean(cdef.code()) : null);
    }

    /**
     * Set the value of delFlg as boolean. <br>
     * (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsBoolean(Boolean determination) {
        setDelFlgAsFlg(CDef.Flg.codeOf(determination));
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as True (1). <br>
     * Checked: means yes
     */
    public void setDelFlg_True() {
        setDelFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of delFlg as False (0). <br>
     * Unchecked: means no
     */
    public void setDelFlg_False() {
        setDelFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg True? <br>
     * Checked: means yes
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlgTrue() {
        CDef.Flg cdef = getDelFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of delFlg False? <br>
     * Unchecked: means no
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlgFalse() {
        CDef.Flg cdef = getDelFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.Flg cdef = getDelFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDelFlgAlias() {
        CDef.Flg cdef = getDelFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (チケット)TICKET by TICKET_STATUS_ID, named 'ticketList'. */
    protected List<Ticket> _ticketList;

    /**
     * [get] (チケット)TICKET by TICKET_STATUS_ID, named 'ticketList'.
     * @return The entity list of referrer property 'ticketList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Ticket> getTicketList() {
        if (_ticketList == null) { _ticketList = newReferrerList(); }
        return _ticketList;
    }

    /**
     * [set] (チケット)TICKET by TICKET_STATUS_ID, named 'ticketList'.
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
        if (obj instanceof BsTicketStatus) {
            BsTicketStatus other = (BsTicketStatus)obj;
            if (!xSV(_ticketStatusId, other._ticketStatusId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ticketStatusId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_project != null && _project.isPresent())
        { sb.append(li).append(xbRDS(_project, "project")); }
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
        sb.append(dm).append(xfND(_ticketStatusId));
        sb.append(dm).append(xfND(_projectId));
        sb.append(dm).append(xfND(_ticketStatusName));
        sb.append(dm).append(xfND(_ticketStatusIcon));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_project != null && _project.isPresent())
        { sb.append(dm).append("project"); }
        if (_ticketList != null && !_ticketList.isEmpty())
        { sb.append(dm).append("ticketList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TicketStatus clone() {
        return (TicketStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TICKET_STATUS_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTicketStatusId() {
        checkSpecifiedProperty("ticketStatusId");
        return _ticketStatusId;
    }

    /**
     * [set] (チケットステータスID)TICKET_STATUS_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param ticketStatusId The value of the column 'TICKET_STATUS_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTicketStatusId(Long ticketStatusId) {
        registerModifiedProperty("ticketStatusId");
        _ticketStatusId = ticketStatusId;
    }

    /**
     * [get] (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT} <br>
     * @return The value of the column 'PROJECT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProjectId() {
        checkSpecifiedProperty("projectId");
        return _projectId;
    }

    /**
     * [set] (プロジェクトID)PROJECT_ID: {UQ+, NotNull, BIGINT(19), FK to PROJECT} <br>
     * @param projectId The value of the column 'PROJECT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProjectId(Long projectId) {
        registerModifiedProperty("projectId");
        _projectId = projectId;
    }

    /**
     * [get] (チケットステータス名)TICKET_STATUS_NAME: {+UQ, NotNull, VARCHAR(128)} <br>
     * @return The value of the column 'TICKET_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getTicketStatusName() {
        checkSpecifiedProperty("ticketStatusName");
        return convertEmptyToNull(_ticketStatusName);
    }

    /**
     * [set] (チケットステータス名)TICKET_STATUS_NAME: {+UQ, NotNull, VARCHAR(128)} <br>
     * @param ticketStatusName The value of the column 'TICKET_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setTicketStatusName(String ticketStatusName) {
        registerModifiedProperty("ticketStatusName");
        _ticketStatusName = ticketStatusName;
    }

    /**
     * [get] (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)} <br>
     * http://fontawesome.io/icons/ を参考に
     * @return The value of the column 'TICKET_STATUS_ICON'. (basically NotNull if selected: for the constraint)
     */
    public String getTicketStatusIcon() {
        checkSpecifiedProperty("ticketStatusIcon");
        return convertEmptyToNull(_ticketStatusIcon);
    }

    /**
     * [set] (チケットステータスアイコン)TICKET_STATUS_ICON: {NotNull, VARCHAR(128)} <br>
     * http://fontawesome.io/icons/ を参考に
     * @param ticketStatusIcon The value of the column 'TICKET_STATUS_ICON'. (basically NotNull if update: for the constraint)
     */
    public void setTicketStatusIcon(String ticketStatusIcon) {
        registerModifiedProperty("ticketStatusIcon");
        _ticketStatusIcon = ticketStatusIcon;
    }

    /**
     * [get] (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg} <br>
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return _delFlg;
    }

    /**
     * [set] (削除フラグ)DEL_FLG: {NotNull, BIT, classification=Flg} <br>
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(Boolean delFlg) {
        checkClassificationCode("DEL_FLG", CDef.DefMeta.Flg, delFlg);
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
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
}
