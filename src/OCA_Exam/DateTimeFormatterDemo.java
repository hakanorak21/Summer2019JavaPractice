package OCA_Exam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println(localDate);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM - dd - YY h:mm a");
		System.out.println(dtf.format(localDate));
		
		

	}

}
