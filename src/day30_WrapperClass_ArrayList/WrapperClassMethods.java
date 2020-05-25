package day30_WrapperClass_ArrayList;

public class WrapperClassMethods {
	
	//Useful wrapper class methods:
	//Max_Value, Min_Value, Parse, ValueOf
	
	public static void main(String[] args) {
		
		// Max Value
		int maximum = Integer.MAX_VALUE;
		System.out.println(maximum);
		
		double maximumDouble = Double.MAX_VALUE;
		System.out.println(maximumDouble);
		
		byte maximumByte = Byte.MAX_VALUE;
		System.out.println(maximumByte);
		
		char maximumChar = Character.MAX_VALUE;
		System.out.println(maximumChar);
		
		//Min Value
		int minimum = Integer.MIN_VALUE;
		System.out.println(minimum);
		
		byte minByte = Byte.MIN_VALUE;
		System.out.println(minByte);
		
		//Parse method: Converts String values to primitives
		
		//parseInt("strValue"): converts String to int primitives
		String str = "123";
		Integer num1 = Integer.parseInt(str);
		System.out.println(num1 + 1); // +1 to see if it is number or string
		
		//parseByte("strValue"): String ==> byte
		
		byte byte1 = Byte.parseByte("19");
		System.out.println(byte1+1);
		
		//byte byte2 = Byte.parseByte("197");
		//System.out.println(byte2); //Value out of range
		
		int num3 = Byte.parseByte("19");
		System.out.println(num3+1);
		
		Float num11 = (float)Double.parseDouble("8.5");
		System.out.println(num11);
		
		//parseBoolean("StrValue"): String ==> boolean
		boolean A = Boolean.parseBoolean("CybertekBatch12");
		System.out.println(A);
		
		boolean B = Boolean.parseBoolean("TrUe"); // parseBoolean is not case sensitive
		System.out.println(B);
		
		boolean C = Boolean.parseBoolean("10>9"); // "10>9" != "true"
		System.out.println(C);
		
		Boolean D = Boolean.parseBoolean("TrUe"); // Autoboxing
		System.out.println(D);
		
		//=======================================
		
		int a = 10;
		double b = a; // Implicit casting
		
		// Double c = a; ==> Compile error 
		
		Double c = (double)a;
		
		// valueOf method: String ==> Wrapper class values
		int z = Integer.valueOf("1234"); //Unboxing
		System.out.println(z+1); 
		Integer z1 = Integer.valueOf("1234");// No boxing
		
		Integer z2 = (int)Integer.valueOf("1234");// Autoboxing
		
		boolean result1 = Boolean.valueOf("FALSE"); //Unboxing
		System.out.println(result1); //false
		
		
		
		
		
		
		
		
		
		
	}

}
