package com.externalprog;

public class BinarySearchEx {

	public static void main(String[] args) {
		int[] arr = {3,4,8,9,12,16,18,20,28,32,37};
		int target = 8;
		int result = binarySearch(arr, target);
		if(result == -1) {
			System.out.println("Element not found in the list.");
		}else {
			System.out.println("Element is found at the index: " + result+" with value: " +target);
		}

	}
	public static int binarySearch(int[] arr, int target) {
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

}
