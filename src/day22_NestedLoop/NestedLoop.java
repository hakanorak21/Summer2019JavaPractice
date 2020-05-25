package day22_NestedLoop;

public class NestedLoop {
	
	
	
	//Loop within loop
	 
	public static void main(String[] args) {
	
		/*
		for (int z = 1; z <= 5; z++) {
			
			for (int i = 1; i <= 5; i++) {
				System.out.print(i);
			}
			
			System.out.println();
		
		}
		
			
		System.out.println();
		
		int j = 1;
		while(j <= 5) {
			
			int k = 1;
			while (k <= 5) {
				System.out.print("*");
				k++;
			}
			
			System.out.println();
			
			j++;
		}
		
		 
		System.out.println();
		
		for (int i = 1; i <= 7; i++){
			
			for (int n = 1; n <= i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		int i = 1;
		while (i <= 7) {
			
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			
			i++;
		}
		
		*/
		
		int i = 7;
		while (i >= 1) {
			
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			
			i--;
		}
		
		
	}

}
