/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.repository.tables.records;


import com.tencent.devops.model.repository.tables.TRepositoryGithubWhitelist;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRepositoryGithubWhitelistRecord extends UpdatableRecordImpl<TRepositoryGithubWhitelistRecord> implements Record5<Long, String, String, String, LocalDateTime> {

    private static final long serialVersionUID = -1591981060;

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.ID</code>.
     */
    public TRepositoryGithubWhitelistRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.PROJECT_ID</code>. 项目ID
     */
    public TRepositoryGithubWhitelistRecord setProjectId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.PROJECT_ID</code>. 项目ID
     */
    public String getProjectId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.URL</code>. github代码库链接
     */
    public TRepositoryGithubWhitelistRecord setUrl(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.URL</code>. github代码库链接
     */
    public String getUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.CREATOR</code>. 创建人
     */
    public TRepositoryGithubWhitelistRecord setCreator(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.CREATOR</code>. 创建人
     */
    public String getCreator() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.CREATED_TIME</code>. 创建时间
     */
    public TRepositoryGithubWhitelistRecord setCreatedTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_GITHUB_WHITELIST.CREATED_TIME</code>. 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, String, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, String, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryGithubWhitelistRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryGithubWhitelistRecord value2(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryGithubWhitelistRecord value3(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryGithubWhitelistRecord value4(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryGithubWhitelistRecord value5(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryGithubWhitelistRecord values(Long value1, String value2, String value3, String value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRepositoryGithubWhitelistRecord
     */
    public TRepositoryGithubWhitelistRecord() {
        super(TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST);
    }

    /**
     * Create a detached, initialised TRepositoryGithubWhitelistRecord
     */
    public TRepositoryGithubWhitelistRecord(Long id, String projectId, String url, String creator, LocalDateTime createdTime) {
        super(TRepositoryGithubWhitelist.T_REPOSITORY_GITHUB_WHITELIST);

        set(0, id);
        set(1, projectId);
        set(2, url);
        set(3, creator);
        set(4, createdTime);
    }
}