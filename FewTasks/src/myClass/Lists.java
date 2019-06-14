package myClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Q #10) Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
		
		
	List<String> list = new ArrayList<String>();
	list.add("Pawe³");
	list.add("£ucja");
	list.add("Kacper");
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	
	System.out.println("\n\n");

	Iterator<String> iterator = list.iterator();
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	System.out.println("\n\n");


	for(Object i: list) {
		System.out.println(i);
	}
		
	
	

//Other -----------------------------------------------------------	
		
/*		
	List<Integer> listOne = new ArrayList<Integer>();
	listOne.add(5);
	listOne.add(13);
	listOne.add(4);
	listOne.add(22);
	listOne.add(2);
	listOne.add(22);
	listOne.add(22);
	listOne.add(2);
	
	System.out.println("List: " + listOne);
	
	List<Integer> listTwo = new LinkedList<Integer>();
	Set<Integer> setThree = new HashSet<Integer>();

	/*setThree.addAll(listOne);
	System.out.println("\n\n Set HashSet: " + setThree);
	
	Set<Integer> setFour = new TreeSet<Integer>();
	
	setFour.addAll(listOne);
	System.out.println("\n\n Set TreeSet: " + setFour);
	
	
	Set<Integer> setFive = new LinkedHashSet<Integer>();
	
	setFive.addAll(listOne);
	System.out.println("\n\n Set LinkedHashSet " + setFive);
	
	Iterator<Integer> iterator = setFive.iterator();
	
*/	
/*	
	while(iterator.hasNext()) {
		System.out.println("next element is: " + iterator.next());
	}
*/
	

/*	
	for(Integer i: setFive) {
		
		System.out.println("Next element to: " + i);
		System.out.println("Next element to: " + iterator.next());

		
	}
*/
/*	
	Queue<String> names = new PriorityQueue<String>();
	names.offer("Kamil");
	names.offer("Luiza");
	names.offer("Masia");
	names.offer("Kasia");
	names.offer("Adam");
	
	System.out.println(names);
	
	System.out.println(names.poll());
	System.out.println(names.poll());
	System.out.println(names.poll());
	System.out.println(names.poll());
	System.out.println(names.poll());

*/
	
	}
	
}
