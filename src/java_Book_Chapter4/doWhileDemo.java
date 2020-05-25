package java_Book_Chapter4;

import java.util.Scanner;

public class doWhileDemo {
	
	public static void main(String[] args)
    {
        int count;
        int number;

        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt( );
        
        
        
        // The following do-while loop:
        count = 1;
        do
        {
            System.out.print(count + ", ");
            count++;
        }while (count <= number);
        
        //can be written as a while loop in the following format:
        count = 1;
        {
            System.out.print(count + ", ");
            count++;
        }
        while (count <= number)
        {
            System.out.print(count + ", ");
            count++;
        }
        //Interesting comparison to better understand the relationship
        //between do-while and while loops. 
        
        System.out.println( );
        System.out.println("Buckle my shoe.");
    }

}
