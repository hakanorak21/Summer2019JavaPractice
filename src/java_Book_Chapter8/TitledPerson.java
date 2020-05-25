package java_Book_Chapter8;

public class TitledPerson extends Person {
	
    private String title; //Ms., Mr., The Honorable

    //Default constructor
    public TitledPerson( )
    {
        super( );
        title = "No title yet"; 
    }
    
    //Constructor 2
    public TitledPerson(String name, String title)
    {
        super(name);
        this.title = title;
    }

    //Constructor 3 - Self-test question 9
    public TitledPerson(String name) {
    	this(name, "No title yet");
    }
    
    //Setter method
    public void reset(String name, String title)
    {
        setName(name);
        this.title = title;
    }
    
    //Getter method
    public String getTitle( )
    {
        return title;
    }
    
    //Setter method
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void writeOutput( )
    {
        System.out.println(title + " " + getName( ));
        
    }

    public boolean equals(TitledPerson otherTitledPerson)
    {
        return hasSameName(otherTitledPerson) &&
              (title == otherTitledPerson.title);
    }


    public String toString( )
    {
        return title + " " + getName( );
    }

}
