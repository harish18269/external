package com.externalprog;

import java.util.Scanner;

public class LastIndexOfAChar {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		System.out.println("Enter the character to search : ");
		String s = sc.nextLine();
		char ch = s.charAt(0);
		
		s = s.toLowerCase();
		str = str.toLowerCase();
		System.out.println("All the indexes of the given character is: ");
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == ch) {
				System.out.print(i + " ");
			}
		}

	}

}
