package com.externalprog;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	public static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("//s", "");
		String s2 = str2.replaceAll("//s", "");
		
		boolean status = true;
		
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		status = Arrays.equals(arr1, arr2);
		
		if(status) {
			System.out.println(s1+" and "+s2+" are anagrams.");
		}else {
			System.out.println(s1+" and "+s2+" are not anagrams.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First String to check whether it's an anagram or not: ");
		String str1 = sc.nextLine();
		System.out.print("Enter the Second String to check whether it's an anagram or not: ");
		String str2 = sc.nextLine();
		
		isAnagram(str1, str2);
	}
}
