package day20_JavaRcap;

import java.util.Scanner;

public class WarmUp3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int max = -99999999, min = 9999999;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter a number: ");
			int inputNum = scan.nextInt();
			if (inputNum > max)
				max = inputNum;
			if (inputNum < min)
				min = inputNum;
		}
		
		System.out.println("The maximum is " + max);
		System.out.println("The minimum is " + min);
		
	}

}
