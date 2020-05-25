package day43_JavaReview;

public class Login {
	
	public static void main(String[] args) {
		
		Credentials obj = new Credentials();
			//obj.username = "Fatih"; //Private instance variable
			//obj.password = "Cybertek123"; //Private instance variable
			
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
		
		obj.setUsername("Fatih");
		obj.setPassword("Cybertek123");
		
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());
		
		/*
		 Weekend assignment:
		 Create custom class for bank account.
		 1. Data: accountHolder, accountNumber, Balance (all private)
		 2. Generate getters and setters
		 3. Actions: deposit, withdraw, available balance (use getters 
		 													and setters)
		 */
		
	}

}
