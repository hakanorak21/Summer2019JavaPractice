package day20_JavaRcap;

public class QuizReview {
	
	public static void main(String[] args) {
		
		//Q1
		String str = "Hello World";
		System.out.println(str.substring(0, 5)); // Hello
		
		//Q3
		String s1 = "Java";
		String s2 = "java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//Q4
		String str3 = " ";
		System.out.println(str3.trim().isEmpty()); // true
		//						""
		System.out.println(str3.isEmpty()); // false
		System.out.println(str3.isBlank()); // true
		
		//Q5
		String str4 = "java";
		String str5 = new String ("java");
		
		System.out.println(str4 == str5); // false because different location
		System.out.println(str4.equals(str5)); // true
		
		//Q6
		String B1 = "Cybertek"; // String pool
		String B2 = new String (B1); // Heap memory
		String B3 = B2; // Heap memory
		// B3 and B2 share the same heap memory
		String B4 = "Cybertek"; // same string pool as B1
		
		System.out.println(B3 == B2); // true because same location
		System.out.println(B3.equals(B2)); // true
		
		//Q10
		int z = 5;
		
		for (int i = 5; i > 0; i--) { // i: 5, 4, 3, 2, 1
			
			z += i;					// 5 + 5 = 10
									// 10 + 4 = 14
									// 14 + 3 = 17
									// 17 + 2 = 19
									// 19 + 1 = 20	
		}
		
		System.out.println(z);
		
		//Q11
		int i = 0;
		for (i = 5; i < 10;) { // i: 5, 7, 9, 11
			i += 2;
		}
		
		System.out.println(i);
		
	}

}
