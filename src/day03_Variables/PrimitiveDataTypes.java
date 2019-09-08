package day03_Variables;

public class PrimitiveDataTypes {
	
	/*
	 byte: 1 byte we can assign whole numbers in the range of -128 and 127 
	 
	 short: 2 bytes
	 
	 int: 4 bytes
	 
	 long: 8 bytes (can be distinguished with an L or l following the number)
	  
	 */

	public static void main(String[] args) {
		
		byte length = 3;
		System.out.print("Length = ");
		System.out.println(length);
		
		byte width = 4;
		System.out.print("Width = ");
		System.out.println(width);
		
		System.out.print("Area = ");
		System.out.println(width*length);
		
		byte myNum1 = -128;
		short myNum2 = -32768;
		
		int num5 = 1_000_000_00; // Helpful in accounting
		
		byte byteNumber = 10;
		short shortNumber = byteNumber;
		
		float num20 = 10.5f;
		
		double doubleNumber = 10.5;
		
		byte bNum = 10;
		short sNum = 20;
		int iNum = 30;
		long lNum = 40;
		
		float fNum = bNum;
		float fNum2 = sNum;
		float fNum3 = sNum;
		float fNum4 = lNum;
		
		System.out.println(fNum);
		
	}
}
