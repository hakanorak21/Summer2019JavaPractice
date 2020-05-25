package java_Book_Chapter5;

public class SpeciesFirstTryDemo2 {
	
	public static void main(String[] args) {
		
		SpeciesFirstTry ex1 = new SpeciesFirstTry();
		ex1.name = "Klingon Ox";
		ex1.population = 10;
		ex1.growthRate = 15;
		
		SpeciesFirstTry ex2 = new SpeciesFirstTry();
		ex2.setSpecies("Klingon Ox", 10, 15);
		
		System.out.println(ex1 == ex2);
		System.out.println(ex1.equals(ex2));
	}

}
