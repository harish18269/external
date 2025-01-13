package com.externalprog;

import java.util.Scanner;

public class JavaSubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			String res = "";
			for(int j=i;j<str.length();j++) {
//				res += str.charAt(j);
				System.out.print(str.substring(i,j+1)+ ", ");
			}
		}

	}

}
