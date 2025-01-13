package com.externalprog;

import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements to the array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("How do you want to read the elements in the array:");
		System.out.println("Enter 1 to read on the basis of index:");
		System.out.println("Enter 2 to read on the basis of values:");
		System.out.println("Enter your choice:(1/2)");
		
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter the index number of an array:");
			int index = sc.nextInt();
			if(index < 0 || index > n ) {
				System.out.println("Index size is not valid.");
			}else {
				System.out.println("The value of the given index is: " +arr[index]);
			}
		}else if(choice == 2) {
			System.out.println("Enter the value to be search:");
			int value = sc.nextInt();
			int k = 0;
			for(int m = 0;m<n;m++) {
				if(arr[m] == value) {
					k = 1;
				}
			}
			if( k != 0) {
				System.out.println("The value is found.");
			}else {
			System.out.println("The given value is not found in the array.");
			}
		}else {
			System.out.println("The entered choice is not valid.");
		}
	}

}
