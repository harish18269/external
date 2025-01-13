package com.externalprog;

import java.util.Scanner;

public class InterpolationSearch {
	public static int interpolationMethod(int[] arr, int target) {
		int low = 0, high = arr.length-1;
		
		while(low<=high && target>=arr[low] && target<=arr[high]) {
			int mid = low+((target - arr[low])*(high-low)/(arr[high]-arr[low]));
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid]<target) {
				mid = mid+1;
			}else {
				mid = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of array elements: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target value to search: ");
		int target = sc.nextInt();
		int result = interpolationMethod(arr, target);
		
		if(result == -1) {
			System.out.println("Value not found in the array.");
		}else {
			System.out.println("Value found at the index: "+result);
		}
	}
}
