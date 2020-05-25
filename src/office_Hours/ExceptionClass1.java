package office_Hours;

/**
 Types of exceptions:
 1. Compile time (checked) --> syntax
 2. Runtime exception (unchecked)
 
 Throwable interface has 2 children (sub-classes)
 1. Error (cannot be handled by code) Ex: Out of memory
 2. Exception 
 
 3 ways to handle exceptions:
 1. Try-catch block
 There can be multiple catch blocks for one try block.
 Condition: Sub comes before super.
*/

public class ExceptionClass1 {
	
	public static void main(String[] args) {
		
		String a = "java";
		//System.out.println(a.charAt(8)); //Runtime exception 
		//Looks good, no syntax error, but I got the exception
		//after running the code.
		//StringIndexOutOfBoundsException
		
		try {
			System.out.println(a.charAt(8));
			System.out.println("try block");
		} catch (ArithmeticException e) {
			System.out.println("catch block"); //unchecked exception
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Runtime exception");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception parent class");
		}
		
		System.out.println("Asiya");
		
	}

}
