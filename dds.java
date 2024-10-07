package DSA;
class node334{
	int data;
	node334 next;
	node334(int data){
		this.data=data;
		this.next=null;
	}
}
	class llist{
	node334 head;
	void addfirst(int data) {
		node334 node=new node334(data);

		 if(head==null)
		 head=node;
		 else{
		 node334 n=head;
		 while(n.next!=null)
		 n=n.next;
		 n.next=node;
		 }

	}
	void printlist() {
		long startTime = System.nanoTime(); // Start time
		node334 node = head;
		 while (node.next != null){
		 System.out.print(node.data + " ");
		 node = node.next;
		 }
		 System.out.print(node.data + " ");
		 long endTime = System.nanoTime(); // End time
		    long duration = endTime - startTime;
		    System.out.println("\nTime taken by Iterative Search: " + duration + " nanoseconds");
	}
	void printlist1(node334 node) {
		if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printlist1(node.next);
	}
	public void printlist1() {
        printlist1(head);
    }
	}
public class dds {
public static void main(String args[]) {
llist l=new llist();
l.addfirst(32);
l.addfirst(44);
l.addfirst(444);
l.addfirst(4);
l.printlist();
System.out.println();
long startTime = System.nanoTime(); // Start time
l.printlist1();
long endTime = System.nanoTime(); // End time
long duration = endTime - startTime;
System.out.println("\nTime taken by Recursive Search: " + duration + " nanoseconds");

}}
