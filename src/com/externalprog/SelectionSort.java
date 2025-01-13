package com.externalprog;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSortMethod(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int min_index = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of array elements: ");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" Elements: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		selectionSortMethod(arr);
		System.out.print("Sorted array: ");
		for(int data:arr) {
			System.out.print(data+", ");
		}
	}
}
