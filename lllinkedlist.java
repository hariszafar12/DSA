package DSA;
class Node122 {
    int data;
    Node122 next;

    Node122(int data) {
        this.data = data;
        this.next = null;
    }
}

public class lllinkedlist {
    Node122 head;

    // Function to return the nth Node122 from the end of the list
    public int nthFromLast(int n) {
        if (head == null) {
            return -1;  // LIST_EMPTY condition
        }

        Node122 first = head;
        Node122 second = head;

        // Move the first pointer n Node122s ahead
        for (int i = 0; i < n; i++) {
            if (first == null) {
                return -1;  // If n is greater than the number of Node122s
            }
            first = first.next;
        }

        // Move both pointers until the first one reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Now the second pointer is at the nth Node122 from the end
        return second.data;
    }

    // Utility function to add a new Node122 at the end of the list
    public void append(int new_data) {
        Node122 new_Node122 = new Node122(new_data);
        if (head == null) {
            head = new_Node122;
            return;
        }
        Node122 last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_Node122;
    }

    public static void main(String[] args) {
       lllinkedlist list = new lllinkedlist();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        int n = 2;
        int result = list.nthFromLast(n);

        if (result != -1) {
            System.out.println("The " + n + "th Node from the end is: " + result);
        } else {
            System.out.println("List is empty or n is larger than the list size.");
        }
    }
}
