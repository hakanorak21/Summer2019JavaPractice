package java_Book_Chapter5;

import java.util.Scanner;

/**
 Class for data on endangered species.
*/
public class Species {
	private String name;
    private int population;
    private double growthRate;

    public void readInput( )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        name = keyboard.nextLine( );

        System.out.println(
                      "What is the population of the species?");
        population = keyboard.nextInt( );
        while (population < 0)
        {
            System.out.println("Population cannot be negative.");
            System.out.println("Reenter population:");
            population = keyboard.nextInt( );
        }

        System.out.println("Enter growth rate (% increase per year):");
       growthRate = keyboard.nextDouble( );
    }

    public void writeOutput( )
    {
         System.out.println("Name = " + name);
         System.out.println("Population = " + population);
         System.out.println("Growth rate = " + growthRate + "%");
    }

    /**
     Precondition: years is a nonnegative number.
     Returns the projected population of the calling object
     after the specified number of years.
    */
    public int predictPopulation(int years)
    {
		int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0))
        {
            populationAmount = (populationAmount +
                          (growthRate / 100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int)populationAmount;
	
        return result;
    }

    public void setSpecies(String name, int population,
                           double growthRate)
    {
        this.name = name;
        if (population >= 0)
            this.population = population;
        else
        {
            System.out.println("ERROR: using a negative population.");
            System.exit(0);
        }
        this.growthRate = growthRate;
    }

    public String getName( )
    {
        return name;
    }

    public int getPopulation( )
    {
        return population;
    }

    public double getGrowthRate( )
    {
        return growthRate;
    }

    public boolean equals(Species otherSpecies)
    {
        return (name.equalsIgnoreCase(otherSpecies.name)) &&
               (population == otherSpecies.population) &&
               (growthRate == otherSpecies.growthRate);
    }
    
    public boolean isGrowthRateLargerThan(Species otherSpecies) {
    	
    	return growthRate > otherSpecies.growthRate;
    }

}
