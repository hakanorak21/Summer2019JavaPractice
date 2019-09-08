package day09_Review;

public class If_Statement 
{
	/*
	 single if statement:
	 
	 if (boolean expression) {
	 	some code runs if boolean expression is true
	 }
	 
	 */
	
	public static void main(String[] args) 
	{
		if ("Today" == "Friday") {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
		}
		
		int a = 1000;
		
		if (++a == 1001) {
			a = 2000;
			System.out.println("a is increased");
		}
		
		System.out.println(a);
		
		int X = 987654321;
		
		if (X%2 == 0) {
			System.out.println("My number is even.");
		}
		
		if (X%2 != 0) {
			System.out.println("My number is odd.");
		}
		
		// Instead
		if (X%2 == 0) {
			System.out.println("My number is even.");
		}
		
		else {
			System.out.println("My number is odd.");
		}
		
		int Y = 2345670;
		
		if (Y%5 == 0) {
			System.out.println("My number is divisible by 5.");
		}
		
		else {
			System.out.println("My number is not divisible by 5.");
		}
		
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		System.out.println(CEO == Kuzzat);
		
		if (Kuzzat == CEO) {
			System.out.println("Great person in the world.");
			System.out.println("First if block");
		}
		
		if (Kuzzat != CEO) {
			System.out.println("Great person in the world.");
			System.out.println("Second if block");
		}
		
		int TotalNumber = 100;
		boolean Cybertek = true;
		boolean BestSchool = true;
		
		if (Cybertek == BestSchool) {
			TotalNumber += 500;
		}
		
		if (Cybertek != BestSchool) {
			TotalNumber -= 500;
		}
		
		System.out.println(TotalNumber);
		
		int age = 10;
		int voteAge = 18;
		
		if (age >= voteAge) {
			System.out.println("You can vote!");
		}
		
		if (age < voteAge) {
			System.out.println("You cannot vote!");
			System.out.println("You can vote in " + (voteAge - age) + " years.");
		}
		
	}

}
