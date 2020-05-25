package java_Book_Chapter7;

import java.util.Scanner;

public class OutOfBounds {
	
	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		int[] count = new int[4];
		
		System.out.println("Enter ten numbers between 0 and 3.");
		for (int i = 0; i < 10; i++) {
			int num = kbd.nextInt();
			count[num]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println("You entered " + count[i] + " " + i + "'s");
		}
		
	}

}
