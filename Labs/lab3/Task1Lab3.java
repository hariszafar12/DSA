public class Task1Lab3 {
    public static class Node {
        String name;
        Node prev, next;

        Node(String name) {
            this.prev = null;
            this.next = null;
            this.name = name;
        }
    }

    Node head;

    // Add node with name in beginning of linkedlist, name as parameter
    public void insertAtBeginning(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
 // Add node in end of linkedlist, name as parameter
 public void insertAtEnd(String name) {
    Node newNode = new Node(name);
    if (head == null) {
        head = newNode;
    } else {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
}

// Add node after name which is provided as param , name and node as params
public void insertAfterName(String name, Node newNode) {
    Node temp = head;
    while (temp != null) {
        if (temp.name.equals(name)) {
            newNode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
            newNode.prev = temp;
            return;
        }
        temp = temp.next;
    }
}
    // Make double linkedlist as Circular Double LinkedList
    public void makeCircular() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;
    }

    // Print all the nodes in linkedlist, make sure it works on circular double linkedlist
    public void printAll() {
        Node temp = head;
        do {
            System.out.print(temp.name + " ");
            temp = temp.next;
        } while (temp != head);
    }

    // Test the class
    public static void main(String[] args) {
        Task1Lab3 obj = new Task1Lab3();
        obj.insertAtBeginning("Zeeshan");
        obj.insertAtEnd("Lashari");
        Task1Lab3.Node newNode = new Task1Lab3.Node("Khan");
        obj.insertAfterName("Zeeshan", newNode);
        obj.makeCircular();
        obj.printAll();
    }
}
