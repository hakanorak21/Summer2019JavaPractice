package day36_JavaReview;

import java.util.Scanner;

public class OptionalAssignment_NumberToWords0to999 {
	
	/**
	Write a java program that can converts the number between 0~ 999   to words

	Ex: 
	input: 185
	output: one hundred eighty five

	input: 974
	output: nine hundred seventy four
	*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 999: ");
		int number = scan.nextInt();
		
		if (number == 0)
			System.out.println("zero ");
		
		if (number >= 100) {
			System.out.print(numberInWord(number/100) + " hundred ");
			number = number%100;
		}
		
		if (number < 10) {
			if (number == 0)
				System.out.println(" ");
			else
				System.out.println(numberInWord(number));
		}
		
		else if (number >= 10 && number < 20)
			System.out.println(teens(number%10));
		
		else if (number >= 20 && number < 100){
			if (number%10 == 0)
				System.out.print(tensDigit(number/10));
			else {
			System.out.print(tensDigit(number/10) + " ");
			System.out.println(numberInWord(number%10));
			}
		}
		
	}
	
	public static String numberInWord(int number) {
		
		String output = "";
		switch (number) {
		case 0: output = "zero"; break;
		case 1: output = "one"; break;
		case 2: output = "two"; break;
		case 3: output = "three"; break;
		case 4: output = "four"; break;
		case 5: output = "five"; break;
		case 6: output = "six"; break;
		case 7: output = "seven"; break;
		case 8: output = "eight"; break;
		case 9: output = "nine"; break;
		default: break;
		}
		
		return output;
		
	}

	public static String tensDigit(int number) {
		
		String output = "";
		switch (number) {
		case 2: output = "twenty"; break;
		case 3: output = "thirty"; break;
		case 4: output = "forty"; break;
		case 5: output = "fifty"; break;
		case 6: output = "sixty"; break;
		case 7: output = "seventy"; break;
		case 8: output = "eighty"; break;
		case 9: output = "ninety"; break;
		default: break;
		}
		
		return output;
		
	}
	
	public static String teens(int number) {
		
		String output = "";
		switch (number) {
		case 0: output = "ten"; break;
		case 1: output = "eleven"; break;
		case 2: output = "twelve"; break;
		case 3: output = "thirteen"; break;
		case 4: output = "forteen"; break;
		case 5: output = "fifteen"; break;
		case 6: output = "sixteen"; break;
		case 7: output = "seventeen"; break;
		case 8: output = "eighteen"; break;
		case 9: output = "nineteen"; break;
		default: break;
		}
		
		return output;
		
	}

}
