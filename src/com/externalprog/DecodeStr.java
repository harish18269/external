package com.externalprog;
import java.util.Stack;

public class DecodeStr {

	public static void main(String[] args) {
		String s = "4[ab5[t]]ef";
		Stack<Character> stack = new Stack<>();
		String str = "";
		String res = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}else if(s.charAt(i) == ']') {
				while(!(stack.peek() == '[')) {
					str += stack.pop();
				}
				stack.pop();
				char ch = stack.pop();
				int n = ch - '0';
				for(int j=0;j<n;j++) {
					res +=str;
				}
				int k = 0;
				while(k< res.length()) {
					stack.push(res.charAt(k));
					k++;
				}
				res = "";
				str = "";
			}
			else {
				stack.push(s.charAt(i));
			}
		}
		StringBuilder sb = new StringBuilder();
		while(stack.size() !=0) {
			sb.append(stack.pop());
		}
		System.out.println("Your string is : " + sb.toString());
	}

}
