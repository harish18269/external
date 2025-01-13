package com.externalprog;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse:");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(String word: words) {
			sb.append(word);
			System.out.print(sb.reverse() + " ");
			sb.delete(0, word.length());
		}
		
		System.out.println();
		for(String word: words) {
			sb.append(" ");
			sb.append(word);
			
		}
		System.out.print(sb.reverse());
	}

}
