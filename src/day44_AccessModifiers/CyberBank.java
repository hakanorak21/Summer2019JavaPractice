package day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
	
	public static void main(String[] args) {
		
		BankAccount Sarah;
		Sarah = new BankAccount();
		Sarah.setAccountHolder("Sarah Abdujappar");
		Sarah.setAccountNumber(123456789);
		
		System.out.println("Name: " + Sarah.getAccountHolder());
		System.out.println("Account Number: " + Sarah.getAccountNumber());
		System.out.println("Available Balance: " + Sarah.getAvailableBalance());
		
		Sarah.withdraw(100);
		Sarah.showBalance();
		
		Sarah.deposit(2000);
		Sarah.showBalance();
		Sarah.withdraw(2500);
		Sarah.showBalance();
		
		BankAccount Serdar = new BankAccount();
		Serdar.getAccountInfo(); //Default values
		
		Serdar.setAccountHolder("Serkan Serdar");
		Serdar.setAccountNumber(987654321);
		
		Serdar.deposit(10000);
		Serdar.showBalance();
		
		Serdar.withdraw(3000);
		Serdar.showBalance();
		
		BankAccount[] accounts = { Sarah, Serdar };
		ArrayList<BankAccount> Accounts; //= new ArrayList<>();
		Accounts = new ArrayList(Arrays.asList(accounts));
		
		//Or:
		//ArrayList<BankAccount> Accounts = new ArrayList<>();
		//Accounts.addAll(Arrays.asList(accounts));
		
	}

}
