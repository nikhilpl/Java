package com.study2heights.learnJava.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("John");
		linkedList.add("Micle");
		linkedList.add("Jony");
		linkedList.add("Lal");

		// System.out.println(linkedList);
		// for (String string : linkedList) {
		// System.out.println(string);
		// }
		
		
		Iterator< String> iterator=linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
