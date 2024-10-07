package DSA;

interface List {
	 public boolean isEmpty();
	 // returns true if the list is empty, false otherwise
	 public int size();
	 // returns the number of items in the list
	 public void add(Object item);
	 // adds an item to the list
	 // item is added at the end of the list
	 public void add(int index, Object item);
	 // adds an item to the list at the given index
	 // item is added at the given index;
	 // the indices start from 1.
	 public void remove(int index);
	 // removes the item from the list that has the given index
	 public void remove(Object item);
	 // removes an item from the list
	 // removes the first item in the list whose equal method matches
	 // that of the given item
	 public List duplicate();
	 // creates a duplicate of the list
	 // returns a copy of the linked list
	 public List duplicateReversed();
	 // creates a duplicate of the list with the nodes in reverse order
	 // returns a copy of the linked list with the nodes in reverse order
	}

public class Linkedlist122 implements List {
    private Node2 head;
    private int size;

    // Constructor to initialize the linked list with a dummy node
    public Linkedlist122() {
        head = new Node2(null);  // Create a dummy node
        size = 0;
    }

    // Inner class Node
    private class Node2 {
        Object data;
        Node2 next;

        Node2(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public boolean isEmpty() {
        if(head==null) {
        	return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object item) {
        Node2 newNode = new Node2(item);
        Node2 current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    @Override
    public void add(int index, Object item) {
        if (index < 1 || index > size + 1) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        Node2 newNode = new Node2(item);
        Node2 current = head;
        
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 1 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        Node2 current = head;
        
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        
        current.next = current.next.next;
        size--;
    }

    @Override
    public void remove(Object item) {
        Node2 current = head;
        while (current.next != null) {
            if (current.next.data.equals(item)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public List duplicate() {
        Linkedlist122 copy = new Linkedlist122();
        Node2 current = head.next;
        
        while (current != null) {
            copy.add(current.data);
            current = current.next;
        }
        
        return copy;
    }

    @Override
    public List duplicateReversed() {
        Linkedlist122 reversedCopy = new Linkedlist122();
        Node2 current = head.next;
        
        while (current != null) {
            Node2 newNode = new Node2(current.data);
            newNode.next = reversedCopy.head.next;
            reversedCopy.head.next = newNode;
            reversedCopy.size++;
            current = current.next;
        }
        
        return reversedCopy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ size: " + size + " - ");
        Node2 current = head.next;
        
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        
        sb.append(" ]");
        return sb.toString();
    }

	 
	public static void main(String[] args) {
Linkedlist122 list=new  Linkedlist122();
//Add items to the list
list.add("First");
list.add("Second");
list.add("Third");
System.out.println("Original List: " + list);

// Add an item at a specific index (1-based)
list.add(2, "Inserted");
System.out.println("After adding at index 2: " + list);

// Remove an item at a specific index (1-based)
list.remove(3);  // Remove the item "Third"
System.out.println("After removing index 3: " + list);

// Remove an item by value
list.remove("First");
System.out.println("After removing 'First': " + list);

// Duplicate the list
Linkedlist122 duplicateList = (Linkedlist122) list.duplicate();
System.out.println("Duplicate List: " + duplicateList);

// Duplicate the list in reverse order
Linkedlist122 reversedList = (Linkedlist122) list.duplicateReversed();
System.out.println("Reversed Duplicate List: " + reversedList);
	}

}
