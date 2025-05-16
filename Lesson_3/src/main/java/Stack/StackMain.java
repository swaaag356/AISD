package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        String[] strs = new String[]{"{}[]()", "{[}]", "((", "[}", "{[()]}{}"};
        boolean[] booleans = {check(strs[0]), check(strs[1]), check(strs[2]), check(strs[3]), check(strs[4])};
        System.out.println(Arrays.toString(booleans));
    }

    public static boolean check(String string) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : string.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char last = stack.pop();
                if (!((c == ')' && last == '(') ||
                        (c == '}' && last == '{') ||
                        (c == ']' && last == '['))) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
