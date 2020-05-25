package Replits;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_MethodWithArrayList_RemoveInstances {
	
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
		
		int i = 0;
		while (i < r.size() ) {
			if (r.get(i) == n) {
				r.remove(i);
			} else i++;
		}
	    return r;
	   
	  }
	  
	  public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,2,3};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,1));
	   
	    
	  }//end main

}
