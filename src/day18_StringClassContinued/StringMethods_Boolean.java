package day18_StringClassContinued;

public class StringMethods_Boolean {
	
	public static void main(String[] args) {
		
		/*
		 isEmpty() 	==> Checks if the string is empty
		 			==> Returns Boolean
		 			==> length() = 0
		 
		 isBlank()  ==> Empty except white spaces
		 			==> Returns Boolean
		 			==> length() doesn't have to be 0
		 			
		 String1.equals(String2) 	==> Checks the visible text
		 							==> Unlike ==
		 							==> Boolean
		 
		 String1.equalsIgnoreCase(String2) 	==> Ignores case sensitivity
		 									==> Boolean
		 
		 contains(str)	==> Checks if str is contained in string
		 					==> Boolean
		 
		  startsWith(str) 	==> Checks if string starts with str
		  					==> Boolean
		  
		 */
		
		String str = "Cybertek";
		boolean R1 = str.isEmpty();
		System.out.println(R1);
		
		
		String str2 ="";
		if (str2.isEmpty()) 
			System.out.println("It's empty");
		else 
			System.out.println("It's not empty");
		
		String A1 = "Cybertek";
		String A2 = new String("Cybertek");
		System.out.println(A1 == A2); // false
		System.out.println(A1.equals(A1)); // true
		
		System.out.println("java".equals("Java")); // Case sensitivity
		System.out.println("java".equalsIgnoreCase("Java")); // Case sensitivity
		
		System.out.println(A1.contains("tek"));
		
		String Today = "Java";
		System.out.println(Today.startsWith("av", 1));
		System.out.println(Today.endsWith("va"));
		
		String B1 = "Muhtar";
		System.out.println(B1.endsWith("tar"));
		
	}

}
