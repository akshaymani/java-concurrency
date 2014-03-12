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
public class FactBuyers extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1915712808;

	/**
	 * The singleton instance of <code>K2V15.FACT_BUYERS</code>
	 */
	public static final com.yahoo.performance.lighthouse.analytics.jooq.tables.FactBuyers FACT_BUYERS = new com.yahoo.performance.lighthouse.analytics.jooq.tables.FactBuyers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>K2V15.FACT_BUYERS.REPORT_DATE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> REPORT_DATE = createField("REPORT_DATE", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.PROPERTY_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROPERTY_NAME = createField("PROPERTY_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.ACCT_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ACCT_NAME = createField("ACCT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.DELIVERY_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DELIVERY_TYPE = createField("DELIVERY_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.USER_LOC</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> USER_LOC = createField("USER_LOC", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.IMPRESSIONS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> IMPRESSIONS = createField("IMPRESSIONS", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.MEAN_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> MEAN_LATENCY = createField("MEAN_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.N25TH_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N25TH_LATENCY = createField("N25TH_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.N50TH_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N50TH_LATENCY = createField("N50TH_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.N95TH_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N95TH_LATENCY = createField("N95TH_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.N99TH_LATENCY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> N99TH_LATENCY = createField("N99TH_LATENCY", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.SEC1</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> SEC1 = createField("SEC1", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.SEC2</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> SEC2 = createField("SEC2", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>K2V15.FACT_BUYERS.SEC3</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> SEC3 = createField("SEC3", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Create a <code>K2V15.FACT_BUYERS</code> table reference
	 */
	public FactBuyers() {
		super("FACT_BUYERS", com.yahoo.performance.lighthouse.analytics.jooq.K2v15.K2V15);
	}

	/**
	 * Create an aliased <code>K2V15.FACT_BUYERS</code> table reference
	 */
	public FactBuyers(java.lang.String alias) {
		super(alias, com.yahoo.performance.lighthouse.analytics.jooq.K2v15.K2V15, com.yahoo.performance.lighthouse.analytics.jooq.tables.FactBuyers.FACT_BUYERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.yahoo.performance.lighthouse.analytics.jooq.tables.FactBuyers as(java.lang.String alias) {
		return new com.yahoo.performance.lighthouse.analytics.jooq.tables.FactBuyers(alias);
	}
}
