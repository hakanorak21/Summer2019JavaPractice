package day37_ClassAndObject;

public class Employees {
	
	/**
		Assignment:
		Create a custom class for Employees

        attributes: EmployeeName
                    EmployeeID
                    JobTitle
                    SSN
                    Gender
                    Salary

        actions:
                getInfo

     */
	
	String EmployeeName;
	int EmployeeID;
	String JobTitle;
	int SSN;
	char Gender;
	int Salary;
	
	public void getInfo() {
		System.out.println("Employee Name: " + EmployeeName);
		System.out.println("Employee ID  : " + EmployeeID);
		System.out.println("Job Title    : " + JobTitle);
		System.out.println("SSN          : " + SSN);
		System.out.println("Gender       : " + Gender);
		System.out.println("Salary       : " + Salary);
		
	}

}
