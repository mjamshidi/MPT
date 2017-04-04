/**
 * 
 */
package com.mpt.mc.sim;

/**
 * @author mohamed
 *
 */
public class PortfolioSimulationValues {

	private Portfolio p;
	private double Median;
	private double TenBestCase;
	private double TenWorstCase;
	
	public PortfolioSimulationValues(Portfolio p) {
		this.p = p;
	}

	/**
	 * @return the p
	 */
	public Portfolio getP() {
		return p;
	}

	/**
	 * @param p the p to set
	 */
	public void setP(Portfolio p) {
		this.p = p;
	}

	/**
	 * @return the median
	 */
	public double getMedian() {
		return Median;
	}

	/**
	 * @param median the median to set
	 */
	public void setMedian(double median) {
		Median = median;
	}

	/**
	 * @return the tenBestCase
	 */
	public double getTenBestCase() {
		return TenBestCase;
	}

	/**
	 * @param tenBestCase the tenBestCase to set
	 */
	public void setTenBestCase(double tenBestCase) {
		TenBestCase = tenBestCase;
	}

	/**
	 * @return the tenWorstCase
	 */
	public double getTenWorstCase() {
		return TenWorstCase;
	}

	/**
	 * @param tenWorstCase the tenWorstCase to set
	 */
	public void setTenWorstCase(double tenWorstCase) {
		TenWorstCase = tenWorstCase;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PortfolioSimulationValues [p=" + p.toString() + ", Median=" + Median + ", TenBestCase=" + TenBestCase
				+ ", TenWorstCase=" + TenWorstCase + "]";
	}

}
