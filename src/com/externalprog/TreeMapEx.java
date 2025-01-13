package com.externalprog;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "harish");
		tm.put(2, "kalyan");
		tm.put(3, "harish");
		for(Map.Entry<Integer, String> m: tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	tm.remove(3);
	System.out.println("removing an element");
	for(Map.Entry<Integer, String> m: tm.entrySet()) {
		System.out.println(m.getKey() + " " + m.getValue());
	}

	}
}
