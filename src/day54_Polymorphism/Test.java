package day54_Polymorphism;

abstract class AbstractClass{
	
	//Abstract class can have non-abstract methods
	public void ByLinkText() {
		System.out.println("Link text super");
		
	}
	
}

public class Test extends AbstractClass {
	
	//Default constructor
	public static void Test() {
		
	}
	
	//Method overloading
	public void ByLinkText(int a) {
		System.out.println("Link text sub");
		
	}
	
	public static void main(String[] args) {
		
		//AbstractClass obj = new AbstractClass();
		//We cannot create an object from an abstract class.
		
		AbstractClass obj = new Test();
		//reference type	//object
		//super class		//sub class
		
		obj.ByLinkText();
		//obj.ByLinkText(2); //Doesn't see sub-class method
		
		Test obj2 = new Test();
		obj2.ByLinkText(10);
		
		//driver.findElement(By.xpath(""));
		//By is a class, while xpath is a static method
		
	}
	
}
