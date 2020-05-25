package day64_Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class Quiz17 {

	public static void main(String[] args) {
		
		Integer[] arr = {10, 10, 20};
		
		LinkedList<Integer> list = new LinkedList<>();
		list.addAll(Arrays.asList(arr));
		
		Set<Integer> linkedhashset = new LinkedHashSet<>();
		
		for (int each: list) {
			linkedhashset.add(each);
		}
		
		System.out.println(linkedhashset);
		
		

	}

}
