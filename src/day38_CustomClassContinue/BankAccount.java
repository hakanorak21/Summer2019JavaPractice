package day38_CustomClassContinue;

public class BankAccount {
	
	/**
    Warmup:
    
    create a custom class for BankAccount
    
    Attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
    
    Actions: deposit, withdraw, showBalance
    
    Requirements: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance
	*/
		
	String AccountHolder;
	long AccountNumber;
	double Balance;
	
	//Example for this
	String username;
	String password;
	
	public BankAccount(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public BankAccount() {
		
	}
	
	public BankAccount(String AccountHolder, long AccountNumber) {
		this.AccountHolder = AccountHolder; //Local variable is assigned to the instance variable
		this.AccountNumber = AccountNumber;
	}
	
	 
	
	public void Balance() {
		System.out.println("----------------------------------------------");
		String acct = "" + AccountNumber;
		String AccountNumber = "************" + acct.substring(12);
		System.out.println("Account Holder: " + AccountHolder);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Available balance: $" + Balance);
		System.out.println("----------------------------------------------");
	}
	
	public void deposit(double depositAmount){
		System.out.println("----------------------------------------------");
		Balance += depositAmount;
		
		String acct = "" + AccountNumber;
		String AccountNumber = "************" + acct.substring(12);
		
		System.out.print("Depositing " + depositAmount);
		System.out.println(" to the account " + AccountNumber);
		System.out.println("Your new balance is: " + Balance);
		System.out.println("----------------------------------------------");
	}
		
	public void withdraw(double withdrawAmount){
		System.out.println("----------------------------------------------");	
		String acct = "" + AccountNumber;
		String AccountNumber = "************" + acct.substring(12);
		
		if (Balance <= 0)
			System.out.println("You don't have enough balance for withdrawal.");
			// return;
		
		else if (withdrawAmount <= Balance) { 
			Balance -= withdrawAmount;
			System.out.print("Withdrawing $" + withdrawAmount);
			System.out.println(" from the account " + AccountNumber);
			System.out.println("Your new balance is: $" + Balance);
		}
		else if (withdrawAmount > Balance) {
			Balance -= (withdrawAmount + 35);
			System.out.println("Your withdrawal amount is more than your balance!");
			System.out.println("Therefore, there is $35 charge.");
			System.out.println("Your new balance is: $" + Balance);
		} 
		System.out.println("----------------------------------------------");
	}

	public void accountSetup(String name, long acctNum) {
		
		AccountHolder = name;
		AccountNumber = acctNum;
		
	}
}
