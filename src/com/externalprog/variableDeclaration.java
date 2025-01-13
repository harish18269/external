package com.externalprog;

public class variableDeclaration {
		public static void main(String[] args) {
		int a =20, b = 10, c =30, result;
		
		result =  ((a>b)?(a>c)?a:c:(b>c)?b:c);
		System.out.println("Max of three number:" + result);
		
		for(int i=0; i<=10;i++) {
			if(i %2 != 0) {
				System.out.println(i);
			}
		}
	}
	
}
