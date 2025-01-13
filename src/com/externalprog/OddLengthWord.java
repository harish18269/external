package com.externalprog;

import java.util.Scanner;

public class OddLengthWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the odd length string:");
		String str = sc.nextLine();
		
		int len = str.length() / 2;
		String res = "";
		for(int i=len;i<str.length();i++) {
			res +=str.charAt(i);
			System.out.println(res);
		}
		for(int j=0;j<len;j++) {
			res +=str.charAt(j);
			System.out.println(res);
		}
		System.out.println("The output is : " + res);
	}

}
