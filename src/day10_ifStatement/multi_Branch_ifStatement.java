package day10_ifStatement;

public class multi_Branch_ifStatement // Definition of the class 
{
	/*
	 if - else if - else
	 */
	public static void main(String[] args)
	{
		if (false) {
			System.out.println("if block");
		}
		else if (false) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		 Task 01.
		 Grade >= 90 ==> A
		 Grade >= 80 && Grade < 90 ==> B
		 Grade >= 70 && Grade < 80 ==> C
		 Grade >= 60 && Grade < 70 ==> D
		 else ==> F
		 */
		
		int grade = 55;
		
		if(grade >= 90) {
			System.out.println("Grade A");
		}
		
		else if(grade >= 80) {
			System.out.println("Grade B");
		}
		
		else if(grade >= 70) {
			System.out.println("Grade C");
		}
		
		else if(grade >= 60) {
			System.out.println("Grade D");
		}
		
		else {
			System.out.println("Grade F");
		}
		
		// Task 03
		int hour = 21;
		
		if (hour >=0 && hour < 12) {
			System.out.println("Good morning");
		}
		
		else if (hour > 12 && hour <= 15) {
			System.out.println("Good Afternoon");
		}
		
		else if (hour > 15 && hour <=23) {
			System.out.println("Good night");
		}
		else {
			System.out.println("Good noon");
		}
		
	}
	
}
