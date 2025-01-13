package com.externalprog;

public class Stack {
	int size;
	int[] intArr;
	int top;
	public Stack(int size) {
		this.size = size;
		intArr = new int[size];
		top = -1;
	}
	
	public void push(int data) {
		if(!isFull()) {
			intArr[++top] = data;
		}else {
			System.out.println("Stack is full");
		}
	}
	
	public int pop() {
		return intArr[top--]; 
	}
	
	public int peek() {
		return intArr[top];
	}
	
	public boolean isFull() {
		if(top == size-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
}
