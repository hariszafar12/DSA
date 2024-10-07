package DSA;
// A linked list node
class Node31
{
 int data; // integer data
 Node31 next; // pointer to the next node
 public Node31(int data)
 {
 // set the data in allocated node and return the node
 this.data = data;
 this.next = null;
 }
}
class Queue1
{
 private static Node31 rear = null, front = null;
 // Utility function to remove front element from the queue and check for Queue Underflow
 public static int dequeue1() // delete at the beginning
 {
	 if (isEmpty()) {
         System.out.println("Queue Underflow");
         return -1;
     }

     int item = front.data;
     System.out.println("Removing " + item);

     front = front.next;

     // If the queue becomes empty, update rear to null
     if (front == null) {
         rear = null;
     }

     return item; }
 // Utility function to add an item in the queue
 public static void enqueue(int item) // insertion at the end
 {
 Node31 n =new Node31(item);
 if(rear==null) {
	 front=rear=n;
 }
 else {
	 rear.next=n;
	 rear=n;
 }
 }
 // Utility function to return top element in a queue
 public static int peek()
 {
 return front.data;
 }
 // Utility function to check if the queue is empty or not
 public static boolean isEmpty()
 {
 return front==null;
 }
}
public class SSS {
 public static void main(String[] args)
 {
 Queue1 q = new Queue1();
 q.enqueue(1);
 q.enqueue(2);
 q.enqueue(3);
 q.enqueue(4);
 System.out.printf("Front element is %d\n", q.peek());
 q.dequeue1();
 q.dequeue1();
 q.dequeue1();
 q.dequeue1();
 if (q.isEmpty()) {
 System.out.print("Queue is empty");
 } else {
 System.out.print("Queue is not empty");
 }
 }
}
