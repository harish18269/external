package com.externalprog;

import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		System.out.println("Enter the " + len + " numbers of an array:");
		int []arr = new int[len];
		for(int j = 0;j<len;j++) {
			arr[j] = sc.nextInt();
		}
		int result = calculateSumOfEven(arr);
		System.out.println("The sum of the Even numbers in the given array is: " + result);
	}

	public static int calculateSumOfEven(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			if(arr[i] % 2 == 0) {
				sum +=arr[i];
			}
		}
		return sum;
	}
}
