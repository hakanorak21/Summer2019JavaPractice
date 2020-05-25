package day46_SuperKeyword;

class A {
	
	String name = "Madina";
	
	public void methodA() {
		
	}
	

	public A(int a) {
		
	}
	
}

public class SuperKeyword extends A{
	
	/**
	Super. : Calls instances (variables and methods) from the super class
				Only used in sub-class
				
	Constructor: Is not inherited automatically
				At least one constructor from the super class has to be
				called in the sub-class
	
	*/
	public void method() {
		super.name = "Mahir"; //calls the instances from the super class
		this.name = "Ihsan"; //calls the instances from the class itself
		
		super.methodA();
		this.methodA();
		
	}
	
	// Super-class constructor should be called in the sub-class
	// Only a constructor can call another constructor
	public SuperKeyword(int a) {
		//super() is used for calling the constructors from the super class
		//this() is used for calling the constructors from the class itself
		super(10);
	}

}
