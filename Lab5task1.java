package DSA;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    // Method to print linked list in reverse
    public void printReverse() {
        printReverseHelper(head);
    }

    // Helper method to recursively print nodes in reverse
    private void printReverseHelper(Node node) {
        if (node == null) {
            return;
        }
        printReverseHelper(node.next); // Recursive call for the next node
        System.out.print(node.data + " "); // Print after recursive call, to reverse order
    }

    // Method to add elements to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

public class Lab5task1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println("Reversed Order:");
        list.printReverse(); // Expected Output: 4 3 2 1
    }
}
