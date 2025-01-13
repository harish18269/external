package com.externalprog;

import java.util.ArrayList;

public class Solution {
	    public void kidsWithCandies(int[] candies, int extraCandies) {
	        ArrayList<Boolean> list = new ArrayList<>();
	        int max = 0;
	        for(int i=0;i<candies.length;i++){
	            max = Math.max(candies[i], max);
	        }
	        System.out.println(max);
	}
}
