/**
 * 
 */
package com.mpt.mc.sim;

import java.util.*;

/**
 * @author mohamed
 *
 */
public class Simulation {

	/**
	 * 
	 */
	private Portfolio p;
	private SimulationResults res;
	private PortfolioSimulationValues simulationValues;
	private Random r;
	private double inflation;
	private int numSimulations;
	private int numYears;
	
	//double mySample = r.nextGaussian()*desiredStandardDeviation+desiredMean;
	public Simulation() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param p
	 * @param inflation
	 * @param numSimulations
	 * @param numYears
	 */
	public Simulation(Portfolio p, double inflation, int numSimulations, int numYears) {
		this.p = p;
		this.simulationValues = new PortfolioSimulationValues(p);
		this.res = new SimulationResults(numSimulations);
		this.inflation = inflation;
		this.numSimulations = numSimulations;
		this.numYears = numYears;
		r = new Random();
	}

	public void simulate(){
		for (int i = 0; i < numSimulations; i++) {
				
			double simResult=p.getInvestment();//starting value

			for(int j=0;j<numYears;j++){

				double rate = (r.nextGaussian()*p.getStandardDeviation()+p.getMean())/100; //next random return rate
				
				simResult = (1+rate)*simResult; //end of year value
				
				simResult = (1-inflation)*simResult; // value after reducing inflation 

			}
			
			res.addResults(simResult);
		}
		
		simulationValues.setMedian(res.getPercentile(50));
		
		simulationValues.setTenBestCase(res.getPercentile(90));
		
		simulationValues.setTenWorstCase(res.getPercentile(10));
		
	}

	/**
	 * @return the simulationValues
	 */
	public PortfolioSimulationValues getSimulationValues() {
		return simulationValues;
	}
	
}
