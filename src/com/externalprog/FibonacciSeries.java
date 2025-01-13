package com.externalprog;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonacci number:");
		int n = sc.nextInt();
		System.out.print("Fibinocci series of the given number is : 0 1");
		fibSeries(n-2);
	}
	
	public static void fibSeries(int n) {
		int prev = 0, cur = 1, next;
		next = prev + cur;
		System.out.print(next+ " ");
		prev = cur;
		cur = next;
		fibSeries(n-1);
	}

}
