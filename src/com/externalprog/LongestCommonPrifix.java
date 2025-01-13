package com.externalprog;

public class LongestCommonPrifix {

	public static void main(String[] args) {
		String[] arr = {"flower","flow","flight"};
		String result = longCommonPrefixCheck(arr);
		if(result.length() != 0) {
		System.out.println(result);
		}else {
			System.out.println("null");
		}
	}
	
	public static String longCommonPrefixCheck(String[] arr) {
		String str = "";
		int i=0,j=0,k=0;
		String first = arr[0];
		String second = arr[1];
		String third = arr[2];
		
		while(i<first.length()) {
			while(j<second.length()) {
				if(first.charAt(i) == (second.charAt(j))){
					while(k<third.length()) {
						if(first.charAt(i) == third.charAt(k)) {
							str +=first.charAt(i);
							break;
						}else {
						k++;
						}
					}
					break;
				}else {
				j++;
				}
			}
			i++;
		}
		
		return str;
	}

}
