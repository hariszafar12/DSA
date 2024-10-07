package DSA;
class Queue
{
 private int arr[];
 private int front;
 private int rear;
 private int capacity;
 private int count;
 // Constructor to initialize queue
 Queue(int size)
 {
 arr = new int[size];
 capacity = size;
 front = 0;
 rear = -1;
 count = 0;
 }
 // Utility function to remove front element from the queue and check for Queue Underflow
 public void dequeue()
 {
	 if (isEmpty()) {
         System.out.println("Queue Underflow");
         return;
     }

     System.out.println("Removing " + arr[front]);

     front = (front + 1) % capacity;
     count--;
 }
 // Utility function to add an item to the queue and check for queue overflow
 public void enqueue(int item)
 { if (isFull()) {
     System.out.println("Queue Overflow");
     return;
 }
	 rear = (rear + 1) % capacity;
     arr[rear] = item;
     count++;
     }
 // Utility function to return front element in the queue and check for Queue Underflow
 public int top()
 {
	 if (isEmpty()) {
         System.out.println("Queue is empty");
         return -1;
     }
     return arr[front];
 }
 // Utility function to return the size of the queue
 public int size()
 {
 return count;
 }
 // Utility function to check if the queue is empty or not
 public Boolean isEmpty()
 {
 return count==0;
 }
 // Utility function to check if the queue is empty or not
 public Boolean isFull()
 {
 return count==capacity;
 }
}
public class sds
{
 // main function
 public static void main (String[] args)
 {
 // create a queue of capacity 5
 Queue q = new Queue(5);
 q.enqueue(1);
 q.enqueue(2);
 q.enqueue(3);
 System.out.println("Front element is: " + q.top());
 q.dequeue();
 System.out.println("Front element is: " + q.top());
 System.out.println("Queue size is " + q.size());
 q.dequeue();
 q.dequeue();
 if (q.isEmpty())
 System.out.println("Queue Is Empty");
 else
 System.out.println("Queue Is Not Empty");
 }
}