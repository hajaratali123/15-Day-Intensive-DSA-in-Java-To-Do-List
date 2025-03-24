package Queues.Circular_Queue;

public class CircularQueue {

    int[] arr;
    int front,rear,size,capacity;
    public CircularQueue() {
        this.capacity = 10;
        arr = new int[capacity];
        front = -1;
        rear =-1;
    }
    boolean isEmpty() {
        return front == -1;
    }
    boolean isFull() {
        return (rear+1) % capacity == front;
    }
    void enQueue(int item) {
        if(isFull()) return;
        if(front == -1) front = 0;
        rear =(rear+1)%capacity;
        arr[rear] = item;

    }
    int deQueue() {
        if(isEmpty()) return -1;
        int item = arr[front];
        front = (front+1)%capacity;
        return item;
    }
    void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int temp = front;
        while(true) {
            System.out.print(arr[temp] + " ");
            if(temp == rear) break;
            temp = (temp+1)%capacity;
        }
        System.out.println();
    }




    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.enQueue(5);
        circularQueue.printQueue();
        circularQueue.deQueue();
        circularQueue.printQueue();

    }
}
