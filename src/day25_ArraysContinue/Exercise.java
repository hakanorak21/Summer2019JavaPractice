package day25_ArraysContinue;

import java.util.Arrays;

public class Exercise {
	
	public static void main(String[] args) {
		
		int[] grades= {98, 100, 83, 90, 93};
	    String[] subjects= {"Math", "English","Music", "Java", "History"};
	    
	    String record="";
	    
	    for(int i=0;i < subjects.length;i++) 
	    	record += subjects[i]+ ": " + grades[i] + " ";
	    
	    System.out.println(record);
	    
	    String[][] records = { {"Math", "English","Music", "Java", "History"} ,
	    					   {"98", "100", "83", "90", "93"} };
	    System.out.println(Arrays.deepToString(records));
	    
	    for (int i = 0; i < records[1].length; i++)
	    	for (int j = 0; j < records.length; j++)
	    		System.out.print(records[j][i] + " ");
		
	}

}
