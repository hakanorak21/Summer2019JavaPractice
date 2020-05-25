package OCA_Exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import java_Book_Chapter8.Student;

public class OCA_Exam_Part4 {
	
	static double area;
	
	public static void main(String[] args) {
		
		
		//Question 5
		Student[] students = new Student[3];
		System.out.println(students.toString());
		
		students[1] = new Student("Richard");
		students[2] = new Student("Donald");
		System.out.println(students[0].name);
		
		/*
		//Question 12
		double discount = 0;
		//int qty = Integer.parseInt(args[0]);
		int qty = 75;
		discount = (qty >= 90)? 0.5: (qty > 80)? 0.2: 0;
		System.out.println(discount);
		
		
		//Question 19
		try {
			int num = 10;
			int div = 0;
			int ans = num / div;	
		}catch(ArithmeticException e) {
			ans = 0; // ans is local variable in try block
		}catch() { //Needs Exception type
			System.out.println("Invalid Calculation");
		}
		
		System.out.println("Answer = " + ans); //ans is not defined
		
		
		//Question 31
		ArrayList<String> myList = new ArrayList<>();
		String[] myArray;
		
		try {
			while(true) {
				myList.add("My String"); //OutOfMemoryError: Java heap space
			}
		}catch(RuntimeException e) {
			System.out.println("Caught a RuntimeException");
		}catch(Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
		
		
		//Question 34
		StringBuilder sb = new StringBuilder("Fistuk");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.charAt(5));
		System.out.println(sb.append(" Simay Abla"));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(0, sb.length()));
		System.out.println(sb.length());
		
		
		//Question 35
		StringBuilder sb = new StringBuilder(5);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		String s = "";
		System.out.println(s.length());
		
		if(sb.equals(s))
			System.out.println("Match 1");
		else if(sb.toString().equals(s.toString()))
			System.out.println("Match 2");
		else
			System.out.println("No match");
		
		
		//Question 37
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		LocalDateTime dt1 = dt.plusDays(30);
		LocalDateTime dt2 = dt1.plusMonths(1);

		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		System.out.println(dt1.format(DateTimeFormatter.ISO_DATE));
		System.out.println(dt2.format(DateTimeFormatter.ISO_DATE));
		
		
		//Question 39
		LocalDate date = LocalDate.of(2012, 1, 32); //DateTimeException
		System.out.println(date);
		
		
		//Question40
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		//UnsupportedTemporalTypeException
		System.out.println(date);
		*/
		
	}

}

/*
//Question 1
class Vehicle{
	String type = "4W";
	int maxSpeed = 100;
	
	Vehicle(String type, int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

class Car extends Vehicle{
	String trans;
	
	Car(String trans){ //Implicit super constructor Vehicle() is undefined. 
						//Must explicitly invoke another constructor
		this.trans = trans;
	}
}


//Question 4
abstract class Toy{
	int price;
	public void printToy(); //Needs a body
}


//Question 5
class Student{
	String name;
	
	public Student(String name) {
		this.name = name;
	}
}

//Question 17
class Triangle{
	
	static double area;
	int b = 2, h = 3;
	
	public static void main(String[] args) {
		
		double p, b, h;
		System.out.println(area);
		
		if(area == 0) { // 0.0 != 0
			
			b = 3;
			h = 4;
			p = 0.5;	
			
		}
		
		area = p * b * h; //compile error because p, b, and h 
						  //have not been initialized yet.
		
	}
}


//Question 20
class A{
	public void a() { }
	int a;
}

class B{
	private int dostuff() {
		private int x = 100; //Compilation problem with private access-modifier. Why??
		return x++;
	}
}


//Question 23
class Person1{
	
	String name;
	int age;
	
	public Person1(String n, int a) {
		name = n;
		age=a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}

class Test{
	
	public static void checkAge(List<Person1> list, Predicate<Person1> predicate) {
		for(Person1 p: list) {
			if(predicate.test(p))
				System.out.println(p.name + " ");
		}
	}
	
	public static void main(String[] args) {
		Person1[] people = {new Person1("Hank", 45),
							new Person1("Charlie", 40),
							new Person1("Smith", 38)};
		List<Person1> list = Arrays.asList(people);
		checkAge(list, p -> p.getAge() > 40);
	}
}


//Question 36
interface Exportable{
	void export(); //assumed public asbtract
}

class Tool implements Exportable{
	protected void export() { //Cannot reduce the visibility of the inherited method from Exportable
		
	}
}
*/






