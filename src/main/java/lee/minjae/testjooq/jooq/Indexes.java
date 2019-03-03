/*
 * This file is generated by jOOQ.
 */
package lee.minjae.testjooq.jooq;


import javax.annotation.Generated;

import lee.minjae.testjooq.jooq.tables.Dictionary;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>test</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index TEST_PK = Indexes0.TEST_PK;
    public static final Index TEST_TEST_ID_UINDEX = Indexes0.TEST_TEST_ID_UINDEX;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index TEST_PK = Internal.createIndex("test_pk", Dictionary.DICTIONARY, new OrderField[] { Dictionary.DICTIONARY.TEST_ID }, true);
        public static Index TEST_TEST_ID_UINDEX = Internal.createIndex("test_test_id_uindex", Dictionary.DICTIONARY, new OrderField[] { Dictionary.DICTIONARY.TEST_ID }, true);
    }
}