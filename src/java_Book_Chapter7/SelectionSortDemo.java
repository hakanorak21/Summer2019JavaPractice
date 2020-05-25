package java_Book_Chapter7;

import java.util.Arrays;

public class SelectionSortDemo
{
    public static void main(String[] args)
    {
        int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
       
        //System.out.println(Arrays.toString(b));
		display (b, "before");
        ArraySorter.selectionSort(b);
		display (b, "after");
        //System.out.println(Arrays.toString(b));
		
    }
	
	public static void display(int[] array, String when)
	{
        System.out.println("Array values " + when + " sorting:");
        for (int each: array)
            System.out.print(each + " ");
        System.out.println( );
	}
}
