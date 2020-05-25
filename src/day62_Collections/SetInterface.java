package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	
	public static void main(String[] args) {
		
		//List accepts duplicates
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(100, 100, 100));
		System.out.println(list1);
		
		//Set does not accept duplicates
		Set<Integer> st1 = new HashSet<Integer>();
			st1.add(100);
			st1.add(100);
			st1.add(100);
		System.out.println(st1);
		
		//st1.get(1); //Set has no index number
		
		System.out.println("====================");
		
		Set<Integer> hashSet = new HashSet<Integer>();
			hashSet.add(100);
			hashSet.add(10);
			hashSet.add(5);
			hashSet.add(1);
		System.out.println(hashSet); //No order
	
		System.out.println("====================");
		
		
		Set<Integer> st2 = new LinkedHashSet<Integer>();
			st2.add(100);
			st2.add(10);
			st2.add(5);
			st2.add(1);
		System.out.println(st2); //In order of entry
		
		System.out.println("=====================");
		
		//TreeSet: Ascending order
		Set<Integer> set3 = new TreeSet<Integer>();
		set3.add(100);
		set3.add(10);
		set3.add(5);
		set3.add(1);
		System.out.println(set3);
		
		//TreeSet example with String
		Set<String> st3 = new TreeSet<String>();
			st3.add("Z");
			st3.add("Y");
			st3.add("Y");
			st3.add("X");
			st3.add("W");
		System.out.println(st3);
		System.out.println("=====================");
		
		//Task: Remove duplicates from an ArrayList and sort
		List<Integer> list = new ArrayList<>();
			list.addAll(Arrays.asList(7, 10, 6, 9, 10, 8, 6, 9, 7, 6));
		Collections.sort(list);
		System.out.println(list);
		
		Set<Integer> set5 = new TreeSet<Integer>();
//		set5.addAll(list);
		set5.addAll(Arrays.asList(7, 10, 6, 9, 10, 8, 6, 9, 7, 6));
		System.out.println(set5);
		
		System.out.println("======================");
		
		//LinkedHashSet: Removes duplicates (do not sort)
		String str = "ZZZYYYYYXXAAAABBBCCD";
		System.out.println(str);
		String[] arr = str.split("");
		System.out.println(Arrays.toString(arr));
		
		LinkedHashSet<String> holy = new LinkedHashSet<String>(Arrays.asList(arr));
		System.out.println(holy);
		
		String result = holy.toString();
		System.out.println(result);
		
		String finalResult = result.substring(1, result.length()-1);
		System.out.println(finalResult);
		
		String finalFinalResult = finalResult.replace(", ", "");
		System.out.println(finalFinalResult);
		
		//Shorter solution
		String str2 = new LinkedHashSet<String>(Arrays.asList(arr)).toString();
		System.out.println(str2);		
		
	}

}
