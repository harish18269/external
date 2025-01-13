package com.externalprog;

public class TwoSumArr {

	public static void main(String[] args) {
		int[] array = {2,3,4,6,8,2,4};
		int t = 8;
		twoSumCheck(array, t);
 	}
	
	public static void twoSumCheck(int[] arr, int target) {
		int iValue = 0;
		int jValue = 0;
		ol:for(int i=0;i<arr.length;i++) {
			il:for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == target) {
					iValue = i;
					jValue = j;
					break ol;
				}
			}
		}
		int []res = new int[2];
		res[0] = iValue+1;
		res[1] = jValue+1;
	
		System.out.print("[" +res[0] + ", " + res[1]+ "]");
		
	}

}
