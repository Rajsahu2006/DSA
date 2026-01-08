package QUEUE;
//Implementation using  Linked list::
public class QU3 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        //isEmpity
        public static boolean isEmpity(){
            return head == null && tail == null;
        }
        //Add
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //Remove
        public static int remove(){
            if(isEmpity()){
                System.out.println("Queue is empity");
                return -1;
            }
            int front = head.data;
            //Single element condition
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }
        //Peek
        public static int peek(){
            if(isEmpity()){
                System.out.println("Queue is empity");
                return -1;
            }
            return head.data;
        }
    }
    
}
