package OCA_Exam;

import java.time.LocalTime;
import java.util.*;


public class OCA_Book_Practice_Exam {
	
	//Question 14
	static int[][] game;
	
	public static void main(String[] args) {
		
		/*
		//Question 13
		LocalTime time = LocalTime.of(1, 11); 
		System.out.println(time);
		while (time.getHour() < 2) {
			time.plusHours(1); // immutable ==> infinite loop
			System.out.println("in loop"); 
		}
		
		//Question 14
		game[3][3] = 6; // NullPointerException
		Object[] obj = game;
		obj[3] = 'X';
		System.out.println(game[3][3]);
		*/
		
		//Question 15
		//List<> b = new ArrayList(); //declaring diamonds cannot be empty
		//List<> d = new ArrayList<>(); //declaring diamonds cannot be empty
		//List<> f = new ArrayList<String>(); //declaring diamonds cannot be empty
		List<String> a = new ArrayList();
		a.add("Hello");
		System.out.println(a);
		
		//Question 41
		String[] array = {"Natural History", "Science", "Art"};
		System.out.println(array[0]);
		List<String> museums = new ArrayList<>(Arrays.asList(array));
		System.out.println(museums);
		museums.remove(2); //UnsupportedOperationException
		System.out.println(museums);
		
		//Question 49
		System.out.println(3 == 3);
		System.out.println("bart" == "bart");
		System.out.println(new String("zelda")
				== new String("zelda"));
		
		//Question 53
		final byte season = 2;
		final short summer = 3;
		int fall = 4;
		switch(season) {
			case 1:
			case summer: System.out.print("summer");
			//case fall: System.out.print("fall");
			default:
		
		}

		
		
		
		
		
		
		

	}

}
