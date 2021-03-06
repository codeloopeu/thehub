/*
 * This file is generated by jOOQ.
 */
package eu.codeloop.thehub.jooq.tables;


import eu.codeloop.thehub.jooq.Indexes;
import eu.codeloop.thehub.jooq.Keys;
import eu.codeloop.thehub.jooq.Public;
import eu.codeloop.thehub.jooq.tables.records.JobKeywordsRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobKeywords extends TableImpl<JobKeywordsRecord> {

    private static final long serialVersionUID = 2109418363;

    /**
     * The reference instance of <code>public.job_keywords</code>
     */
    public static final JobKeywords JOB_KEYWORDS = new JobKeywords();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobKeywordsRecord> getRecordType() {
        return JobKeywordsRecord.class;
    }

    /**
     * The column <code>public.job_keywords.keyword</code>.
     */
    public final TableField<JobKeywordsRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.job_keywords.date_created</code>.
     */
    public final TableField<JobKeywordsRecord, OffsetDateTime> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public.job_keywords.date_modified</code>.
     */
    public final TableField<JobKeywordsRecord, OffsetDateTime> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * Create a <code>public.job_keywords</code> table reference
     */
    public JobKeywords() {
        this(DSL.name("job_keywords"), null);
    }

    /**
     * Create an aliased <code>public.job_keywords</code> table reference
     */
    public JobKeywords(String alias) {
        this(DSL.name(alias), JOB_KEYWORDS);
    }

    /**
     * Create an aliased <code>public.job_keywords</code> table reference
     */
    public JobKeywords(Name alias) {
        this(alias, JOB_KEYWORDS);
    }

    private JobKeywords(Name alias, Table<JobKeywordsRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobKeywords(Name alias, Table<JobKeywordsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JobKeywords(Table<O> child, ForeignKey<O, JobKeywordsRecord> key) {
        super(child, key, JOB_KEYWORDS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.JOB_KEYWORDS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobKeywordsRecord> getPrimaryKey() {
        return Keys.JOB_KEYWORDS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobKeywordsRecord>> getKeys() {
        return Arrays.<UniqueKey<JobKeywordsRecord>>asList(Keys.JOB_KEYWORDS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobKeywords as(String alias) {
        return new JobKeywords(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobKeywords as(Name alias) {
        return new JobKeywords(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobKeywords rename(String name) {
        return new JobKeywords(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JobKeywords rename(Name name) {
        return new JobKeywords(name, null);
    }
}
