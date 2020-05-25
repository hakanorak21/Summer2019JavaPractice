package day45_Protected_Default;

import office_Hours.Employee;

public class EmployeeList extends Employee {
	
public static void main(String[] args) {
		
		Employee obj = new Employee();
		System.out.println(obj.getSSN());
		
		Employee obj2 = new Employee(123, "Employee", 33, 150000);
		System.out.println(obj2.getSSN());
		
	}

}
