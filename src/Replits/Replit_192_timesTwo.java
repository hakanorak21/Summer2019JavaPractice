package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_192_timesTwo {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4));
		timesTwo(nums);
		System.out.println(nums);
		
	}
	//create your method below
	public static void timesTwo(ArrayList<Integer> list){
	  for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)*2);
		}
	}
	
}
