package com.externalprog;

import java.util.Scanner;

public class LongestWordInStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		int max = words[0].length();
		int another = 0;
		for(int i=1;i<words.length;i++) {
			if(words[i].length()>max) {
				max = i;
			}else if(words[i].length() == max) {
				another = i;
			}
			
		}
		System.out.println("Biggest word is : " + words[max]);
		
		}

}
