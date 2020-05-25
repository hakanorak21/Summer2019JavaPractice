package day62_Collections;

public class CollectionsIntro {
	
/**
Collections Framework: Asked a lot during interviews.

Data Structures: Used for managing data efficiently and
				 in an organized manner. 
				 
3 types:
1. Array
2. Collections framework
3. Maps

Array: 	Collection of data (same data type)
		Size is fixed
		Index numbers (starting from zero)
		Supports both primitives and objects
		Can have duplicates
		
Collections framework: Is consisted of multiple interfaces; 
 					   Each interface has multiple implementations.
 					   
	Interfaces in Collections framework:
		1. Iterable
		2. Collection
		3. List
		4. Queue
		5. Set
		6. SortedSet
		7. Deque

Iterable (I): Root interface, super type of all the interfaces 
		  	  in collections framework. 

Collection (I): Extended by 3 interfaces: List(I), Set(I), Queue(I)

 	List (I): Implemented by ArrayList(C), LinkedList(C), Vector(C)
 			  Has index numbers, dynamic sized, accepts duplicates
 			  
 			  List<Integer> list1 = new ArrayList<Integer>();
 			  List<String>  list2 = new LinkedList<Integer>();
 			  List<Double>  list3 = new Vector<Integer>();
 			  //Stack(C) extends Vector(C)
 			  List<Character>  list4 = new Stack<Character>();
 			  
 			  ArrayList: Array based class, internally uses arrays
 			  
 			  LinkedList: 	Each object is doubly linked
 			    			Doubly linked: adding & removing (add(), remove())
 			  			  	Retrieving data is slower
 			  			  	Is not array based
 			  			  
 			  Vector: Only one difference!
 			  		  Is synchronized: higher safety, lower speed
 			  		  synchronized keyword
 			  		  Preferred only in multi-threads
 			   			multi-thread: Multiple threads try to get access to
 			   				 		  to a resource at the same time
 			   		  Has a sub-class called stack
 			   		  Stack: unique method pop() [ LIFO ]
 			   		  
Set(I):	No duplicates
		No index numbers
		Implemented by HashSet(C), LinkedHashSet(C)
		Extended by SortedSet(I)
		SortedSet(I) is implemented by TreeSet(C)
		
		Set<Integer> st1 = new HashSet<Integer>();
		Set<Integer> st2 = new LinkedHashSet<Integer>();
		Set<Integer> st3 = new TreeSet<Integer>();
		
		HashSet: Does not keep the objects in order
		LinkedHashSet: Keeps the order
		TreeSet: Sorts the objects in ascending order			   
*/

}
