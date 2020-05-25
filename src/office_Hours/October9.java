package office_Hours;

import java.util.Arrays;

public class October9 {
	
	public static void main(String[] args) {
		
		int[] numbers = {4, 54, 76, 232, 1035};
		
		//To print 58
		System.out.println(numbers[0] + numbers[1]);
		
		//Printing all values from an array: 3 ways
		int[] ages = new int[3];
		ages[0] = 4;
		ages[1] = 3;
		ages[2] = 2;
		
		//1st way: toString
		System.out.println(Arrays.toString(ages));
		
		//2nd way: for each loop
		for (int age: ages)
			System.out.print(age + " ");
		
		System.out.println();
		
		//Practice
		int[] num = {1,2,3};
		
		//Print out 2, 4, 6
		for (int each: num)
			System.out.print(each*2 + " ");
		
		System.out.println();
		
		//3rd way: for loop
		for (int i = 0; i < num.length; i++)
			System.out.print(num[i]*2 + " ");
		
		System.out.println();
		
		//2 dimensional (2D) array
		int[][] nums = { 
						 {10,20,30},
						 {40,50,60},
						 {70,80}
									};
		
		
		//Print 50
		System.out.println(nums[1][1]);
		
		//Print 70
		System.out.println(nums[2][0]);
		
		//Print 140
		System.out.println(nums[1][2] + nums[2][1]);
		
		//Print entire array: 1st way (toDeepString)
		System.out.println(Arrays.deepToString(nums));
		
		//Print entire array: 2nd way (for each loop)
		for (int[] each: nums) {
			System.out.print(Arrays.toString(each) + " ");
		}
		
		System.out.println();
		
		//Or
		for (int[] numArr: nums) {
			System.out.print("[");
			for (int number: numArr)
				System.out.print(number + " ");
			System.out.print("]");
		}
		
		System.out.println();
		
		//Print entire array: 2nd way (for loop)
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++)
				System.out.print(nums[i][j] + " ");
		}
		
	}

}
