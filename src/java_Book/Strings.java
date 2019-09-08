package java_Book;

public class Strings 
{
	public static void main(String[] args) 
	{
		int index;
		String name = "Java ";
		String friends = "Sue likes Fred ";
		String text = "programming is fun!";
		String output;
		output = friends.substring(0,10);
		output = output + text.substring(0, 12);
		output = output + name;
		output = output + "because " + text;
		output = friends + "and " + output;
		output = output.replace(output.charAt(2), 'E');
		output = output.toUpperCase();
		
		System.out.println(output);
		
	}

}
