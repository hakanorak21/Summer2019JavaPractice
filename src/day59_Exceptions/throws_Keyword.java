package day59_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws_Keyword {
	
/**
 throws keyword: used for handling exceptions
 				 
 				 MUST be used with method signature, 
 				 indicates that method might throw exception.
 				 
 				 Ex: public static void sleep() throws InterruptedException{
 				 		Thread.sleep(1000);
 				 	 }
 				 
 				 One-time (temporary) fix!
 				 
 				 Good if we have multiple exceptions of the same type
 				 in the same code.
 				 
 				 Used MAINLY for checked exceptions.
 */
	//throws: one-time fix
	public static void sleep(long milliSec) throws InterruptedException {
		Thread.sleep(milliSec);
	}
	
	//Again, one-time fix
	public static void method1() throws InterruptedException{
		sleep(1000);
	}
	
	//try-catch: permanent fix
	public static void sleep2(long milleSec) {
		try {
			Thread.sleep(milleSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception{
		
		Thread.sleep(1000);
		
		System.out.println("Hello");
		
		Thread.sleep(2000);
		
		System.out.println("World");
		
		//System.out.println(9/0);
	}
	
	public static void method2() throws Exception{
		Thread.sleep(1000);
		FileInputStream file = new FileInputStream("");
	}
	
	//Or: throws multiple exceptions
	public static void method3() throws InterruptedException, FileNotFoundException{
		Thread.sleep(1000);
		FileInputStream file = new FileInputStream("");
	}
	
	//throws can't fix unchecked exceptions
	public static void method4() throws ArithmeticException{
		System.out.println(9/0);
	}
	
	public static void main(String[] args) throws Exception{
		//sleep(2000); //Gives exception again!
		sleep2(3000);
		test();
		//method3(); //FileNotFound??
		//method4(); //Runtime exception
		
	}

}
