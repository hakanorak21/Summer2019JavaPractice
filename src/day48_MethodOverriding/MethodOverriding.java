package day48_MethodOverriding;

/**
 Method overloading:
 	Same name, different parameters
 	Return type doesn't matter
 	Access-modifier doesn't matter
 	Any method can be overloaded
 	
 Method overriding:
 	Same name, same parameters
 	Same method signature in different classes
 	Different functionality
 	Return type MUST be the same
 	Not in the same class
 	ONLY instance methods can be overridden
 		Constructor and static methods cannot be overridden
 	private methods cannot be overridden (they are not inheritable, anyway)
 	Override methods can use same or more visible access-modifiers
 		default ==> default, protected, public
 		protected ==> protected, public
 		public ==> public
 		public > protected > default > private
 	
@override: used to verify if the method is overridden or not 
 	
 Why do we need overriding?
 	To implement specific functionality to the method
 		We create methods with the same name and same parameters,
 		then provide different implementation
 	
 Example: 
 	WebDriver driver = new ChromeDriver(); //ChromeDriver is sub-class
 											//of WebDriver
 	get(): Inherited from WebDriver to ChromeDriver
 	driver.get(URL): opens URL in chrome browser
 	
 	WebDriver driver = new FirefoxDriver();
 	driver.get(URL): opens URL in Firefox driver
 	
 	super class: Bank
 		action: interestRate() ==> 9%
 		
 	sub classes: 	BofA		==> 5%
 					Chase		==> 6%
 					CapitalOne	==> 7%
 					
 Override vs. Overload:
 	Overload: 	Access-modifier can be same or different
 	 			Return type can be same or different
 	 			Parameters MUST be different
 	 			Any method can be overloaded
 				Method name MUST be same
 				Happens in the same class
 				
 	Override:	Access-modifier needs to be same or more visible
 				Method MUST be inheritable to the sub class
 				Return type MUST be same
 				Method name MUST be same
 				parameters MUST be same
 				only instance methods can be overridden
 				MUST be overridden in sub class
 				@Override annotation MUST be applicable
 */

class student{
	
	public void printName() {
		System.out.println("Hakan");
	}
	
}
public class MethodOverriding extends student {
	
	public void print(String str) {
		
	}
	
	//Overloading
	public void print(double a) {
		
	}
	
	@Override
	public void printName() {
		System.out.println("Shukran");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding();
		obj.printName(); //Shukran
		
		student obj2 = new student();
		obj2.printName(); //Hakan
		
	}

}
