package day55_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

/**
extends:
		one sub class can have only one super class while
		one super class can have multiple sub classes.
		class extends class
		interface extends interface
		
implements:
		class implements interface
		
Polymporhism: 	Multi-behaviors of an object
				
				Occurs when super-class/interface is reference type, and
				object is created from non-abstract sub class
				
				If interface is reference type, object has to be created
				from the classes implementing the interface.
				Ex: WebDriver driver = new ChromeDriver();
 
IS-A: Inherited relationship between sub and super classes
HAS-A: If one class' object is used in another class  
*/

/*
WarmUp:         
    1. create an abstract class called ScrumTeam
            Data: Name
                  JobTitle
                  Salary
            Actions: DailyStandUp();
                     Demo();
    2. Create the following sub classes of ScrumTeam:
                1. Testers:
                        Actions: FindBug
                2. Developers:
                        Actions: FixBug
    3. Create a class called BOF
            create Array of Testers named sdets, at least store two objects
            create array of Developers named dev, at least store three objects
            create ArrayList of ScrumTeam:
                    store all the developer' and testers' objects
 */
abstract class ScrumTeam{
	
	public String name, title;
	public double salary; 
	
	public abstract void DailyStandUp();
	public abstract void Demo();
	
	//Non-abstract methods possible in abstract classes
	//but not possible in interfaces
	public void getEmployeeInfo() {
		System.out.println("============================");
		System.out.println("Employee name: " + name);
		System.out.println("Employee title: " + title);
		System.out.println("Employee salary: $" + salary);
		System.out.println("=============================");
	}
	
}

class Testers extends ScrumTeam{
	
	//Constructor
	public Testers(String name, String title, double salary) {
		this.name = name;
		this.title = title;
		this.salary = salary;
	}

	@Override
	public void DailyStandUp() {
		System.out.println("Tester " + name + " is talking.");
		
	}

	@Override
	public void Demo() {
		System.out.println("Tester " + name + " is doing demo.");
		
	}
	
	//Tester class own method
	public void FindBug() {
		System.out.println("Tester " + name + " is finding bugs.");
	}
	
}


class Developers extends ScrumTeam{
	
	//Constructor
	public Developers(String name, String title, double salary) {
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	
	@Override
	public void DailyStandUp() {
		System.out.println("Developer " + name + " is talking.");
		
	}

	@Override
	public void Demo() {
		System.out.println("Developer " + name + "  is doing demo.");
		
	}
	
	//Developers class own method
	public void FixBug() {
		System.out.println("Developer " + name + " is fixing bugs.");
	}	
	
}


public class BOA {
	
	public static void main(String[] args) {
		
		ScrumTeam Madina 			= new Testers("Madina", "SDET", 130000);
		//Super-class reference type		//Sub-class object
		Madina.DailyStandUp();
		Madina.Demo();
		//Madina.FindBug(); //Is not defined in super-class
		Madina.getEmployeeInfo();
		
		ScrumTeam Akerke = new Testers("Akerke", "Automation tester", 100000);
		ScrumTeam Erhan = new Testers("Holly", "Manual tester", 80000);

		//Array of ScrumTeam consisting Testers objects
		ScrumTeam[] testers = {Madina, Akerke, Erhan};
		
		ScrumTeam Nadire= new Developers("Nadire", "Senior Developer", 150000);
        ScrumTeam Mahir = new Developers("Mahir", "Junior Developer", 130000);
        ScrumTeam Parsa = new Developers("Parsa", "Medium Developer", 220000);
        ScrumTeam Delare = new Developers("Dilara", "Devloper", 200000);
        
        //Array of ScrumTeam consisting Developers objects
        ScrumTeam[] dev = { Nadire, Mahir, Parsa, Delare};
        
        //ArrayList of testers and developers
		ArrayList<ScrumTeam> scrum = new ArrayList<>();
		scrum.addAll(Arrays.asList(testers));
		scrum.addAll(Arrays.asList(dev));
		
		for(ScrumTeam each: scrum)
			each.getEmployeeInfo();
		
	}

}
