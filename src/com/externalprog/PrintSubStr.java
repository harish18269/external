package com.externalprog;

import java.util.Scanner;

public class PrintSubStr {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		int len = str.length();
		System.out.println("Press 1 for substring from starting index to end \n Press 2 for substring with starting index and ending index:");
		System.out.println("Enter your choice:(1/2) ");
		int i = sc.nextInt();
		
		System.out.println("Enter the index number to write a substring: ");
		int n = sc.nextInt();
		
		if(i == 1) {
		if(n < 0 || n > len) {
			System.out.println("Given index number is not valid.");
		}else {
			System.out.println("The resulted substring is : " + str.substring(n));
		}
		}else if( i == 2) {
			System.out.println("Enter the ending index: ");
			int end = sc.nextInt();
			if(n < 0 || n > len ||end < n || end > len) {
				System.out.println("Given index number is not valid.");
			}else {
				System.out.println("The resulted substring is : " + str.substring(n, end));
			}
		}
		
	}

}
