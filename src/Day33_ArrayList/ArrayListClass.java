package Day33_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	
	/**
	ArrayList:
		Presented in "java.util"
		Does not support primitives, we can store only objects
		Size is dynamic, adjusted automatically
		Ordered collection of values
		We can add or remove objects, unlike array
		
	How to declare ArrayList:
		ArrayList<NonPrimitive> variableName = new ArrayList<NonPrimitive>();
		
		Preferred way:
		ArrayList<NonPrimitive> variableName = new ArrayList<>();
		
	Declaration of array:
		int[] arr = new int[];
		
	ArrayList vs. Array (interview question):
		Dynamic vs. fixed
		Objects vs. all
		1D vs. Multi-D
	*/
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<>();
		
		//add(object)
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("apple"); //index 0: size 1
		shoppingList.add("orange"); //index 1: size 2
		shoppingList.add("grape"); // index 2: size 3
		System.out.println(shoppingList);
		System.out.println(shoppingList.size());
		
		//add(index, object): adds an object at the given index number
		shoppingList.add("strawberry");
		System.out.println(shoppingList);
		
		shoppingList.add(0, "bread");
		System.out.println(shoppingList);
		
		//shoppingList.add(6, "icecream"); ==> index out of bound
		
		//get(index) ==> object
		System.out.println(shoppingList.get(4)); //strawberry
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Homayra");
		names.add("Meri");
		names.add(1, "Mihrigul");
		names.add(1, "Tabriz");
		names.add(0, "Asiya");
		
		String str1 = names.get(1);
		System.out.println(str1);
		
		//clear(): removes all objects from ArrayList
		System.out.println(names);
		System.out.println(names.size());
		names.clear();
		System.out.println(names);
		System.out.println(names.size());
		
		//set(index number, object): the given object will replace
		//							 the object at the given index number
		names.add("Homayra");
		names.add("Meri");
		names.add(1, "Mihrigul");
		names.add(1, "Tabriz");
		names.add(0, "Asiya");
		System.out.println(names);
		
		names.set(2, "Eyyup");
		System.out.println(names);
		
		names.add(1, "Safwan");
		System.out.println(names);
		
		//contains(object): ==> boolean
		System.out.println(names.contains("Hakan"));
		
		//equals(ArrayList): 
		System.out.println(names.equals(shoppingList));
		
		//remove(int): removes the index
		System.out.println(names); 
		//[Asiya, Safwan, Homayra, Eyyup, Mihrigul, Meri]
		
		names.remove(0); //Asiya
		System.out.println(names);
		//[Safwan, Homayra, Eyyup, Mihrigul, Meri]
		
		names.remove(2); //Eyyup
		System.out.println(names);
		//[Safwan, Homayra, Mihrigul, Meri]
		
		
		//remove(object): removes the first matching object
		//					and returns a boolean
		
		System.out.println(names); //[Safwan, Homayra, Mihrigul, Meri]
		
		System.out.println(names.remove("Mihrigul")); // ==> true
		System.out.println(names); //[Safwan, Homayra, Meri]
		
		System.out.println(names.remove("Seyfo")); // ==> false
		System.out.println(names); //[Safwan, Homayra, Meri]
		
		//set practice
		System.out.println(names); //[Safwan, Homayra, Meri]
		
		names.set(1,  "Seyfo");
		System.out.println(names);
		
		
	}
	
}
