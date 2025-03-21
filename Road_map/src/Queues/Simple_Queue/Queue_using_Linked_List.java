package Queues.Simple_Queue;

class Node { // Fixed class name from 'node' to 'Node' (follows Java conventions)
    int data;
    Node next;

    Node(int d) {
        this.data = d; // Fixed incorrect assignment
        this.next = null;
    }
}

public class Queue_using_Linked_List {
    Node front, rear;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return; // Prevents an unnecessary assignment to `rear.next`
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); // New line for better formatting
        }
    }

    public static void main(String[] args) {
        Queue_using_Linked_List queue = new Queue_using_Linked_List();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display(); // Expected Output: 2 3

        queue.dequeue();
        queue.display(); // Expected Output: 2 3
    }
}
