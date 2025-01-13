package com.externalprog;

import java.util.Scanner;

public class ReplaceWordsInStr {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		System.out.println("Enter the word you want to replace: ");
		String word = sc.nextLine();
		str = str.toLowerCase();
		word = word.toLowerCase(); 
		
		if(!str.contains(word)) {
			System.out.println("Entered word is not present in the String.");
		}else {
			System.out.println("Enter the word to replace: ");
			String newWord = sc.nextLine();
			
			System.out.println("The replaced string is: \n" + str.replaceAll(word, newWord));
		}

	}

}
