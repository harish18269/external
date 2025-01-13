package com.externalprog;

import java.util.Scanner;

public class PalindromeCheck {
	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		s = s.toLowerCase();
		
		while(left<right) {
			
			while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			
			while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an String to check whether it's an palindrome or not: ");
		String s = sc.nextLine();
		boolean result = isPalindrome(s);
		if(result == true) {
			System.out.println("Given string is an palindrome.");
		}else {
			System.out.println("Given string is not an palindrome.");
		}
	}
}
