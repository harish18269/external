package com.externalprog;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str,":");
		while(st.hasMoreElements()) {
			if(((String) st.nextElement()).equalsIgnoreCase("Rohit Sharma")) {
				System.out.println("Opener and Star Batter: "+st.nextElement());
			}else if(((String) st.nextElement()).equalsIgnoreCase("Virat Kohli")){
				System.out.println("Opener and GOAT: "+st.nextElement());
			}else {
			System.out.print(st.nextElement()+", ");
			}
		}

	}

}