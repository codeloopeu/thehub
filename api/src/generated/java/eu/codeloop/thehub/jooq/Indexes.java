/*
 * This file is generated by jOOQ.
 */
package eu.codeloop.thehub.jooq;


import eu.codeloop.thehub.jooq.tables.Companies;
import eu.codeloop.thehub.jooq.tables.Domains;
import eu.codeloop.thehub.jooq.tables.Equities;
import eu.codeloop.thehub.jooq.tables.JobKeywords;
import eu.codeloop.thehub.jooq.tables.JobPerks;
import eu.codeloop.thehub.jooq.tables.Jobs;
import eu.codeloop.thehub.jooq.tables.JobsJobKeywords;
import eu.codeloop.thehub.jooq.tables.JobsJobPerks;
import eu.codeloop.thehub.jooq.tables.Locations;
import eu.codeloop.thehub.jooq.tables.MonthlySalaries;
import eu.codeloop.thehub.jooq.tables.PositionsTypes;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index COMPANIES_PKEY = Indexes0.COMPANIES_PKEY;
    public static final Index DOMAINS_PKEY = Indexes0.DOMAINS_PKEY;
    public static final Index EQUITIES_PKEY = Indexes0.EQUITIES_PKEY;
    public static final Index JOB_KEYWORDS_PKEY = Indexes0.JOB_KEYWORDS_PKEY;
    public static final Index JOB_PERKS_PKEY = Indexes0.JOB_PERKS_PKEY;
    public static final Index JOBS_PKEY = Indexes0.JOBS_PKEY;
    public static final Index JOBS_JOB_KEYWORDS_PKEY = Indexes0.JOBS_JOB_KEYWORDS_PKEY;
    public static final Index JOBS_JOB_PERKS_PKEY = Indexes0.JOBS_JOB_PERKS_PKEY;
    public static final Index LOCATIONS_PKEY = Indexes0.LOCATIONS_PKEY;
    public static final Index MONTHLY_SALARIES_PKEY = Indexes0.MONTHLY_SALARIES_PKEY;
    public static final Index POSITIONS_TYPES_PKEY = Indexes0.POSITIONS_TYPES_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index COMPANIES_PKEY = Internal.createIndex("companies_pkey", Companies.COMPANIES, new OrderField[] { Companies.COMPANIES.COMPANY_ID }, true);
        public static Index DOMAINS_PKEY = Internal.createIndex("domains_pkey", Domains.DOMAINS, new OrderField[] { Domains.DOMAINS.DOMAIN }, true);
        public static Index EQUITIES_PKEY = Internal.createIndex("equities_pkey", Equities.EQUITIES, new OrderField[] { Equities.EQUITIES.EQUITY }, true);
        public static Index JOB_KEYWORDS_PKEY = Internal.createIndex("job_keywords_pkey", JobKeywords.JOB_KEYWORDS, new OrderField[] { JobKeywords.JOB_KEYWORDS.KEYWORD }, true);
        public static Index JOB_PERKS_PKEY = Internal.createIndex("job_perks_pkey", JobPerks.JOB_PERKS, new OrderField[] { JobPerks.JOB_PERKS.JOB_PERK_ID }, true);
        public static Index JOBS_PKEY = Internal.createIndex("jobs_pkey", Jobs.JOBS, new OrderField[] { Jobs.JOBS.JOB_ID }, true);
        public static Index JOBS_JOB_KEYWORDS_PKEY = Internal.createIndex("jobs_job_keywords_pkey", JobsJobKeywords.JOBS_JOB_KEYWORDS, new OrderField[] { JobsJobKeywords.JOBS_JOB_KEYWORDS.KEYWORD, JobsJobKeywords.JOBS_JOB_KEYWORDS.JOB_ID }, true);
        public static Index JOBS_JOB_PERKS_PKEY = Internal.createIndex("jobs_job_perks_pkey", JobsJobPerks.JOBS_JOB_PERKS, new OrderField[] { JobsJobPerks.JOBS_JOB_PERKS.JOB_PERK_ID, JobsJobPerks.JOBS_JOB_PERKS.JOB_ID }, true);
        public static Index LOCATIONS_PKEY = Internal.createIndex("locations_pkey", Locations.LOCATIONS, new OrderField[] { Locations.LOCATIONS.LOCATION }, true);
        public static Index MONTHLY_SALARIES_PKEY = Internal.createIndex("monthly_salaries_pkey", MonthlySalaries.MONTHLY_SALARIES, new OrderField[] { MonthlySalaries.MONTHLY_SALARIES.MONTHLY_SALARY }, true);
        public static Index POSITIONS_TYPES_PKEY = Internal.createIndex("positions_types_pkey", PositionsTypes.POSITIONS_TYPES, new OrderField[] { PositionsTypes.POSITIONS_TYPES.POSITION_TYPE }, true);
    }
}
