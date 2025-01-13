package com.externalprog;

import java.util.Arrays;
import java.util.Scanner;

public class TwoElementSum {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n = sc.nextInt();
		
		int []arr = new int[n];
		System.out.println("Enter the elements to the array:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Minimum number :  " + arr[0]);
		System.out.println("Maximum number :  " + arr[arr.length - 1]);
		System.out.println("Second largest number :  " + arr[arr.length - 2]);
		
	 /* System.out.println("Enter the sum to be searched: ");
		int sum = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == sum) {
					System.out.print("{" + arr[i] + ", " + arr[j] + "}");
				}
			}
		} */

	}

}
