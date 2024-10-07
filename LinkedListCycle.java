package DSA;
//task5
class Node24 {
    int data;
    Node24 next;

    public Node24(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(Node24 head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node24 slow = head;  // Slow pointer (Tortoise)
        Node24 fast = head;  // Fast pointer (Hare)

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2

            if (slow == fast) {
                return true;           // Cycle detected
            }
        }
        return false;                   // No cycle
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();

        // Creating a linked list with a cycle
        Node24 head = new Node24(1);
        head.next = new Node24(2);
        head.next.next = new Node24(3);
        head.next.next.next = new Node24(4);
        head.next.next.next.next = head.next;  // Creating a cycle

        System.out.println(list.hasCycle(head));  // Output: true
    }
}
