package com.externalprog;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int res = factorial(n);
		System.out.println("Factorial of the given number is: " + res);
	}
	
	public static int factorial(int n) {
		if(n<0) {
			return -1;
		}
		if(n==1) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
