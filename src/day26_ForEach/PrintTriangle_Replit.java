package day26_ForEach;

import java.util.Scanner;

public class PrintTriangle_Replit {
	
	public static void main(String[] args) {
		
		/**
		//int i = 1;
		//int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			
		for (int i = 1; i <= n; i++){
			for (int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
			
	  	}
	  	*/
		
		//While loop
		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
					
		while (i <= n){
			j = 1;
			while (j <= i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;			
		}
		
	}
}
