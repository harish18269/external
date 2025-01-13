package com.externalprog;

import java.util.Scanner;

public class TCSNQTQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		int result = 0;
		for(int i=num1;i<=num2;i++) {
			result +=i*i*i;
		}
		System.out.println("The sum of cubes of all the numbers between the given range is: " + result);
	}

}
