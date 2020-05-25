package java_Book_Chapter9;

public class SelfTestQuestions {

}

//Question 15
class CoreBreachException extends Exception{
	
	public CoreBreachException( )
    {
        super("Core Breach! Evacuate Ship!");
    }
	
    public CoreBreachException(String message)
    {
        super(message);
    }
    
}

//Question 16
class MessageTooLongException extends Exception{
	
	public MessageTooLongException( )
    {
        super("Message Too Long!");
    }
	
    public MessageTooLongException(String message)
    {
        super(message);
    }
    
}
