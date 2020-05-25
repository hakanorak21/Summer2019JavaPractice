package day57_Exceptions;

public class Quiz {
	
	public static void main(String[] args) {
		
		/*
		//Question 1
		1. Polymporphism: Objects share behaviors with other objects.
		2. Inheritance: A subclass can inherit from a superclass. 
		
		//Question 2
		No instance methods in interface.
		Also, no constructors.
		Public and abstract keywords are given implicitly.
		(Even if we don't write them, our code will still run).
		Interface can have only abstract, static, and default methods. 
		
		//Question 3
		Only public static final variables in interface.
		No object from interface.
		
		//Question 4: See below
		
		//Question 5
		Reference type decides which methods to be called.
		(First rule of polymorphism)
		Rule 2: Object type decides on the definition of the method.
		
		//Question 6
		Encapsulation: private access-modifier for data hiding
		
		//Question 7
		Selenium
		
		//Question 8
		navigate().forward();
		
		//Question 9
		WebElement element = driver.findElement(By.name("button"));
		==> Returns an element with a name attribute with the value of button.
		
		//Question 10: See below
		
		//Question 11
		8 locators in Selenium
		
		//Question 12: See below
		Sub class cannot be reference type of a super class
		
		//Question 13
		No protected access-modifier at an implementation method.
		(Because the overridden abstract method is public.)  
		*/
		
	}

}


//Question 4
interface Fatih{
	
	void readBooks();
	abstract void watchTV();
}

abstract class Omer implements Fatih{
	
	@Override
	public void readBooks() {
		System.out.println("Omer is reading");
	}
}

class Oleksander extends Omer{
	
	@Override
	public void watchTV() {
		System.out.println("Oleksander is watching TV");
	}

}


//Question 10
//Make passportNo read only
class Employee{
	
	//public int passportNo;
	private int passportNo;
	public int getPassportNo() {
		return passportNo;
	}
	
}


//Question 12
class parent{
	
}

class child extends parent{
	
	public static void main(String[] args) {
		parent obj = new child(); //Up casting
		//child obj2 = new parent(); //child class cannot be 
									 //reference type of parent object
		parent obj3 = new parent();
		child obj2 = (child)obj3; //Down casting
		
	}
	
}
