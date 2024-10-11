public interface List {


     
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
        public class LinkedList implements List{
            public class Node{
                int data;
                Node next;
                Node(int data){
                    this.data = data;
                    this.next=null;
                }
            }
        public static void  main(String[] args){
            Node head;
             
            public LinkedList(){ 
                head = new Node(null);  
                size = 0; 
            } 

           public  boolean isEmpty(){
                if(list == null){
                    return true;
                }
                else{
                    return false;
                }

        }
        public int size(){
           
                System.out.println(" the size of the list" + " is " + list.size());       
        
    }
        }
    
    }