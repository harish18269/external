package com.externalprog;

import java.util.Scanner;

public class tcsnqt2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number too give the first 10 multiple sum:");
		int n = sc.nextInt();
		int res = first10Multiple(n);
		System.out.println("The sum first 10 multiples of the given number is: " + res);
	}
	
	public static int first10Multiple(int n) {
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum += i * n;
		}
		return sum;
	}

}
