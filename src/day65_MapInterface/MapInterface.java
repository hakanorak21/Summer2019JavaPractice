package day65_MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

/*
Data Structures:
1. Arrays
2. Collections framework
3. Map Interface

Map Interface: Accepts objects (both key and value)
 		Set<Value>
 		Map<Key, Value>
 		Does not accept duplicate keys
 		
Map Interface hierarchy:
		Implemented by HashMap(C), LinkedHashMap(C), Hashtable(C)
		Extended by SortedMap(I)
			Implemented by TreeMap(C)
			
Map<Key, Value> map1 = new HashMap<>();
Map<Key, Value> map2 = new LinkedHashMap<>();
Map<Key, Value> map3 = new HashTable<>();
Map<Key, Value> map4 = new TreeMap<>();

SortedMap<Key, Value> map5 = new TreeMap<>();

Map(I) methods:
	put(key, value): inserts the given key and value
	get(key): returns value
	remove(key): removes key and corresponding value
	size(): return size
	containsKey(key): returns boolean
	keySet(): returns all keys as a Set interface
	clear(): clears the map

HashMap(C): Does not keep the insertion order

LinkedHashMap(C): Keeps the insertion order
	Doubly linked: 
		get() is slower than HashMap
		put() & remove() are faster
		
Hashtable(C): Doesn't accept null for key or value
			  Synchronized (thread safe)

TreeMap(C): implements SortedMap(I) 
			Sorts in ascending order
		
*/
	
	public static void main(String[] args) {
		
		Map<String, Double> employees = new HashMap<>();
		System.out.println(employees);
		
		employees.put("Nurullah", 150000.0);
		System.out.println(employees);
		
		employees.put("Ibrohim", 120000.0);
		System.out.println(employees);
		
		double salary1 = employees.get("Nurullah");
		System.out.println(salary1);
		
		System.out.println(employees.size());
		
		employees.put("Akiyev", 160000.0);
		System.out.println(employees);
		System.out.println(employees.size());
		
		employees.remove("Nurullah");
		System.out.println(employees);
		
		boolean employee = employees.containsKey("Hakan");
		System.out.println(employee);
		
		Set<String> names = employees.keySet();
		System.out.println(names);
		System.out.println("============================");
		
		Map<String, Integer> map1 = new LinkedHashMap();
		
		employees.put("Ibrohim", 0.0); //replaced the original key, value
		System.out.println(employees);
		
		Hashtable<String, Integer> map2 = new Hashtable();
		//map2.put(null, null); //Runtime exception
		System.out.println(map2);
		
		TreeMap<String, Integer> map3 = new TreeMap<>();
		map3.put("Z", 1000);
	    map3.put("Y", 9000000);
	    map3.put("X", 1000000);
	    System.out.println(map3);
		
	}

}
