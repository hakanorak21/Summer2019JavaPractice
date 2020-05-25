package OCA_Exam;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class OCA_Exam_Chapter3 {

	public static void main(String[] args) {
		
		//Method chaining
		String result = "AniMaL ".trim().toLowerCase().replaceFirst("a", "A");
		System.out.println(result);
		
		//StringBuilder class
		StringBuilder alpha = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++) 
			alpha.append(current);
		System.out.println(alpha);
		
		//StringBuilder is mutable unlike String
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // sb = "start+middle" 
		StringBuilder same = sb.append("+end"); // "start+middle+end"
		System.out.println(sb);
		System.out.println(same);
		System.out.println(same == sb);
		System.out.println(same.equals(sb));
		
		//Object referencing
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de"); //b and a are referencing to the same object
		b.append("f").append("g");
		System.out.println("b=" + b);
		System.out.println("a=" + a);
		
		//3 ways to create a StringBuilder
		StringBuilder sb1 = new StringBuilder(); 
		StringBuilder sb2 = new StringBuilder("animal"); 
		StringBuilder sb3 = new StringBuilder(10);
		
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		System.out.println(sb3.capacity());
		
		//Methods: charAt(), indexOf(), length(), and substring()
		StringBuilder sb4 = new StringBuilder("animals");
		String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
		System.out.println(sb4);
		System.out.println(sub);
		
		//String equality
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y); // true
		String z = " Hello World".trim();
		System.out.println(x == z); // false
		
		Object a1 = new Object();
		System.out.println(a1.equals(sb4));
		System.out.println(a1.toString());
		
		//Creating an array of primitives
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[] {42, 55, 99}; //Doable but redundant
		int[] numbers3 = {42, 55, 99};
		
		//Location of brackets and space
		int[] numAnimals; 
		int [] numAnimals2; 
		int numAnimals3[]; 
		int numAnimals4 [];
		
		//Creating an Array with Reference Variables
		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true 
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
		System.out.println(alias == bugs);
		String [] bugs2 = { "cricket", "beetle", "ladybug" };
		System.out.println(bugs == bugs2);
		System.out.println(bugs[0].equals(bugs2[0]));
		System.out.println(Arrays.toString(bugs));
		
		//Sorting arrays
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		String sortedArray = Arrays.toString(numbers);
		System.out.println(sortedArray);
		
		//Sorting String array
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " ");
		System.out.println();
		
		//Searching arrays
		int[] numbers4 = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbers4, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers4, 4)); // 1
		
		//Searching unsorted arrays
		int[] numbers5 = new int[] {3,2,1};
		System.out.println(Arrays.binarySearch(numbers5, 2));
		System.out.println(Arrays.binarySearch(numbers5, 3));
		
		//Dates and times now
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		//Creating date
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		System.out.println(date2);
		
		//Creating time
		LocalTime time3 = LocalTime.of(6, 15);
		System.out.println(time3);
		
		//Creating date and time
		LocalDateTime dateTime1 = LocalDateTime.of(2015, 1, 20, 6, 15);
		System.out.println(dateTime1);
		
		LocalDateTime dt2 = LocalDateTime.of(date2, time3);
		System.out.println(dt2);
		
		//Old way
		Date jan = new Date(2015, Calendar.JANUARY, 1);
		System.out.println(jan);
		//No object needed with LocalDate, LocalTime, or LocalDateTime
		//All static methods
		
		//Period
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		Period period = Period.ofMonths(1);
		System.out.println(date.plus(period));
		System.out.println(dateTime.plus(period));
		//System.out.println(time.plus(period)); //UnsupportedTemporalTypeException
		//Period can only be used with date.
		//Time has Duration similar to Period.
		
		//Formatting Dates and Times
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time4 = LocalTime.of(11, 12, 34);
		
		System.out.println(date3.getDayOfWeek());
		System.out.println(date3.getMonth());
		System.out.println(date3.getYear());
		System.out.println(date3.getDayOfYear());
		
		LocalDateTime dateTime2 = LocalDateTime.of(date3, time4);
		System.out.println(dateTime2);
		System.out.println(date3.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time4.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		//Predefined formats
		LocalDate date5 = LocalDate.of(2020, Month.JANUARY, 20); 
		LocalTime time5 = LocalTime.of(11, 12, 34); 
		LocalDateTime dateTime5 = LocalDateTime.of(date5, time5);
		System.out.println(dateTime5);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime5));
		System.out.println(mediumF.format(dateTime5));
		
		//Creating your own format
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime5.format(f));
		
		//Question 10
		String ab = "";
		ab += 2;
		ab += 'c';
		ab += false;
		System.out.println(ab);
		
		//Question 15
		Object[][][] cubbies = new Object[3][0][5];
		System.out.println(Arrays.toString(cubbies));
		String beans[] = new String[6];
		int[][] types = new int[3][];
		
		//Question 23
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		System.out.println(list);
		System.out.println(list.toString()); //same result
		Collections.sort(list);
		System.out.println(list);
		Integer array[] = list.toArray(new Integer[10]);
		System.out.println(array[0]);
		System.out.println(array[9]); //null
		//System.out.println(array[10]); //ArrayIndexOutOfBoundsException 
		
		//Question 26
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5")); //Autoboxing
		ages.add(Integer.valueOf("6"));
		ages.add(7); //Autoboxing
		ages.add(null); //compiles! 
		System.out.println(ages);
//		for (int age : ages) //NullPointerException due to null
//			System.out.print(age);
		
		//Question 29
		LocalDate date29 = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date29.plusDays(2); 
		//date29.plusHours(3); //No time in LocalDate
		System.out.println(date29.getYear() + " " + date29.getMonth() + " " + date.getDayOfMonth());
		
		//Question 32
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f32 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f32));
		
		
		
		
		
		
	}

}
