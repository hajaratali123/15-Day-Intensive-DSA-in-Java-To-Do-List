package Queues.Simple_Queue;

public class Queue {
    int arr[];

    int front, rear, size,capacity;

    public Queue() {
        this.capacity=100;
        arr = new int[capacity];
        front =0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }
    boolean isFull() {
        return size == capacity;
    }
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            rear=(rear+1)%capacity;
            arr[++rear] = data;
            size++;

        }
    }

     int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        int data=arr[front];
        front=(front+1)%capacity;
        size--;
        return data;
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int i = front;  // Use a temporary variable instead of modifying 'front'
            while (i != rear) {
                System.out.print(arr[i] + " ");
                i = (i + 1) % capacity;
            }
            System.out.println(arr[rear]); // Print the last element explicitly
        }
    }
    int peek(){
        if(isEmpty()) return -1;
        return arr[front];

    }
    int rear(){
        if(isEmpty()) return -1;
        return arr[rear];
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.rear());
    }
}
