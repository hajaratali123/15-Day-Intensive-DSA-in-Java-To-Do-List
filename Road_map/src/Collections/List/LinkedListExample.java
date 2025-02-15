package Collections.List;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.addFirst("Zara"); // Adding at the beginning

        System.out.println(names);  // Output: [Zara, Alice, Bob]
        names.removeLast();  // Removes "Bob"
        System.out.println(names);  // Output: [Zara, Alice]
    }
}
