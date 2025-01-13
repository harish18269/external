package com.externalprog;

public class ArrayIterationUsingRecursion {

	public static void main(String[] args) {
		int []arr = {4,5,9,12,45,78,56,23,41,5};
		int value = 0;
		ArrayItrUsingRecursion(arr, value);
	}
	
	public static void ArrayItrUsingRecursion(int[] arr, int value) {
		if(value<arr.length) {
			System.out.print(arr[value++]+" ");
			ArrayItrUsingRecursion(arr, value);
		}
		
	}
}
