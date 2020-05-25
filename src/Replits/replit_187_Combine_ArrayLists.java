package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class replit_187_Combine_ArrayLists {
	
	/**
	Create a static method that:
		is called combineAL
		returns an ArrayList
		takes two parameters: an ArrayList of Strings called wordList1, 
		and an ArrayList of Strings called wordList2

		This method should create a new ArrayList of Strings, 
		add all the words (in order) from wordList1, 
		then add all the words (in order) from wordList2.  
		In other words, it is combining all the elements 
		from the two parameters.
	*/
	
	public static ArrayList<String> combineAL(ArrayList<String> wordList1,
												ArrayList<String> wordList2)
	{
		wordList1.addAll(wordList2);
		return wordList1;
	}
	
	public static void removeAll(ArrayList<String> wordList, String targetWord)
	{
		wordList.removeAll(Arrays.asList(targetWord));
		
		System.out.println("now wordList is " + wordList);
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> words1 = new ArrayList<String>();
		words1.add("bla bla bla");
		
		ArrayList<String> words2 = new ArrayList<String>();
		words2.add("next words");
		
		//combineAL(words1, words2);
		System.out.println(combineAL(words1, words2));
		
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
		removeAll(wordList,"hi");
		
	}
}
