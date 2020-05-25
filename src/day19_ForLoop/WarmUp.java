package day19_ForLoop;

import java.util.Scanner;;

public class WarmUp {
	

	public static void main(String[] args) {
		
		String user, pass, username, password;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter username and password: ");
		System.out.println("Password is case sensitive!");
		user = keyboard.nextLine().toLowerCase();
		pass = keyboard.nextLine();
		
		username = "cybertek.batch12@gmail.com";
		password = "Javengers";
		
		if (user.endsWith("@gmail.com")) {
			
			if (user.equalsIgnoreCase(username) && pass.equals(password))
				System.out.println("Logged in successfully");		
					
			else {
				if (!user.equalsIgnoreCase(username) && !pass.equals(password))
					System.out.println("Both username and password are incorrect");
				else if (user.equalsIgnoreCase(username))
					System.out.println("Invalid password");
				else
					System.out.println("Invalid username");
			}
			
		} else
			System.out.println("It's not a valid email");
		
	}

}
