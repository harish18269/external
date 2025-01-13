package com.externalprog;

import java.util.Scanner;

public class IncreasingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int count = 0;
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(str.charAt(count));
				count++;
			}
			System.out.println();
		}

	}

}
