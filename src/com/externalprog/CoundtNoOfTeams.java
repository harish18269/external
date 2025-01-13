package com.externalprog;

public class CoundtNoOfTeams {

	public static void main(String[] args) {
		int[] arr = {3,6,7,5,1};
		int result = countTeams(arr);
		System.out.println("count is : " + result);
	}
	
	public static int countTeams(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i] > arr[j] && arr[j] > arr[k] ) {
						count +=1;
					}else if(arr[i] < arr[j] && arr[j] < arr[k]) {
						count +=1;
					}
				}
			}
		}
		return count;
	}
}
