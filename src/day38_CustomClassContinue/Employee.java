package day38_CustomClassContinue;

public class Employee {
	
	String Name;
	String ID;
	int age;
	int SSN;
	String jobTitle;
	double Salary;
	
	public Employee (String Name, String ID, int age, int SSN, String jobTitle, double Salary) {
		
		this.Name = Name;
		this.ID = ID;
		this.age = age;
		this.SSN = SSN;
		this.jobTitle = jobTitle;
		this.Salary = Salary;
		
	}
	
	public void getInfo() {
		
		System.out.println("Employee name: " + Name);
		System.out.println("Employee ID: " + ID);
		System.out.println("SSN: " + SSN);
		System.out.println("Age: " + age);
		System.out.println("Job title: " + jobTitle);
		System.out.println("Salary: " + Salary);
		System.out.println();
		
	}
	
	

}
