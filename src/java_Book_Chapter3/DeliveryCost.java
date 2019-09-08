package java_Book_Chapter3;

import java.util.Scanner;

public class DeliveryCost 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a distance:");
        Scanner keyboard =  new Scanner(System.in);
        int distance = keyboard.nextInt();
          
        if (distance > 0 && distance <= 100)
        	System.out.println("The delivery cost is $10.00");
        else if (distance > 100 && distance <= 500)
        	System.out.println("The delivery cost is $15.00");
        else if (distance > 500 && distance <= 1000)
        	System.out.println("The delivery cost is $17.50");
        else 
        	System.out.println("The delivery cost is $20.00");
        
	}

}
