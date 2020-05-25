package office_Hours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionsReview {
	
/**
 * Main categories: List, Queue, and Set
 * 
 * List classes:
 * ArrayList: Array based, ordered
 * LinkedList: Doubly linked, Slower than ArrayList
 * Vector: Thread safe but slow
 *  
 * Set: Collection of unique values, not ordered, no duplicates
 * SortedSet: Ascending order
 */
	public static void main(String[] args) {
		
		//List<String> list = new List<String>();
		//Compile error: List is interface!
		
		//Polymorphism: Reference type parent, object child
		List<String> cars = new ArrayList<String>();
		String[] carList = {"BMW", "Mercedes", "Ford"};
		cars.add("Toyota");
		cars.add("Honda");
		
		System.out.println(cars.get(0)); //Prints one element
		
		//Printing all
		System.out.println(cars); //calls toString()
		
		//Printing all by loop
		for (String car: cars) {
			System.out.print(car + " ");
		}
		System.out.println();
		
		System.out.println(cars.remove(1));
		
		System.out.println(cars);
		
		cars.addAll(Arrays.asList(carList));
		System.out.println(cars);
		//Printing in reverse order
		for (int i = cars.size()-1; i >= 0; i--)
			System.out.print(cars.get(i) + " ");
		System.out.println();
		
		//ArrayList<Integer> price = new ArrayList<Integer>();
		
		//Iterator practice
		Iterator itr = cars.iterator();
		System.out.println("Are there any cars? " + itr.hasNext());
		while (itr.hasNext() == true)
			System.out.print(itr.next() + " ");
		System.out.println();
		
		System.out.println("End of ArrayList practice");
		System.out.println("=========================");
		
		//LinkedList
		List<String> languages = new LinkedList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.add("Ruby");
		System.out.println(languages);
		//LinkedList has all methods as ArrayList
		//because both implements List
		System.out.println("=========================");
		
		//Vector
		List<String> books = new Vector<String>();
		
		//Set
		System.out.println("Set example using HashSet");
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		System.out.println(numbers);
		System.out.println("Duplicates are being removed");
		System.out.println();
		
		Iterator itrNum = numbers.iterator();
		while(itrNum.hasNext())
			System.out.print(itrNum.next() + " ");
			
	}

}
