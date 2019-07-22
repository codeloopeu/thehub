/*
 * This file is generated by jOOQ.
 */
package eu.codeloop.thehub.jooq.tables.records;


import eu.codeloop.thehub.jooq.tables.Locations;

import java.time.OffsetDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LocationsRecord extends UpdatableRecordImpl<LocationsRecord> implements Record3<String, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1268445406;

    /**
     * Setter for <code>public.locations.location</code>.
     */
    public LocationsRecord setLocation(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.locations.location</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getLocation() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.locations.date_created</code>.
     */
    public LocationsRecord setDateCreated(OffsetDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.locations.date_created</code>.
     */
    public OffsetDateTime getDateCreated() {
        return (OffsetDateTime) get(1);
    }

    /**
     * Setter for <code>public.locations.date_modified</code>.
     */
    public LocationsRecord setDateModified(OffsetDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.locations.date_modified</code>.
     */
    public OffsetDateTime getDateModified() {
        return (OffsetDateTime) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Locations.LOCATIONS.LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field2() {
        return Locations.LOCATIONS.DATE_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field3() {
        return Locations.LOCATIONS.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component2() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component3() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value2() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value3() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value1(String value) {
        setLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value2(OffsetDateTime value) {
        setDateCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value3(OffsetDateTime value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord values(String value1, OffsetDateTime value2, OffsetDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationsRecord
     */
    public LocationsRecord() {
        super(Locations.LOCATIONS);
    }

    /**
     * Create a detached, initialised LocationsRecord
     */
    public LocationsRecord(String location, OffsetDateTime dateCreated, OffsetDateTime dateModified) {
        super(Locations.LOCATIONS);

        set(0, location);
        set(1, dateCreated);
        set(2, dateModified);
    }
}