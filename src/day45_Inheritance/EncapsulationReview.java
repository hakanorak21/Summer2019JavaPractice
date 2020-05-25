package day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class Credentials{
	
	private String username; //admin
	private String password; //123
	
	public Credentials() { //Constructor
		setUsername("admin");
		setPassword("123");
	}
	
	//getters
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void getInfo() {
		System.out.println("username: " + getUsername());
		System.out.println("password: " + getPassword());
	}
	
	//setters
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setCredentials(String username, String password) {
		//this.username = username;
		//this.password = password;
		//Or:
		setUsername(username);
		setPassword(password);
	}
	
}

public class EncapsulationReview {

	public static void main(String[] args) {
		
		Credentials Zlfy = new Credentials();
		//obj.username = "Zlfy"; //private accessible only within the class
		//obj.password = "kar"; //private accessible only within the class
		Zlfy.setCredentials("Zlfy", "007");
		System.out.println(Zlfy.getUsername());
		System.out.println(Zlfy.getPassword());
		
		Credentials Nurzat = new Credentials();
		Nurzat.setUsername("Nurzat");
		Nurzat.setPassword("Nuri345");
		System.out.println(Nurzat.getUsername());
		System.out.println(Nurzat.getPassword());
		
		Credentials Seyfo = new Credentials();
		Seyfo.setCredentials("SeyFoo", "Holly");
		
		//System.out.println("username: " + Seyfo.getUsername());
		//System.out.println("password: " + Seyfo.getPassword());
		//Or:
		Seyfo.getInfo();
		
		System.out.println("=====================================");
		
		//Array
		Credentials[] users = {Zlfy, Nurzat, Seyfo};
		users[0].getInfo();
		users[1].getInfo();
		users[2].getInfo();
		
		System.out.println("=====================================");
		
		//ArrayList
		ArrayList<Credentials> CredentialsList = new ArrayList<>();
		CredentialsList.addAll(Arrays.asList(users));
		CredentialsList.get(0).getInfo();
		
		for (Credentials each: CredentialsList) {
			each.getInfo();
		}
		
	}
	
}
