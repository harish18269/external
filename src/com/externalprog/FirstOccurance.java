package com.externalprog;

public class FirstOccurance {

	public static void main(String[] args) {
		String str = "leetcode";
		String sub = "leeto";
		System.out.println(occuranceCheck(str, sub));

	}
	
	public static int occuranceCheck(String str, String subStr) {
		int res = str.indexOf(subStr);
		if(res < 0) {
			return -1;
		}
		return res;
	}
}
