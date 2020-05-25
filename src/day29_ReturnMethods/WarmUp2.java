package day29_ReturnMethods;

public class WarmUp2 {
	
	public static void main(String[] args) {
		
		String str = "AAAFFFFDDEECC";   // expected result = "A2B2C2D2";

		String expectedResult = "";
		
		int j=0;
		while(j < str.length()) {
			int count = 0;
			for(int i=0; i < str.length(); i++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			expectedResult += str.charAt(j) + "" + count;
			str = str.replace("" + str.charAt(j), "");  
			// after adding the str.charAt(j),
		}
		System.out.println(expectedResult);
		
		/**
		String str = "AABBCCDD"; // expected result: "A2B2C2D2
		String ExpectedResult = "";
		
		for (int j = 0; j < str.length(); j++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
			ExpectedResult += "" + str.charAt(j) + count;
			str = str.replace(""+str.charAt(j), "");
		}
		System.out.println(ExpectedResult);
		*/
		
	}

}
