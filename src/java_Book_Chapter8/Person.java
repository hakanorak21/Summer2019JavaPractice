package java_Book_Chapter8;

//Super class of Student
public class Person
{
    public String name;
    
    //Default constructor
    public Person( )
    {
        //name = "No name yet";
    	this("No name yet"); //SAME
    }
    
    //Constructor 2
    public Person(String name)
    {
        this.name = name;
    }
    
    //Setter method
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Getter method
    public String getName( )
    {
        return name;
    }
    
    public void writeOutput( )
    {
        System.out.println("Name: " + name);
    }
   
    public boolean hasSameName(Person otherPerson)
    {
        return name.equalsIgnoreCase(otherPerson.name);
    }
}
