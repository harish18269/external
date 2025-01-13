package com.externalprog;

import java.util.Scanner;

public class ASCIIValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		System.out.println("ASCII VALUES OF THE GIVEN STRING:");
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int value = c;
			System.out.println("Character: " + c + " value: " + value);
		}
		

	}

}
