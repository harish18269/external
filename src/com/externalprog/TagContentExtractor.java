package com.externalprog;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class TagContentExtractor {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the no of lines of text:");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // consume newline left-over
	        System.out.println("enter the text");
	        for (int i = 0; i < n; i++) {
	            String line = scanner.nextLine();
	            String[] tags = line.split("<|>");
	            Stack<String> stack = new Stack<>();
	            StringBuilder content = new StringBuilder();
	            boolean inTag = false;

	            for (String tag : tags) {
	                if (tag.startsWith("/")) {
	                    String closingTag = tag.substring(1);
	                    if (!stack.isEmpty() && stack.peek().equals(closingTag)) {
	                        stack.pop();
	                        if (stack.isEmpty()) {
	                            inTag = false;
	                        }
	                    } else {
	                        content.setLength(0);
	                    }
	                } else if (!tag.isEmpty()) {
	                    stack.push(tag);
	                    inTag = true;
	                } else {
	                    if (inTag) {
	                        content.append(tag);
	                    }
	                }
	            }

	            if (content.length() == 0) {
	                System.out.println("None");
	            } else {
	                System.out.println(content.toString());
	            }
	}
}}
