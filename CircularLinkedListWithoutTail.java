package DSA;
//task4a
public class CircularLinkedListWithoutTail {
    class Node27 {
        Object data;
        Node27 next;

        public Node27(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node27 head;

    public CircularLinkedListWithoutTail() {
        this.head = null;
    }

    // Insert at the end
    public void insert(Object data) {
        Node27 newNode = new Node27(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself
        } else {
            Node27 current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Point to head
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(Object data) {
        Node27 newNode = new Node27(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself
        } else {
            Node27 current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            head = newNode;
            current.next = head; // Update the last node's next
        }
    }

    // Delete a node by value
    public void delete(Object data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data.equals(data)) {
            if (head.next == head) { // Only one node in the list
                head = null;
            } else {
                Node27 current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = head.next;
                head = head.next;
            }
            return;
        }
        Node27 current = head;
        while (current.next != head && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != head) {
            current.next = current.next.next;
        } else {
            System.out.println("Node not found");
        }
    }

    // Search for a node
    public boolean search(Object data) {
        if (head == null) {
            return false;
        }
        Node27 current = head;
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
        Node27 current = head;
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
        Node27 current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedListWithoutTail list = new CircularLinkedListWithoutTail();
        list.insert("A");
        list.insert("B");
        list.insertAtBeginning("C");
        list.display();  // Output: C -> A -> B -> (head)

        list.delete("A");
        list.display();  // Output: C -> B -> (head)

        System.out.println("Found B: " + list.search("B")); // Output: true
        System.out.println("List size: " + list.size());    // Output: 2
    }
}
