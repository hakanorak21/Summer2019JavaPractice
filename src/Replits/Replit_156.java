package Replits;

public class Replit_156 {
	
	public static void main(String[] args) {
		
		String[] some_array = {"a","foo","bar","foo","bla"};
		String some_string = "foo";
		int count = count_appearance(some_array, some_string);
		System.out.println(count);
		
	}
	
	public static int  count_appearance(String[] arr,String t)
	  {
		int count = 0;
		for (String each: arr) {
			if (each.equals(t)) 
				count++;
		}
		
		return count;
	   
	  } //end  count_appearance
	  
}
