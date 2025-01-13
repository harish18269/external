package com.externalprog;

import java.util.Scanner;

public class TableUsingRecurssion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print the multiplication table: ");
		int num = sc.nextInt();
		System.out.println("The multiplicaton table for the given number is:");
		tableMethod(num,1);
	}
	
	public static  void tableMethod(int num, int count) {
		if(count <=10 ) {
			System.out.println(num + " * " + count + " = " +(num * count));
			count ++;
			tableMethod(num,count++);
		}
	}

}
