package day17_StringClass;

import java.util.Scanner;

public class Oghlan {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   System.out.println("Enter grade: ");
		   int grade = s.nextInt();
		   //your code here
		    String finalse = (grade >= 90 && grade <= 100) ? "Excellent" : 
		    				 (grade >= 70 && grade <90) ? "Good" :
		    				 (grade >= 60 && grade <70) ? "Pass" :
		    				 (grade >= 0 && grade < 60) ? "Fail" :
		    				 "Fail";
		    				
		    System.out.println(finalse);
		}	
}
