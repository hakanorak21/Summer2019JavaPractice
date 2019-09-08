package java_Book;

import java.util.Scanner;

public class Exercise10 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter two whole numbers:");
		
		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		
		System.out.print(n1);
		System.out.print(", ");
		
		while (n1 < (n2 - 1)) 
		{
			n1 = n1+1;
			System.out.print(n1);
			System.out.print(", ");
		}
		
		System.out.println(n2);
		
	}

}
