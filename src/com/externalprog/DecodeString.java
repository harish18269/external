package com.externalprog;
import java.util.Stack;

import java.util.*;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String currentString = "";
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + c - '0';
            } else if (c == '[') {
                countStack.push(k);
                resultStack.push(currentString);
                currentString = "";
                k = 0;
            } else if (c == ']') {
                String prevString = resultStack.pop();
                int count = countStack.pop();
                StringBuilder sb = new StringBuilder(prevString);
                for (int i = 0; i < count; i++) {
                    sb.append(currentString);
                }
                currentString = sb.toString();
            } else {
                currentString += c;
            }
        }

        return currentString;
    }
}
