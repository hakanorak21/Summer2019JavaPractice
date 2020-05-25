package day28_JavaRecap;

import java.util.Scanner;

public class Replit108_Print_Triangle {

	public static void main(String[] args) {


		//int i = 1;
		//int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i = 1;
		while (i++ <= n){
			int j=1;
			while (j++ <= i-1){
				System.out.print("*");
				
			}
			System.out.println();
		}

	}


}
