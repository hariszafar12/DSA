package DSA;
class Node13{
 int data;
 Node13 next;
 //Constructor
 Node13(int data)
 {
 this.data=data;
 this.next=null;
 }
}
class LinkedList1{
 Node13 head;
 void addToBack(int data)
 {
 Node13 node=new Node13(data);
 if(head==null) {
 head=node;
 }
 else{
 Node13 n=head;
 while(n.next!=null)
 n=n.next;
 n.next=node;
 }
 }
 void printList() {
 Node13 node = head;
 while (node.next != null){
 System.out.print(node.data + " ");
 node = node.next;
 }
 System.out.print(node.data + " ");
 }
 void listlength() {
	 Node13 current = head;
	 int a=0;
	 if(head==null) {
		 a=1;
		 System.out.println("length of linked list:"+a);
	 }
	 else {
		 while(current!=null) {
			 a++;
			 current=current.next;
		 }
		 System.out.println("length of linked list:"+a);
	 }
 }
 }
public class Node12 {
 public static void main(String[] args) {
 LinkedList1 ll=new LinkedList1();
 ll.addToBack(5);
 ll.addToBack(19);
 ll.addToBack(22);
 ll.printList();
 ll.listlength();
 }
}