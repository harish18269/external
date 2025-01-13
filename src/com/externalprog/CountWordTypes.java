package com.externalprog;

public class CountWordTypes {

	public static void main(String[] args) {
		String str= "can you give me 10 bucks puff in 7.5 or 7";
		String[] arr = str.split(" ");
		int stringCount = 0, doubleCount = 0, intCount = 0, floatCount = 0;
		for(String word: arr) {
			try {
				Integer.parseInt(word);
				intCount++;
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				Float.parseFloat(word);
				floatCount++;
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				Double.parseDouble(word);
				doubleCount++;
			}catch(Exception e) {
				System.out.println(e);
			}
			stringCount++;
		}
		System.out.println("The output is:");
		System.out.println("String " + stringCount);
		System.out.println("integer " + intCount);
		System.out.println("double " + doubleCount);
	}

}
