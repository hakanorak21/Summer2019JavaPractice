package day59_Exceptions;

import java.util.NoSuchElementException;

public class Multi_Catch_Blocks {
	
/**
 Multi-catch block: We can have multiple catch blocks with one try block.
 
 	try{
 	
 	}catch(ExceptionClass1 name){
 	
 	}catch(ExceptionClass2 name){
 	
 	}
 
 CONDITION: Parent class should come after child class.
 			Otherwise, code is unreachable.
 			
 			No duplicates.
 
 Unchecked Exceptions:
 Exception > RunTimeException > Arithmetic, Index, etc.
 
 In multi-catch block whichever handles the exception first,
 will be executed.
 
 */
	public static void main(String[] args) {
		
		//Unchecked exception
		try {
			System.out.println(9/0);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//Only Arithmetic Exception catch block is executed.
		
		//Unchecked exception
		int[] arr = {1,2,3};
		try {
			System.out.println(arr[100]);
		}catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}catch (ClassCastException e) {
			System.out.println("ClassCastException");
		}catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(e.getMessage());
		}catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
		}catch (RuntimeException e) {
			System.out.println("RuntimeException");
		}catch (Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Exception caught by child class;");
			System.out.println("No need for the remaining exceptions.");
		}
		System.out.println("==================================");
		
		//Unchecked exception
		try {
			System.out.println(9/0);
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		
		} catch (ClassCastException e) { //This can be before or after
			// TODO: handle exception	 //Arithmetic exception
			
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception");
			
		} catch (Exception e) {
			System.out.println("Exception class");
			
		}
		System.out.println("===================================");
		
	}

}
