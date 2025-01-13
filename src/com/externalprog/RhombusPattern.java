package com.externalprog;

import java.util.Scanner;

public class RhombusPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the Rhombus Pattern:");
		int n = sc.nextInt();
		RPattern(n);
	}
	
	public static void RPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<n;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
