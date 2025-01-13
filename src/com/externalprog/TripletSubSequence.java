package com.externalprog;

public class TripletSubSequence {

	public static void main(String[] args) {
		int[] arr = {4,6,8,5,8,9};
		boolean result = increasingTriplet(arr);
		System.out.println("The result is : " + result);
	}
	
	public static boolean increasingTriplet(int[] nums) {
		int n = nums.length;
        int cur = 0, prev = 0, next = 0;
        boolean value = false;
        for(int i=1;i<n-1;i++){
            cur = nums[i];
            prev = nums[i-1];
            next = nums[i+1];
            if(cur > prev && cur < next){
                value = true;
                break;
            }            
        }
        return value;
	}
}
