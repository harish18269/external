package com.externalprog;

import java.util.Scanner;

public class PrintDigitTimes {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		String str = String.valueOf(n);
		String[] arr = str.split("");
//		for(int j = 0;j<str.length();j++) {
//			arr[j] = str.split("");
//		}
//		System.out.println(str);
		for(int i = 0;i<arr.length;i++) {
			int num = Integer.parseInt(arr[i]);
//			System.out.println(num);
			int p = 0;
			while(p<num) {
				System.out.print(num);
				p++;
			}
		}
		}

}
