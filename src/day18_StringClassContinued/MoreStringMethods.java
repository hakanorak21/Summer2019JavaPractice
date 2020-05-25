package day18_StringClassContinued;

public class MoreStringMethods {
	
	
	public static void main(String[] args) {
		
		/*
		 indexOf() ==> The index of the first character of String
		 
		 lastIndexOf(String) ==> The index of the last occurance 
		 					of the first character String
		 */
		
		String A1 = "Batch12 is a great batch";
		int indexNumberofGreat = A1.indexOf("great");
		System.out.println(indexNumberofGreat);
		System.out.println(A1.substring(13));
		
		int num2 = A1.indexOf("eat2"); // -1: does not exist
		System.out.println(num2);
		
		String B1 = "Today is Tuesday. Today we have class in the afternoon";
		System.out.println(B1.indexOf("after"));
		
		String address = "7925 Jones Branch Dr, McLean, VA 22003";
		int firstIndex = address.indexOf(",") + 2;
		int lastIndex = address.indexOf(", VA");
		String cityName = address.substring(firstIndex, lastIndex);
		System.out.println(cityName);
		
		String emailAddress = "hakanorak21@yahoo.com";
		int beginIndex = emailAddress.indexOf("@") + 1;
		int endIndex = emailAddress.indexOf(".");
		System.out.println(emailAddress.substring(beginIndex, endIndex));
		
		String str = "ABCDACBVFR";
		int n2 = str.lastIndexOf("B");
		System.out.println(n2);
		
		//The email type: "yahoo"
		beginIndex = emailAddress.indexOf("@") + 1;
		endIndex = emailAddress.lastIndexOf(".");
		System.out.println(emailAddress.substring(beginIndex, endIndex));
		
		
		
		
	}

}
