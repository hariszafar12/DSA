public class Task1Lab5 {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

   
    public void printReverse(Node node) {
        if (node == null) {
            return;
        }
        printReverse(node.next); 
        System.out.print(node.data + " "); 
    }

  
    public void printListInReverse() {
        System.out.print("List in reverse order: ");
        printReverse(head);
        System.out.println();
    }

    public static void main(String[] args) {
        Task1Lab5 t = new Task1Lab5();
        t.addLast(5);
        t.addLast(4);
        t.addLast(3);
        t.addLast(2);
        t.addLast(1);

             t.printListInReverse();
    }
}
