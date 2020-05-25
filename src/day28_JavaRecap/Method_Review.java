package day28_JavaRecap;

public class Method_Review {
	
	public static void main(String[] args) {
		AddThreeNumbers(1,2,3);
		GreaterNumber(3, 2);
		calculateAge(2000);
	}
	
	//Write a method that calculates the sum of 3 numbers
	public static void AddThreeNumbers(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	//Write a method that shows the greater number from 2 numbers
	public static void GreaterNumber(int a, int b) {
		
		if (a > b)
			System.out.println(a + " is greater than " + b);
		else if (b > a)
			System.out.println(b + " is greater than " + a);
		else
			System.out.println(a + " and " + b + " are equal.");
			
	}
	
	/**
	Write a method that accepts birthyear and 
	displays the age in the console.
	
	Sample output:    
		calculateAge(2000) --> 19
	*/
	
	public static void calculateAge(int birthYear) {
		System.out.println(2019 - birthYear);
	}
	
	

}
