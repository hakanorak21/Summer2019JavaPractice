package day09_Review;

public class Warmup 
{
	public static void main(String[] args) 
	{
		// Task on Page 3
		int a1, a2;
		a1 = 1;
		a2 = -10;
		boolean isGreater;
		isGreater = a1 > a2;
		System.out.println("The first number is greater than the second number - " + isGreater );
		
		// Task 1 on Page 10
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
		// 						True 			  || 		True
		//										 True
		System.out.println(comp);
		
		// Task 2 on Page 10
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shinny";
		Degree = 70;
		boolean comp2 = (!(OutsideWeather == "Rainy" || Degree == 70));
		System.out.println(comp2);
		
		// Task 1 on Page 11
		int b = 2; // 1
		boolean res = ++b == 2 || --b == 2 && --b == 2;
		// 		res = 	false  || 	true   && 	false
		//		res = 	false  || 		  false
		// 		res = false
		System.out.println(res);
		
		// Task 2 on Page 11
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) || (z == false);
		// x = true || false
		// x = true
		System.out.println(z);
				
	}

}
