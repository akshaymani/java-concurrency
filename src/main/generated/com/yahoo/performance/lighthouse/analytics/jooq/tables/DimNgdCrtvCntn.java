/**
 * This class is generated by jOOQ
 */
package com.yahoo.performance.lighthouse.analytics.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DimNgdCrtvCntn extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1948152097;

	/**
	 * The singleton instance of <code>K2V15.DIM_NGD_CRTV_CNTN</code>
	 */
	public static final com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn DIM_NGD_CRTV_CNTN = new com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.CRTV_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> CRTV_ID = createField("CRTV_ID", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.DESCRIPTION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.VENDOR_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> VENDOR_NAME = createField("VENDOR_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.ACTIVE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.CREATED_ON</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> CREATED_ON = createField("CREATED_ON", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.HEIGHT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> HEIGHT = createField("HEIGHT", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.WIDTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> WIDTH = createField("WIDTH", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.STATUS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.IS_THIRD_PARTY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> IS_THIRD_PARTY = createField("IS_THIRD_PARTY", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.MEDIA_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> MEDIA_TYPE = createField("MEDIA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.CONTENT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONTENT = createField("CONTENT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.MEDIA_URL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> MEDIA_URL = createField("MEDIA_URL", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.FILE_SIZE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> FILE_SIZE = createField("FILE_SIZE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.DIM_NGD_CRTV_CNTN.LAST_UPDATE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> LAST_UPDATE = createField("LAST_UPDATE", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * Create a <code>K2V15.DIM_NGD_CRTV_CNTN</code> table reference
	 */
	public DimNgdCrtvCntn() {
		super("DIM_NGD_CRTV_CNTN", com.yahoo.performance.lighthouse.analytics.jooq.K2v15.K2V15);
	}

	/**
	 * Create an aliased <code>K2V15.DIM_NGD_CRTV_CNTN</code> table reference
	 */
	public DimNgdCrtvCntn(java.lang.String alias) {
		super(alias, com.yahoo.performance.lighthouse.analytics.jooq.K2v15.K2V15, com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn.DIM_NGD_CRTV_CNTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getPrimaryKey() {
		return com.yahoo.performance.lighthouse.analytics.jooq.Keys.PK_DIM_NGD_CRTV_CNTN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(com.yahoo.performance.lighthouse.analytics.jooq.Keys.PK_DIM_NGD_CRTV_CNTN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn as(java.lang.String alias) {
		return new com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn(alias);
	}
}
