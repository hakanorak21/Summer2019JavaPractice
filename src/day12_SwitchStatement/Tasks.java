package day12_SwitchStatement;

public class Tasks {
	
	public static void main(String[] args) {
		
		//Page 3
		String computer = "HP";
		
		switch (computer) {
		
		case ("Apple"):
			System.out.println("Apple - no virus");
		break;
			
		case ("Dell"):
			System.out.println("Dell - tough one");
		break;
		
		case ("Acer"):
			System.out.println("Acer - cheap one");
		break;
		
		default:
			System.out.println("Do not buy that one!");
		break;
		
		}
		
		//Page 4
		int day = 10;
		
		switch (day) {
		
		case (1):
			System.out.println("Monday");
		break;
			
		case (2):
			System.out.println("Tuesday");
		break;
		
		case (3):
			System.out.println("Wednesday");
		break;
		
		case (4):
			System.out.println("Thursday");
		break;
			
		case (5):
			System.out.println("Friday");
		break;
		
		case (6):
			System.out.println("Saturday");
		break;
		
		case (7):
			System.out.println("Sunday");
		break;
		
		default:
			System.out.println("Please enter a number between 1 and 7.");
		break;
			
		}
		
		//Page 5
		char letter = 'F';
		
		switch (letter) {
		
		case ('A'):
			System.out.println("A");
		break;
			
		case ('B'):
			System.out.println("B");
		break;
		
		case ('C'):
			System.out.println("C");
		break;
		
		case ('D'):
			System.out.println("D");
		break;
			
		case ('E'):
			System.out.println("E");
		break;
		
		default:
			System.out.println("Not found");
		break;
			
		}
		
		
		
	}

}
