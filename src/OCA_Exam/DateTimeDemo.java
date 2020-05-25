package OCA_Exam;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(1989, Month.AUGUST, 20);
		System.out.println(d1);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalTime t1 = LocalTime.of(12, 35);
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.now(ZoneId.of("Asia/Kuwait"));
		System.out.println(t2);
		
		Instant i = Instant.now();
		System.out.println(i);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

	}

}
