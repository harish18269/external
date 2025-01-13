package com.externalprog;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		System.out.println("Enter the elements : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int []res = plusOne(arr);
		System.out.println("the array: " + Arrays.toString(res));
	}
	
	public static int[] plusOne(int[] digits) {
        String st = "";
    
        for(int i =0;i<digits.length;i++){
            st += String.valueOf(digits[i]);
        }
        int num = Integer.parseInt(st);
        num = num+1;
        String word = String.valueOf(num);
        int[] res = new int[word.length()];

        for(int j=0;j<word.length();j++){
            res[j] = Integer.parseInt(String.valueOf(word.charAt(j)));
        }

        return res;
    }

}
