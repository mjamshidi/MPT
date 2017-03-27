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
	private double[] results;
	private Random r;// = new Random();
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
		this.inflation = inflation;
		this.numSimulations = numSimulations;
		this.numYears = numYears;
		r = new Random();
		results = new double[this.numSimulations];
	}

	public void simulate(){
		for (int i = 0; i < numSimulations; i++) {
				
			double simResult=p.getInvestment();//starting value

			for(int j=0;j<numYears;j++){

				double rate = (r.nextGaussian()*p.getStandardDeviation()+p.getMean())/100; //next random return rate
				
				simResult = (1+rate)*simResult; //end of year value
				
				simResult = (1-inflation)*simResult; // value after reducing inflation 

			}
			
			results[i] = simResult;
		}
		Arrays.sort(results);
		
		p.setSimMedian(computeAverage(results, 49.5));
		
		p.setSim10BestCase(computeAverage(results, 90));
		
		p.setSim10WorstCase(computeAverage(results, 10));
		
	}

	private double computeAverage(double[] ar, double percent){
		
		double result = 0;
		int startIndex = (int) (ar.length*percent/100);
		int onePercent = ar.length/100;
		for(int i = startIndex;i<startIndex+onePercent;i++){
			result += ar[i];
		}
		return result/onePercent;
	}
	
}
