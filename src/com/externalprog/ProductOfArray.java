package com.externalprog;

import java.util.Scanner;

public class ProductOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println(arr);
		int product = 1;
		for(int j=0;j<arr.length;j++) {
			product *= arr[j];
		}
		System.out.println("The product of the given array is: " + product);
	}

}
