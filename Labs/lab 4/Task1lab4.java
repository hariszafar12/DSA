class Stack
{
 private int arr[];
 private int top;
 private int capacity;
 // Constructor to initialize stack
 Stack(int size)
 {
 arr = new int[size];
 capacity = size;
 top = -1;
 }
 // Utility function to add an element x in the stack andcheck for stack overflow
 public void push(int x)
 {
        if(top > arr.length){
            System.out.println(" Stack is full");
        }
        else{
            arr[++top]=x;
            capacity --;
            
        }
 }
 // Utility function to pop top element from the stack and check for stack underflow
 public int pop()
 {
    int a=0;
    if(top <0){
        System.out.println(" Stack is empty!");
    }
    else{
        a= arr[top--];
        capacity ++;
       // System.out.println(arr[top--]);
        
    }
    return a;
 }
 // Utility function to return top element in a stack
 public int top()
 {
 // Write your code here
 
 return arr[top];
 }
 // Utility function to return the size of the stack
 public int size()
 {
 // Write your code here
 
 return capacity;
 }
 // Utility function to check if the stack is empty or not 
  public boolean isEmpty()
 {
    boolean a=false;
    if(top < 0){
     a = true;
    }
     return a;
    
 // Write your code here
 }
 // Utility function to check if the stack is full or not
 public boolean isFull()
 {
    boolean b = false;
 // Write your code here
 if(top >arr.length){
         b = true;
    
 }
        return b;
 }
 public static void main (String[] args)
 {
 Stack stack = new Stack(5);
 stack.push(1); // Inserting 1 in the stack
 stack.push(2); // Inserting 2 in the stack
 stack.pop(); // removing the top 2
 stack.pop(); // removing the top 1
 stack.push(3); // Inserting 3 in the stack
 stack.push(5);
 System.out.println("Top element is: " + stack.top());
 System.out.println("Stack capacity is " + stack.size());
 //stack.pop(); // removing the top 3
 // check if stack is empty
 if (stack.isEmpty())
 System.out.println("Stack Is Empty");
 else
 System.out.println("Stack Is Not Empty");
 }

}
