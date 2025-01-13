package com.externalprog;

public class NoOfSeniorCitizens {

	public static void main(String[] args) {
		String []arr = {"7868192809M7522","8989767564F9211","7654768978F4010"};
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			String str = arr[i].substring(11,13);
//			System.out.println(str);
			int num = Integer.parseInt(str);
			if(num > 60) {
				count ++;
			}
		}
		System.out.println("the count is: " + count);
	}

}
