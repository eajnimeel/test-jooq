/*
 * This file is generated by jOOQ.
 */
package lee.minjae.testjooq.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import lee.minjae.testjooq.jooq.Indexes;
import lee.minjae.testjooq.jooq.Keys;
import lee.minjae.testjooq.jooq.Test;
import lee.minjae.testjooq.jooq.tables.records.DictionaryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dictionary extends TableImpl<DictionaryRecord> {

    private static final long serialVersionUID = 2010060146;

    /**
     * The reference instance of <code>test.dictionary</code>
     */
    public static final Dictionary DICTIONARY = new Dictionary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictionaryRecord> getRecordType() {
        return DictionaryRecord.class;
    }

    /**
     * The column <code>test.dictionary.test_id</code>.
     */
    public final TableField<DictionaryRecord, Integer> TEST_ID = createField("test_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(
            DSL.field("nextval('test.test_test_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>test.dictionary.korean_word</code>. 한국어 단어
     */
    public final TableField<DictionaryRecord, String> KOREAN_WORD = createField("korean_word", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "한국어 단어");

    /**
     * The column <code>test.dictionary.english_full_word</code>. 영문 단어
     */
    public final TableField<DictionaryRecord, String> ENGLISH_FULL_WORD = createField("english_full_word", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "영문 단어");

    /**
     * The column <code>test.dictionary.english_short_word</code>. 영문 축약어
     */
    public final TableField<DictionaryRecord, String> ENGLISH_SHORT_WORD = createField("english_short_word", org.jooq.impl.SQLDataType.VARCHAR(45), this, "영문 축약어");

    /**
     * The column <code>test.dictionary.use_yn</code>. 사용 여부
     */
    public final TableField<DictionaryRecord, Boolean> USE_YN = createField("use_yn", org.jooq.impl.SQLDataType.BOOLEAN, this, "사용 여부");

    /**
     * The column <code>test.dictionary.package_yn</code>.
     */
    public final TableField<DictionaryRecord, Boolean> PACKAGE_YN = createField("package_yn", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>test.dictionary.class_yn</code>.
     */
    public final TableField<DictionaryRecord, Boolean> CLASS_YN = createField("class_yn", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>test.dictionary.variable_yn</code>.
     */
    public final TableField<DictionaryRecord, Boolean> VARIABLE_YN = createField("variable_yn", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>test.dictionary.method_yn</code>.
     */
    public final TableField<DictionaryRecord, Boolean> METHOD_YN = createField("method_yn", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>test.dictionary.view_yn</code>.
     */
    public final TableField<DictionaryRecord, Boolean> VIEW_YN = createField("view_yn", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>test.dictionary.reg_dttm</code>. 등록 일시
     */
    public final TableField<DictionaryRecord, LocalDateTime> REG_DTTM = createField("reg_dttm", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "등록 일시");

    /**
     * The column <code>test.dictionary.mod_dttm</code>. 수정 일시
     */
    public final TableField<DictionaryRecord, LocalDateTime> MOD_DTTM = createField("mod_dttm", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "수정 일시");

    /**
     * Create a <code>test.dictionary</code> table reference
     */
    public Dictionary() {
        this(DSL.name("dictionary"), null);
    }

    /**
     * Create an aliased <code>test.dictionary</code> table reference
     */
    public Dictionary(String alias) {
        this(DSL.name(alias), DICTIONARY);
    }

    /**
     * Create an aliased <code>test.dictionary</code> table reference
     */
    public Dictionary(Name alias) {
        this(alias, DICTIONARY);
    }

    private Dictionary(Name alias, Table<DictionaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dictionary(Name alias, Table<DictionaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Dictionary(Table<O> child, ForeignKey<O, DictionaryRecord> key) {
        super(child, key, DICTIONARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEST_PK, Indexes.TEST_TEST_ID_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictionaryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DICTIONARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictionaryRecord> getPrimaryKey() {
        return Keys.TEST_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictionaryRecord>> getKeys() {
        return Arrays.<UniqueKey<DictionaryRecord>>asList(Keys.TEST_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary as(String alias) {
        return new Dictionary(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dictionary as(Name alias) {
        return new Dictionary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dictionary rename(String name) {
        return new Dictionary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dictionary rename(Name name) {
        return new Dictionary(name, null);
    }
}
