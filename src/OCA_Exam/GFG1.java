package OCA_Exam;

public class GFG1 {
	
	public static void main(String[] argv) 
	        throws Exception 
	    { 
	  
	        // create a StringBuilder object 
	        // usind StringBuilder() constructor 
	        StringBuilder str 
	            = new StringBuilder(); 
	  
	        str.append("GFG"); 
	  
	        // print string 
	        System.out.println("String = " + str); 
	  
	        // create a StringBuilder object 
	        // usind StringBuilder(CharSequence) constructor 
	        StringBuilder str1 = new StringBuilder("AAAABBBCCCC");  
	            
	        // print string 
	        System.out.println("String1 = " + str1);
	  
	        // create a StringBuilder object 
	        // usind StringBuilder(capacity) constructor 
	        StringBuilder str2 = new StringBuilder(10); 
	      
	        // print string 
	        System.out.println("String2 capacity = " + str2.capacity());
	                           
	        // create a StringBuilder object 
	        // usind StringBuilder(String) constructor 
	        StringBuilder str3 = new StringBuilder(str1);  
	         
	        // print string 
	        System.out.println("String3 = "
	                           + str3.toString()); 
	    } 

}
