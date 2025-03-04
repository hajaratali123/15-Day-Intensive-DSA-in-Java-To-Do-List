package Stacks;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "{[()]}";
        System.out.println("Is balanced? " + isBalanced(expr));
    }
}
