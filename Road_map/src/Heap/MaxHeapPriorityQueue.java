package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);

        System.out.println("Priority Queue (Max-Heap Order): ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // Removes largest first
        }
    }
}
