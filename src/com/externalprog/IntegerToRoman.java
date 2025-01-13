package com.externalprog;

import java.util.Scanner;

public class IntegerToRoman {
	public static String ITRMethod(int num) {
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		
		StringBuilder roman = new StringBuilder();
		
		for(int i=0;i<values.length;i++) {
			while(num>=values[i]) {
				roman.append(symbol[i]);
				num -= values[i];
			}
		}
		return roman.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an Integer Value to convert into Roman String: ");
		
		int num = sc.nextInt();
		String roman = ITRMethod(num);
		
		System.out.println("The Roman String of the given value: " +roman);
	}
}
