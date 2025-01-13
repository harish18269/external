package com.externalprog;

import java.util.Scanner;

public class BusTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bus ticket price: ");
		int num = sc.nextInt();
		
		int res = reverseBusTicket(num);
		System.out.println("The correct bus ticket price is: " + res);		
	}
	
	public static int reverseBusTicket(int n) {
		int result = 0;
		while(n > 0) {
			int digit = n % 10;
			if(digit != 0) {
				result = result * 10 + digit;
			}
			n /= 10;			
		}
		
		return result;

	}		
}
