
package LinkedList;

public class L3 {

    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Print reverse using recursion
    void printReverse(Node head) {

        if (head == null) {
            return;
        }

        printReverse(head.next);

        System.out.print(head.data + " ");
    }

    public static void main(String[] args) {

        L3 list = new L3();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Reverse Order:");

        list.printReverse(list.head);
    }
}