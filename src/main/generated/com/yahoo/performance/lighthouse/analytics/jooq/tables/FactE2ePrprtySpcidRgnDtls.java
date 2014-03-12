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
public class FactE2ePrprtySpcidRgnDtls extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1270053562;

	/**
	 * The singleton instance of <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS</code>
	 */
	public static final com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcidRgnDtls FACT_E2E_PRPRTY_SPCID_RGN_DTLS = new com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcidRgnDtls();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.REPORT_DATE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> REPORT_DATE = createField("REPORT_DATE", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.SPACE_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPACE_ID = createField("SPACE_ID", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.PROPERTY_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROPERTY_NAME = createField("PROPERTY_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.REGION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REGION = createField("REGION", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.IMPRESSIONS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> IMPRESSIONS = createField("IMPRESSIONS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.AD_START_BEFORE_LOAD</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> AD_START_BEFORE_LOAD = createField("AD_START_BEFORE_LOAD", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.N95TH_E2E</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_E2E = createField("N95TH_E2E", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.N95TH_TIME_BEFORE_AD_RENDER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_TIME_BEFORE_AD_RENDER = createField("N95TH_TIME_BEFORE_AD_RENDER", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.N95TH_AD_INIT_DELAY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_AD_INIT_DELAY = createField("N95TH_AD_INIT_DELAY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.N95TH_SERVER_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_SERVER_LATENCY = createField("N95TH_SERVER_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.N95TH_CLIENT_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_CLIENT_LATENCY = createField("N95TH_CLIENT_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.N95TH_FAC_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_FAC_LATENCY = createField("N95TH_FAC_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.N95TH_POSITION_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_POSITION_LATENCY = createField("N95TH_POSITION_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.N95TH_PAGE_RENDER_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_PAGE_RENDER_LATENCY = createField("N95TH_PAGE_RENDER_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.MEAN_E2E</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_E2E = createField("MEAN_E2E", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.MEAN_TIME_BEFORE_AD_RENDER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_TIME_BEFORE_AD_RENDER = createField("MEAN_TIME_BEFORE_AD_RENDER", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.MEAN_AD_INIT_DELAY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_AD_INIT_DELAY = createField("MEAN_AD_INIT_DELAY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.MEAN_SERVER_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_SERVER_LATENCY = createField("MEAN_SERVER_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.MEAN_CLIENT_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_CLIENT_LATENCY = createField("MEAN_CLIENT_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.MEAN_FAC_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_FAC_LATENCY = createField("MEAN_FAC_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.MEAN_POSITION_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_POSITION_LATENCY = createField("MEAN_POSITION_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS.MEAN_PAGE_RENDER_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_PAGE_RENDER_LATENCY = createField("MEAN_PAGE_RENDER_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Create a <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS</code> table reference
	 */
	public FactE2ePrprtySpcidRgnDtls() {
		super("FACT_E2E_PRPRTY_SPCID_RGN_DTLS", com.yahoo.performance.lighthouse.analytics.jooq.K2v15.K2V15);
	}

	/**
	 * Create an aliased <code>K2V15.FACT_E2E_PRPRTY_SPCID_RGN_DTLS</code> table reference
	 */
	public FactE2ePrprtySpcidRgnDtls(java.lang.String alias) {
		super(alias, com.yahoo.performance.lighthouse.analytics.jooq.K2v15.K2V15, com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcidRgnDtls.FACT_E2E_PRPRTY_SPCID_RGN_DTLS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcidRgnDtls as(java.lang.String alias) {
		return new com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcidRgnDtls(alias);
	}
}