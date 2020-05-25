package Replits;

public class Replit_173 {
	
	/**
	the method gets two strings and return the longest one
	
	Ex:
	biggerS("apple","orange") ==> "orange"
	 */
	
	public static void main(String[] args) {
		
		System.out.println(biggerS("apple","orange"));
		
	}
	
	public static String biggerS(String a ,String b){
		
		return (a.length()>b.length()? a: b);
	   
	  }

}
