package Replits;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit_155_FibonacciNumbers {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    //fib(num);
	    System.out.println(fibonacci(num));
	    
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
		  
		  /**
		  int a = 0;
		  int b = 1;
		  for (int i=1; i<=num; i++){
			  b = a + (a = b);
		  }
		  System.out.println(b);

		  
		  //Using ArrayList
		  ArrayList<Integer> fibonacci = new ArrayList<>();
	   
	    	if (num == 1)
	    		fibonacci.add(0);
	    	
	    	else if (num == 2){
	    		fibonacci.add(0);
	    		fibonacci.add(1);
	    	}
 	
	    	else {
	    		fibonacci.add(0);
	    		fibonacci.add(1);
	    		for (int i = 2; i <= num; i++){
	    		fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
	    	}
	    }
	    System.out.println (fibonacci.get(num-1));
		
		  
		//Using arrays
		int[] arr = new int[num+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for (int i = 2; i <= num; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[num-1]);
		
		
		//Solving without arrays
		int Number, i = 0, First_Value = 0, Second_Value = 1, Next = 0;
		while (i < num) {
			if (i <= 1)
				Next = i;
			else {
				Next = First_Value + Second_Value;
				First_Value = Second_Value;
				Second_Value = Next;
			}
			i++;
		}
		System.out.println(Next);
		*/
		
	  }
	  
	  //Using recursive methods
	  public static int fibonacci(int n) {
		  if (n == 1) return 1;
		  else if (n == 2) return 1;
		  else return fibonacci(n-1) + fibonacci(n-2);
	  }

}
