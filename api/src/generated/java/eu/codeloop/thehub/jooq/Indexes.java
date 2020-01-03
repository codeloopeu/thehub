/*
 * This file is generated by jOOQ.
 */
package eu.codeloop.thehub.jooq;


import eu.codeloop.thehub.jooq.tables.Companies;
import eu.codeloop.thehub.jooq.tables.Equities;
import eu.codeloop.thehub.jooq.tables.Jobs;
import eu.codeloop.thehub.jooq.tables.Locations;
import eu.codeloop.thehub.jooq.tables.MonthlySalaries;

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
    public static final Index EQUITIES_PKEY = Indexes0.EQUITIES_PKEY;
    public static final Index JOBS_PKEY = Indexes0.JOBS_PKEY;
    public static final Index LOCATIONS_PKEY = Indexes0.LOCATIONS_PKEY;
    public static final Index MONTHLY_SALARIES_PKEY = Indexes0.MONTHLY_SALARIES_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index COMPANIES_PKEY = Internal.createIndex("companies_pkey", Companies.COMPANIES, new OrderField[] { Companies.COMPANIES.COMPANY_ID }, true);
        public static Index EQUITIES_PKEY = Internal.createIndex("equities_pkey", Equities.EQUITIES, new OrderField[] { Equities.EQUITIES.EQUITY }, true);
        public static Index JOBS_PKEY = Internal.createIndex("jobs_pkey", Jobs.JOBS, new OrderField[] { Jobs.JOBS.JOB_ID }, true);
        public static Index LOCATIONS_PKEY = Internal.createIndex("locations_pkey", Locations.LOCATIONS, new OrderField[] { Locations.LOCATIONS.LOCATION }, true);
        public static Index MONTHLY_SALARIES_PKEY = Internal.createIndex("monthly_salaries_pkey", MonthlySalaries.MONTHLY_SALARIES, new OrderField[] { MonthlySalaries.MONTHLY_SALARIES.MONTHLY_SALARY }, true);
    }
}
