package day27_CustomMethods;

public class VoidMethod {
	
	/**
	 Declaration of method:
	 access-modifier specifier return-type method-name
	 
	 */
	
	public static void main(String[] args) {
		
		myFirstMethod();
		
		OneTo100();
		
	}	
		public static void myFirstMethod() {
		System.out.println("Hello World");
		}
		
		public static void OneTo100() {
			for (int i = 1; i <= 100; i++) {
				System.out.print(i + " ");
			}
		}
		
	


}
