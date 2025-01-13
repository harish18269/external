package com.externalprog;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		Iterator<String> itr= set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String data:set) {
			System.out.print(data+" | ");
		}
	}
}
