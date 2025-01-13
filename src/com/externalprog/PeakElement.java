package com.externalprog;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements in the array:");
		int n = sc.nextInt();
		System.out.println("Enter the numbers array:");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int cur,prev,next;
		for(int i=0;i<arr.length;i++) {
			prev = i;
			cur = i+1;
			next = i+2;
			
		}
	}

}
