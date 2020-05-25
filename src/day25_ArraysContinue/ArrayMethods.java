package day25_ArraysContinue;

import java.util.Arrays;

public class ArrayMethods {
	
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
		
		int[] array = {1, 2, 3};
		System.out.println(array); // hash code "[I@3764951d"
		
		/**
		// To print entire array, we convert array to String
		
		Arrays.toString(variableName): used for converting single-diemnsional
		arrays to string
		
		Arrays class: Utilities of all the arrays
						Arrays classes is in "hava.util" package
		*/
		
		Arrays.toString(array);
		String str = Arrays.toString(array);
		System.out.println(str);
		
		String [] names = {"Elvira", "Bibish", "Tural", "Daulet", "Hakan"};
		System.out.println(names[0]);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.deepToString(names));
		
		/**
		 Arrays.sort(variableName): Sorts the values of array in ascending
		 order (from smallest to largest)
		 */
		
		int[] numbers = {9, 8, 100, 300, 4, 5, 6};
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		String[] nameLists = {"Alma", "Enes", "Myra", "Smith", "Sarah", "Lexi"};
		Arrays.sort(nameLists);
		System.out.println(Arrays.toString(nameLists));
		
		int[] num1 = {2000, 90, 89, 78, 65, 5555, 444, -5};
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		System.out.println("Minimum number: " + num1[0]);
		System.out.println("Maximum number: " + num1[num1.length-1]);
		System.out.println("Second minimum number: " + num1[1]);
		System.out.println("Second maximum number: " + num1[num1.length-2]);
		
		// Write a program to sort an array in descending order
		int[] num2 = new int[num1.length];
		for (int i = 1; i <= num1.length; i++){
			num2[i-1] = num1[num1.length -i];
		}
		System.out.println();
		
		int[] num3 = new int[num1.length];
		for (int i = num1.length - 1; i >= 0; i--){
			//System.out.print(num1[i] + " ");
			//num3[] = num1[i];
		}
		System.out.println(Arrays.toString(num2));
		
		
		int [] nums = {1, 5, 2, 7, 8, 3, 9, 10, 25};
        Arrays.sort(nums);
        for (int a = nums.length -1; a >= 0; a--) {
            System.out.print(nums[a] + ", ");
        }
        System.out.println();
        
        int[] myNumbers = {99, 10, 200, 300, 40, 50, 5000};
        Arrays.sort(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
		
        System.out.print("[");
        for (int i = myNumbers.length - 1; i > 0; i--) {
        	System.out.print(myNumbers[i] + ", ");
        }
        System.out.print(myNumbers[0] + "]");
        System.out.println();
        
        
        Arrays.sort(myNumbers);
        int[] newArray = new int[myNumbers.length];
        
        for (int i = newArray.length-1; i >= 0; i--) {
        	newArray[myNumbers.length-1-i] = myNumbers[i];
        }
        
        System.out.println(Arrays.toString(myNumbers));
        System.out.println();
        System.out.println(Arrays.toString(newArray));
		
	}

}
