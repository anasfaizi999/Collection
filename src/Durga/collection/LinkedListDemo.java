package Durga.collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String [] args) {
		
		LinkedList i = new LinkedList();
		i.add("durga");
		i.add(30);
		i.add(null);
		i.add("durga");
		i.set(0, "Software");
		i.add(0, "venky");
		i.removeLast();
		i.addFirst("CCC");
		System.out.println(i);
		
	}

}
