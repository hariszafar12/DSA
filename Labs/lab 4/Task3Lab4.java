class Task3Lab4
{
        private int arr[];
        private int front;
        private int rear;
        private int capacity;
        private int count;
 // Constructor to initialize queue
 Task3Lab4(int size)
    {
            arr = new int[size];
            capacity = size;
            front = 0;
            rear = 0;
            count = 0;
    }
 // Utility function to remove front element from the queueand check for Queue Underflow
 public void dequeue()
        {

        // Write your code here
        }
 // Utility function to add an item to the queue and checkfor queue overflow
 public void enqueue(int item)
        {
            if(count < arr.length){
                arr[count] =item;
                count++;
                capacity--;
            }
        }
 // Utility function to return front element in the queue andcheck for Queue Underflow
 public int peek()
        {
      return arr[front++];
        }
 // Utility function to return the size of the queue
 public int size()
        {
        return capacity;
        }
 // Utility function to check if the queue is empty or not
 public Boolean isEmpty()
        {
        boolean a = false;
            if(count<0){
                a=true;
            }
            return a;
        }
 // Utility function to check if the queue is empty or not
 public Boolean isFull()
        {
            boolean a = false;
            if(count>arr.length-1){
                a=true;
            }
            return a;
        }
}
class Main
{
 // main function
 public static void main (String[] args)
 {
 // create a queue of capacity 5
        Task3Lab4 q = new Task3Lab4(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is " + q.size());
        q.dequeue();
        q.dequeue();
        if (q.isEmpty())
        System.out.println("Queue Is Empty");
        else
        System.out.println("Queue Is Not Empty");
 }
} 