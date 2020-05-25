package day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IterableInterface {
	
/**
Iterable(I): Extended by root interface Collection(I)

	We can apply Iterator(I) to the classes or interfaces 
	that are implementing Iterable(I).
	
	Iterator(I): 	Sub type of Iterable(I)
					1. Allows us to get access to each object 
						of the collection type.
					2. Allows us to remove objects from a collection type
					*The ONLY legit way to remove data from  collections*
					
		iterator(): Iterates the collection and return iterator
			
			hasNext(): Checks if there is an element 
			
			next(): If hasNext() is true, it retrieves the current
			 		iteration from the collection
					
*/
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,1,1,2,2,3,4));
		
		for (int i = 0; i < list.size(); i++) {
			if(i == 1)
				list.remove(i);
		}
		System.out.println(list);
		//Not all 1's are removed!
		//We have to use Iterator
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(Arrays.asList(1,1,1,2,2,3,4));
		
		//How to declare an Iterator
		Iterator<Integer> itr = list2.iterator();
		boolean a = itr.hasNext();
		System.out.println(a);
		System.out.println(itr.next());
		boolean b = itr.hasNext();
		System.out.println(b);
		System.out.println(itr.next());
		boolean c = itr.hasNext();
		System.out.println(c);
		System.out.println(itr.next());
		boolean d = itr.hasNext();
		System.out.println(d);
		System.out.println(itr.next());
		// Finally, will be false
		System.out.println("============================");
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(Arrays.asList(1,1,1,2,2,3,4,1,1));
		
		//Remove all 1's
		Iterator<Integer> itr2 = list3.iterator();
		while(itr2.hasNext()) {
			int num = itr2.next();
			if(num == 1) {
				itr2.remove();
			}
		}
		System.out.println(list3);
		System.out.println("============================");
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(Arrays.asList(10,20));
		
		Iterator<Integer> itr3 = set.iterator();
		
		System.out.println(itr3.hasNext());
		System.out.println(itr3.next());
		
		System.out.println(itr3.hasNext());
		System.out.println(itr3.next());
		
		System.out.println(itr3.hasNext()); //False
//		System.out.println(itr3.next()); //NoSuchElementException
		System.out.println("=============================");
		
		//Remove names starting with E
		String[] name = {"Ersin", "Erhan", "Nadira", "Oghlan"};
		Set<String> names = new LinkedHashSet<String>();
		names.addAll(Arrays.asList(name));
		System.out.println(names);
		Iterator<String> removeE = names.iterator();
		while(removeE.hasNext()) {
			if(removeE.next().startsWith("E"))
				removeE.remove();
		}
		System.out.println(names);
		System.out.println("==============================");
		
		//We can also use for loop
		//for(initialization; condition; iterator)
		List<Integer> myList = new ArrayList<Integer>();
		myList.addAll(Arrays.asList(100, 900, 500, 99, 200, 89, 300, 90));
		System.out.println(myList);
		
		//Remove numbers larger than 100
		for (Iterator<Integer> itr4 = myList.iterator(); itr4.hasNext();) {
			int number = itr4.next();
			if(number > 100)
				itr4.remove();
		}
		System.out.println(myList);
		System.out.println("==============================");
		
		//Remove all Erhans
		String[] student = {"Erhan", "Erhan", "Safwan", "Madina", "Erhan"};
		List<String> studentList = new ArrayList<String>();
		studentList.addAll(Arrays.asList(student));
		System.out.println(studentList);
		
		Iterator<String> itr5 = studentList.iterator();
		while(itr5.hasNext()) {
			if(itr5.next().equals("Erhan"))
				itr5.remove();
		}
		System.out.println(studentList);
	}

}
