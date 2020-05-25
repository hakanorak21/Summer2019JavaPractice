package java_Book_Chapter8;

public class InheritanceDemo
{
    public static void main(String[] args) 
    {
        Student s = new Student();
        //s.name //compile error because private instance variables
        			//are not inherited
        s.setName("Warren Peace"); //from super class
        s.setStudentNumber(1234); //from sub class
        //s.writeOutput( );
        //Or
        System.out.println(s.toString());
        System.out.println();
        
        //Practice
        Student s2 = new Student("Warren Peace", 4321);
        s2.writeOutput();
        System.out.println();
        
        boolean a = s.hasSameName(s2);
        System.out.println(a);
        
    }
}
