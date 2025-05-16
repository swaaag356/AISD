package org.example;

import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        String exp = "3 5 4 + +  56 *";
        System.out.println(calculate(exp));
    }

    public static int calculate(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] strs = expression.split("\\s+");
        Integer result = 0;
        for (String s : strs) {
            switch (s) {
                case "+" -> {
                    result += stack.pop();
                    result += stack.pop();
                    }
                case "*" -> {
                    result *= stack.pop();
                    result *= stack.pop();
                }

                case "-" -> {
                    while (!stack.isEmpty()){
                        result -= stack.pop();
                        result -= stack.pop();
                    }
                }

                default -> stack.push(Integer.parseInt(s));
            }
        }
        return result;
    }
}
