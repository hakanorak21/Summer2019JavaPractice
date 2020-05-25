package day44_AccessModifiers;

public class TestData {
	
	/**
	import: 
			import PackageName.className; 
			// imports a single class from the package
			
			import PackageName.*;
			// imports all classes from the package
			
			import static PackageName.ClassName.StaticName;
			// imports one class member (static variable or method)
			
			import static PackageName.ClassName.*;
			// imports all class members (static variables and methods)
			// To be used with assertion...
	
	Access-modifiers: public, protected, private, default
			public: open for the world, visible everywhere
					ex: public int num = 100;
					
			private: only visible within the class
					ex: private int num = 100;
					
			default: only visible to the classes in the same package
					ex: int num = 100;
					
			protected: only visible to the classes in the same package;
						but it is inheritable outside the package
					ex: protected int num = 100;
	*/
	
	public static String Name = "Juline";
	public static int ID = 123;
	public static String SchoolName = "Cybertek";
	
	private static String Password = "Cybertek";
	
			static int age = 20; //Can be used within package
	
	public static void printHello() {
		System.out.println("Hello");
	}
	
}
