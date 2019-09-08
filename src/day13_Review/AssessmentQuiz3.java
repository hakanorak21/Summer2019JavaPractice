package day13_Review;

public class AssessmentQuiz3 {
	
	public static void main(String[] args) {
		
		// Question 7
		boolean result = true;
		
		if (result) {
			System.out.println("it's true");
		}
		else if (!result){
			System.out.println("it's false");
		}
		
		// Question 8
		boolean A = true, B = !A;
		
		if (A) {
			if (B) {
				System.out.println("Monday");
			}
			else {
				System.out.println("Tuesday");
			}
		}
		else {
			if(A) {
				System.out.println("Thursday");
			}
			else {
				System.out.println("Friday");
			}
		}
		
		// Question 9
		int number = 10;
		
		if(--number > 10) {
			System.out.println("Hello Cybertek " + number);
		}
		else if (number == 9) {
			System.out.println("Hello World " + number);
		}
		
		// Question 10
		boolean X = true;
		boolean Y = !X == false;
		boolean Z = Y;

		 

		if( X ) {
		
			System.out.println("Hello Everyone");

		} 
		if( Y ) {

		System.out.println("Today is great day");

		} 
		
		if( Z ) {

		System.out.println("We have picnic on Saturday");

		}
		
		
	}
	
	

}
