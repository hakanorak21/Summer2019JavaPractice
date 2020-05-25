package day60_ExceptionsReview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 Checked exception: Happens during compile time.
 					Unwanted code, compiler is not happy, compile error
 					MUST be handled immediately
 					
 					Ex: FileNotFoundException
 						InterruptedException
 						IOException
 						...
 
 Unchecked exception:	Occurs during runtime.
 						Unexpected event
 						All extend RuntimeException
 						(RuntimeException is parent class 
 						of all unchecked exceptions)
 						
 					Ex:	NoSuchElementException
 					 	WebDriverException
 					 	TimeOutException
 					 	StaleElementException

try-catch block: handle exception

			try{
				exception code; //executed if exception is checked
			}catch(Exception e){
				statements;		//executed if exception is unchecked
			}finally{
			
			}
			
finally block: is always executed

multi-catch blocks: one try, multiple catch
					parent catch comes after child catch

 			try{
 			
 			} catch(Exception1 e){
 			
 			} catch(Exception2 e){
 			
 			}
 
 If the exception is checked, no need for multiple catch blocks.
 
 throws keyword: MUST be used with method signature 
 				 Declares an exception
 				 Caller is responsible for handling the exception.
 				 Mostly used for checked exceptions.
 				 A method can declare multiple exceptions.
 				 
 Two ways to handle exception:
 
 		1. try-catch blocks: Handles exception immediately.
 							 
 							 try block tries to handle the exception, 
 							 if not, catch block handles it.
 							 
 							 catch block catches all unexpected events.
 							 
 							 We can have multiple catch blocks but:
 							 		1. super after sub
 							 		2. cannot be conflicted
 							 
 		2. throws keyword:	see above
 		
 throw keyword: used for throwing exception manually.
   				after throw, any code fragment is unreachable.
   				
 keywords: return, break, continue, throw
  			(any codes after these are unreachable) 
 
 */
public class ExceptionsReview {
	
	public static void main(String[] args) {
		
		//throw new ClassCastException(); //Unchecked
		
		//throw new FileNotFoundException(); //Checked (compiler not happy)
	
		//FileInputStream file2 = new FileInputStream ("file path"); //Checked
		
		try {
			//FileInputStream file = new FileInputStream ("file path");
			System.out.println(1/0);
			//System.out.println("try block");
		} catch (RuntimeException a) {
			System.out.println(a.getMessage());
			System.out.println("catch block");
		} finally {
			System.out.println("finally block 1");
		}
		
		System.out.println("next test step");
		
		try {
			System.out.println("try block");
			System.out.println(9/0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block 2");
		}
		
		System.out.println("=========================");
		
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[200]);	
		} catch (NullPointerException e) {
			// TODO: handle exception
		//} catch (ArrayIndexOutOfBoundsException e) {
		//	System.out.println(e.getMessage());
			
		//} catch (IndexOutOfBoundsException e) {
		//	System.out.println(e.getMessage());
			
		//} catch (RuntimeException e) {
		//	System.out.println(e.getMessage());
			
		//} catch (Exception e) {
		//	System.out.println(e.getMessage());
			
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			
		}
		
		//method(); //compile error because exception was passed
		method2(); //compiles because of try-catch block
		
		//method3(); //compile error because exception was passed
		try {
			method4();	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//method5(); //runtime exception
		
		try {
			int breaktime = 0;
			if (breaktime == 0) {
				throw new RuntimeException("Time to go!");
			}
			System.out.println("try block");
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("catch block");
		}
		
		
		System.out.println("End of program");
		
	}
	
	public static void method() throws InterruptedException{
		Thread.sleep(2000);
	}
	
	public static void method2() {
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void method3() throws Exception {
			System.out.println(9/0);
			
	}
	
	public static void method4() throws InterruptedException{
		
	}
	
	public static void method5() {
		throw new RuntimeException();
	}	

}
