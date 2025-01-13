package com.externalprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {1};
		List<Integer> res = findDuplicates(arr);
		System.out.println(res);
 
	}
	
	public static List<Integer> findDuplicates(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					list.add(arr[i]);
				}
			}
		}
		Collections.sort(list);
		return list;
	}

}
