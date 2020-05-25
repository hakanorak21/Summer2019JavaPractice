package OCA_Exam;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.Predicate;

public class Assessment_Exam {
	
	/*
	//Question 1
	private static int $;
	static String a_b;
	*/
	
	public static void main(String[] main) {
	
	/*
		//Question 1
		System.out.print($); 
		System.out.print(a_b);
	
	
		//Question 2
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder(); 
		sb1.append("Ja").append("va"); 
		System.out.println(s1 == s2); 
		System.out.println(s1.equals(s2)); 
		System.out.println(sb1.toString() == s1); 
		System.out.println(sb1.toString().equals(s1));
	
		
		//Question 4
		boolean keepGoing = true; 
		int count = 0;
		int x = 3;
		
		while(count++ < 3) {
			int y = (1 + 2 * count) % 3; 
			switch(y) {
				default: 
				case 0: x -= 1; break; 
				case 1: x += 5;
			}
		}
		System.out.println(x);
		
		
		//Question 17
		System.out.println(test(i -> i == 5));
		System.out.println(test((i) -> i == 5));
		//System.out.println(test((int i) -> i == 5);
		System.out.println(test((i) -> {return i == 5;}));
		
		
		//Question 18
		System.out.println(LocalDate.of(2015, Month.APRIL, 1));
		System.out.println(LocalDate.of(2015, 4, 1));
		//System.out.println(new LocalDate(2015, 4, 1));
		*/
		
	}
	
	//Question 17
	private static boolean test(Predicate<Integer> p) {
		return p.test(5); 
	}

}
