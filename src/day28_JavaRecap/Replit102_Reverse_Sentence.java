package day28_JavaRecap;

import java.util.Scanner;

public class Replit102_Reverse_Sentence {
	
	// Example: Java is fun
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    /**
		    //TODO: Type your code below
		    while (sentence.lastIndexOf(" ") > 0) { 
		    	System.out.println(sentence.substring(sentence.lastIndexOf(" ")+1));
		    	sentence = sentence.substring(0, sentence.lastIndexOf(" "));
		    }
		    System.out.println(sentence);
		    */
		    
		    //With arrays
		    String[] array = sentence.split(" ");
		    int i = array.length - 1;
		    while (i >= 0){
		    	System.out.println(array[i--]);
		    }
		    
	  }

}
