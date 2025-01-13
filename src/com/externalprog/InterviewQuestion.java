package com.externalprog;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class InterviewQuestion {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string :");
//		String str = sc.nextLine();
//		methodToPrint(str);
		String input = "a12b10c12d4";
        StringBuilder output = new StringBuilder();
        StringBuilder numBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                if (numBuilder.length() > 0) {
                    int count = Integer.parseInt(numBuilder.toString());
                    numBuilder.setLength(0);
                    for (int j = 0; j < count; j++) {
                        output.append(c);
                    }
                } else {
                    output.append(c);
                }
            } else {
                numBuilder.append(c);
            }
        }

        if (numBuilder.length() > 0) {
            int count = Integer.parseInt(numBuilder.toString());
            char lastChar = output.charAt(output.length() - 1);
            for (int j = 0; j < count - 1; j++) {
                output.append(lastChar);
            }
        }

        System.out.println(output.toString());
	
//	public static void methodToPrint(String str) {
//		char []ch = str.toCharArray();
//		System.out.println(Arrays.toString(ch));
//		Stack<Character> stack = new Stack<>();
//		int num = 0;
//		for(char c: ch) {
//			if(Character.isLetter(c)) {
//				stack.push(c);
//			}else if(Character.isDigit(c)) {
//				while(Charcter.)
//			}
//		}
	}

}
