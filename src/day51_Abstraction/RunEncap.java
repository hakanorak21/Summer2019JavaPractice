package day51_Abstraction;

/**
 The public setXXX() and getXXX() methods are the access points of the instance variables of 
 the EncapTest class. Normally, these methods are referred as getters and setters. 
 Therefore, any class that wants to access the variables should access them through 
 these getters and setters.
 
 Benefits of Encapsulation:
 1. The fields of a class can be made read-only or write-only.
 2. A class can have total control over what is stored in its fields.
 */
public class RunEncap {

	public static void main(String args[]) {
		EncapTest encap = new EncapTest();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");

		System.out.println("Name : " + encap.getName());
		System.out.println("ID # : " + encap.getIdNum());
		System.out.println("Age : " + encap.getAge());
	}
}