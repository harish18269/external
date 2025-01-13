package com.externalprog;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		String s = "Hello";
		char[] charr = s.toCharArray();
		Stack stack = new Stack(s.length());
		for(int i = 0; i < s.length();i++) {
			char c = s.toLowerCase().charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				stack.push(c);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<s.length();j++) {
			char ch = s.toLowerCase().charAt(j);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				sb.append(stack.pop());
			}else {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	
	}

}
