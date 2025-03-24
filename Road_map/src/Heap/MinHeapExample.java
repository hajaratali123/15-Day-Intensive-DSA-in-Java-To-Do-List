package Heap;

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(4);
        minHeap.add(10);
        minHeap.add(3);
        minHeap.add(5);
        minHeap.add(1);

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); // Output: 1 3 4 5 10
        }
    }
}
