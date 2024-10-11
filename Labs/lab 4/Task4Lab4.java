class Task4Lab4 
{
    class Node 
{ 
    int data;       // integer data   
    Node next;      // pointer to the next node   
 
    public Node(int data) 
    { 
        // set the data in allocated node and return the node   
        this.data = data; 
        this.next = null; 
    } 
}
 Node head=null;  
    private static Node rear = null, front = null;
    public  int dequeue()     // delete at the beginning   
    {  int num=0;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            num=head.data;
            head=head.next;
       
        } 
    return num ;
}
 
    // Utility function to add an item in the queue   
    public  void enqueue(int item)    // insertion at the end   
    {  Node temp=head;
           
        Node node = new Node(item);
        // Write your code here   
        if(head== null){
            head=node;
        }
        else{
            while(temp.next!=null){
                temp= temp.next;
               // temp.next=node;
            }
             temp.next=node;
        }
    } 
 
    // Utility function to return top element in a queue   
    public  int peek() 
    { 
        int a=0;
        if(head==null){
            System.out.println(" Queue is empty");
        }   
        else{
             a = head.data;
            
        }
        return a;
    } 
 
    // Utility function to check if the queue is empty or not   
    public  boolean isEmpty() 
    { 
        boolean b= false;
        if(head==null){
            b=true;
        }   
        return b;
    } 
}

class Main { 
    public static void main(String[] args) 
    { 
        Task4Lab4 q = new Task4Lab4(); 
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 
        q.enqueue(4); 
 
        System.out.printf("Front element is %d\n", q.peek()); 
 
        q.dequeue(); 
        q.dequeue(); 
        q.dequeue(); 
        // q.dequeue(); 
        // q.dequeue(); 
       
        if (q.isEmpty()) { 
            System.out.print("Queue is empty"); 
        } else { 
            System.out.print("Queue is not empty"); 
        }
    }
}