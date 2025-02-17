package Collections.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // HashSet: No order, allows one null
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");  // Duplicate, will be ignored
         // Allowed

        // LinkedHashSet: Maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>(hashSet);

        // TreeSet: Sorted, does not allow null
      Set<String> treeSet = new TreeSet<>(hashSet);
     //   treeSet.remove(null); // Remove null to prevent exception (TreeSet does not allow null)

        // Print Sets
        System.out.println("HashSet: " + hashSet);          // [null, Apple, Orange, Banana]
       System.out.println("LinkedHashSet: " + linkedHashSet);  // [Apple, Banana, Orange]
        System.out.println("TreeSet: " + treeSet);          // [Apple, Banana, Orange]
    }
}
