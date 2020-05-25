package day38_CustomClassContinue;

public class BankAccountObjects {
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		account1.AccountHolder = "Holly Erhan";
		account1.AccountNumber = 1234567891234567L;
		
		account1.Balance();
		account1.deposit(2000);
		account1.deposit(4000);
		
		account1.withdraw(3000);
		account1.withdraw(3001);
		account1.withdraw(2000);

		
		BankAccount account2 = new BankAccount();
		account2.accountSetup("Muaz Gulen", 9876543219876543L);
		account2.Balance();
		
		account2.deposit(100);
		account2.withdraw(50);
		
		BankAccount account3 = new BankAccount("Nadire Pilot", 1234567891234569L);
		account3.Balance();
		account3.deposit(10);
		account3.withdraw(20);
		account3.withdraw(1);
		account3.deposit(3000);
		
		
		
	}

}
