package day45_Inheritance;

/**
 We can have multiple classes in a Java file.
 
 There can be only one public class with the same name as the Java file.
 
 Other classes MUST have default access-modifiers. 
 
 */

public class MultiClass {
	
	public static void main(String[] args) {
		System.out.println("Main public class");
	}

}


class A{ //should be default within the same file
	
	public static void main(String[] args) {
		System.out.println("Default class A");
	}
	
}


class B{
	
	public static void main(String[] args) {
		System.out.println("Default class B");
		
	}
}
