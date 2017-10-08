package com.study2heights.learnJava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("Jony");
		hashSet.add("Sreenivas");
		hashSet.add("Feroz");
		hashSet.add("Sarath");
//		System.out.println(hashSet);
		
//		for (String string : hashSet) {
//			System.out.println(string);
//			
//		}
//		
		
		Iterator<String > iterator=hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
