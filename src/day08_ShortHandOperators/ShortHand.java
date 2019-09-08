package day08_ShortHandOperators;

public class ShortHand 
{
	/*
	 x += y is shorthand for x = x + y
	 */
	
	public static void main(String[] args) 
	{
		int a = 9;
		a += 3; // a = a + 3;
		System.out.println(a); // 12
		
		int b = a += 5; // a = 17
		System.out.println(b); // 17
		
		int c = a += b; // c = 17 + 17 = 34
		System.out.println(c);
		
		int d = a += c;
		System.out.println(d);
		
		int e = (d += b) * 2;
		System.out.println(e);
		// e = 170, d = 85, c = 34, b =17, a = 68
		
		int f = b += d * 2;
		System.out.println(f);
		
		int g = 101;
		int h = g -= 1;
		System.out.println(h);
		
		int i = g += h + 5;
		System.out.println(i);
		
		int j = h += g % i;
		System.out.println(j);
		
		int k = j -= h * 2 % 5;
		System.out.println(k);
		
		int A = 100;
		A *= 200;
		System.out.println(A);
		
		int B = 100;
		B *= 100  / 10;
		
		h=100; 
		g=100;      
		c = h += g + 5;    
		// I understand that c=205; but why h=205?  
		// I thought it has to be 200
		// c = h
		
	}

}
