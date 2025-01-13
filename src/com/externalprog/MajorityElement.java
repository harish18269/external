package com.externalprog;

public class MajorityElement {
	public static int majorityElementMethod(int []nums) {
		int candidate = nums[0];
		int count = 0;
		
		for(int num:nums) {
			if(count == 0) {
				candidate = num;
				count =1;
			}else if(num == candidate) {
				count++;
			}else {
				count--;
			}
		}
		return candidate;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,1,2,3,4,3,2,1,1,2,4};
		int result = majorityElementMethod(nums);
		System.out.println("The majority Element in the given array is:"+result);
	}
}
