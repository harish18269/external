package com.externalprog;

public class StackImplThroughArray {

	public static void main(String[] args) {
		Stack s = new Stack(5);
		
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		
		System.out.println("Element at top: " + s.peek());
		System.out.println("Elements: ");
		
		while(!s.isEmpty()) {
			int data = s.pop();
			System.out.println(data);
		}
		System.out.println("stack is full:: " + s.isFull());
		System.out.println("stack is Empty:: " + s.isEmpty());
	}
	
}
