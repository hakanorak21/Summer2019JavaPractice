package day43_JavaReview;

public class BankAccount {
	
	private String accountHolder;
	private int accountNumber;
	private double availableBalance;
	
	//getters
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return availableBalance;
	}
	
	//setters
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance) {
		this.availableBalance = balance;
	}
	
	//methods
	public void deposit(double depositAmount) {
		setBalance(getBalance() + depositAmount);
	}
	
	public void withdraw(double withdrawalAmount) {
		setBalance(getBalance() - withdrawalAmount);
	}
	
}
