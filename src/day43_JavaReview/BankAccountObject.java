package day43_JavaReview;

public class BankAccountObject {
	
	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount();
		customer1.setAccountHolder("Hakan");
		customer1.setAccountNumber(12345);
		customer1.setBalance(250000);
		
		System.out.println(customer1.getAccountHolder());
		System.out.println(customer1.getAccountNumber());
		System.out.println(customer1.getBalance());
		
		customer1.deposit(150000);
		System.out.println(customer1.getBalance());
		
		customer1.withdraw(400000);
		System.out.println(customer1.getBalance());
		
	}

}
