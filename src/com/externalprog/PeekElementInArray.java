package com.externalprog;

public class PeekElementInArray {

	public static void main(String[] args) {
		int []arr = {10, 20, 30, 40, 50};
		int result = peekEle(arr);
		System.out.println("Peek Element in the array is: " + result);
//		int a = 10;
//		int b = ++a + a++ + --a;
//		System.out.println(b);
	}
	public static int peekEle(int[] arr) {
		int peek = 0;
		for(int num: arr) {
			if(num > peek) {
				peek = num;
			}
		}
		return peek;
	}

}
