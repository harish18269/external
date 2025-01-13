package com.externalprog;

import java.util.Scanner;

public class LinearSearch {
	
		public static int linearSearchMethod(int[] arr, int target) {
			int n = arr.length;
			if(n == 0) {
				return -1;
			}else{
				for(int i=0;i<n;i++) {
					if(arr[i] == target) {
						return i;
					}
				}
			}
				return -2;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no.of array elements: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter "+n+" elements: ");
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter the target element to search: ");
			int target = sc.nextInt();
			int result = linearSearchMethod(arr, target);
			
			if(result == -1) {
				System.out.println("array is Empty.");
			}else if(result == -2) {
				System.out.println("Element is not found in the array.");
			}else {
				System.out.println("Valus "+target+" found at the index: "+result);
			}
		}
}
