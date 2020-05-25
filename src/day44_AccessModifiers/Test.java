package day44_AccessModifiers;

import static day44_AccessModifiers.TestData.*;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(Name);
		System.out.println(ID);
		System.out.println(SchoolName);
		
		//Example
		int[] numbers = {1,2,3};
		String str = Arrays.toString(numbers);
		System.out.println(str);
		
		System.out.println(age);
		//System.out.println(password); //Private variable - not accessible 
										//outside class
	}

}
