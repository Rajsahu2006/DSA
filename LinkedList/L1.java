package LinkedList;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class L1 {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        

        Node(String data){
            this.data = data;
            this.next = null;
            size ++;
        }
    }
    //Add
    public void addFirst(String data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Add last;
    public void Addlast(String data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }
        Node CurrNode = head;
        while(CurrNode.next != null){
            CurrNode = CurrNode.next;

        }
        newNode = CurrNode.next;
    }
    //Print 
    public void printlist(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node CurrNode = head;
        while(CurrNode != null){
            System.out.print(CurrNode.data + "->");
            CurrNode = CurrNode.next;
        }
        System.out.println("NULL");
    }
    // deelete first
    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;

    }
    //delete Last node
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        size --;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node LastNode = head.next; // head.next =  null -> last node = null
        while (LastNode.next != null) {
            LastNode = LastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getsize(){
        return size;
    }

    public static void main(String[] args) {
        L1 list = new L1();
        list.addFirst("a");
        list.addFirst("bowl");
        list.addFirst("full fill");
        list.addFirst("of milk");
        //list.printlist();
        list.addFirst("more");
        list.printlist();
        list.deleteLast();
        list.printlist();

        System.out.println(list.getsize());

    }
    
}
