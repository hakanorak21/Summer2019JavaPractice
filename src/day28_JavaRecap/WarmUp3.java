package day28_JavaRecap;

public class WarmUp3 {
	
	// Calculating grades
	public static void main(String[] args) {
		
		CalculateGrades(85);
		
	}
	
	public static void CalculateGrades (int score) {
		
		char grade = (score >= 90 && score <= 100)? 'A': (score >= 80)? 'B':
						(score >= 70)? 'C': (score >= 60)? 'D': (score >= 0)? 'F': 'I';
		if (grade == 'I')
			System.out.println("Invalid score");
		else
			System.out.println(grade);
	}

}
