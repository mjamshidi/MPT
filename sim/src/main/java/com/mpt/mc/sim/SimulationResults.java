package com.mpt.mc.sim;

import java.util.Arrays;

public class SimulationResults {
	private double[] results;
	private boolean isSorted;
	private int index;

	public SimulationResults(int numSims) {
		results = new double[numSims];
	}
	
	public void addResults(double result){
		if(!(index<results.length))
			return ;
		results[index] = result;
		index++;
	}
	
	public double getPercentile(double percentage){
		if(!isSorted){
			Arrays.sort(results);
			isSorted = true;
		}
		double GenreralIndex = (results.length+1)*percentage/100;
		int index = (int) Math.floor(GenreralIndex);
		double partialIndex = GenreralIndex - index;
		return results[index-1] + (partialIndex*(results[index] - results[index-1]));
	}
}
