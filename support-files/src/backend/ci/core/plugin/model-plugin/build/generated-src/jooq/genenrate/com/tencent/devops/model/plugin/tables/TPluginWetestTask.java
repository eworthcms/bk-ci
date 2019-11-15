/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.plugin.tables;


import com.tencent.devops.model.plugin.DevopsPlugin;
import com.tencent.devops.model.plugin.Keys;
import com.tencent.devops.model.plugin.tables.records.TPluginWetestTaskRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPluginWetestTask extends TableImpl<TPluginWetestTaskRecord> {

    private static final long serialVersionUID = -745745413;

    /**
     * The reference instance of <code>devops_plugin.T_PLUGIN_WETEST_TASK</code>
     */
    public static final TPluginWetestTask T_PLUGIN_WETEST_TASK = new TPluginWetestTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPluginWetestTaskRecord> getRecordType() {
        return TPluginWetestTaskRecord.class;
    }

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.ID</code>.
     */
    public final TableField<TPluginWetestTaskRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.PROJECT_ID</code>.
     */
    public final TableField<TPluginWetestTaskRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.NAME</code>.
     */
    public final TableField<TPluginWetestTaskRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.MOBILE_CATEGORY</code>.
     */
    public final TableField<TPluginWetestTaskRecord, String> MOBILE_CATEGORY = createField("MOBILE_CATEGORY", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.MOBILE_CATEGORY_ID</code>.
     */
    public final TableField<TPluginWetestTaskRecord, String> MOBILE_CATEGORY_ID = createField("MOBILE_CATEGORY_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.MOBILE_MODEL</code>.
     */
    public final TableField<TPluginWetestTaskRecord, String> MOBILE_MODEL = createField("MOBILE_MODEL", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.MOBILE_MODEL_ID</code>.
     */
    public final TableField<TPluginWetestTaskRecord, String> MOBILE_MODEL_ID = createField("MOBILE_MODEL_ID", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.DESCRIPTION</code>.
     */
    public final TableField<TPluginWetestTaskRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.TICKETS_ID</code>.
     */
    public final TableField<TPluginWetestTaskRecord, String> TICKETS_ID = createField("TICKETS_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.CREATED_TIME</code>.
     */
    public final TableField<TPluginWetestTaskRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_WETEST_TASK.UPDATED_TIME</code>.
     */
    public final TableField<TPluginWetestTaskRecord, LocalDateTime> UPDATED_TIME = createField("UPDATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>devops_plugin.T_PLUGIN_WETEST_TASK</code> table reference
     */
    public TPluginWetestTask() {
        this("T_PLUGIN_WETEST_TASK", null);
    }

    /**
     * Create an aliased <code>devops_plugin.T_PLUGIN_WETEST_TASK</code> table reference
     */
    public TPluginWetestTask(String alias) {
        this(alias, T_PLUGIN_WETEST_TASK);
    }

    private TPluginWetestTask(String alias, Table<TPluginWetestTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPluginWetestTask(String alias, Table<TPluginWetestTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsPlugin.DEVOPS_PLUGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TPluginWetestTaskRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_PLUGIN_WETEST_TASK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPluginWetestTaskRecord> getPrimaryKey() {
        return Keys.KEY_T_PLUGIN_WETEST_TASK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPluginWetestTaskRecord>> getKeys() {
        return Arrays.<UniqueKey<TPluginWetestTaskRecord>>asList(Keys.KEY_T_PLUGIN_WETEST_TASK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginWetestTask as(String alias) {
        return new TPluginWetestTask(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPluginWetestTask rename(String name) {
        return new TPluginWetestTask(name, null);
    }
}