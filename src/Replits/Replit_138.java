package Replits;

import java.util.Arrays;

public class Replit_138 {
	
	public static void main(String[] args) {
		
		
		/**
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for(int i=0; i<inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		*/

		//int[] inhabitants = {0, 20, 0, 20, 20, 10, 0, 10};
		int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};

		//TODO. Write you code below this line.
		int day = 0;
		System.out.print ("Day " + day + " ");
		System.out.print (Arrays.toString(inhabitants) + "\n");
		int[] result = new int[inhabitants.length];

		boolean nonZero = true;
		while (nonZero){

			for (int i = 0; i < inhabitants.length; i++) {
				result[i] = inhabitants[i];
			}
			
			for (int i = 0; i < inhabitants.length; i++){
				if ((i != 0 && i != inhabitants.length-1) 
						&& (inhabitants[i+1]==0 || inhabitants[i-1]==0) 
						|| (i==inhabitants.length-1 && inhabitants[i-1]==0) 
						|| (i==0 && inhabitants[i+1]==0)){
					result[i]=inhabitants[i]/2;	          
				} else {
					result[i]=inhabitants[i];	    	   
				}
			

				for (int j = 0; j < result.length; j++){
					if (result[j] != 0){
						nonZero = true;
						break;
					}
					else{
						nonZero = false;
					}
				}
			}
			
			day++;
			System.out.print ("Day " + day + " ");
			System.out.print (Arrays.toString(result) + "\n");
			
			for (int i = 0; i < inhabitants.length; i++){
				inhabitants[i] = result[i];
			}
		} 

		System.out.println("---- EXTINCT ----");

	}

}
