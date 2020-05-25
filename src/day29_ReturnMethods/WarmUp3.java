package day29_ReturnMethods;

public class WarmUp3 {
	
	public static void main(String[] args) {
		
		int count[] = new int[256]; 
		String str = "aabbaaaabbcccccbadddaa";
		int len = str.length(); 
		  
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.print("" + str.charAt(i) + count[str.charAt(i)]);             
        } 
	}

}
