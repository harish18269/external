package com.externalprog;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearchMethod(int[] arr, int target) {
		int low =0, high =arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid]<target) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {3,8,12,16,20,24,28,39,41,49,52,57};
		int target = 57;
		int result = binarySearchMethod(arr, target);
		
		if(result == -1) {
			System.out.println("Element not found in the list.");
		}else {
			System.out.println("Element is found at the index: " + result+" with value: " +target);
		}
	}
}
