package com.externalprog;

import java.util.Scanner;

public class AadharCardCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check whether it's an valid aadhar card or not:");
		String str = sc.nextLine();
		boolean result = validAadharCheck(str);
		if(result) {
			System.out.println("The given " + str + " string is an valid aadhar card nmber.");
		}
		else {
			System.out.println("The given " + str + " string is not an valid aadhar card number.");
		}
		
	}

	public static boolean validAadharCheck(String str) {
		char[] ch = str.toCharArray();
		if(ch.length >12) {
			return false;
		}
		for(int i=0;i<ch.length;i++) {
			if(!Character.isDigit(ch[i]) || !Character.isSpaceChar(ch[i])){
				return false;
			}
		}
		return true;
	}
}
