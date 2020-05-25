package day43_JavaReview;

public class staticKeyword {
	
	/**
	 Static members (class members):
	 			1. Static variables
	 			2. Static methods
	 			3. Static initializer block
	 			4. Static inner class (nested class)
	 			
	 Static variable: Shared by class and objects, one copy
	 
	 Static methods: Can be called through the class
	 					(no need for object)
	 					Ex: WebDriver driver = WebDriverFactory.getDriver();
	 
	 				Accepts only static (non-static can only be called through
	 										the object)
	 			
	 */

	static String staticName = "Filiz";
		String instanceName = "Nurzat";
	
	public static void printName(){
		
		System.out.println(staticName);
		//System.out.println(instanceName); //instance variable cannot
											//called in a static method
		
	}
	
	public void printName2() {
		System.out.println(instanceName);
		System.out.println(staticName);
		
	}

}
