package day44_AccessModifiers;

public class BankAccount {
	
	/**
	WarmUp: Create a custom class for bank account
    
    The attributes/data that the class can have are: 
            AccountHolder, AccountNumber, AvailableBalance
    
    Actions the class can do are:
            deposit, withdraw, checking balance
    
    Requirements:
            1. Apply encapsulation
            2. User should be able to deposit, withdraw, and check the balance
                2.1 if the withdrawing amount is greater than available 
                balance, 35$ penalty fee will be charged from the account
                2.2 if the available balance is less or equal to 0, 
                account holder won't be able to withdraw money
	*/
	
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
	//getters (accessor): instance return method
	public String getAccountHolder() {
		return AccountHolder;
	}
	
	public long getAccountNumber() {
		return AccountNumber;
	}
	
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	
	//setters (mutator): instance void method, passes a parameter
	public void setAccountHolder (String AccountHolder) {
		this.AccountHolder = AccountHolder;
	}
	
	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	//public void getAvailableBalance 
	//No need because only deposit or withdraw changes the balance
	
	//Actions:
	//1. Deposit
	public void deposit (double amount) {
		AvailableBalance += amount;
	}
	
	//2. Withdraw
	public void withdraw(double amount) {
		if (AvailableBalance <= 0) {
			System.out.println("No money to withdraw!");
			return;
		}
		
		if (amount > AvailableBalance)
			AvailableBalance -= 35; // $35 fee
		
		AvailableBalance -= amount; 
			
	}
	
	//3. Check balance
	public void showBalance() {
		System.out.println("Available balance: " + AvailableBalance);
	}
	
	//4. Get account info
	public void getAccountInfo() {
	System.out.println("Name: " + getAccountHolder());
	System.out.println("Account Number: " + getAccountNumber());
	System.out.println("Available Balance: " + getAvailableBalance());
	}
	
}
