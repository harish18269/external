package com.externalprog;

import java.util.Scanner;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		if(x<0 || x%10 == 0 && x !=0) {
			return false;
		}
		
		int reversed = 0;
		int original = x;
		
		while(x>0) {
			int digit = x%10;
			x /=10;
			
			if(reversed>(Integer.MAX_VALUE - digit)/10) {
				return false;
			}
			
			reversed = reversed * 10 + digit;
		}
		return original == reversed;
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a number to check whether it's an palindrome (or) not:");
		int x = sc.nextInt();
		boolean res = isPalindrome(x);
		
		if(res) {
			System.out.println("The given number "+x+" is an palindrome.");
		}else {
			System.out.println(x+" number is not an palindrome.");
		}
	}
}
