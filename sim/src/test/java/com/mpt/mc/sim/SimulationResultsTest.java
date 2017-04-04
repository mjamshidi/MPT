/**
 * 
 */
package com.mpt.mc.sim;

import junit.framework.TestCase;

/**
 * @author mohamed
 *
 */
public class SimulationResultsTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.mpt.mc.sim.SimulationResults#getPercentile(double)}.
	 */
	public final void testGetPercentile() {
		SimulationResults s = new SimulationResults(12);
		s.addResults(95.1772);
		s.addResults(95.1567);
		s.addResults(95.1937);
		s.addResults(95.1959);
		s.addResults(95.1442);
		s.addResults(95.0610);
		s.addResults(95.1591);
		s.addResults(95.1195);
		s.addResults(95.1065);
		s.addResults(95.0925);
		s.addResults(95.1990);
		s.addResults(95.1682);
		assertEquals(95.19807, s.getPercentile(90));
	}

}
