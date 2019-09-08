package Assignments;

public class Task04_HTTPS_Status_Code 
{
	public static void main(String[] args) 
	{
		int StatusCode = 404;
		
		if (StatusCode == 200)
			System.out.println("OK");
		if (StatusCode == 201)
			System.out.println("Created");
		if (StatusCode == 202)
			System.out.println("Accepted");
		if (StatusCode == 301)
			System.out.println("Moved Permanently");
		if (StatusCode == 303)
			System.out.println("See Other");
		if (StatusCode == 304)
			System.out.println("Not Modified");
		if (StatusCode == 307)
			System.out.println("Temporary Redirect");
		if (StatusCode == 400)
			System.out.println("Bad request");
		if (StatusCode == 401)
			System.out.println("Unauthorized");
		if (StatusCode == 403)
			System.out.println("Forbidden");
		if (StatusCode == 404)
			System.out.println("Not Found");
		if (StatusCode == 410)
			System.out.println("Gone");
		if (StatusCode == 500)
			System.out.println("Internal Server Error");
		if (StatusCode == 503)
			System.out.println("Service Not Available");
		
	}

}
