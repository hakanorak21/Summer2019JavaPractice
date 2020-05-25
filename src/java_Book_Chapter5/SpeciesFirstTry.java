package java_Book_Chapter5;

import java.util.Scanner;

public class SpeciesFirstTry {
	
	public String name;
    public int population;
    public double growthRate;
	
    public void readInput( )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        this.name = keyboard.nextLine( );

        System.out.println("What is the population of the species?");
        this.population = keyboard.nextInt( );

        System.out.println("Enter growth rate (% increase per year):");
        this.growthRate = keyboard.nextDouble( );
    }

    public void writeOutput( )
    {
         System.out.println("Name = " + this.name);
         System.out.println("Population = " + this.population);
         System.out.println("Growth rate = " + this.growthRate + "%");
    }

    public int getPopulationIn10( )
    {
		int result = 0;
        double populationAmount = this.population;
        int count = 10;
		
        while ((count > 0) && (populationAmount > 0))
        {
            populationAmount = populationAmount +
                              (this.growthRate / 100) * populationAmount;
            count--;
        }
	   
        if (populationAmount > 0)
            result = (int)populationAmount;
	
        return result;
    }
    
    public int getFemalePopulation() {
    	
    	return population/2 + population%2;
    
	}
    
    public int getMalePopulation() {
    	
    	return population/2;
    	
	}
    
    public void setSpecies(String name, int population, double growthRate) {
    	this.name = name;
    	this.population = population;
    	this.growthRate = growthRate;
    }
    
    public boolean equals(SpeciesFirstTry otherObject) {
    	return 	(this.name.equalsIgnoreCase(otherObject.name)) &&
    			(this.population == otherObject.population) &&
    			(this.growthRate == otherObject.growthRate);
    	
    }

}
