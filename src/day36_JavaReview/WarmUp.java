package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
	
	/**
	1. write a return method that can remove the duplicated objects 
	from an Integer arraylist
    
    2. write a return method that can remove the duplicated objects 
    from a String arraylist
    
    3. write a return method that can remove the duplicated objects 
    from a Character arraylist
    
    4. write a return method that can remove the duplicated objects 
    from a Double arraylist
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,3));
		list = RemoveDuplicates(list);
		System.out.println(list);
		
		String[] names = {"Sherinay", "Seyfo", "Denis", "Nurzat", "Seyfo"};
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(names));
		System.out.println(list2);
		
		list2 = RemoveDuplicates2(list2);
		System.out.println(list2);
		
		
	}
	
	//Task 1
	public static ArrayList<Integer> RemoveDuplicates(ArrayList<Integer> list){
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(Integer each: list) {
			if(!result.contains(each))
				result.add(each);
		}
		
		/**
		//With regular for loop
		for (int i = 0; i < list.size(); i++) {
			if(!result.contains(list.get(i)))
				result.add(list.get(i));
		}
		*/
		
		return result;
	}
	
	//Task 2
	public static ArrayList<String> RemoveDuplicates2(ArrayList<String> list){

		ArrayList<String> result = new ArrayList<>();

		for(String each: list) {
			if(!result.contains(each))
				result.add(each);
		}

		return result;
	}

	//Task 3
	public static ArrayList<Character> RemoveDuplicates3(ArrayList<Character> list){

		ArrayList<Character> result = new ArrayList<>();

		for(Character each: list) {
			if(!result.contains(each))
				result.add(each);
		}

		return result;
	}
	
	//Task 4
	public static ArrayList<Double> RemoveDuplicates4(ArrayList<Double> list){

		ArrayList<Double> result = new ArrayList<>();

		for(Double each: list) {
			if(!result.contains(each))
				result.add(each);
		}

		return result;
	}

}
