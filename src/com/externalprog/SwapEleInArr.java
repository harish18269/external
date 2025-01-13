package com.externalprog;

import java.util.Scanner;

public class SwapEleInArr {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n = sc.nextInt();
		
		int []arr = new int[n];
		System.out.println("Enter the elements to the array:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Original array is:");
		for(int number: arr) {
			System.out.print(number + " ");
		}
		System.out.println();
		for(int j=0;j<arr.length-1;j++) {
			 if(j%2 ==0) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] =  temp;
			}
		}
		System.out.println("Reversed array is: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}

	}

}
