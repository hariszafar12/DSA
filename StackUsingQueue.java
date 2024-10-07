package DSA;
class MyQueue {
    private int arr[];
    private int front, rear, capacity, count;

    // Constructor to initialize a queue
    public MyQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to add an item to the queue
    public void enqueue(int item) {
        if (count == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Utility function to dequeue the front item from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // Utility function to check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Utility function to return the front item of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return arr[front];
    }

    // Utility function to get the current size of the queue
    public int size() {
        return count;
    }
}

public class StackUsingQueue {
    private MyQueue q1, q2;

    // Constructor to initialize the stack
    public StackUsingQueue(int size) {
        q1 = new MyQueue(size);
        q2 = new MyQueue(size);
    }

    // Push an item onto the stack
    public void push(int data) {
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }

        // Enqueue the new element into q1 (which is the stack's top)
        q1.enqueue(data);

        // Move all elements back from q2 to q1
        while (!q2.isEmpty()) {
            q1.enqueue(q2.dequeue());
        }
    }

    // Pop the top item from the stack
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        // The front of q1 holds the top element of the stack
        return q1.dequeue();
    }

    // Peek the top item of the stack
    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        // The front of q1 is the top element of the stack
        return q1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue(10);  // Set the queue size (10 in this case)

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Peek the top element
        System.out.println("Top element is: " + stack.peek());  // Should print 4

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());   // Should print 4
        System.out.println("Popped element: " + stack.pop());   // Should print 3

        // Push more elements
        stack.push(5);
        stack.push(6);

        // Peek and pop the remaining elements
        System.out.println("Top element is: " + stack.peek());  // Should print 6
        System.out.println("Popped element: " + stack.pop());   // Should print 6
        System.out.println("Popped element: " + stack.pop());   // Should print 5
        System.out.println("Popped element: " + stack.pop());   // Should print 2

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
