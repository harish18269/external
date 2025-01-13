package com.externalprog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseTheSentence {
	public static void reverseWordMethod(String str) {
		int n = str.length();
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0;i<n;i++) {
			list.add(str.charAt(i));
		}
		ListIterator itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			System.out.print(itr.previous());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		reverseWordMethod(str);
	}
}
