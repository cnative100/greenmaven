/*
 * This file is generated by jOOQ.
*/
package com.sylvanaqua.farmhacker.database.tables.records;


import com.sylvanaqua.farmhacker.database.tables.FarmhackerUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmhackerUserRecord extends UpdatableRecordImpl<FarmhackerUserRecord> implements Record7<String, String, String, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1777070812;

    /**
     * Setter for <code>farmhacker.farmhacker_user.username</code>.
     */
    public void setUsername(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>farmhacker.farmhacker_user.username</code>.
     */
    public String getUsername() {
        return (String) get(0);
    }

    /**
     * Setter for <code>farmhacker.farmhacker_user.password</code>.
     */
    public void setPassword(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>farmhacker.farmhacker_user.password</code>.
     */
    public String getPassword() {
        return (String) get(1);
    }

    /**
     * Setter for <code>farmhacker.farmhacker_user.role</code>.
     */
    public void setRole(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>farmhacker.farmhacker_user.role</code>.
     */
    public String getRole() {
        return (String) get(2);
    }

    /**
     * Setter for <code>farmhacker.farmhacker_user.is_eater</code>.
     */
    public void setIsEater(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>farmhacker.farmhacker_user.is_eater</code>.
     */
    public Integer getIsEater() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>farmhacker.farmhacker_user.is_grower</code>.
     */
    public void setIsGrower(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>farmhacker.farmhacker_user.is_grower</code>.
     */
    public Integer getIsGrower() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>farmhacker.farmhacker_user.is_facebook_user</code>.
     */
    public void setIsFacebookUser(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>farmhacker.farmhacker_user.is_facebook_user</code>.
     */
    public Integer getIsFacebookUser() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>farmhacker.farmhacker_user.zip</code>.
     */
    public void setZip(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>farmhacker.farmhacker_user.zip</code>.
     */
    public Integer getZip() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FarmhackerUser.FARMHACKER_USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FarmhackerUser.FARMHACKER_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FarmhackerUser.FARMHACKER_USER.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return FarmhackerUser.FARMHACKER_USER.IS_EATER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return FarmhackerUser.FARMHACKER_USER.IS_GROWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return FarmhackerUser.FARMHACKER_USER.IS_FACEBOOK_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return FarmhackerUser.FARMHACKER_USER.ZIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getIsEater();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getIsGrower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIsFacebookUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getZip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FarmhackerUserRecord value1(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FarmhackerUserRecord value2(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FarmhackerUserRecord value3(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FarmhackerUserRecord value4(Integer value) {
        setIsEater(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FarmhackerUserRecord value5(Integer value) {
        setIsGrower(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FarmhackerUserRecord value6(Integer value) {
        setIsFacebookUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FarmhackerUserRecord value7(Integer value) {
        setZip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FarmhackerUserRecord values(String value1, String value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FarmhackerUserRecord
     */
    public FarmhackerUserRecord() {
        super(FarmhackerUser.FARMHACKER_USER);
    }

    /**
     * Create a detached, initialised FarmhackerUserRecord
     */
    public FarmhackerUserRecord(String username, String password, String role, Integer isEater, Integer isGrower, Integer isFacebookUser, Integer zip) {
        super(FarmhackerUser.FARMHACKER_USER);

        set(0, username);
        set(1, password);
        set(2, role);
        set(3, isEater);
        set(4, isGrower);
        set(5, isFacebookUser);
        set(6, zip);
    }
}
