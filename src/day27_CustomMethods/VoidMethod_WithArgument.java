package day27_CustomMethods;

public class VoidMethod_WithArgument {
	
	/**
	 Methods with argument:
	 	access-modifier specifier return-type name (parameter){ }
	 		parameters can be any data type
	 */
	
	public static void main(String[] args) {
		
		oddOrEven(10);
		sum(5,10);
		
	}
	
	public static void oddOrEven(int a) {
		
		if (a %2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
	}
	
	public static void sum(int a, int b) {
		
		System.out.println("Sum of " + a + " and " + b + " is " + (a+b));
		
	}

}
