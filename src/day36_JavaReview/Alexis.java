package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Alexis {
	
	public static void main(String[] args) {
        /*
         * given a list
         * 
         * remove all values > 100
         */
        
        ArrayList<Integer> more = new ArrayList <>();
        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        System.out.println(more);
        more.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        System.out.println(more);
        
        ArrayList<Integer> mo = new ArrayList<>();
        
        for(int each: more)
            if(each<100)
                mo.add(each);
        System.out.println(mo);
        
        more = mo;
        System.out.println(more);
                
        }

}
