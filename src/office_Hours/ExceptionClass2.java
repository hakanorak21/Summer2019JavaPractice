package office_Hours;

/**
 throws keyword --> method (warning message)
 "Passing the buck"
 throws: declaring exception
 		 fixes checked exceptions one-time;
 		 but does not fix unchecked (runtime) exceptions.
 		 
 throw keyword --> Creating your custom method
 */

public class ExceptionClass2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		try {
			String java = "java";
			System.out.println(java.charAt(4));
			
		} catch (IndexOutOfBoundsException e) {
			//throw new IndexOutOfBoundsException("Asiya's index out of bounds");
			System.out.println(e.getMessage());
			
		}
		
		try {
			int i = 2/0;
			throw new ArithmeticException("Asiya's exception");
			
		} catch (ArithmeticException e) {
			System.out.println("child catch");
		} catch (Exception e) {
			System.out.println("Mom found exception");
		}
		
		hi();
		
		try {
			divide();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(3000);
		
		//letsTry(); //Runtime exception because the exception 
					 //has not been handled.
					 //throws doesn't fix the unchecked exception.
		
		System.out.println("Asiya");
		
	}
	
	public static void hi() {
		System.out.println("Hi");
	}
	
	public static void divide() throws ArithmeticException {
		int num = 9;
		System.out.println(num/0);
	}
	
	public static void letsTry() throws ArithmeticException {
		divide();
	}
	
	

}
