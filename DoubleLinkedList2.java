package DSA;
//task2
class Node23 {
    String name;
    Node23 prev, next;

    Node23(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}

public class DoubleLinkedList2 {
    Node23 head, tail;

    // Constructor to initialize an empty list
    public DoubleLinkedList2() {
        head = null;
        tail = null;
    }

    // Insert node with name at the beginning of the list
    public void insertAtBeginning(String name) {
        Node23 newNode = new Node23(name);
        if (head == null) {  // If the list is empty
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert node with name at the end of the list
    public void insertAtEnd(String name) {
        Node23 newNode = new Node23(name);
        if (tail == null) {  // If the list is empty
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove node from the beginning of the list
    public void removeFromBeginning() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head == tail) {  // Only one node in the list
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Remove node from the end of the list
    public void removeFromEnd() {
        if (tail == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head == tail) {  // Only one node in the list
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Print all the nodes in the list from head to tail
    public void printAll() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node23 temp = head;
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Test the class
    public static void main(String[] args) {
        DoubleLinkedList2 list = new DoubleLinkedList2();

        // Test inserting at the beginning
        list.insertAtBeginning("Alice");
        list.insertAtBeginning("Bob");
        System.out.println("List after inserting at the beginning:");
        list.printAll();

        // Test inserting at the end
        list.insertAtEnd("Charlie");
        list.insertAtEnd("David");
        System.out.println("List after inserting at the end:");
        list.printAll();

        // Test removing from the beginning
        list.removeFromBeginning();
        System.out.println("List after removing from the beginning:");
        list.printAll();

        // Test removing from the end
        list.removeFromEnd();
        System.out.println("List after removing from the end:");
        list.printAll();
    }
}
