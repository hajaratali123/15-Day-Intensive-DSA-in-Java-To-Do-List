package Stacks;

import java.util.Stack;

public class SortStack {
    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        sort(stack);
        insertSorted(stack, top);
    }

    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println("Original Stack: " + stack);

        sort(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

