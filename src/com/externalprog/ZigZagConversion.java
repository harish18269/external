package com.externalprog;

public class ZigZagConversion {

	public static void main(String[] args) {
//		String s = "P    A    H    N\nA  P  L  S  I  I  G\nY    I    R";
		String s2 = "P     I    N\nA   L S  I  G\nY A   H R   \nP     I";
		System.out.println("Original Stirng: ");
		System.out.println(s2);
		String res = zigzagMethod(s2);
		System.out.println("Modified String: " + res);
	}
	
	public static String zigzagMethod(String s) {
		return s.replaceAll("\\s+","").replace("\n","");
	}
}
