package DSA;
// Node class to represent each element in the linked list
class Node4<T> {
    T data; // Data of generic type T
    Node4<T> next; // Reference to the next node

    // Constructor to initialize a node
    public Node4(T data) {
        this.data = data;
        this.next = null; // Next is null by default when node is created
    }
}

// LinkedList class to manage the nodes
class LinkedList32<T> {
    private Node4<T> head; // Head of the list

    // Constructor to initialize an empty list
    public LinkedList32() {
        this.head = null;
    }

    // Method to add a node at the end of the list
    public void add(T data) {
        Node4<T> newNode = new Node4<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node4<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to remove a node from the list by value
    public void remove(T data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If the data to be deleted is in the head
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node4<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found!");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node4<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class GenericLinkedListDemo {
    public static void main(String[] args) {
        // Creating a linked list of integers
        LinkedList32<Integer> intList = new LinkedList32<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Integer List:");
        intList.display();

        // Removing an element from the list
        intList.remove(20);
        System.out.println("After removing 20:");
        intList.display();

        // Creating a linked list of strings
        LinkedList32<String> strList = new LinkedList32<>();
        strList.add("Hello");
        strList.add("World");
        System.out.println("String List:");
        strList.display();
    }
}
