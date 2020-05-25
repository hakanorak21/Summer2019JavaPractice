package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	
	/**
	 Remaining methods of ArrayList:
	 	indexOf(): returns the index number of the object in ArrayList
	 	lastIndexOf(): same logic
	 	
	 	Arrays.asList(Object Array): used for converting object arrays 
	 	to List interface 
	 		We will learn List in the future.
	 		
	 	addAll(Interface): used for storing multiple objects to ArrayList
	 	 					asList is an interface
	 	 					
	 	Sorting an array:
	 		Arrays.sort(ArrayName)
	 		*Arrays class is in "java.util"
	 	
	 	Sorting the ArrayList
	 	 	Collections.sort(ArrayListName)
	 	 	*Collections class is also in "java.util"
	 	 
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1, 2);
		System.out.println(list); //[1, 2]
		
		list.add(Integer.valueOf("33"));
		System.out.println(list); //[1, 2, 33]
		
		list.add(Integer.parseInt("100"));
		System.out.println(list); //[1, 2, 33, 100]
		
		//indexOf(object): returns the index number of the given object
		int a = list.indexOf(100);
		System.out.println(a);
		
		int b = list.indexOf(11); //11 doesn't exist in ArrayList
		System.out.println(b); // ==> -1
		
		//lastIndexOf ==> Returns an int
		System.out.println(list); //[1, 2, 33, 100]
		list.add(33); //[1, 2, 33, 100, 33] 
		System.out.println(list.indexOf(33)); // 2
		System.out.println(list.lastIndexOf(33)); // 4
		
		//asList
		Integer[] arr = {1,2,3,4,5};
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
		// Object Array ==> ArrayList
		
		System.out.println(list2);
		
		String[] arr2 = {"Java", "Python", "C#", "C++"};
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr2));
		System.out.println(list3); // ArrayList
		System.out.println(Arrays.toString(arr2)); //Array
		
		System.out.println(list3.isEmpty()); //false
		
		list3.add("Muhtar");
		System.out.println(list3);
		
		int[] arr3 = {1,2,3,4,5};
		//ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr3));
				//Only the object arrays can be converted
		
		//addAll(Interface):
		ArrayList<String> names = new ArrayList<>();
		names.addAll(Arrays.asList("Almaz", "Ibrohim", "Tabi"));
		System.out.println(names);
		
		String[] allNames = {"Ersin", "Firuz", "Basak", "Zehra", "Oghlan"};
		names.addAll(Arrays.asList(allNames));
		System.out.println(names);
		
		//removeAll(Interface)
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,4));
		System.out.println(numbers);
		
		numbers.removeAll(Arrays.asList(1,2));
		System.out.println(numbers);
		
		//remove method is not designed for loops
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.addAll( Arrays.asList(1,1,1,2,2,3,3,4,2,1) );
		System.out.println(list4);
		
		for (int i = 0; i < list4.size(); i++) {
			if (list4.get(i) == 1)
				list4.remove(i);
		}
		System.out.println(list4);
		
		//ArrayList Sorting
		Integer[] array = {1000, 900, 800, 765, 123, 542};
		
		ArrayList<Integer> price = new ArrayList<>();
		price.addAll(Arrays.asList(array));
		System.out.println(price); //[1000, 900, 800, 765, 123, 542]
		
		Collections.sort(price);
		System.out.println(price); //[123, 542, 765, 800, 900, 1000]
				
	}

}
