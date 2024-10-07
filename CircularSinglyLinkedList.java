package DSA;
//task4b
public class CircularSinglyLinkedList {
    class Node29 {
        Object data;
        Node29 next;

        public Node29(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node29 head;
    private Node29 tail;

    public CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert at the end
    public void insert(Object data) {
        Node29 newNode = new Node29(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(Object data) {
    	Node29 newNode = new Node29(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail's next reference
        }
    }

    // Delete a node by value
    public void delete(Object data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data.equals(data)) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Node29 current = head;
        while (current.next != head && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != head) {
            current.next = current.next.next;
            if (current.next == head) {
                tail = current;
            }
        } else {
            System.out.println("Node not found");
        }
    }

    // Search for a node
    public boolean search(Object data) {
        if (head == null) {
            return false;
        }
        Node29 current = head;
        do {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        } while (current != head);
        return false;
    }

    // Get size of the list
    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node29 current = head;
        do {
            size++;
            current = current.next;
        } while (current != head);
        return size;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node29 current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.insert("A");
        list.insert("B");
        list.insertAtBeginning("C");
        list.display(); // Output: C -> A -> B -> (back to head)

        list.delete("A");
        list.display(); // Output: C -> B -> (back to head)

        System.out.println("Found B: " + list.search("B")); // Output: true
        System.out.println("List size: " + list.size());    // Output: 2
    }
}
