package day63_JavaRecap;

import java.io.IOException;
import org.testng.annotations.Test;

public class Quiz16 {
	
	
//	//Question 2
//	public static void main(String[] args) {
//		throw new RuntimeException("This is an exception"); //explicitly 
//		
////		System.out.println(9/0); //implicitly
//	}
	
	public static void method1() throws IOException{
		
	}
	
	
//	//Question 4
//	public static void main(String[] args) {
//		
//		int[] arr = {1,2,3};
//		
//		try {
//			System.out.println(arr[100]); // ArrayIndexOutOfBoundsException
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array index out of...");
//		}catch(RuntimeException e) { //Super class should come after sub class
//			System.out.println("runtime");
//		}	
//	}
	
	
	
	public static void main(String[] args) throws Exception {
		
//		throw new NoHolidayException();
		
		
//		try {
//			throw new NoBreakException("No coffee!!");
//		} catch(NoBreakException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		//throw new RuntimeException("This is an Exception."); //explicitly
//		try {
//			//System.out.println(9/0); //implicitly
//			throw new RuntimeException("Dividing by zero!");
//			//System.out.println("try block");  //unreachable code
//			
//		}catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//			
//		}
		
//		int[] arr = {1,2,3};
//        
//        try {
//            System.out.println(arr[100]);
//        }catch(RuntimeException e) {
//            System.out.println("runtime");
//        }
		
//		System.out.println("End of program");
		
	}
	
//	@Test( timeOut = 1000 )  // gives time limit to the Test case
//    public void Test1() throws Exception{ 
//        Thread.sleep(2000);
//        System.out.println("Test Completed");
//        
//    }
//	
//}
//
class NoHolidayException extends Exception{//Custom checked exception
	
}

class NoBreakException extends RuntimeException {//Custom unchecked exception
	
	public NoBreakException(String str) {
		super(str);
	}
	
}

}
