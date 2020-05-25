package day57_Exceptions;

/**
Exceptions: unwanted (checked) or unexpected (unchecked) events

		Exception is call that will be thrown when those unexpected
		and unwanted events occur.
		
		 There are two types of exceptions:
		 1. Unchecked (unexpected): Occurs during run time (JVM cannot detect)
		 	Ex: int[] arr = {1,2,3};
		 		syso(arr[20]);
		 		
		 	Selenium ex: Null Pointer
		 				 No Such Element
		 				 Web Driver
		 				 
		 	RuntimeException class is the parent class of all the unchecked
		 	exceptions.
		 	
		 	All of the RuntimeExceptions are unchecked exceptions. 
		 		
		 2. Checked: 	Occurs during compilation
		  				Needs to be handled IMMEDIATELY, because
		  				it gives compile error.
		  	Ex: Thread.sleep();

Exception Handling:	

	  	1. Try&Catch: used for handling the exception
	  	
	  	 		try{
	  	 			exception statements/code
	  	 			
	  	 		}catch(ExceptionClass name){
	  	 			statements
	  	 			
	  	 		 }
	  	 		 
	  	 	Only one of those blocks gets executed.
	  	 		try block: Executed if the exception is checked exception
	  	 		catch block: Executed if the exception is unchecked exception 

Exception classes diagram:
	1. Exception: parent class of all checked and unchecked exceptions.
	2. RunTimeException: parent class of all unchecked exceptions. 
	PS. Exception class can handle all exceptions because it is the 
		parent class of RuntimeException, too.
*/
public class ExceptionsClass {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		System.out.println(arr[100]);	//Unchecked (aka unexpected)
										//ArrayIndexOutOfBoundsException
		
		//Thread.sleep(1000);	//Checked (aka unwanted)
								//Gives compile error
	
	}
	
}
