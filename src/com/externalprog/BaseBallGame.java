package com.externalprog;

import java.util.Iterator;
import java.util.Stack;

public class BaseBallGame {
	
	public static int count(String[] ops) {
		Stack<Integer> s = new Stack<>();
		for(int i = 0; i < ops.length; i++) {
			if(ops[i].equals("C")) {
				if(s.size() > 0) {
					s.pop();
				}
			}else if(ops[i].equals("D")) {
				if(s.size() > 0) {
					int x = s.peek() * 2;
					s.push(x);
				}
			}else if(ops[i].equals("+")) {
				if(s.size() >= 2) {
					int x = s.peek() + s.elementAt(s.size() - 2);
					s.push(x);
				}
			}else {
				int num = Integer.parseInt(ops[i]);
				s.push(num);
			}
		}
		
		Iterator<Integer> itr = s.iterator();
		
		int total = 0;
		while(itr.hasNext()) { 
		    total += itr.next();
		}
		return total;
	}

	public static void main(String[] args) {
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		int value = count(ops);
		System.out.println(value);
	}
	
	}
