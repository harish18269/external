package com.externalprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistincttArray {
	public static void distinctMethod(int []arr) {
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			int diff = arr[i]-arr[i-1];
			if(diff<minDiff) {
				minDiff = diff;
			}
		}
		
		
		List<int[]> pairs = new ArrayList<int[]>();
		for(int i=1;i<arr.length;i++) {
			int diff = arr[i]-arr[i-1];
			if(diff == minDiff) {
				pairs.add(new int[] {arr[i-1], arr[i]});
			}
		}
		
		for(int[] pair:pairs) {
			System.out.println("("+pair[0]+","+pair[1]+")");
		}
	}
	
	public static void main(String[] args) {
		int []arr = {4,2,1,3};
		distinctMethod(arr);
	}
}
