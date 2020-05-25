package java_Book_Chapter8;

public class Undergraduate extends Student
{
    private int level; //1 for freshman, 2 for sophomore,
                       //3 for junior, or 4 for senior.
    
    //Default constructor
    public Undergraduate( )
    {
        super( ); //Calling Student default constructor
        level = 1; //Default level = 1
    }
    
    //Constructor 2
    public Undergraduate(String name, int studentNumber, 
                         int level)
    {
        super(name, studentNumber);
        setLevel(level); //Checks 1 <= initialLevel <= 4
    }
    
    /*
    //Overloaded method
    public void reset(String name, int studentNumber, 
	                  int level)
    {
        reset(name, studentNumber); //Student's reset
        setLevel(level); //Checks 1 <= newLevel <= 4
    }
    */
    
    //Self-test question 11
    public void reset(String name, int studentNumber, 
    		int level)
    {
    	setName(name);
    	setStudentNumber(studentNumber);
    	setLevel(level); //Checks 1 <= newLevel <= 4
    }
    
    public int getLevel( )
    {
        return level;
    }
    
    public void setLevel(int level)
    {
        if ((1 <= level) && (level <= 4))
            this.level = level;
        else
        {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }
    
    /*
    @Override
    public void writeOutput( )
    {
        super.writeOutput( );
        System.out.println("Student Level: " + level);
    }
    */
    
    //Self-test question 10
    public void writeOutput() {
    	System.out.println("Name: " + getName( ));
        System.out.println("Student Number: " + getStudentNumber());
        System.out.println("Student Level: " + level);
    }
    
 
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return equals((Student)otherUndergraduate) && //name and id
               (this.level == otherUndergraduate.level); //level
    }
/*  // Alternate version 
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return super.equals(otherUndergraduate) &&
               (this.level == otherUndergraduate.level);
    }
*/	
}
