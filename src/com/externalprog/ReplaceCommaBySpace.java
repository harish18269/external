package com.externalprog;

import java.util.Scanner;

public class ReplaceCommaBySpace {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		System.out.println("The modified string is :\n" + str.replace(",", " "));

	}

}
