package com.externalprog;

public class StaticExample {
	public static void min(int[] arr) {
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		int arr[] = {33,4,10,5,2,6};
		
		min(arr);
	}
}
