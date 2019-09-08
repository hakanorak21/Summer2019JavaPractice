package day06_ArithmeticOperators;

public class PrimitiveCasting 
{
	public static void main(String[] args) 
	{
		// Explicit casting
		int a = 10;
		byte b = (byte)a;
		
		double c = 10.5;
		float d = (int)c;
		int e = (int)c;
		
		long f = 300L;
		int g = (int)f;
		
		// Implicit casting
		byte h = 100;
		int i = h;
		int j = (int)h;
		
		short k = 100;
		long l = k;
		
		double m = 100.8765;
		byte n = (byte)m;
		float o = (float)m;
		
		float p = 500.67F;
		int r = (int)p;
		
		boolean result;
		result = 2 > 1;
		
		System.out.println(result);
		
	}

}
