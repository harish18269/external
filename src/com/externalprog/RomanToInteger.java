package com.externalprog;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
	public static int RTIMethod(String s) {
			HashMap<Character, Integer> map = new HashMap<>();
			map.put('I', 1);
			map.put('V', 5);
			map.put('X', 10);
			map.put('L', 50);
			map.put('C', 100);
			map.put('D', 500);
			map.put('M', 1000);
			
			int total = 0;
			int length = s.length();
			
			for(int i=0;i<length;i++) {
				int curValue = map.get(s.charAt(i));
				
				if(i+1<length && map.get(s.charAt(i+1))>curValue) {
					total -= curValue;
				}else {
					total += curValue;
				}
			}
			return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an Roman String to convert it into Integer value: ");
		String s = sc.nextLine();
		
		int result = RTIMethod(s);
		System.out.println("The value of the Roman String is:" +result);
	}
}
