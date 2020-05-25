package day64_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	
/**
Collection(I): extended by List, Queue, and Set interfaces

List(I): Index numbers, Accepts duplicates

Set(I): No index numbers, No duplicates

Queue(I): No index numbers, Accepts duplicates

	Implemented by PriorityQueue(C)
	
	Extended by Deque(I)
		
		Implemented by ArrayDeque(C), LinkedList(C)
		
		LinkedList(C) implements List(I) & Deque(I)
		
	poll(): FIFO
	
Deque(I): 
	addFirst():
	getFirst():
	removeFirst():
	addLast(): ???
	getLast():
	removeLast():
*/
	
	public static void main(String[] args) {
		
		//Queue<Integer> q1 = new PriorityQueue<Integer>();
		Queue q1 = new PriorityQueue();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(10);
		//q1.get(i); //No indices
		System.out.println(q1);
		
		//int a = q1.poll(); //Removes 10
		int a = (Integer)q1.poll(); //Removes 10
		System.out.println(a + " is removed");
		System.out.println(q1);
		
		int b = (Integer)q1.poll(); //Removes the second 10
		System.out.println(b + " is removed");
		System.out.println(q1);
		
		Queue<String> q2 = new PriorityQueue<String>();
		q2.add("Mahribana");
		q2.add("Madina");
		q2.add("Erhan");
		System.out.println(q2);
		
		String first = q2.poll();
		System.out.println(first);
		System.out.println(q2);
		
		String second = q2.poll();
		System.out.println(second);
		System.out.println(q2);
		
		Queue<Integer> q3 = new PriorityQueue<Integer>();
		q3.add(30);
		q3.add(20);
		q3.add(10);
		System.out.println(q3);
		
		System.out.println(q3.peek()); //Returns but does not remove
		System.out.println(q3);
		System.out.println("=========================");
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.addFirst(10);
		dq.addFirst(20);
		System.out.println(dq);
		
		System.out.println(dq.getFirst());
		System.out.println(dq);
		
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		
		dq.addLast(20); //same as add
		System.out.println(dq);
		
		dq.addLast(30); //same as add
		System.out.println(dq);
		
		System.out.println(dq.removeFirst()); //same as remove
		
	}

}
