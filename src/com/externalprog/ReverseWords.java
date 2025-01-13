package com.externalprog;

public class ReverseWords {

	public static void main(String[] args) {
		String[] arr = {"hello", "world", "make", "way", "for", "king"};
		for(String word: arr) {
			System.out.print(word + " ");
		}
		System.out.println();
		String revWord = "";
		for(String word: arr) {
			int i = word.length()-1;
			while(i>=0) {
			revWord += word.charAt(i);
			i--;
			}
			revWord += " ";
		}
		System.out.println("Reverse the above sentence ");
		System.out.print(revWord + " ");

	}

}
