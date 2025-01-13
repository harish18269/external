package com.externalprog;

import java.util.Scanner;

public class PrintInLowerNUpper {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		System.out.println("The given string in uppercase: " + str.toUpperCase());
		System.out.println("The given string in lowercase: " + str.toLowerCase());

	}

}
