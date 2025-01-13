package com.externalprog;

import java.util.Scanner;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n = sc.nextInt();
		
		int []arr = new int[n];
		System.out.println("Enter the elements to the array:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		
		while(index < arr.length) {
			arr[index++] = 0;
		}
		
		for(int num: arr) {
			System.out.print(num + " ");
		}

	}

}
