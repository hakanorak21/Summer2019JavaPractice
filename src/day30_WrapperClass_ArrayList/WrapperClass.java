package day30_WrapperClass_ArrayList;

import java.util.Arrays;

public class WrapperClass {
	
	/**
	 Wrapper Classes:
	 	Every primitive in Java has a class that's designed for it
	 
	 Primitives: byte, short, int, long, float, double, boolean, char
	 
	 Wrapper classes: Byte, Short, Integer, Long, Float, Double, 
	 	Boolean, Character
	 	
	 All wrapper classes presented in "java.lang" package
	 Ex: String is also in "java.lang"
	 
	 Default values of primitives:
	 	byte, short, int, long = 0
	 	double, float = 0.0
	 	boolean = false
	 	char = space
	 	
	 Default values of wrapper classes: null
	 	
	 */
	
	public static void main(String[] args) {
		
		int numInt = 10;
		Integer numInteger = 20;
		
		numInteger = numInt; // Auto-boxing: Converting primitive 
		// values to wrapper class
		
		System.out.println(numInteger);
		
		Boolean BooleanResult = false;
		boolean booleanResult = BooleanResult; // Unboxing: Converting
		//wrapper class to primitive 
		
		System.out.println(BooleanResult);
		System.out.println(booleanResult);
		
		char ch1 = 'L';
		Character ch2 = ch1; // Auto-boxing
		
		char ch3 = ch1; // Neither auto-boxing nor unboxing
		
		char ch4 = ch2; // Unboxing
		
		int[] arr = new int[3];
		System.out.println(Arrays.toString(arr)); // [0, 0, 0]
		
		//Now, wrapper class
		Integer[] array = new Integer[3];
		System.out.println(Arrays.toString(array)); // [null, null, null]

		//Primitives do not have methods but wrapper classes do
		
		//Useful wrapper class methods:
		//Max_Value, Min_Value, Parse, ValueOf  
		
		Integer num2 = 20;
		System.out.println(num2.MAX_VALUE);	
		
	}

}
