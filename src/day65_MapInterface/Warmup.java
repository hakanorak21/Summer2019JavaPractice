package day65_MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Write a program that removes all even numbers
//from a List Interface
public class Warmup {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3,4,5));
		//for(initialization; condition; iterator)
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next() % 2 == 0)
				itr.remove();
		}

//		// Using for loop instead of while loop
//		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
//			//No need for iterator: will turn false itself eventually
//			//int a = itr.next();
//			if(itr.next() % 2 == 0)
//				itr.remove();
//		}
		System.out.println(list);
		
		//hasNext() practice
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(Arrays.asList(1,2));
		
		Iterator<Integer> itr2 = list2.iterator();
		System.out.println(itr2.hasNext()); // true
		System.out.println(itr2.next()); // 1
		
		System.out.println(itr2.hasNext()); // true
		System.out.println(itr2.next()); // 2
		
		System.out.println(itr2.hasNext()); // false
		//No more iteration!
//		System.out.println(itr2.next()); //NoSuchElementException
//		System.out.println(itr2.next());
		
		//Now, using while loop
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(Arrays.asList(1,2,3,4,5));
		Iterator<Integer> itr3 = list3.iterator();
		
		while(itr3.hasNext()) {
			if(itr3.next() %2 == 0)
				itr3.remove();
		}
		System.out.println(list3);
		
		// Task: Remove Dorian and Deyana from students list
		String[] students = {"Katy", "Dorian", "Dorian", "Dorian" , "Deyana", "Deyana","Salim", "Dorian","Samia", "Dai\'quan"};
        
	    List<String> namelist = new ArrayList<String>();
	        namelist.addAll(Arrays.asList(students));
	        
	    Iterator<String> studentIt = namelist.iterator();
	    for(  ; studentIt.hasNext(); ) {      //it can be also while loop with condition
	    	String name = studentIt.next();
	    	if(name.equals("Dorian") || name.equals("Deyana")) {
	    		studentIt.remove();
	    	}
	    }
	    System.out.println(namelist);
		
	}

}
