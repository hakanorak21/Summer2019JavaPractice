package day43_JavaReview;

/**
 How to import a class:
 import PackageName.className;
 
 Or:
 Packagename.* (wild import)
 
 
 */
public class Practice {
	
	public static void main(String[] args) {
		
		staticKeyword.printName(); //Static methods can be called 
									//through the class name
		
		//staticKeyword.printName2(); //Cannot be called using class name
		printName();
		
		staticKeyword obj = new staticKeyword(); //First, create object
		obj.printName2(); //non-static method
		obj.printName(); //static method
		
		String a = obj.instanceName;
		System.out.println(a);
		
		String b = obj.staticName;
		System.out.println(b);
		
		obj.staticName = "Holly";
		String c = obj.staticName;
		System.out.println(c);
		
		staticKeyword.printName();
		
	}
	
	public static void printName() {
		System.out.println("Semra");
	}

}
