package day18_OptionalAssignments;

import java.util.Scanner;

public class WebAddress {
	
	/*
	 Write a Java program that can check the URL

	Valid extensions for URL are: com, net, edu, org, gov

	- check that it starts with www.
	- check if it contains the ending dot right before the extension
	- assign String domain and 
	String extension.
	- print them
	"Domain:" amazon
	"Extension:" .com  
	 */
	
	public static void main(String[] args) {
		
		String domain, extension, url;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a website URL:");
		url = keyboard.nextLine();
		
		if (url.startsWith("www")) {
			
			domain = url.substring(4, url.lastIndexOf("."));
			System.out.println("Domain: " + domain);
			
			extension = url.substring(url.lastIndexOf(".") + 1);
			System.out.println("Extension: " + extension);
			
		}
		
		else
			System.out.println("Please enter a valid URL (starting with www)");
		
	}

}
