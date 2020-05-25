package day30_WrapperClass_ArrayList;

public class Replit_Practice {
	
	public static void main(String[] args) {
		
		String email = "info@cybertekschool.com";
		
		String[] email1 = email.split("@");
		System.out.println(email1[0]);
		System.out.println(email1[1]);
		
		int k = 1;
	    int total = 0;
	     
	     do{
	       total += k*k;
	       k++;
	       
	     } while (k <= 50);
	     
	     System.out.println(total);
		
		
	}

}
