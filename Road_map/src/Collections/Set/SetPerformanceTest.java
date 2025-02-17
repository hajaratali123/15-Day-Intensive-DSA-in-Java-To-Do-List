package Collections.Set;

import java.util.*;

public class SetPerformanceTest {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        int n = 100000;

        // Measure time for HashSet
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet Insertion Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure time for TreeSet
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("TreeSet Insertion Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
