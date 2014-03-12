/**
 * This class is generated by jOOQ
 */
package com.yahoo.performance.lighthouse.analytics.jooq;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>K2V15</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.Record> PK_DIM_NGD_CRTV_CNTN = UniqueKeys0.PK_DIM_NGD_CRTV_CNTN;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.Record> PK_DIM_NGD_CRTV_CNTN = createUniqueKey(com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn.DIM_NGD_CRTV_CNTN, com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn.DIM_NGD_CRTV_CNTN.CRTV_ID, com.yahoo.performance.lighthouse.analytics.jooq.tables.DimNgdCrtvCntn.DIM_NGD_CRTV_CNTN.MEDIA_TYPE);
	}
}
