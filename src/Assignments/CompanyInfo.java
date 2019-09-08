package Assignments;

import java.text.DecimalFormat;

public class CompanyInfo 
{	
	public static void main(String[] args) 
	{
		String companyName, address;
		int numberOfEmployees, revenue;
		// String revenue;
		boolean isTechCompany;
		
		companyName = "FaceBook";
		address = "1 Hacker Way\nMenlo Park, CA 94025"; 
		numberOfEmployees = 100;
		revenue = 4_000_000;
		isTechCompany = true;
		
		System.out.println("Company name is " + companyName);
		System.out.println("Address is:\n" + address);
		System.out.println("Number of employees is " + numberOfEmployees );
		
		DecimalFormat myFormatter = new DecimalFormat("###,###,###");
		String output = myFormatter.format(revenue);
		String output2 = output.replace(",", " ");
		System.out.println("Annual revenue is " + output2);
		
		System.out.println("Is it tech company? - " + isTechCompany);
		
	}

}
