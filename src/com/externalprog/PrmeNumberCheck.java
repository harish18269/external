package com.externalprog;

import java.util.Scanner;

public class PrmeNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int n = sc.nextInt();
		int factor = 0;
		if(n < 2)
			System.out.println("Given number " +n + " is not a prime number.");
		for(int i=2;i<n/2;i++) {
			if(n % i ==0)
				factor ++;
		}
		
		if (factor !=0) {
			System.out.println("Given number " + n +" is not a prime number.");
		}else {
			System.out.println("Given number " + n + " is a prime number.");
		}

	}

}
