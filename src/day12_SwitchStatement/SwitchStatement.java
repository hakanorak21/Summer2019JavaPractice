package day12_SwitchStatement;

public class SwitchStatement {
	
	/*
	 Similar to if else.
	 
	 switch (Expression)
	 	case CaseValue:
	 	Statement 1;
	 	Statement 2;
	 	break;
	 	
	 	case CaseValue2:
	 	Statement 3;
	 	Statement 4;
	 	break;
	 	
	 	default:
	 	Statement5;
	 
	 */
	public static void main(String[] args) {
		
		int score = 1;
		if (score == 1) {
			System.out.println("1");
			
		}
		else if (score == 2) {
			System.out.println("2");
		}
		
		switch(score) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("Invalid");
			break;
			
		}
		
		String str = "C";
		
		switch (str) {
		
		case "C":
			System.out.println("C Programming");
			break;
			
			
		case "Python":
			System.out.println("Python Programming");
			break;
			
		
		default:
			System.out.println("Invalid");
			break;
		
		}
		
		char grade = 'A';
		
		switch (grade) {
			
		case 'B':
			System.out.println("B");
			break;
		
		case 'C':
			System.out.println("C");
			break;
		
		default:
			System.out.println("Failed");
			break;
			
		}
		
		
	}

}
