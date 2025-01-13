package com.externalprog;

import java.util.Scanner;

public class DisplayNextFiveLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter: ");
		char ch = sc.next().charAt(0);
		printLetters(ch);

	}
	
	public static void printLetters(char ch) {
		for(int i=0;i<5;i++) {
			ch++;
			if(ch >'Z' && ch < 'a') {
				ch = 'a';
			}else if(ch > 'z') {
				ch ='A';
			}
			System.out.print(ch +" ");
		}
	}

}
