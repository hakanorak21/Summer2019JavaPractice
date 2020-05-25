package OCA_Exam;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriodDemo {
	
	public static void main(String[] args) {
		
		LocalDate initialDate = LocalDate.parse("2007-05-10");
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		int days = Period.between(initialDate, finalDate).getDays();
		System.out.println(finalDate);
		System.out.println(days);
		
		Period.of(2019, 12, 22);
		
		
	}

}
