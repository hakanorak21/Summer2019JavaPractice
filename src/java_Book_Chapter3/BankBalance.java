package java_Book_Chapter3;

import java.util.Scanner;

public class BankBalance {
    
	public static final double OVERDRAWN_PENALTY = 8.00;
    public static final double INTEREST_RATE = 0.02;//2% annually
	
    public static void main(String[] args)
    {
        double balance;
		
        System.out.print("Enter your checking account balance: $");
        Scanner keyboard =  new Scanner(System.in);
        balance = keyboard.nextDouble( );
        System.out.println("Original balance $" + balance);
		
        if (balance >= 0) {
        	System.out.println("You earned interest!");
            balance = balance + (INTEREST_RATE * balance)/12;
        }
        System.out.printf("Your new balance is $%.2f.%n", balance);
        /*
        else {
            System.out.println("You paid overdraft fee!");
        	balance = balance - OVERDRAWN_PENALTY;
        }	
        System.out.println("After adjusting for one month");
        System.out.println("of interest and penalties,");
        System.out.print("your new balance is $");
        System.out.printf("%1.2f",balance);
        */
        
        
        
    }

}
