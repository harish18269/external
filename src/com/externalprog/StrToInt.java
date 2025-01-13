package com.externalprog;

public class StrToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int myAtoi(String s) {
        String str = "";
        s = s.trim();
        int i =0 ;
        while(s.charAt(i) == '0'){
             i++;
        }
        for(int j=i;j<s.length();j++){
         if(Character.isDigit(s.charAt(j))){
             str += s.charAt(j);
         }
         else if(Character.isLetter(s.charAt(j))){
             break;
         }else{
             str += s.charAt(j);
         }
        }
        if(str.isEmpty()){
         return 0;
        }
        return Integer.parseInt(str);
	 }
}
