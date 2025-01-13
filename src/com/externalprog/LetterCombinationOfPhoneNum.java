package com.externalprog;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNum {

	public static void main(String[] args) {
		String digits = "23";
		List<String> result = letterCombinations(digits); 
		System.out.println(result); 
	}
	
	public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
        for(int i=0;i<digits.length();i++){
        	char ch = digits.charAt(i);
        	int num = ch - '0';
//            int num = Integer.parseInt(digits.charAt(i));
            switch(num){
                case 2:
                    list.add("abc");
                    break;
                case 3:
                    list.add("def");
                    break;
                case 4:
                    list.add("ghi");
                    break;
                case 5:
                    list.add("jkl");
                    break;
                case 6:
                    list.add("mno");
                    break;
                case 7:
                    list.add("pqrs");
                    break;
                case 8:
                    list.add("tuv");
                    break;
                case 9:
                    list.add("wxyz");
                    break;
            }
        }
        if (list.size() < 2) {
            return list;
        }
        List<String> result = new ArrayList<>();
        for (String s1 : list.get(0).split("")) {
            for (String s2 : list.get(1).split("")) {
                result.add(s1 + s2);
            }
        }
        return result;
    }
}
