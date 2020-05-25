package day48_MethodOverriding;

//super class
public class Bank {
	
	public void interestRate() {
		System.out.println("Default: 9 percent");
	}
	
	public static void main(String[] args) {
		
		Bank obj = new Bank(); 
		obj.interestRate();
		
		
		BofA BOA = new BofA();
		BOA.interestRate();
		
		Chase Chase = new Chase();
		Chase.interestRate();
		
		CapitalOne CO = new CapitalOne();
		CO.interestRate();
		
	}

}

//sub class 1
class BofA extends Bank{
	
	@Override
	public void interestRate() {
		System.out.println("BofA: 5 percent");
	}
	
}

//sub class 2
class Chase extends Bank{
	
	@Override
	public void interestRate() {
		System.out.println("Chase: 6 percent");
	}
	
	
}

//sub class 3
class CapitalOne extends Bank{
	
	@Override
	public void interestRate() {
		System.out.println("CapitalOne: 7 percent");
	}
	
}


