/**
 * This class is generated by jOOQ
 */
package com.yahoo.performance.lighthouse.analytics.jooq;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class K2v15 extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 2051447743;

	/**
	 * The singleton instance of <code>K2V15</code>
	 */
	public static final K2v15 K2V15 = new K2v15();

	/**
	 * No further instances allowed
	 */
	private K2v15() {
		super("K2V15");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn.DIM_NGD_CRTV_CNTN,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.DimVendorDomains.DIM_VENDOR_DOMAINS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactBuckets.FACT_BUCKETS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactBuyers.FACT_BUYERS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactCreatives.FACT_CREATIVES,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBktPrptyBrvrsn.FACT_E2E_BKT_PRPTY_BRVRSN,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBktPrptyBrvrsnDtls.FACT_E2E_BKT_PRPTY_BRVRSN_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBktPrptyBrwsr.FACT_E2E_BKT_PRPTY_BRWSR,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBktPrptyBrwsrDtls.FACT_E2E_BKT_PRPTY_BRWSR_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBktPrptyDtls.FACT_E2E_BKT_PRPTY_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBktPrptySpcid.FACT_E2E_BKT_PRPTY_SPCID,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBktPrptySpcidDtls.FACT_E2E_BKT_PRPTY_SPCID_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBrwsr.FACT_E2E_BRWSR,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBrwsrDtls.FACT_E2E_BRWSR_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBrwsrVrsn.FACT_E2E_BRWSR_VRSN,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eBrwsrVrsnDtls.FACT_E2E_BRWSR_VRSN_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprty.FACT_E2E_PRPRTY,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtyBrwsr.FACT_E2E_PRPRTY_BRWSR,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtyBrwsrDtls.FACT_E2E_PRPRTY_BRWSR_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtyBrwsrVrsn.FACT_E2E_PRPRTY_BRWSR_VRSN,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtyBrwsrVrsnDtl.FACT_E2E_PRPRTY_BRWSR_VRSN_DTL,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtyDtls.FACT_E2E_PRPRTY_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtyRgn.FACT_E2E_PRPRTY_RGN,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtyRgnDtls.FACT_E2E_PRPRTY_RGN_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcid.FACT_E2E_PRPRTY_SPCID,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcidDtls.FACT_E2E_PRPRTY_SPCID_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcidRgnDtls.FACT_E2E_PRPRTY_SPCID_RGN_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2ePrprtySpcIdRgn.FACT_E2E_PRPRTY_SPC_ID_RGN,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eRgn.FACT_E2E_RGN,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eRgnDtls.FACT_E2E_RGN_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eYahoo.FACT_E2E_YAHOO,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactE2eYahooDtls.FACT_E2E_YAHOO_DTLS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactHighlevelE2eDetails.FACT_HIGHLEVEL_E2E_DETAILS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactHighlevelE2eProperty.FACT_HIGHLEVEL_E2E_PROPERTY,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactProperties.FACT_PROPERTIES,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactSciences.FACT_SCIENCES,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactTop10vendors.FACT_TOP10VENDORS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.FactVendors.FACT_VENDORS,
			com.yahoo.performance.lighthouse.analytics.jooq.tables.VwTopC2AdTag.VW_TOP_C2_AD_TAG);
	}
}
