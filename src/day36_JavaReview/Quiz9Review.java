package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz9Review {
	
	public static void main(String[] args) {
		
		//Question 3 & 4
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3));
		//				index:    0 1 2
		
		Integer a = 1; //Or int a = 1 ==> [1, 3]
		list.remove(a);
		System.out.println(list); //[2, 3]
		
		//Question 5
		String[] arr = {"Rob", "Bran", "Rick", "Bran"};
		ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));
		System.out.println(names);
		
		if (names.remove("Bran")) //[Rob, Rick, Bran] and true
			names.remove("John"); // false
		
		System.out.println(names); //[Rob, Rick, Bran]
		
	}

}
