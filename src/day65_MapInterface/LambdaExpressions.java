package day65_MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {

	public static void main(String[] args) {
		//Predicate<Integer> remove100 = p -> p == 100;
		List<Integer> list = new ArrayList<>(Arrays.asList(100, 200, 100));
		System.out.println(list);
		list.removeIf(p -> p == 100);
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500, 600));
		System.out.println(list2);
		list2.removeIf( x -> x > 300); 
		System.out.println(list2);
		 
		//foreEach()
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		list3.forEach( p -> {  if(p < 5) {System.out.print(p + " ");}  } );
		System.out.println();
		System.out.println("=================================");
		 
		list3.forEach( System.out::print );
		System.out.println();
		 
		// remove all names that are ended with et
		List<String> names = new ArrayList<String>();
		names.addAll(Arrays.asList("Ahmet", "Ibrohim", "Madina", "Ahmet", "Mehmet"));
 
//		Predicate<String> x = name -> name.endsWith("et");
//		names.removeIf(x);
		names.removeIf(name -> name.endsWith("et"));		
		System.out.println(names);

		// task
		List<String> l1 = new ArrayList<String>();
		l1.addAll(Arrays.asList("Muhtar","Marufjon","Akerke", "Asiya","Meryem") );
		
		List<String> l2 = new ArrayList<String>();
		l1.forEach( y -> { if(y.startsWith("M")) { l2.add(y);}    } );

		System.out.println(l2);

		l1.removeIf( z -> z.startsWith("M") );
		System.out.println(l1);
		
		//Back to warmup
		List<Integer> list4 = new ArrayList<Integer>();
		list4.addAll(Arrays.asList(1,2,3,4,5));
		System.out.println(list4);
		list4.removeIf(y -> y % 2 == 0);
		System.out.println(list4);

	}

}

// default and static methods in interfaces starting Java 8
// interface no more pure abstraction!!!
interface I
{
	default void show() {
		System.out.println("show");
	}
	static void read() {
		System.out.println("show");
	}
	
}
