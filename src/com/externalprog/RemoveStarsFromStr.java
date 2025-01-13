package com.externalprog;
import java.util.Stack;

public class RemoveStarsFromStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "leet**cod*e";
		String st = "erase*****";
		char[] arr = st.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '*' ){
                stack.pop();
            }else {
                stack.push(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        
        while(!stack.empty()){
            char c = stack.pop();
            sb.append(c);
   
        }
        System.out.println(sb.reverse().toString());
        
	}
	

}
