package com.mpt.mc.sim;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Monte Carlo Simulation!" );
        
        Portfolio A = new Portfolio("Aggressive", 9.4324, 15.675, 100_000);
        
        Portfolio I = new Portfolio("Conservative", 6.189, 6.3438, 100_000);
        
        Simulation ASim = new Simulation(A, 0.035, 10_000, 20);
        
        Simulation ISim = new Simulation(I, 0.035, 10_000, 20);
        
        ASim.simulate();
        
        ISim.simulate();
        
        System.out.println(A.toString());
        
        System.out.println(I.toString());
    }
}
