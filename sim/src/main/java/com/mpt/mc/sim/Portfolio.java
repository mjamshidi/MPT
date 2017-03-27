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
	
	/**
	 * Simulation Results
	 */
	private double simMedian;
	private double sim10BestCase;
	private double sim10WorstCase;
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
	/**
	 * @return the simMedian
	 */
	public double getSimMedian() {
		return simMedian;
	}
	/**
	 * @param simMedian the simMedian to set
	 */
	public void setSimMedian(double simMedian) {
		this.simMedian = simMedian;
	}
	/**
	 * @return the sim10BestCase
	 */
	public double getSim10BestCase() {
		return sim10BestCase;
	}
	/**
	 * @param sim10BestCase the sim10BestCase to set
	 */
	public void setSim10BestCase(double sim10BestCase) {
		this.sim10BestCase = sim10BestCase;
	}
	/**
	 * @return the sim10WorstCase
	 */
	public double getSim10WorstCase() {
		return sim10WorstCase;
	}
	/**
	 * @param sim10WorstCase the sim10WorstCase to set
	 */
	public void setSim10WorstCase(double sim10WorstCase) {
		this.sim10WorstCase = sim10WorstCase;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Portfolio [type=" + type + ", mean=" + mean + ", standardDeviation=" + standardDeviation
				+ ", investment=" + investment + ", simMedian=" + simMedian + ", sim10BestCase=" + sim10BestCase
				+ ", sim10WorstCase=" + sim10WorstCase + "]";
	}

}
