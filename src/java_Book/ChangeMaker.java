package java_Book;

import java.util.Scanner;

public class ChangeMaker 
{
    public static void main(String[] args)
    {
    	double originalAmount;
    	int amount;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int dollars;
        int fiftyCents;

        System.out.println("Enter a dollar and cents amount.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change.");

        Scanner keyboard = new Scanner(System.in);
        originalAmount = keyboard.nextDouble( );

        amount = (int)(originalAmount * 100);
        dollars = amount / 100;
        amount %= 100;
        
        fiftyCents = amount / 50;
        amount %= 50;
        
        quarters = amount / 25;
        amount %= 25;
        
        dimes = amount / 10;
        amount %= 10;
        
        nickels = amount / 5;
        amount %= 5;
        
        pennies = amount;

        System.out.println(originalAmount +
                           " dollars in coins can be given as:");
        System.out.println(dollars + " 1-dollar coins");
        System.out.println(fiftyCents + " fify-cents coins");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels and");
        System.out.println(pennies + " pennies");
        
        
        /*
        // Self-test Question 18
        int n = 2;
        // n++;
        System.out.println("n is " + ++n);
        // n--;
        System.out.println("n is " + --n);
        */
        
    }
	
}
