package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(); // Empty
		System.out.println(list.isEmpty()); // true
		
		// add(): takes an object
		list.add(10); //Autoboxing
		System.out.println(list); // [10]
		
		list.add(20);
		System.out.println(list); // [10, 20]
		
		// add(index, object): inserts the object at index
		list.add(1, 30);
		System.out.println(list); // [10, 30, 20]
		
		//list.add(4, 40); //out of bounds
		list.add(3, 40);
		System.out.println(list); // [10, 30, 20, 40]
		
		// get(index): returns the object at the given index
		Integer A = list.get(0);
		System.out.println(A); // 10
		
		int a = list.get(0); //unboxing
		System.out.println(a); // 10
		
		//list.get(10); //out of bounds
		
		// size(): returns the total number of elements in an ArrayList
		System.out.println(list.size()); // 4
		System.out.println(list.get(list.size()-1)); // Last element: 40
		
		for (int i = 0; i < list.size(); i++) 
			System.out.print(list.get(i) + " "); // 10 30 20 40 
		
		System.out.println();
		
		//Reverse order
		for (int i = list.size() - 1; i >= 0; i--) 
			System.out.print(list.get(i) + " "); // 40 20 30 10
		
		System.out.println();
		
		//clear(): removes all objects from ArrayList
		list.clear();
		System.out.println(list); //[]: Empty ArrayList
		System.out.println(list.isEmpty()); // true
		
		
		//set(index, object): replaces the index with the given object
		ArrayList<String> students = new ArrayList<>();
			students.add("Erhan");
			students.add("Madina");
			students.add("Mehmet");
			students.add("Safwan");
			
		System.out.println(students); // [Erhan, Madina, Mehmet, Safwan]
		
		students.set(0, "Holly");
		System.out.println(students); // [Holly, Madina, Mehmet, Safwan]
		
		//indexOf(object): returns the first matching object's index number
		System.out.println(students.indexOf("Madina")); // 1
		
		//lastIndexOf(object): returns the last matching object's index number
		System.out.println(students.lastIndexOf("Madina")); // Still 1
		
		ArrayList<String> students2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
		System.out.println(students.equals(students2)); // false
		
		students2 = students;
		System.out.println(students.equals(students2)); // true
		
		//contains(object): checks if the given object is contained in the ArrayList
		System.out.println(students); //[Holly, Madina, Mehmet, Safwan]
		System.out.println(students.contains("Muhtar")); // false
		System.out.println(students.contains("Holly")); // true
		
		//remove(index): removes the oject at the given index number
				//Not designed to be used within the loop
		
		ArrayList<Integer> price = new ArrayList<>();
			price.add(1);
			price.add(2);
			price.add(3);
			
			price.remove(1); // removes 2 at index 1 
			System.out.println(price); //[1, 3]
		
		
		//Using remove in loop	
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,2,3,3,4));
		
		for (int i = 0; i < nums.size(); i++)
			if (nums.get(i) == 1)
				nums.remove(i);
		System.out.println(nums); // Did not remove all 1's
		
		// Instead, use removeAll
		nums.removeAll(Arrays.asList(1));
		System.out.println(nums); // Now, all 1's are gone.
		
		//Or we can remove more than one object at a time
		nums.removeAll(Arrays.asList(1,2));
		System.out.println(nums); // Now, 1 and 2 are gone
		
		// addAll(interface): adds multiple objects to the ArrayList
		ArrayList<String> n1 = new ArrayList<>();
		n1.addAll(Arrays.asList("Yasin", "Talha", "Ruslan"));
		
		System.out.println(n1);
		
		//Collections.sort(ArrayList): sorts the ArrayList in ascending order
		Integer[] arr = {1, 5, 2, -9, 99, 100};
		ArrayList<Integer> lists = new ArrayList<>(Arrays.asList(arr));
		System.out.println(lists); //[1, 5, 2, -9, 99, 100]
		
		Collections.sort(lists);
		System.out.println(lists); //[-9, 1, 2, 5, 99, 100]
		
	}

}
