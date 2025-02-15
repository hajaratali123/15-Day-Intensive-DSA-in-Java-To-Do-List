package Collections.List;

import java.util.*;

public class ListComparison {
    public static void main(String[] args) {
        // Creating Lists
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();

        // Adding elements
        arrayList.add(10); arrayList.add(20); arrayList.add(30);
        linkedList.add(10); linkedList.add(20); linkedList.add(30);
        vector.add(10); vector.add(20); vector.add(30);
        stack.push(10); stack.push(20); stack.push(30);  // Using push() for Stack

        // Displaying contents
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Vector: " + vector);
        System.out.println("Stack: " + stack);

        // Removing elements
        arrayList.remove(1);  // Removes element at index 1
        linkedList.remove(1);
        vector.remove(1);
        stack.pop();  // Removes top element in Stack

        System.out.println("\nAfter Removal:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Vector: " + vector);
        System.out.println("Stack: " + stack);
    }
}

