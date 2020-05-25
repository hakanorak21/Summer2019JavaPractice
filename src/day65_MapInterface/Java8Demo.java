package day65_MapInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8Demo {
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//Printing using for loop
		for(int i = 0; i < 6; i++) {
			System.out.print(values.get(i) + " ");
		}
		System.out.println();
		
		//Printing using iterator
		Iterator<Integer> itr = values.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		//Printing using enhanced for loop
		for(int i: values) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		//These are all external iterations
		//What about internal iterations?
		
		//Internal iteration using lambda expression
		values.forEach(i -> System.out.print(i+" "));
		
	}

}
