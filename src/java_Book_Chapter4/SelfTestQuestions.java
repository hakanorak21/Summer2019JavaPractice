package java_Book_Chapter4;

import java.util.Scanner;

public class SelfTestQuestions {
	
	
	public static void main(String[] args)
    {
        
		/**
		//Question 20
		//Revise listing 4.6 with break instead of boolean
		System.out.println("Enter nonnegative numbers.");
        System.out.println("Place a negative number at the end");
        System.out.println("to serve as an end marker.");

        int sum = 0;
        //boolean areMore = true;
        Scanner keyboard = new Scanner(System.in);
        int next = 0;
        
        while (next >= 0)
        {
        	next = keyboard.nextInt( );
        	if (next < 0)
                break;
            else
                sum = sum + next;
        }
        
        System.out.println("The sum of the numbers is " + sum);
        */
		
		//Question 22
		//Debugging a loop with print and scan
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int n = 1; n <= 10; n++) {
			sum = sum +n;
			System.out.println("For loop: n=" + n + " sum= " + sum);
			scan.nextLine();
			
		}
		System.out.println("1+2+......+9+10 = " + sum);
 
    }

}
