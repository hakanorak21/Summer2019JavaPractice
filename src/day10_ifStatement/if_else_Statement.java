package day10_ifStatement;

public class if_else_Statement 
{
	public static void main(String[] args) 
	{
		
		if (9 <= 8) {
			System.out.println("9 is less than or equal to 8");
		}
		
		else {
			System.out.println("9 is greater than 8");
		}
		
		if (false == !false) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
		
		/*
		 Task01:
		 if score is less than 60 => failed
		 if score >= 60 but score < 90 => pass
		 if score >= 90 => passed with distinction 
		 */
		
		int score = 89;
		if (score >= 60) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		
		if (score >= 90) {
			System.out.println("passed with distinction");
		}
		else {
			System.out.println("You have made less than 90");
		}
		
		/*
		 1. Triangle: has 3 angles, which add up to 180 degrees.
		 (declare 3 variables for angles: angle1, angle2, angle3
		 2. Write a program to check if the triangle is valid or not
		 */
		
		int angle1=20, angle2=50, angle3=110;
		boolean valid = (angle1 + angle2 + angle3) == 180;
		
		if (valid) {
			System.out.println("Valid triangle");
		}
		else {
			System.out.println("Invalid triangle");
		}
		
		
		
	}

}
