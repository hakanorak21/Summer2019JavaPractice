package java_Book_Chapter7;

import java.util.Scanner;

import java_Book_Chapter6.DollarFormat;

/**
 Class for sales associate records.
*/
public class SalesAssociate extends DollarFormat{
    private String name;
    private double sales;

    public SalesAssociate( )
    {
        name = "No record";
        sales = 0;
    }

    public SalesAssociate(String name,
                          double sales)
    {
        set(name, sales);
    }

    public void set(String name, double sales)
    {
        this.name = name;
        this.sales = sales;
    }

    public void readInput( )
    {
        System.out.print("Enter name of sales associate: ");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine( );

        System.out.print("Enter associate's sales: $");
        sales = keyboard.nextDouble( );
    }

    public void writeOutput( )
    {
        System.out.println("Name: " + name);
        System.out.print("Sales: ");
        writeln(sales);
    }

    public String getName( )
    {
        return name;
    }

    public double getSales( )
    {
        return sales;
    }
}
