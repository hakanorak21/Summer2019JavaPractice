package Replits;

public class Replit_OOP1_PrintAttributes {
	
	/**
	The class Atts holds a few attributes and has a method called asString.

	The attributes are name and color -both are strings and amount which is an int.
	Their visibility is public.

	asString returns a string showing all the Atts in a format.

	For example:
	Atts a = new Atts();
   	a.name = "table";
   	a.color = "brown";
   	a.amount = 1;
   
   	System.out.println(a.asString());
   	
   	Prints:
   	name: table color: brown amount: 1
	*/
	
	public static void main(String[] args) {
		   
		Atts a = new Atts();
		a.name = "ball";
		a.color = "red";
		a.amount = 1;


		System.out.println(a.asString());
	}
	
}
