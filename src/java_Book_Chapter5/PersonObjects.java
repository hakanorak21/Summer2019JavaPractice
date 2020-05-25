package java_Book_Chapter5;

public class PersonObjects {
	
	public static void main(String[] args) {
		Person Hakan = new Person();
		Hakan.setPerson("Hakan", 43);
		System.out.println(Hakan.getName() + " " + Hakan.getAge());
		Hakan.setName("Leyla");
		Hakan.setAge(39);
		System.out.println(Hakan.getName() + " " + Hakan.getAge());
		
		Person Leyla = new Person();
		Leyla.setPerson("Leyla", 39);
		System.out.println(Hakan.equals(Leyla));
		
	}
}
