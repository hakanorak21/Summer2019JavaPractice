package OCA_Exam;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class OCA_Book_Chapter4 {
	
	private static final ArrayList<String> values = new ArrayList<>();
	
	private static final int NUM_SECONDS_PER_HOUR; 
	
	//static block
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four; // DOES NOT COMPILE
	
	static {
		one = 1;
		two = 2;
		//three = 3; // DOES NOT COMPILE
		//two = 4; // DOES NOT COMPILE
		four = 4;
	}

	public static int number(int number) {
		number++;
		return number; 
	}
	
	public static String letters(String letters) { 
		letters += "d";
		return letters;
	}

	public static void main(String[] args) {
		
		values.add("changed");
		System.out.println(values);
		
		System.out.println(NUM_SECONDS_PER_HOUR);
		
		asList("one"); 
		
		int number = 1;
		String letters = "abc";
		
		number += number(number);
		letters += letters(letters);
		System.out.println(number + letters);
		

	}

}
