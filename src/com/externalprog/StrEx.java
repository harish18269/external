package com.externalprog;

public class StrEx {

	public static void main(String[] args) {
		String str = "Hello   world   ";
		System.out.println("Length: " + str.length());
		int len = str.trim().length();
		System.out.println(len);
	}

}
