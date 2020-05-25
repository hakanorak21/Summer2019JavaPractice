package day52_Interface;

/**
Abstraction: Abstract class or Interface
	We can store abstract methods in both.

Interface is not a class! It is a blueprint of class.

Declaration: public interface name{

			  }
			  
Since interface is not a class, it cannot have sub classes.
(Cannot be extended by a class but it can be implemented).

We store abstract methods and let classes implement them.

implements keyword: used instead of extends for implementation

interface is meant to be implemented like abstract class.

Why interface? 	A class can implement multiple interfaces.
				A class can extend only one class.
				
What can we have in interface?
	Methods: abstract methods, static methods, default method
	Variables: public static final by default  
	
What we cannot have in interface?
	Constructor (no class ==> no constructor)
	Instance methods
	Instance variables
	Instance blocks (no instance variables)
	Static blocks (because static variables are final)
	
Interfaces in Selenium:
	WebDriver
	WebElement
	
	List
	Set
	Map	
*/

public interface InterfaceIntro {
	
	int a = 10; //By default static, final, and public
	public static final int b = 20; //Same as above
	
	//public InterfaceIntro() { } //No constructor
	
	//public void methodB() { }; //No instance methods
	
	//Abstract method
	public abstract void methodA();
	
	//Static method
	public static void MethodC() {
		System.out.println("C");
		
	}
	
	//Default method
	public default void MethodD() {
		
	}
	
	public static void main(String[] args) {
		
		InterfaceIntro.MethodC();
		System.out.println(a);
		//a = 20; //Variables are static and final by default
		
	}

}

interface Example{
	
}

class Test implements InterfaceIntro, Example{
//	  subtype		  supertype		  supertype
	
	@Override
	public void methodA() {
		System.out.println("A");
	}
	
}

class A{
	
}

//Class can extend only one class.
class B extends A{
	
}
