package day57_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int[] number = {100, 200, 300};
		try {
		
			System.out.println(number[5]);
			System.out.println("Try block, checked exception");
		
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Catch block, unchecked exception");
		}
		System.out.println("====================================");
		
		
		try {
			
			Thread.sleep(2000);
			System.out.println("Try block, checked exception");
			
		} catch(InterruptedException e) {
			
			System.out.println("Catch block, unchecked exception");
			
		}
		System.out.println("====================================");
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3));
		try {
			
			System.out.println(list.get(10));
			System.out.println("Checked exception occured in ArrayList");
		
		} catch(RuntimeException e) {
			
			System.out.println("Unchecked exception occured in ArrayList");
			
		}
		System.out.println("====================================");
		
		/*
		//This is not a runtime exception but it is compile error.
		//So, RuntimeException will not catch it.
		try {
		Thread.sleep(1000);
		}catch(RuntimeException e) {
			
		}
		*/
		
		try {
			Thread.sleep(1000);
			System.out.println("Checked exception");
		} catch(Exception e) { //Parent of all Exception classes
				
		}
		System.out.println("====================================");
		
		int[] nums = {1, 2, 3};
		try {
			System.out.println(nums[10]);
			System.out.println("Checked exception");
		} catch(Exception e) {
			System.out.println("Unchecked exception");
		}
		System.out.println("Work done");
		
	}

}
