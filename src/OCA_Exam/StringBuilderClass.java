package OCA_Exam;

public class StringBuilderClass {
	
	public static void main(String[] args) {
		
		// creates empty builder, capacity 16
		StringBuilder sb = new StringBuilder();
		// adds 9 character string at beginning
		sb.append("Greetings");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(" my friend!");
		
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(33);
		System.out.println(sb);
		
		sb.append(" How are you, today?");
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.capacity());
		
	}

}
