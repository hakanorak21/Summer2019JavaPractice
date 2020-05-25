package day20_JavaRcap;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str = "Cybertek School";
		
		String str1 = str.substring(0, str.indexOf("k") + 1);
		String str2 = str.substring(str.indexOf("S"));
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "Java is a fun language. I love Java, good";
		System.out.println(str3.indexOf("a"));
		System.out.println(str3.indexOf("age"));
		
		//lastIndexOf()
		System.out.println(str3.lastIndexOf("J"));
		System.out.println(str3.lastIndexOf("a"));
		
		//replace
		String name = "Cybertek School Batch 12";
		System.out.println(name.length());
		//name = name.replaceAll(" ", "");
		//name = name.replace(" ", "");
		name = name.replace("School", "Family");
		System.out.println(name);
		System.out.println(name.length());
		
		
	}

}
