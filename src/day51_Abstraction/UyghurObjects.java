package day51_Abstraction;

public class UyghurObjects {
	
	public static void main(String[] args) {
		
		Uyghur oghlan = new Uyghur("Oghlan", 18, 150);
		System.out.println(oghlan.name);
		System.out.println(oghlan.age);
		System.out.println(oghlan.weight);
		
		Uyghur kashgaria = new Uyghur("Kashgaria", 21, 180);
		System.out.println(kashgaria.name);
		System.out.println(kashgaria.age);
		System.out.println(kashgaria.weight);
		//System.out.println(oghlan.name);
		
		Uyghur gheni = new Uyghur("Gheni");
		System.out.println(gheni.name);
		//gheni.name = "Gheni";
		//System.out.println(gheni.name);
		System.out.println(gheni.age);
		System.out.println(gheni.weight);
		
		//Uyghur.Wants();
		oghlan.Wants("East Turkistan");
		kashgaria.Wants("Humanity");
		gheni.Wants("Kurdistan");
		
	}

}
