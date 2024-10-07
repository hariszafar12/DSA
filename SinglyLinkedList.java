package DSA;
//task3a
public class SinglyLinkedList {
    class Node26 {
        Object data;
        Node26 next;

        public Node26(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node26 head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Insert at the end
    public void insert(Object data) {
        Node26 newNode = new Node26(data);
        if (head == null) {
            head = newNode;
        } else {
            Node26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(Object data) {
        Node26 newNode = new Node26(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete a node by value
    public void delete(Object data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node26 current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Node not found");
        }
    }

    // Search for a node
    public boolean search(Object data) {
        Node26 current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get size of the list
    public int size() {
        int size = 0;
        Node26 current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Display the list
    public void display() {
        Node26 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert("X");
        list.insert("Y");
        list.insertAtBeginning("Z");
        list.display();  // Output: Z -> X -> Y -> null

        list.delete("X");
        list.display();  // Output: Z -> Y -> null

        System.out.println("Found Y: " + list.search("Y")); // Output: true
        System.out.println("List size: " + list.size());    // Output: 2
    }
}
