/*
 * This file is generated by jOOQ.
*/
package com.sylvanaqua.farmhacker.database.tables;


import com.sylvanaqua.farmhacker.database.Farmhacker;
import com.sylvanaqua.farmhacker.database.Keys;
import com.sylvanaqua.farmhacker.database.tables.records.InventoryRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Inventory extends TableImpl<InventoryRecord> {

    private static final long serialVersionUID = 737287598;

    /**
     * The reference instance of <code>farmhacker.inventory</code>
     */
    public static final Inventory INVENTORY = new Inventory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InventoryRecord> getRecordType() {
        return InventoryRecord.class;
    }

    /**
     * The column <code>farmhacker.inventory.id</code>.
     */
    public final TableField<InventoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>farmhacker.inventory.catalog_id</code>.
     */
    public final TableField<InventoryRecord, Integer> CATALOG_ID = createField("catalog_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>farmhacker.inventory.measure</code>.
     */
    public final TableField<InventoryRecord, Short> MEASURE = createField("measure", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>farmhacker.inventory.time_entered</code>.
     */
    public final TableField<InventoryRecord, Timestamp> TIME_ENTERED = createField("time_entered", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>farmhacker.inventory</code> table reference
     */
    public Inventory() {
        this("inventory", null);
    }

    /**
     * Create an aliased <code>farmhacker.inventory</code> table reference
     */
    public Inventory(String alias) {
        this(alias, INVENTORY);
    }

    private Inventory(String alias, Table<InventoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Inventory(String alias, Table<InventoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Farmhacker.FARMHACKER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InventoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INVENTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InventoryRecord> getPrimaryKey() {
        return Keys.KEY_INVENTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InventoryRecord>> getKeys() {
        return Arrays.<UniqueKey<InventoryRecord>>asList(Keys.KEY_INVENTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InventoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InventoryRecord, ?>>asList(Keys.INVENTORY_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Inventory as(String alias) {
        return new Inventory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Inventory rename(String name) {
        return new Inventory(name, null);
    }
}
