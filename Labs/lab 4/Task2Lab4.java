
class Task2Lab4

{
class Node
{
        int data; // integer data
        Node next; // pointer to the next node
        Node(int data){
            this.data = data;
            this.next = null;
        }
}

    private Node top;
     public Stack() {
    this.top = null;
 }
    int size=0;
    Node head;

     // Utility function to add an element x in the stack
 public void push(int x) // insert at the beginning
 {
    Node newNode = new Node(x);
 if(head==null){
    head= newNode;
 }
    else{
       newNode.next=head;
       head=newNode;
       size++;

    }
 }

 public boolean isEmpty()
 {
    boolean a=false;
    if (head == null) {
        a= true;
        
    }
    return a;
 }

 /// Utility f9unction to return top element in a stack
 public int top()
 {
    int a=0;
    if (isEmpty()) {
        System.out.println(" our list is empty.");
        
    }else{
         a=head.data;
    }
    return a;
 }
 // Utility function to pop top element from the stack andcheck for Stack underflow
 public int  pop()
 {
   int a=0;
    if (isEmpty()) {
        System.out.println(" our list is empty.");
        
    }else{
      
        a= head.data;
        head=head.next;
         
       
         size--;
    }
    return a;

 }

}
class StackImpl
{
 public static void main(String[] args)
 {
 Task2Lab4 stack= new Task2Lab4();
 stack.push(1);
 stack.push(2);
 stack.push(3);
 System.out.println("Top element is " + stack.top());
 stack.pop();
 stack.pop();
 stack.pop();
 
// stack.pop();

 if (stack.isEmpty()) {
 System.out.print("Stack is empty");
 } else {
 System.out.print("Stack is not empty");
 }
 }
}