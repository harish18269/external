package com.externalprog;

import java.util.Scanner;

public class LengthofLastWord {
	public static int lengthOfLastWord(String s) {
		s = s.trim();
		
		int lastIndex = s.lastIndexOf(" ");
		
		return s.length()-lastIndex-1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the string to count the length of the last word: ");
		String s = sc.nextLine();
		
		System.out.println(lengthOfLastWord(s));
	}
}
