package OCA_Exam;

import java.util.Arrays;

public class OCA_Exam_Part1 {
	
	public static void main(String[] args) {
		
//		//Question 1
//		int[][] arr = new int[][] { {1,2}, {3,4} };
//		arr[1] = arr[0];
//		System.out.println(arr[1]); //[I@3764951d 
//		System.out.println(arr[1][0]); //1
		
//		//Question 2
//		int[][] arr2 = new int[2][];
//		double[][] arr3 = new double[][]{ {1,2}, {3,4} };
//		//long[][] arr4 = new long[2][]{ {1,2}, {3,4} }; //Compile error
//		long[][] arr5 = new long[][]{ {1,2}, {3,4} };
//		int[][] arr6 = { {'A', 'B'}, {'C', 'D'} };
//		
//		//Question 3
//		int[][] arr = new int[][] { {1,2,3}, {3,4} };
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//		}
//		
//		//Question 4
//		int ivar = 100;
//		double dvar = 123;
//		float fvar = 200;
//		ivar = fvar;
//		fvar = ivar;
//		dvar = fvar;
//		fvar = dvar;
//		dvar = ivar;
//		ivar = dvar;
//		
//		//Question 5
//		//Varargs
//		//int arr[] = new int[2];
//		arr[0] = 10;
//		arr[1] = 20;
//		System.out.println(arr[0] + " " + arr[1]);
//		
//		//Question 6
//		System.out.println("Result A" + 0 + 1);
//		System.out.println("Result B" + (0) + (1));
//
//		//Question 7
//		System.out.println("5 + 2 = " + 3 + 4);
//		System.out.println("5 + 2 = " + (3 + 4));
//		
//		//Question 8
//		String str = " ";
//		str.trim(); //String is immutable!
//		System.out.println(str.equals("") + " " + str.isEmpty());
//		
//		//Question 9
//		int[][] arr = new int[][] { {1,2}, {3,4} };
//		for(int i=arr.length-1; i>=0; i--) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//		}
//		
//		//Question 10
//		//It can run on any platform that has the JRE
//		
//		//Question 11
//		String[][] arr = { {"A","B","C"}, {"D","E"} };
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//				if(arr[i][j].equals("B")) {
//					break;
//				}
//			}
//		}
//		
//		//Question 12
//		int wd = 0;
//		String[] days = {"sun","mon","wed","sat"};
//		for(int i=0; i<days.length; i++) {
//			switch(days[i]) {
//				case "sat":
//				case "sun": 
//							wd -= 1;
//							break;
//				case "mon": 
//							wd++;
//				case "wed": 
//							wd += 2;
//			}
//		}
//		System.out.println(wd);
//		
//		//Question 13
//		String[][] arr = { {"A","B","C"}, {"D","E"} };
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				if(arr[i][j].equals("B")) {
//					break;
//				}
//				System.out.print(arr[i][j]);
//			}
//		}
//		
//		//Question 14
//		int[] num1 = new int[3]; 
//		int[] num2 = {1,2,3,4,5};
//		num1=num2; 
//		for (int i=0; i<num1.length; i++) {
//			System.out.print(num1[i]); 
//		}
//		System.out.println();
//		
//		//Question 15
//		int[] arr1 = {1,2,3,4,5};
//		for(int e = 0; e < 5; e += 2) {
//			System.out.print(arr1[e]);
//		}
//		
//		//Question 16
//		//Its expression must evaluate to a single value.
//		//byte, short, int, String, Byte, Short, Integer
//
//		//Question 17
//		int x = 100;
//		int a = x++;
//		int b = ++x;
//		int c = x++;
//		int d = (a<b)? (a<c)? a: (b<c)? b: c;
//		
//		//Question 18
//		int[] numbers = {1,2,3,4,5};
//		int max = findMax(numbers);
//		
//		//Question 19
//		int num = 10;
//		add10(num);
//		System.out.println(num);
//
//		//Question 20
//		String ta = "A";
//		ta = ta.concat("B");
//		String tb = "C";
//		ta = ta + tb;
//		ta.replace('C', 'D');
//		ta = ta + tb;
//		System.out.println(ta);
//		
//		//Question 21
//		String str1 = "Java";
//		String[] str2 = {"J","a","v","a"};
//		String str3 = "";
//		
//		for (int i=0; i<str2.length; i++) {
//			str3 += str2[i];
//		}
//		
//		boolean b1 = str1 == str3;
//		boolean b2 = str1.equals(str3);
//		
//		System.out.println(b1+", "+b2);
//		
//		//Question 22
//		int numbers[];
//		numbers[0] = 10;
//		numbers[1] = 20;
//		
//		numbers = new int[4];
//		numbers[2] = 30;
//		numbers[3] = 40;
//		
//		System.out.println(Arrays.toString(numbers));
//
//		//Question 23
//		int numbers[];
//		numbers = new int[2];
//		numbers[0] = 10;
//		numbers[1] = 20;
//		
//		numbers = new int[4];
//		numbers[2] = 30;
//		numbers[3] = 40;
//		
//		System.out.println(Arrays.toString(numbers));
//		
//		//Question 24
//		String str = "Hello World";
//		str.trim(); //String is immutable!
//		int z = str.indexOf(" ");
//		System.out.println(z);
//		
//		//Question 25
//		String str1 = "Java";
//		String str2 = new String("java");
//		
//		if(str1.equalsIgnoreCase(str2)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not Equal");
//		}
//		
//		//Question 26
//		String stuff = "TV";
//		String res = "";
//		
//		if(stuff.equals("TV")) {
//			res="Walter";
//		}else if(stuff.equals("Movie")){
//			res = "White";
//		}else {
//			res = "No result";
//		}
//		
//		res = stuff.equals("TV")? "Walter": stuff.equals("Movie")? "White": "No result";
//		
//		//Question 27
//		String num1 = args[1];
//		String num2 = args[2];
//		String num3 = args[3];
//		
//		System.out.println("number is " + num3);
//		
//		//Question 28
//		String shirts[][] = new String[2][2];
//		shirts[0][0] = "red";
//		shirts[0][1] = "blue";
//		shirts[1][0] = "small";
//		shirts[1][1] = "medium";
//		
//		for(int i=0; i<2;) {
//			for(int j=0; j<2;) {
//				System.out.println(shirts[i][j]);
//				j++;
//			}
//			i++;
//		}
//		
//		//Question 29
//				String str = "Batch 11";
//				int z = str.trim().length();
//				System.out.println(z);
//		
//		//Question 30
//		int[] intArr = {15, 30, 45, 60, 75};
//		intArr[2] = intArr[4];
//		intArr[4] = 90;
//		System.out.println(Arrays.toString(intArr));
//		
//		//Question 31
//		double z = 10;
//		switch(z) {
//			case 10: System.out.println("Monday");
//			case 11: System.out.println("Tuesday");
//			case 12: System.out.println("Wednesday");
//			default: System.out.println("Friday");
//		}
//		
//		//Question 32
//		boolean B = true;
//		switch(B) {
//			case true: System.out.println("Monday");
//			case false: System.out.println("Tuesday");
//			default: System.out.println("Wednesday");
//		}
//		
//		//Question 33
//		String str1 = "Java";
//		String[] str2 = {"J","a","v","a"};
//		String str3 = "";
//		
//		for (int i=0; i<str1.length(); i++) {
//			str3 = str3 + str2[i];
//		}
//		
//		System.out.println(str1 == str3);
//		System.out.println(str1.equals(str3));
//		
		//Question 34
		int[] arr = {10, 20, 30};
		int size = arr.length;
		int idx = 0;
		
		do {
			idx++;
		}while(idx < size-1);
			
		System.out.println(arr[idx]);
//		
//		//Question 35
//		int num1 = 9;
//		if(++num1 < 10) {
//			System.out.println(num1 + " Hello World!");
//		}else {
//			System.out.println(num1 + " Hello Universe!");
//		}
//		
//		//Question 36
//		//byte x = 1;
//		//int x = 1;
//		short x = 1;
//		switch(x){
//			case 1: System.out.println("One");
//					break;
//			case 2: System.out.println("Two");
//					break;
//		}
	}
		
		
	
	//Question 18
	static int findMax(int[] numbers) {
		int max = 0;
		/* code goes here */
		return max;
	}
	
	//Question 19
	static void add10(int num) {
		num = num + 10;
	}

}
