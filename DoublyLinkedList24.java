package DSA;
//task3b
public class DoublyLinkedList24 {
    class Node25 {
        Object data;
        Node25 next;
        Node25 prev;

        public Node25(Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node25 head;

    public DoublyLinkedList24() {
        this.head = null;
    }

    // Insert at the end
    public void insert(Object data) {
        Node25 newNode = new Node25(data);
        if (head == null) {
            head = newNode;
        } else {
            Node25 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(Object data) {
        Node25 newNode = new Node25(data);
        if (head != null) {
            head.prev = newNode;
        }
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
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        Node25 current = head;
        while (current != null && !current.data.equals(data)) {
            current = current.next;
        }
        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        } else {
            System.out.println("Node not found");
        }
    }

    // Search for a node
    public boolean search(Object data) {
        Node25 current = head;
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
        Node25 current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Display the list forward
    public void display() {
        Node25 current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList24 list = new DoublyLinkedList24();
        list.insert("X");
        list.insert("Y");
        list.insertAtBeginning("Z");
        list.display();  // Output: Z <-> X <-> Y <-> null

        list.delete("X");
        list.display();  // Output: Z <-> Y <-> null

        System.out.println("Found Y: " + list.search("Y")); // Output: true
        System.out.println("List size: " + list.size());    // Output: 2
    }
}
