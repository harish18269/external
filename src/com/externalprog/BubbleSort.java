package com.externalprog;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSortMethod(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of array elements: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		bubbleSortMethod(arr);
		
		System.out.print("Sorted array: ");
		for(int data:arr) {
			System.out.print(data+" ");
		}
	}
}
