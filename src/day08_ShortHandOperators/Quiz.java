package day08_ShortHandOperators;

public class Quiz 
{
	public static void main(String[] args) 
	{
		
		// Assessment quiz 2
		
		// Question 1
		int iVar = 100;
		double dVar = 200;
		float fVar = 300;
		// iVar = fVar; compilation error because float > int
		fVar = iVar;
		
		
		
		// Question 15
		int  x =  10;
		int  y =  x++; // y = 11, x = 12
		System.out.println( y++  + "  " +  x++  + "  " + y);
		// 10 11 11
		
	}

}
