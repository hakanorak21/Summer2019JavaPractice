package day13_Review;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		/*
		 switch (Expression){
		 	case value:
		 		Statements;
		 		break;
		 	default:
		 		Statements;
		 		break;
		 */
		
		int num = 7;
		
		switch (num) {
		
			case 7:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("Invalid entry");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
			
			case 6:
				System.out.println("Saturday");
				break;
			
		}
		
		String day = "Friday";
		
		switch (day) {
		
		case "Monday":
			System.out.println("Learn Java");
			break;
			
		case "Tuesday":
			System.out.println("Learn Agile");
			break;
		
		case "Wednesday":
			System.out.println("Self/Group Study");
			break;
		
		default:
			System.out.println("Invalid day");
			break;
				
		}
		
		long n1 = 10;
		switch ((int)n1) { }
		
		// or logic:
		char grade = 'B';
		
		if (grade == 'A' || grade == 'B') {
			System.out.println("Passed the exam");
		}
		
		switch (grade) {
		
		case 'A':
		case 'B':
			System.out.println("Passed");
			break;
			
		default:
			System.out.println("Failed");
		}
		
		String US = "USA";
		if (US == "USA" || US == "America" || US == "US") {
			System.out.println("American");
		}
		
		else {
			System.out.println("Not American");
		}
		
		switch (US) {
			case "US":
			case "USA":
			case "America":
				System.out.println("American");
				break;
			
			default:
				System.out.println("Not American");
				break;
				
		}
		
	}

}
