package com.study2heights.learnJava.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashTest {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Anoop");
		linkedHashSet.add("Rama");
		linkedHashSet.add("Jeasus");
		linkedHashSet.add("Aravind");
		linkedHashSet.add("Ravi");

		// System.out.println(linkedHashSet);

		// foreach
		// for (String string : linkedHashSet) {
		// System.out.println(string);
		// }

		// Iterator
		Iterator<String> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
