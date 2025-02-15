package Collections.List;

import java.util.*;

public class ListPerformanceTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Number of elements
        int n = 100000;

        // Measure time for ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i);  // Insert at the beginning
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList Insertion Time: " + (endTime - startTime) / 1e6 + " ms");

        // Measure time for LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(0, i);  // Insert at the beginning
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Insertion Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
