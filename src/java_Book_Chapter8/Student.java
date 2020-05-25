package java_Book_Chapter8;

public class Student extends Person
{
    private int studentNumber;

    //Default constructor
    public Student( )
    {
        super( );
        studentNumber = 0;//Indicating no number yet
    }
    
    //Constructor 2
    public Student(String name, int studentNumber)
    {
        super(name);
        this.studentNumber = studentNumber;
    }

    //Constructor 3 - Self-test question 9
    public Student(String name) {
    	this(name, 0);
    }
    
    //Setter method
    public void reset(String name, int studentNumber)
    {
        setName(name);
        this.studentNumber = studentNumber;
    }
    
    //Getter method
    public int getStudentNumber( )
    {
        return studentNumber;
    }
    
    //Setter method
    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public void writeOutput( )
    {
        System.out.println("Name: " + getName( ));
        System.out.println("Student Number: " + studentNumber);
    }

    public boolean equals(Student otherStudent)
    {
        return hasSameName(otherStudent) &&
              (studentNumber == otherStudent.studentNumber);
    }


    public String toString( )
    {
        return "Name: " + getName( ) +
			   "\nStudent number: "  + studentNumber;
    }

 /* //For Optional Section
    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (!(otherObject instanceof Student))
            return false;
        else
        {
            Student otherStudent = (Student)otherObject;
            return (this.sameName(otherStudent)
                && (this.studentNumber ==
                                otherStudent.studentNumber));
        }
    }
*/

}
