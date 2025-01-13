package com.externalprog;

import java.util.Scanner;

public class AltCharsInStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Alternative characters in the given string: ");
		for(int i=0;i<str.length();i+=2) {
			System.out.print(str.charAt(i) + " ");
		}

	}

}
