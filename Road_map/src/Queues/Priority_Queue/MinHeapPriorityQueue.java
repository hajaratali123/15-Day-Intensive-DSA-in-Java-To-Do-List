package Queues.Priority_Queue;

//Java provides a built-in PriorityQueue class that
// by default works as a Min-Heap (smallest element has the highest priority).

import java.util.PriorityQueue;

public class MinHeapPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);

        System.out.println("Priority Queue (Min-Heap Order): ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // Removes and prints in sorted order
        }
    }
}
