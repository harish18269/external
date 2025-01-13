package com.externalprog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OrderWordsBySize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of words:");
		int n = sc.nextInt();
		sc.nextLine();
		String[] words = new String[n];
		
		for(int i=0;i<n;i++) {
			String word = sc.nextLine();
			words[i] = word;			
		}
		Arrays.sort(words, Comparator.comparing(String::length));
		
		for(String word:words) {
			System.out.print(word+" ");
		}
		sc.close();
	}

}
