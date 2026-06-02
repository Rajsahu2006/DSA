package LinkedList;
import java.util.*;

public class L4 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    //Insert Node
    void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
    }

    //Print reverse recursion
    // void printReverse(Node head){
        // if(head == null){
        // return;
    // }
    // printReverse(head.next);
    // System.out.println(head.data + "");
    // }

    //Reverse linkedlist using iterators
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node curNode = head.next;
        while (curNode != null) {
            Node  nextNode = curNode.next;
            curNode.next = prevNode;

            //update 
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;

        
    }
    void printList() {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        L4 list = new L4();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        
        // list.printReverse(list.head);
        list.reverseIterate();
        System.out.println("Reveerse order:");
        list.printList();        
    }
}
