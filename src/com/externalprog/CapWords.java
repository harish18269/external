package com.externalprog;

import java.util.Scanner;

public class CapWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		capWords(str);
		sc.close();

	}
	
	public static void capWords(String str) {
		String []words = str.split(" ");
		for(String word: words) {
			System.out.print(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase()+" ");
		}
		
	}

}
