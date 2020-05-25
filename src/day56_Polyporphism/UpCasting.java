package day56_Polyporphism;

/**
 There are two types of casting between classes:
 1. Up casting: Always allowed
 				multiple reference name refers to the same object
 				(same memory)
 	
 	WebDriver driver = new ChromeDriver();
 	//JavaScriptExecuter js = new ChromeDriver();
 	JavaScriptExecuter js = (JavaScriptExecuter)driver;
 	//One memory location (one browser)
 		js.ExecuteScript("window.open()");
 	
 	//TakeScreenShot ts = new ChromeDriver();
 	TakeScreenShot ts = (TakeScreenShot)driver;
 	  ts.TakeScreenShotAs("");
 
 2. Down casting: 	Not allowed
 					Converting super type to sub type
 
 OOP: Object Oriented Programming
 1. Encapsulation: data hiding (private), getter&setter methods (public)
 					Benefits: Data security  
 2. Inheritance: Sub&super relationship, methods and variables of super class
 				 inherited to sub class
 					Benefits: Reusability
 							  Maintainability
 							  Organized
 3. Abstraction: Hiding the implementation (concentrating on essentials)
 										   (not worrying about the details)
  				 2 ways: Abstract class and interface
  				 Benefits: Reusability
  				 
 4. Polymorphism: object behavior in many forms.
   				  super type can be reference to any sub class
   				  Benefits: flexible
   				    - one single variable with reference to parent class
   				      is able to any object of child class 
 
 
 					
 */

class Animal{
	
	public void method1() {
		
	}
	
}

class Dog extends Animal{
	//Dog is an animal.
	public void method2() {
		
	}
	
}

public class UpCasting {
	
	public static void main(String[] args) {
		
		System.out.println((double)10); //primitive casting
		
		//Upcasting: casting subclass to super type
		Dog obj = new Dog();
		Animal obj2 = (Animal)obj;
		
		Animal obj3 = new Animal();
		//Dog obj4 = (Dog)obj3; //Run time error: ClassCastException
		
		
	}

}
