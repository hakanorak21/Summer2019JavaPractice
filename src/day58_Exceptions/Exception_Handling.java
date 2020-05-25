package day58_Exceptions;

public class Exception_Handling {
	
/**
 finally block: Can come after try-catch
  				Executed regardless of the exception occurrence.
  		
 */
	public static void main(String[] args) {
		
		try {
			System.out.println(9/0);
			throw new ArithmeticException();
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}finally {
			System.out.println("finally block");
			
		}
		System.out.println("===================");
		
		try {
			Thread.sleep(2000);
			System.out.println("try block");
			
		}catch(Exception e) {
			System.out.println("catch block");
			
		}finally {
			System.out.println("finally block");
			
		}
	}
}
