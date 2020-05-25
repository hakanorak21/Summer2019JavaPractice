package day43_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlock {
	
	static String[] arr = new String[3];
	static ArrayList<String> list = new ArrayList<>();
	//list.addAll(Arrays.asList(arr));
	double salary;
	
	static {
		System.out.println("static block");
		arr[2] = "Holly";
		arr[0] = "Seyfo";
		arr[1] = "Ruslan";
		
		list.addAll(Arrays.asList(arr));
		
		//salary = 130000; //static only accepts static
		staticBlock obj1 = new staticBlock();
		obj1.salary = 130000;
		System.out.println(obj1.salary);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		staticBlock obj1 = new staticBlock();
		System.out.println(obj1.salary); //instance variable not assigned yet
		
	}

}
