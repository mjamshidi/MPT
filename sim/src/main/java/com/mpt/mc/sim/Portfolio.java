	/**
 * 
 */
package com.mpt.mc.sim;

/**
 * @author mohamed
 *
 */
public class Portfolio {
	
	private String type;
	/**
	 * Return
	 */
	private double mean;
	/**
	 * Risk
	 */
	private double standardDeviation;
	
	private double investment;

	public Portfolio() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param type
	 * @param mean
	 * @param standardDeviation
	 * @param investment
	 */
	public Portfolio(String type, double mean, double standardDeviation, double investment) {
		this.type = type;
		this.mean = mean;
		this.standardDeviation = standardDeviation;
		this.investment = investment;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the mean
	 */
	public double getMean() {
		return mean;
	}
	/**
	 * @param mean the mean to set
	 */
	public void setMean(double mean) {
		this.mean = mean;
	}
	/**
	 * @return the standardDeviation
	 */
	public double getStandardDeviation() {
		return standardDeviation;
	}
	/**
	 * @param standardDeviation the standardDeviation to set
	 */
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
	/**
	 * @return the investment
	 */
	public double getInvestment() {
		return investment;
	}
	/**
	 * @param investment the investment to set
	 */
	public void setInvestment(double investment) {
		this.investment = investment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Portfolio [type=" + type + ", mean=" + mean + ", standardDeviation=" + standardDeviation
				+ ", investment=" + investment + "]";
	}

}
