package DSA;
class Node1{
 int data;
 Node1 next;
 //Constructor
 Node1(int data)
 {
 this.data=data;
 this.next=null;
 }
}
class LlinkedList{
 Node1 head;
int a=0;
 void addToBack(int data)
 {
 Node1 node=new Node1(data);
 if(head==null) {
 head=node;
 }
 else{
 Node1 n=head;
 while(n.next!=null)
 n=n.next;
 n.next=node;
 }
 }
 void printList() {
 Node1 node = head;
 while (node.next != null){
 System.out.print(node.data + " ");
 node = node.next;
 }
 System.out.print(node.data + " ");
 }
 void addToFront(int data)
 {
 Node1 node =new Node1(data);

 node.next=head;
 head=node;
 }
 void addMiddle(int index,int data)
 {
 Node1 node =new Node1(data);
 node.data=data;
 node.next=null;
 Node1 n=head;
 for(int i=1;i<index-1;i++)
 {
 n=n.next;
 }
 node.next=n.next;
 n.next=node;
 }
 void removeFromFront()
 {
 head=head.next;
 a--;
 }
 void removeFromBack()
 {
 Node1 n=head;
 while(n.next.next!=null) {
 n=n.next;
 n.next=null;
 }
 }
 void removeAt(int index)
 {
 if (index==1) {
 removeFromFront();
 }
 else{
 Node1 n=head;
 Node1 temp=null;
 for(int i=1;i<index-1;i++)
 {
 n=n.next;
 }
 temp=n.next;
 n.next=temp.next;
 }
 }
 boolean isEmpty(){
 return head == null;
 }
 void search(int data) {
	 Node1 current = head;  
     int i = 1;
     boolean flag = false;  
     //Checks whether list is empty  
     if(head == null) {  
         System.out.println("List is empty");  
     }  
     else {  
         while(current != null) {  
              //Compares node to be found with each node present in the list  
             if(current.data == data) {  
                 flag = true;  
                 break;  
             }  
             i++;  
             current = current.next;  
         }  
     }  
     if(flag)  
          System.out.println("Element is present in the list at the position : " + i);  
     else  
          System.out.println("Element is not present in the list");  
 }  
}
public class Node333 {
 public static void main(String[] args) {
 LlinkedList ll=new LlinkedList();
 ll.addToBack(20);
 ll.addToBack(19);
 ll.addToFront(20);
 ll.printList();
 System.out.println("");
 ll.addToFront(22);
 ll.printList();
 System.out.println("");
 ll.addMiddle(2,200);
 ll.printList();
 System.out.println("");
 ll.removeFromFront();
 ll.printList();
 ll.search(20);
 }
}