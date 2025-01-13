package com.externalprog;

import java.util.*;
import java.util.Stack;

public class TagCExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lines");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline left-over
        System.out.println("enter text");
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            System.out.println(parseTags(line));
        }
    }

    public static String parseTags(String line) {
        Stack<String> tags = new Stack<>();
        StringBuilder content = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean inTag = false;

        for (char c : line.toCharArray()) {
            if (c == '<') {
                if (inTag) {
                    temp.append(c);
                } else {
                    inTag = true;
                    temp = new StringBuilder();
                    temp.append(c);
                }
            } else if (c == '>') {
                temp.append(c);
                String tag = temp.toString();
                if (tag.startsWith("</")) {
                    if (tags.isEmpty() || !tags.peek().equals(tag.substring(2, tag.length() - 1))) {
                        return "None";
                    }
                    tags.pop();
                    if (tags.isEmpty()) {
                        return content.toString();
                    }
                } else {
                    tags.push(tag.substring(1, tag.length() - 1));
                }
                inTag = false;
                temp = new StringBuilder();
            } else if (inTag) {
                temp.append(c);
            } else {
                content.append(c);
            }
        }

        return tags.isEmpty() ? content.toString() : "None";
    }
}
