package day45_Inheritance;

/**
Inheritance: One of the 4 concepts of OOP.
Used for building relationships between classes.
It builds super and sub relationships using "extends" keyword.

Ex: public class 	A 	extends B
					Sub			Super

Sub class: aka child class
Super class: aka parent class

Sub class can inherit accessible features from super class
Accessible (visible or protected): public, default, protected

*Features with public or protected access-modifiers can be inherited anywhere,
even outside the package.

*Features with default access-modifiers can be inherited to the classes
in the same package

*Features with private access-modifiers cannot be inherited

Protected access-modifier: Only visible to the classes in the same package
 							But can be inherited to other packages.

One class can only extend one class (only one super class)
But one class can be extended by multiple classes

Benefits of inheritance:
	1. Re-usability
	2. Easy to maintain

POM: Page object module??	
*/

class TestBase{
	
	static String chromeDriver = "Chrome"; //default
	
	public static void TakeScreenShot() {
		System.out.println("Took screenshot.");
	}
	
	private static void CloseBrowser() {
		System.out.println("Browser closed.");
	}
	
}

public class Inheritance extends TestBase {
			 // sub				 //super
	//sub class inherits all visible or protected features of the super class	
	
	public static void main(String[] args) {
		
		System.out.println(chromeDriver);
		TakeScreenShot();
		//CloseBrowser(); //Private: Neither visible nor protected
	}
}
