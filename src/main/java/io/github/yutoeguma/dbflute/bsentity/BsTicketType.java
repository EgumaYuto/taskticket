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
 * The entity of (チケットタイプ)TICKET_TYPE as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long ticketTypeId = entity.getTicketTypeId();
 * Long memberId = entity.getMemberId();
 * String ticketTypeIcon = entity.getTicketTypeIcon();
 * String ticketTypeName = entity.getTicketTypeName();
 * Boolean delFlg = entity.getDelFlg();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setTicketTypeId(ticketTypeId);
 * entity.setMemberId(memberId);
 * entity.setTicketTypeIcon(ticketTypeIcon);
 * entity.setTicketTypeName(ticketTypeName);
 * entity.setDelFlg(delFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTicketType extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _ticketTypeId;

    /** (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} */
    protected Long _memberId;

    /** (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)} */
    protected String _ticketTypeIcon;

    /** (チケットタイプ名)TICKET_TYPE_NAME: {NotNull, VARCHAR(128)} */
    protected String _ticketTypeName;

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
        return "TICKET_TYPE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_ticketTypeId == null) { return false; }
        return true;
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
    /** (チケット)TICKET by TICKET_TYPE_ID, named 'ticketList'. */
    protected List<Ticket> _ticketList;

    /**
     * [get] (チケット)TICKET by TICKET_TYPE_ID, named 'ticketList'.
     * @return The entity list of referrer property 'ticketList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Ticket> getTicketList() {
        if (_ticketList == null) { _ticketList = newReferrerList(); }
        return _ticketList;
    }

    /**
     * [set] (チケット)TICKET by TICKET_TYPE_ID, named 'ticketList'.
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
        if (obj instanceof BsTicketType) {
            BsTicketType other = (BsTicketType)obj;
            if (!xSV(_ticketTypeId, other._ticketTypeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ticketTypeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
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
        sb.append(dm).append(xfND(_ticketTypeId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_ticketTypeIcon));
        sb.append(dm).append(xfND(_ticketTypeName));
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
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_ticketList != null && !_ticketList.isEmpty())
        { sb.append(dm).append("ticketList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TicketType clone() {
        return (TicketType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TICKET_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTicketTypeId() {
        checkSpecifiedProperty("ticketTypeId");
        return _ticketTypeId;
    }

    /**
     * [set] (チケットタイプID)TICKET_TYPE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param ticketTypeId The value of the column 'TICKET_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTicketTypeId(Long ticketTypeId) {
        registerModifiedProperty("ticketTypeId");
        _ticketTypeId = ticketTypeId;
    }

    /**
     * [get] (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * このチケットタイプを作ったメンバー
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (メンバーID)MEMBER_ID: {IX, NotNull, BIGINT(19), FK to MEMBER} <br>
     * このチケットタイプを作ったメンバー
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Long memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)} <br>
     * @return The value of the column 'TICKET_TYPE_ICON'. (basically NotNull if selected: for the constraint)
     */
    public String getTicketTypeIcon() {
        checkSpecifiedProperty("ticketTypeIcon");
        return convertEmptyToNull(_ticketTypeIcon);
    }

    /**
     * [set] (チケットタイプアイコン)TICKET_TYPE_ICON: {NotNull, VARCHAR(128)} <br>
     * @param ticketTypeIcon The value of the column 'TICKET_TYPE_ICON'. (basically NotNull if update: for the constraint)
     */
    public void setTicketTypeIcon(String ticketTypeIcon) {
        registerModifiedProperty("ticketTypeIcon");
        _ticketTypeIcon = ticketTypeIcon;
    }

    /**
     * [get] (チケットタイプ名)TICKET_TYPE_NAME: {NotNull, VARCHAR(128)} <br>
     * @return The value of the column 'TICKET_TYPE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getTicketTypeName() {
        checkSpecifiedProperty("ticketTypeName");
        return convertEmptyToNull(_ticketTypeName);
    }

    /**
     * [set] (チケットタイプ名)TICKET_TYPE_NAME: {NotNull, VARCHAR(128)} <br>
     * @param ticketTypeName The value of the column 'TICKET_TYPE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setTicketTypeName(String ticketTypeName) {
        registerModifiedProperty("ticketTypeName");
        _ticketTypeName = ticketTypeName;
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
