package com.externalprog;

import java.util.Scanner;

public class IndexOfAGivenChar {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		System.out.println("Enter the character to search : ");
		String s = sc.nextLine();
		
		s = s.toLowerCase();
		str = str.toLowerCase();
		System.out.println("Index of the given character is : " + str.indexOf(s));
		System.out.println("Last index of the given character is : " + str.lastIndexOf(s));
	}
}
