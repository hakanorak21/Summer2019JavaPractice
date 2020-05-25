package java_Book_Chapter5;

public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Person newPerson) {
		return 	(name.equals(newPerson.name)) &&
				(this.age == newPerson.age);
	}

}
