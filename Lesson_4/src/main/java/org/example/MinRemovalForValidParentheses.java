package org.example;

import java.util.Scanner;
import java.util.Stack;

public class MinRemovalForValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(minRemoveToMakeValid(s));
    }

    public static int minRemoveToMakeValid(String s) {
        int open = 0;
        int removals = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                open++;
            } else if (c == ')' || c == '}' || c == ']') {
                if (open == 0) {
                    removals++;
                } else {
                    open--;
                }
            }
        }
        removals += open;

        return removals;
    }
}