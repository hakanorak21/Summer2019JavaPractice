package Day33_ArrayList;

public class WarmUp2 {
	
	/**
    Assignment:
       1. write a return method that can remove duplicates from a string
           Ex: RemoveDup("AABBBCCCDD")  ==> ABCD
    
       2. write a return method that passes two string parameters a and b, 
            return the number appearances of b in a
           Ex:     count("ABAB" , "A") ==> 2
            
       3. combine method 1 and method 2 to write a method that can find 
       the frequency of characters
           Ex: frequency("AAABBBCCCDD")  ==> A3B3C3D2
    */
	
	public static void main(String[] args) {
		
		System.out.println(removeDuplicates("AABBBCCCDD"));
		System.out.println(Appearance("ABAB", "B"));
		System.out.println(Frequency("AAABBBCCCDD"));	
		
	}
	
	public static String removeDuplicates(String str) {
		
		String unique = "";
		for (int i = 0; i < str.length(); i++) {
			if (!unique.contains(str.substring(i, i+1)))
				unique += str.substring(i, i+1);		
		}
		return unique;
	}
	
	public static int Appearance(String str1, String str2) {
		
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.substring(i, i + str2.length()).equals(str2)) {
				count++;
			}
		}
		return count;
	}
	
	public static String Frequency(String str) {
		
		String str1 = removeDuplicates(str);
		String result = "";
		for (int i = 0; i < str1.length(); i++) {
			result += str1.substring(i,i+1) + Appearance(str, str1.substring(i,i+1));
		}
		
		return result;
	}

}
