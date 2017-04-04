/**
 * 
 */
package com.mpt.mc.sim;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author mohamed
 *
 */
public class SimulationTest {



	/**
	 * Test method for {@link com.mpt.mc.sim.Simulation#Simulation()}.
	 */
	@Test
	public void testSimulation() {
		assertTrue( true );
	}

	/**
	 * Test method for {@link com.mpt.mc.sim.Simulation#Simulation(com.mpt.mc.sim.Portfolio, double, int, int)}.
	 */
	@Test
	public void testSimulationPortfolioDoubleIntInt() {
		assertTrue( true );
	}

	/**
	 * Test method for {@link com.mpt.mc.sim.Simulation#simulate()}.
	 */
	@Test
	public void testSimulate() {
        Portfolio A = new Portfolio("Aggressive", 9.4324, 15.675, 100_000);
        
        Portfolio I = new Portfolio("Conservative", 6.189, 6.3438, 100_000);
        
        Simulation ASim = new Simulation(A, 0.035, 10_000, 20);
        
        Simulation ISim = new Simulation(I, 0.035, 10_000, 20);
        
        ASim.simulate();
        
        ISim.simulate();
        
        System.out.println(ASim.getSimulationValues().toString());
        
        System.out.println(ISim.getSimulationValues().toString());
	}

}
