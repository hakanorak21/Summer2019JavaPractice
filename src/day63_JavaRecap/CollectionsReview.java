package day63_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsReview {
	
/**
 * Array: Fixed size 
 * Collection: Dynamic
 * 
 * List(I): has index numbers
 * 			implemented by: ArrayList(C), LinkedList(C), Vector(C)
 * 
 * 			ArrayList: Array based
 * 	
 * 			LinkedList: Doubly linked
 * 						add() & remove() are faster than ArrayList
 * 						get() is slower than ArrayList
 * 
 * 			Vector: Synchronized (Thread safe)
 * 					Slowest of all three List classes
 * 					Only List class that has a child class
 * 
 *  				Stack: 	pop() ==> LIFO
 *  						push() [in addition to add]
 *  
 * Set(I): 	Does not have index numbers
 * 			No duplicates
 * 			Implemented by HashSet(C), LinkedHashSet(C)
 * 
 * 			HashSet: No order
 * 
 * 			LinkedHashSet: 	Ordered
 * 							Doubly linked
 * 
 * 			extended by SortedSet(I): Sorts objects in ascending order
 * 
 * 					implemented by TreeSet(C)
 */
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(Arrays.asList(100, 100, 100));
		System.out.println(list1);
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(100);
		set1.add(100);
		System.out.println(set1);
		
		list1.add(200);
		System.out.println(list1);
		
		List<Integer> list2 = new Vector<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
		list2.add(2); //List classes accept duplicates
		System.out.println(list2);
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.addAll(Arrays.asList(100, 200, 300));
		System.out.println("Stack: " + stack);
		System.out.println("Popped: " + stack.pop());
		System.out.println(stack);
		System.out.println("Pushed: " + stack.push(300));
		System.out.println(stack);
		
		System.out.println("===========================");
		
		int[][] list3 = { {1,2,3} }; //2D array
		
		//List of list ==> Similar to 2D array
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();
		listOfList.add(list4);
		System.out.println(listOfList); // [ [ ] ]
		
		Set<Integer> hashset = new HashSet<Integer>();
		hashset.add(100);
		hashset.add(90);
		hashset.add(80);
		hashset.add(70);
		hashset.add(70); //Compiles but is not added
		System.out.println(hashset); //[80, 100, 70, 90] (not in order of entry)
		
		Set<Integer> linkedhashset = new LinkedHashSet<Integer>();
		linkedhashset.add(100);
		linkedhashset.add(90);
		linkedhashset.add(80);
		linkedhashset.add(70);
		linkedhashset.add(70); //Compiles but is not added
		System.out.println(linkedhashset); //[100, 90, 80, 70] (in order of entry)
		
		List<Integer> list5 = new ArrayList<Integer>(Arrays.asList(1,10,5));
		System.out.println(list5);
		//Sort
		Collections.sort(list5);
		System.out.println(list5);
		// Sort using TreeSet
		SortedSet<Integer> sortedset = new TreeSet<Integer>(list5);
		System.out.println(sortedset);
		
		// No need to define data type
		ArrayList list10 = new ArrayList();
		list10.add("John");
		list10.add(1);
		list10.add('a');
		System.out.println(list10);
		
		Object o = list10.get(1);
		System.out.println(o);
		
		list10.set(1, "Fionna");
		System.out.println(list10);
		
		list10.clear();
		System.out.println(list10);
		System.out.println(list10.size());
		
	}

}
