package com.externalprog;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSortMethod(int[] arr) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of array elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		insertionSortMethod(arr);
		System.out.print("Sorted array: ");
		for(int data:arr) {
			System.out.print(data+" | ");
		}
	}
}
