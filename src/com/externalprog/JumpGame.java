package com.externalprog;

public class JumpGame {

	public static void main(String[] args) {
		int []nums = {3,2,1,0,4};
		boolean result = jumpCheck(nums);
		System.out.println(result);

	}
	
	public static boolean jumpCheck(int[] arr) {
		if(arr[0] <=0) {
			return false;
		}
		int i=0;
		while(i<arr.length) {
			if(arr[i] == 0 && arr[i] != arr[arr.length-1]) {
				return false;
			}
			i +=arr[i];
		}
		i = i-arr[arr.length - 1];
		return i == arr.length-1;
	}
}
