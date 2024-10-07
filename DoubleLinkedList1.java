package DSA;
//task1
class Node22 {
    String name;
    Node22 prev, next;

    Node22(String name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLinkedList1 {
    Node22 head;

    // Add node with name at the beginning of the linked list
    public void insertAtBeginning(String name) {
        Node22 newNode = new Node22(name);
        insertAtBeginning(newNode);
    }

    // Add node at the beginning of the linked list (node as parameter)
    public void insertAtBeginning(Node22 node) {
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add node with name at the end of the linked list
    public void insertAtEnd(String name) {
        Node22 newNode = new Node22(name);
        insertAtEnd(newNode);
    }

    // Add node at the end of the linked list (node as parameter)
    public void insertAtEnd(Node22 node) {
        if (head == null) {
            head = node;
        } else {
            Node22 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }

    // Add node after the node with the specified name
    public void insertAfterName(String name, Node22 node) {
        Node22 temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                node.next = temp.next;
                node.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = node;
                }
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node with name " + name + " not found.");
    }

    // Add node before the node with the specified name
    public void insertBeforeName(String name, Node22 node) {
        Node22 temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                node.next = temp;
                node.prev = temp.prev;
                if (temp.prev != null) {
                    temp.prev.next = node;
                } else {
                    head = node; // If inserting before head
                }
                temp.prev = node;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Node with name " + name + " not found.");
    }

    // Make the double linked list circular
    public void makeCircular() {
        if (head == null) return;

        Node22 tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.prev = tail;
    }

    // Print all the nodes in the linked list
    public void printAll() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node22 temp = head;
        do {
            System.out.print(temp.name + " ");
            temp = temp.next;
        } while (temp != null && temp != head); // For circular list
        System.out.println();
    }

    // Test the class
    public static void main(String[] args) {
        DoubleLinkedList1 list = new DoubleLinkedList1();

        // Test inserting at the beginning
        list.insertAtBeginning("Alice");
        list.insertAtBeginning("Bob");

        // Test inserting at the end
        list.insertAtEnd("Charlie");
        list.insertAtEnd("David");

        // Test printing the list
        System.out.println("List after adding nodes:");
        list.printAll();

        // Test inserting after a node
        list.insertAfterName("Alice", new Node22("Eve"));
        System.out.println("List after inserting Eve after Alice:");
        list.printAll();

        // Test inserting before a node
        list.insertBeforeName("Charlie", new Node22("Frank"));
        System.out.println("List after inserting Frank before Charlie:");
        list.printAll();

        // Test making the list circular
        list.makeCircular();
        System.out.println("List after making it circular:");
        list.printAll();
    }
}
