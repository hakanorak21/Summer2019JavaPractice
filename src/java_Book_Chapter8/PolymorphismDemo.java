package java_Book_Chapter8;

public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Person[] people = new Person[4];

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812); 	//We don't know if s/he is 
															//undergraduate or graduate.
															//Similar to mysterio :-)
		people[3] = new Undergraduate("Bugg, June", 9901, 4);

		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}