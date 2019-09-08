package java_Book;

import java.util. Scanner;

public class EggBasket 
{
	public static final double PI = 3.14159;
    public static final int DAYS_PER_WEEK = 7;
    
	public static void main(String[] args)
    {
    	int numberOfBaskets, eggsPerBasket, totalEggs;
        
    	// numberOfBaskets = 10;
        // eggsPerBasket = 6;
    	
    	Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the number of eggs in each basket:");
        eggsPerBasket = keyboard.nextInt();
        
        // Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the number of baskets:");
        numberOfBaskets = keyboard.nextInt();
        
        totalEggs = numberOfBaskets * eggsPerBasket;

        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs);

        System.out.println("========================================");
        System.out.println("Now we take two eggs out of each basket.");
        
        eggsPerBasket = eggsPerBasket - 2;
        totalEggs = numberOfBaskets * eggsPerBasket;
        
        System.out.println("You know have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets.");
        System.out.println("The new total number of eggs is " + totalEggs);
        
        
    }


}
