package com.externalprog;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array= ");
		int n = sc.nextInt();
		
		String []arr1 = {"john", "adam", "john", "tom", "adam"};
		String []arr2 = {"tom", "john", "tom", "adam", "john"};
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for(int i = 0;i<n;i++) {
			set.add(arr1[i]+" "+arr2[i]);
			Iterator<String> itr = set.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println(set.size());
		}
	}

}
