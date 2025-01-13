package com.externalprog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JavaBraces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		list.add(str);
		
		for(String s: list) {
			System.out.println(isBalanced(s));
		}

	}
	
	public static String isBalanced(String s){
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{') {
				st.push(ch);
			}else if(ch == ')' || ch == '}') {
				if(st.isEmpty()) {
					return "false";
				}
				char top = st.pop();
				if(ch == ')' && top !=')' || ch =='}' && top !='}') {
					return "false";
				}
			}
		}
		if(!st.isEmpty()) {
			return "false";
		}
		return "true";
	}

}
