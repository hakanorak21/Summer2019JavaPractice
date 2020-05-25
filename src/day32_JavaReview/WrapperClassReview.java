package day32_JavaReview;

public class WrapperClassReview {
	
	/**
	 primitive ==> Wrapper class
	 
	 primitives                         Wrapper classes:  java.lang
            byte                                Byte
            short     Auto boxing               Short
            int     ==============>              Integer
            long                                Long
            float       un-boxing               Float
            double  <=============               Double
            boolean                             Boolean
            char                                Character
	 
	 wrapper class vs. primitives:
            1. default values:
                primitives: byte, short, int, long ==> 0
                            float, double ==> 0.0
                            boolean ==> false
                            char ==>space
                
                All wrapper class: null
                
            2. wrapper class only accepts its own primitive values
            
            3. wrapper classes have method, primitives don't
            
            4. wrapper class takes object, primitives takes values
	 
	 Wrapper class methods: Max_values, MIN_values, parse, valueOf
        
          max_value: returns the maximum value of the the data-type
          min_value: return the minimum value of the data type
          parse methods: converts String to primitives
          valueOf methods: converts string to wrapper class
          
     Auto-boxing: assign the primitives to wrapper class
     Unboxing: assign the wrapper class to primitives	
	 */
	
	public static void main(String[] args) {
		
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int min = Byte.MIN_VALUE; //-128
		System.out.println(min);
		
		int minInteger = Integer.MIN_VALUE;
		System.out.println(minInteger);
		
		char c = Character.MAX_VALUE;
		System.out.println(c);
		
		char d = Character.MIN_VALUE;
		System.out.println(" this is:" + d + "my output."); //Nothing!
		
		//Parse method: Converts String to primitives
		//String is not a wrapper class (no corresponding primitive)
		//So, this is not unboxing
		
		short s1 = Short.parseShort("1234");
		System.out.println(s1 + 1);
		
		boolean r1 = Boolean.parseBoolean("TRUE");
		System.out.println(r1);
		
	}

}
