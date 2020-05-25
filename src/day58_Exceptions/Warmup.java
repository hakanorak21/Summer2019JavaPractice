package day58_Exceptions;
/**
Exception: unwanted (checked) or unexpected (unchecked) events

	Checked exception (unwanted): 	Occurs during compile time
									MUST be handled immediately
	
	Unchecked exception (unexpected): 	Occurs during runtime
										All the runtime exceptions are
										unchecked exceptions
									
									Ex: NoSuchElementException
										WebDriverException
										TimeoutException
										...

Exception handling:
	1. try-catch:
		try{
			Exception code;
		}catch(ExceptionClass name){
			code;
		}
		
		try block: 	executed if the  exception is checked
		catch block: executed if the exception is unchecked 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Warmup {
/**
1. 	Write a method called "wait" that causes the current executing thread 
	to sleep for the specific number of seconds
		parameters: double seconds
    	return-type: void
    
2. 	Write a method called "getData" that can retrieve the data from 
	properties files
  		parameters: String Key, String FilePath
    	return-type: String
    
    Note: Exceptions MUST be handled within the methods
*/

	
	public static void wait(double seconds) {
		
		try {
			Thread.sleep((long)(seconds*1000));
			System.out.println("Waited for " + seconds + " seconds");
			
		} catch (InterruptedException e) {
			//e.getMessage();
			//e.printStackTrace();
		}
		
	}
	
	
	public static String getData(String key, String filePath) {
		
		Properties property = new Properties();
		
		try {
			FileInputStream file = new FileInputStream(filePath);
			property.load(file);
			//System.out.println("try block");
		}catch(IOException e) {
			System.out.println("catch block");
			System.out.println(e.getMessage());
			
		}
		
		String data = property.getProperty(key); 
		return data;
		
	}
	
	
	public static void main(String[] args) {
		wait(2.5);
		System.out.println("Batch 12");
		
		String path = "/Users/horak/Desktop/Data.properties";
		String name = getData("Name", path);
		System.out.println(name);
		
		String age = getData("Age", "TestData.properties");
		System.out.println(age);
		
		String gender = getData("Gender", "TestData.properties");
		System.out.println(gender);
		
		String browser = getData("Browser", "Files/TestData2.properties");
		System.out.println(browser);
		
		String url = getData("URL", "Files/TestData2.properties");
		System.out.println(url);
		
	}
	
}
