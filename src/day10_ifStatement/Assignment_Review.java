package day10_ifStatement;

public class Assignment_Review 
{
	public static void main(String[] args) 
	{
		
	//Task01
	int num1 = 100;
	int num2 = 100;
	int max = 0;
	
	if (num1 > num2) {
		max = num1;
	}
	
	if (num2 > num1) {
		max = num2;
	}
	
	if (num1 == num2) {
		max = num2;
		System.out.println("Both numbers are equal.");
	}
	
	System.out.println("Maximum number is:" + max);
	System.out.println("Whic one is bigger? " + num1 + " or " + 
	num2 + "? Answer: " + max);
	
	//Task02. 12:24:33 PM
	int hours = 05;
	int minutes = 24;
	int seconds = 33;
	String amOrPm = "PM";
	
	if (hours > 23) {
		System.out.println("Hour should be less than 24.");
	}
	else 
	System.out.println(hours + ":" + minutes + ":" + seconds + " " + amOrPm);
	
	//Task03
	int n1=1000, n2=900, n3=500000;
	int maximum = 0;
	if (n1 > n2 && n1 > n3) {
		maximum = n1;
	}
	
	if (n2 > n1 && n2 > n3) {
		maximum = n2;
	}
	
	if (n3 > n1 && n3 > n2) {
		maximum = n3;
	}
	
	System.out.println("The biggest number among " + n1 + ", " 
	+ n2 + ", and " + n3 + " is " + maximum);
	
	double B;
	if (true) {
		B = 10;
	}
	System.out.println(B);
	
	// Task04
	int statusCode = 404;
	String finalResult = "Invalid Status Code";
	
	if (statusCode == 200)
		finalResult = "OK";
	
	if (statusCode == 201)
		finalResult = "Created";
	
	if (statusCode == 404)
		finalResult = "Not found";
	
	System.out.println("Status code " + statusCode + " is " + finalResult);
	
	// Task 05. Positive, negative, or zero
	int number = 0;
	String sign = "zero";
	
	if (number > 0)
		sign = "positive";
	if (number < 0)
		sign = "negative";
	
	System.out.println(number + " is " + sign);
	
			
	
	}

}
