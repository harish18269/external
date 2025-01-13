package com.externalprog;

import java.util.Scanner;

public class OTPGeneration {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String=");
		String str = sc.nextLine();
		
		if(str.length() != 14) {
			System.out.println(str + " is an invalid length.");
			return;
		}
		
		if(!str.substring(0, 2).matches("[A-Z]{2}") ) {
			System.out.println(str + " is an invalid string.");
			return;
		}
		
		String mobileNum = str.substring(2,12);
		if(!mobileNum.matches("[6-9]\\d{9}")) {
			System.out.println(mobileNum + " is not an valid mobile number");
			return;
		}
		
		int age = 0;
		try {
			age = Integer.parseInt(str.substring(12));
			if(age<21 || age > 30) {
				System.out.println(age + " is not an valid age");
				return;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		String otp = "";
		for(int i=1;i<mobileNum.length();i += 2) {
			otp += mobileNum.charAt(i);
		}
		
		otp += age;
		
		System.out.println("OTP:" + otp);
	}

}
