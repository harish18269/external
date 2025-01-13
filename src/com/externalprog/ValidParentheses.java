package com.externalprog;
import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with brackets only: ");
		String str = sc.nextLine();
		System.out.println("The given string is valid : " +validCheck(str));
	}
	
	public static boolean validCheck(String str) {
		Stack<Character> stack = new Stack<>();
		char[] ch = new char[128];
		ch[')'] = '(';
		ch['}'] = '{';
		ch[']'] = '[';
		
		for(char c: str.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}else if(c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty() || stack.pop() !=ch[c]) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
