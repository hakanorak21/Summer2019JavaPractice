package day18_OptionalAssignments;

public class replace {
	
	public static void main(String[] args) {
		
		String java = "Java is a programming language. Java is good.";
		String java1 = java.replace("Java", "C++");
		System.out.println(java1);
		
		String java2 = java.replaceFirst("Java", "C++");
		System.out.println(java2);
		
	}

}
