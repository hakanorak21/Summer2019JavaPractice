package day35_Constructors;

import java.util.ArrayList;

public class Quiz9 {
	
	public Quiz9(int a) {
		System.out.print("Toyota");
	}
	
	public Quiz9() {
		System.out.println("Default constructor");
	}
	
	
	public static void main(String[] args) {
		
		/**
		//Question 7
		ArrayList<Integer> list = new ArrayList<>();
		
		Integer a = 1;
		
		System.out.println(list.remove(a));
		
		
		//Question 8
		ArrayList<Integer> list = new ArrayList<>();

		int a = 1;

		System.out.println(list.remove(a));
		
		
		//Question 9
		Quiz9 obj = new Quiz9(1);
		System.out.println("Corolla");
		
		
		//Question 2
		ArrayList<Integer> list = new ArrayList<>();
		*/
		
		//Question 5
		ArrayList<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		System.out.println(names); //[Robb, Bran, Rick, Bran]
		
		boolean check = names.remove("Bran");
		System.out.println(check); //true
		System.out.println(names); //[Robb, Rick, Bran]
		
		boolean check2 = names.remove("John");
		System.out.println(check2); //false
		
		
		
		
		
		
	}

}
