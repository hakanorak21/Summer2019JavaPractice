package day47_JavaReview;

//Quiz 12: Question 2
//How to set amount to 100

public class CheckingAccount {
	
	public int amount;
	//line 1
	/*
	//One way: instance block
	{
		amount = 100;
	}
	
	//Another way: constructor
	public CheckingAccount(){
		amount = 100;
	}
	*/
	
	public static void main(String[] args) {
		
		CheckingAccount acct = new CheckingAccount();
		//line 3
		//this.amount = 100; //compile error due to this
		//amount = 100; //must be called through object
		acct.amount = 100;
		System.out.println(acct.amount);
		
	}

}
