package day10_ifStatement;

public class Test 
{
	public static void main(String[] args) 
	{
		int num1 =300, num2=200, num3 =300;
        
        if( num1 > num2 && num1 > num3) {
            System.out.println(num1+" is the bigger number");
        }
        
        else if( num2 > num1 && num2 > num3){
            System.out.println(num2+" is bigger number");
        }
        
        else if(num3 > num2 && num3 >num1) {
            System.out.println(num3+" is the bigger number");
        }
        
        else if (num3 == num2 && num3 > num1) {
            System.out.println(num3+" and "+num2+" are the bigger number");
        }
    
        else if(num3==num1 && num3 > num2) {
            System.out.println(num3+" and "+num1+" are the bigger number");
        }
        else if(num2 == num1 && num2 > num3) {
            System.out.println(num2+" and "+num1+" are the bigger number");
        }
        else {
            System.out.println("all of them are equal");
        }
		
	}

}
