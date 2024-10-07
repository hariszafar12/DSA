package DSA;
class MyStack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element to the stack
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Utility function to pop a top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Utility function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Utility function to return the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
}

public class Queue3 {
    private MyStack s1, s2;

    // Constructor
    Queue3(int size) {
        s1 = new MyStack(size);
        s2 = new MyStack(size);
    }

    // Enqueue an item to the queue
    public void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue an item from the queue
    public int dequeue() {
        // If both stacks are empty, the queue is empty
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        // If s2 is empty, move all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        // Pop the element from s2 (the front of the queue)
        return s2.pop();
    }

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };

        Queue3 q = new Queue3(10);  // Set the stack size (10 in this case)

        // Insert above keys
        for (int key : keys) {
            q.enqueue(key);
        }

        // Dequeue elements
        System.out.println(q.dequeue()); // prints 1
        System.out.println(q.dequeue()); // prints 2
    }
}
