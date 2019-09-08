package day14_Scanner;

public class Ternary {
	
	/*
	if (condition) 		==> (condition)?
	else           		==> :
	else if (condition) ==> :(condition)?
	*/
	
	public static void main(String[] args) {
		
		int num = 0;
		
		if (true)
			num = 100;
		else
			num = 50;
		System.out.println(num);
		
		int n = (true)? 100 : 50;
		System.out.println(num);
		
		String SchoolName = "";
		boolean Batch12 = true;
		if (Batch12)
			SchoolName = "Cybertek";
		else
			SchoolName = "Invalid";
		
		SchoolName = (Batch12) ? "Cybertek" : "Invalid"; 
		System.out.println(SchoolName);
		System.out.println((Batch12) ? "Cybertek" : "Invalid");
		
		double interestRate = 0;
		boolean goodCredit = true;
		
		interestRate = (goodCredit)? 0.5 : 0.9;
		System.out.println(interestRate);
		
		byte grade = 60;
		boolean Passed = (grade >= 60)? true : false;
		System.out.println(Passed);
		
		char FinalGrade = 'E';
		String Group ="";
		
		if (FinalGrade == 'A') 
			Group = "Early bird";
		else if (FinalGrade == 'B')
			Group = "Group 1";
		else if (FinalGrade == 'C')
			Group = "Group 2";
		else if (FinalGrade == 'D')
			Group = "Group 3";
		else
			Group = "Last but not least";
		System.out.println(Group);
		
		Group = (FinalGrade == 'A')? "Early bird" : (FinalGrade == 'B')? 
			"Group 1" : (FinalGrade == 'C')? "Group 2" : 
				(FinalGrade == 'D')? "Group 3" :"Last but not least";
		System.out.println(Group);		
		
		int score = 100;
		char Final =' ';
		
		if (score >= 90 && score <= 100)
			Final = 'A';
		else if (score >= 80 && score < 90)
			Final = 'B';
		else if (score >= 70 && score < 80)
			Final = 'C';
		else if (score >= 60 && score < 70)
			Final = 'D';
		else if (score >= 0 && score < 60)
			Final = 'F';
		else 
			Final = '?';
		System.out.println(Final);
		
		Final = (score >= 90 && score <= 100)? 'A' 
				 :(score >= 80 && score < 90)? 'B' 
				  :(score >= 70 && score < 80)? 'C' 
				   :(score >= 60 && score < 70)? 'D' 
				    :(score >= 0 && score < 60)? 'F' 
				     :'?';
		System.out.println(Final);
		
		int n1 = 100, n2 = 200, n3 = 300;
		
		int max = (n1 > n2 && n1 > n3)? n1
					:(n2 > n1 && n2 > n3)? n2
					  : n3;
		
	}

}
