package day10_ifStatementReview;

public class Warmup 
{
	public static void main(String[] args) 
	{
		//Task 1. This program determines if a given year is a leap year or not.
		
		int year = 1900;
        
		if ((year % 400) == 0)
        	System.out.println(year + " is a leap year.");
        else if ((year % 100) == 0)
        	System.out.println(year + " is not a leap year.");
        else if ((year % 4) == 0)
        	System.out.println(year + " is a leap year.");
        else 
        	System.out.println(year + " is not a leap year.");
		
		//Task 2. Grade calculator
		/*
		 A = 90 - 100
		 B = 80 - 89
		 C = 70 - 79
		 D = 60 - 69
		 F = 0-59
		 */
		
		int grade = 101;
		boolean A = (grade >= 90 && grade <= 100);
		boolean B = (grade >= 80 && grade < 90);
		boolean C = (grade >= 70 && grade < 80);
		boolean D = (grade >= 60 && grade < 70);
		boolean ValidGrade = (grade >= 0 && grade <= 100);
		
		
		if (ValidGrade) {

			if (A)
				System.out.println("You got an A.");
			else if (B)
				System.out.println("You got a B.");
			else if (C)
				System.out.println("You got a C.");
			else if (D)
				System.out.println("You got a D.");
			else
				System.out.println("You got an F.");
	
		}
		
		else
			System.out.println("Invalid grade!");
	
		/* Task 3. Age requirement
		 * int Age
		 * boolean GoodPerson
		 * age >= 18 ==> cigarette
		 * age >= 21 ==> hookah
		 * age >= 25 ==> alcohol
		 * age <  18 ==> milk
		 * 
		*/
		
		int age = 22;
		boolean GoodPerson = false;
		
		if (age >= 18) {
			if (GoodPerson) {
				System.out.println("Alcohol is bad for your health.");	
			}
			else {
				System.out.println("You can buy cigarettes.");
				if (age >=21) {
					System.out.println("You can also buy hookah.");
					if (age >= 25) {
						System.out.println("You can also buy alcohol.");
					}
				}
			}
			
		}
		
		else 
			System.out.println("Buy milk");
		
		/*
		 1. Write a program that can find number of days in a month.
		 Assume February is 28 
		 int Month = 0-12
		 28 days: 2
		 30 days: 4, 6, 9, 11
		 31 days: 1, 3, 5, 7, 8, 10, 12
		 */
		
		int month = 9;
		
		if (month > 0 && month < 13) {
			if (month == 2)
				System.out.println("February has 28 days");
			else if (month < 8) {
				if (month % 2 == 0)
					System.out.println("Month " + month + " has 30 days");
				else
					System.out.println("Month " + month + " has 31 days");
			}
			else {
				if (month % 2 == 0)
					System.out.println("Month " + month + " has 31 days");
				else
					System.out.println("Month " + month + " has 30 days");
			}
				
		}
		
		else 
			System.out.println("Invalid entry!");
		
	}

}
