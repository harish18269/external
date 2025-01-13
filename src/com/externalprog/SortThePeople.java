package com.externalprog;

import java.util.Scanner;

public class SortThePeople {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the names and hieghts arrays: ");
		int len = sc.nextInt();
		System.out.println("Enter the names of the array with a space seperated values: ");
		String []names = new String[len];
		for(int i = 0;i<len;i++) {
			names[i] = sc.nextLine();
		}
		sc.nextLine();
		System.out.println("Enter the heights of the array members with the space separated values: ");
		int heights[] = new int[len];
		for(int i=0;i<len;i++) {
			heights[i] = sc.nextInt();
		}

		String []result = sortPeople(names, heights);
		
		for(String name: result) {
			System.out.print(name + " ");
		}
	}
	
	public static String[] sortPeople(String[] names, int[] heights) {
		for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        return names;
	}

}
