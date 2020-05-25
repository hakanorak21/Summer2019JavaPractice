package day27_CustomMethods;

public class PracticeMethod {
	
	public static void main(String[] args) {
		RemoveDuplicates("abcabcabcd");
	}
	
	public static void RemoveDuplicates(String a) {
		
		String result = "";
		
		for (int i = 0; i < a.length(); i++) {
			if(!result.contains(a.substring(i, i+1)))
				result += a.substring(i, i+1);
		}
		
		System.out.println(result);

		
	}

}
