package day28_JavaRecap;

public class WarmUp2 {
	
	public static void main(String[] args) {
		
		calculate(10, 2, "*");
	}
	
	public static void calculate(int a, int b, String operator) {
		
		String result = "";
		if (operator.equals("-"))
			result += (a - b);
		else if (operator.equals("+"))
			result += (a + b);
		else if (operator.equals("*"))
			result += (a * b);
		else if (operator.equals("/"))
			result += (a / b);
		else if (operator.equals("%"))
			result += (a % b);
		else
			result += "Invalid operator";
		
		System.out.println(result);	
		
		//Ternary operator
		String result2 = "";
		result2 += (operator.equals("-"))? (a-b) : 
					(operator.equals("+"))? (a+b) :
					(operator.equals("*"))? (a*b) :
					(operator.equals("/"))? (a/b) :
					(operator.equals("%"))? (a%b) :
					"Invalid operator";
		System.out.println(result2);				
		
	}	

}
