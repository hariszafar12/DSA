public class Task2Lab5 {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    class stack {

        int size =0;    
        Node head;

        void push(char data){
            Node n = new Node(data);
            if(head==null){
                head=n;

            }
            else{
                n.next= head;
                head=n;
                size ++;
            }
            
        }

        char pop(){
            if(head==null){
                System.out.println(" Stack is empty");
            }
            else{
                return head.data;
                size --;
            }
        }
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            Node temp = top; // Start from the top
            System.out.print("Stack elements: ");
            while (temp != null) {
                System.out.print(temp.data + " "); 
                temp = temp.next; 
            }
            System.out.println(); 
        }

    }

    public static void main(String[] args) {
        
        stack s = new stack();
        s.push('(');
        s.push(')');
        s.push('{');


        s.display();


    }

}
