package day04_Variables2;

public class PrimitiveDataTypes2 
{

	/*
	 * Primitives: byte, short, int, long, float, double, boolean, char
	 * 
	 * boolean: takes either True or False boolean expressions
	 * 
	 * char: declared with single quote ''; single character only.
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) 
	{
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3 ;
		
		System.out.println(result); // true
		System.out.println(result2); // false
		System.out.println(result3); // true
		
		char char1 = 'a';
		System.out.println();
		System.out.println(char1);
		char char2 = 'b';
		char char3 = '9';
		char char4 = '#';
		
		char char5 = 67;
		System.out.println(char5); // C because 67 is C in ASCII
		
		char char6 = '{';
		char char7 = 123;
		System.out.println();
		System.out.println(char6);
		System.out.println(char7); // prints { for 123 (from ASCII table)
		System.out.println();
		
		// initializing char to other primitives
		char MyChar1 = 'b';
		int MyInt = MyChar1;
		System.out.print(MyChar1);
		System.out.print(" = ");
		System.out.print(MyInt);
		System.out.println(" in ASCII table.");
		
		byte MyByte = 'b';
		System.out.println(MyByte);
		
		short ShortNum = 'b';
		System.out.println(ShortNum);
		
		long LongNum = MyChar1;
		System.out.println(LongNum);
		
		float FloatNum = MyChar1;
		System.out.println();
		System.out.println(FloatNum);
		
		float FloatNum2 = 'b';
		System.out.println(FloatNum2);
		
		double DoubleNum = MyChar1;
		double DoubleNum2 = 'b';
		System.out.println();
		System.out.println(DoubleNum);
		System.out.println(DoubleNum2);
		
		char myCharValue = 2222;
		System.out.println(myCharValue);
		
		double a = 10L;      //line 3
	
		
		
		
		
		
	}

}
