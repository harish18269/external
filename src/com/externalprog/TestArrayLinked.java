package com.externalprog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Ramu");
		al.add("Rajesh");
		al.add("Rakesh");
		
		List<String> ll = new LinkedList<String>();
		ll.add("Kalyan");
		ll.add("Kumar");
		ll.add("kesh");
		ll.add("koushik");
		
		System.out.println("ArrayList: "+al);
		System.out.println("LinkedList: "+ll);
		
		for(String data:al) {
			System.out.print(data+" | ");
		}
		System.out.println();
		for(String data:ll) {
			System.out.print(data+" | ");
		}
	}
}
