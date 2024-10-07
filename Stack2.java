package DSA;
// A linked list node
class Node30
{
 int data; // integer data
 Node30 next; // pointer to the next node
 
 Node30(int data){
	 this.data=data;
	 this.next=null;
 }
}
class Stack3
{
 private Node30 top;
 public Stack3() {
 this.top = null;
 }
 // Utility function to add an element x in the stack
 public void push(int x) // insert at the beginning
 {
	 Node30 n=new Node30(x);
 if(top==null) {
	 top=n;
 }
 else {
	n.next=top;
	top=n;
 }
 }
 // Utility function to check if the stack is empty or not
 public boolean isEmpty()
 {
 return top==null;
 }
 // Utility function to return top element in a stack
 public int top()
 {
 return top.data;
 }
 // Utility function to pop top element from the stack and check for Stack underflow
 public void pop() // remove at the beginning
 {

 if(top==null) {
	 System.out.println("stack empty");
 }
 else {
	 top=top.next;
 }
 }
}
public class Stack2{
 public static void main(String[] args){
 Stack3 stack = new Stack3();
 stack.push(1);
 stack.push(2);
 stack.push(3);
 System.out.println("Top element is " + stack.top());
 stack.pop();
 stack.pop();
 stack.pop();
 if (stack.isEmpty()) {
 System.out.print("Stack is empty");
 } else {
 System.out.print("Stack is not empty");
 }
 }
} 