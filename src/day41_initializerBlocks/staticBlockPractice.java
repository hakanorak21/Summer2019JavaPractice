package day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {
	
	public static String name;
	public static int[] arr;
	public static ArrayList<String> list = new ArrayList<>();
	public static ArrayList<String> students = new ArrayList<>();
	public static String[] online = {"Arzigul", "Me", "Spike", "Savas", "Bahadir"};
	public static String[] inClass = {"Daryna", "Nadire", "Olga", "Mizgin"};
	public static double a;
	public int grade;
	
	
	static {
		name = "Erhan";
		arr = new int[3];
		arr[1] = 2;
		list.add("Break");
		
		students.addAll(Arrays.asList(online));
		
		a = 100;
	}
	
	
	static {
		name = "Suna";
		arr = new int[5];
		arr[0] = 1;
		arr[2] = 3;
		list.add("Coffee");
		list.add("Tea");
		
		students.addAll(Arrays.asList(inClass));
		a = 200;
		
	}
	
	public staticBlockPractice() {
		name = "Mehmet";
		grade = 100;
	}

	
	public static void main(String[] args) {
		
		System.out.println(name); //class static name (because we are in the class)
		staticBlockPractice obj = new staticBlockPractice();
		System.out.println(name); // object name (in the Constructor)
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(list);
		
		System.out.println(students);
		
		System.out.println(a);
		
		System.out.println(obj.grade); 	// Instance variable can also be called
										// through object
										// Can be assigned in the constructor
		
		
	}

}
