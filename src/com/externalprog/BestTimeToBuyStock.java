package com.externalprog;

public class BestTimeToBuyStock {

	public static void main(String[] args) {
		int []arr = {7,6,4,3,1};
		
		int maxProfit = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					maxProfit = Math.max((arr[j]-arr[i]), maxProfit);
				}
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					maxProfit = Math.max((arr[j]-arr[i]), maxProfit);
				}
			}
		}
		System.out.println("Best time is: " + maxProfit);
	}

}
