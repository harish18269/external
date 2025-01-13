package com.externalprog;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines for the pyramid pattern : ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
