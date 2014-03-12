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
public class FactHighlevelE2eDetails extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1326774031;

	/**
	 * The singleton instance of <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS</code>
	 */
	public static final com.yahoo.performance.lighthouse.analytics.jooq.tables.FactHighlevelE2eDetails FACT_HIGHLEVEL_E2E_DETAILS = new com.yahoo.performance.lighthouse.analytics.jooq.tables.FactHighlevelE2eDetails();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.REPORT_DATE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> REPORT_DATE = createField("REPORT_DATE", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.PROPERTY_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROPERTY_NAME = createField("PROPERTY_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.PAGE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PAGE_NAME = createField("PAGE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(200), this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.SPACE_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPACE_ID = createField("SPACE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.POSITION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> POSITION = createField("POSITION", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.BROWSER_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> BROWSER_NAME = createField("BROWSER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.IMPRESSIONS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> IMPRESSIONS = createField("IMPRESSIONS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.N95TH_E2E</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_E2E = createField("N95TH_E2E", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.N95TH_TIME_BEFORE_AD_RENDER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_TIME_BEFORE_AD_RENDER = createField("N95TH_TIME_BEFORE_AD_RENDER", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.N95TH_POSITION_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_POSITION_LATENCY = createField("N95TH_POSITION_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.MEAN_E2E</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_E2E = createField("MEAN_E2E", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.MEAN_TIME_BEFORE_AD_RENDER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_TIME_BEFORE_AD_RENDER = createField("MEAN_TIME_BEFORE_AD_RENDER", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS.MEAN_POSITION_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_POSITION_LATENCY = createField("MEAN_POSITION_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Create a <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS</code> table reference
	 */
	public FactHighlevelE2eDetails() {
		super("FACT_HIGHLEVEL_E2E_DETAILS", com.yahoo.performance.lighthouse.analytics.jooq.K2v15.K2V15);
	}

	/**
	 * Create an aliased <code>K2V15.FACT_HIGHLEVEL_E2E_DETAILS</code> table reference
	 */
	public FactHighlevelE2eDetails(java.lang.String alias) {
		super(alias, com.yahoo.performance.lighthouse.analytics.jooq.K2v15.K2V15, com.yahoo.performance.lighthouse.analytics.jooq.tables.FactHighlevelE2eDetails.FACT_HIGHLEVEL_E2E_DETAILS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.yahoo.performance.lighthouse.analytics.jooq.tables.FactHighlevelE2eDetails as(java.lang.String alias) {
		return new com.yahoo.performance.lighthouse.analytics.jooq.tables.FactHighlevelE2eDetails(alias);
	}
}