package com.study2heights.learnJava.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("john");
		list.add("Anoop");
		list.add("Micle");
		list.add("Sam");
		//print the list
		//System.out.println(list);
		//list printing using for each
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		
		//using iterator
		Iterator iterator=list.iterator();
		while (iterator.hasNext()) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
			System.out.println(iterator.next());
			
		}
	}

}
