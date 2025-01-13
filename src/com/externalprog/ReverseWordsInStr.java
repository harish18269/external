package com.externalprog;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWordsInStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String str = sc.nextLine();
		str = str.trim();
		String[] arr = str.split("\\s+");
		
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
 
	}

}
