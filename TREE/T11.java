package TREE;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
    import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class T11 {

    // Function to find sum of nodes at Kth level
    public static int sumAtKthLevel(Node root, int k) {
        if (root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 0; 
        int sum = 0;

        while (!q.isEmpty()) {
            int size = q.size();   // number of nodes at current level
            
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();

                // If current level is K, add to sum
                if (level == k) {
                    sum += temp.data;
                }

                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }

            level++;  // Move to next level
            if (level > k) break;  // No need to go deeper
        }

        return sum;
    }

    public static void main(String[] args) {
        //int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6,-1,-1};
        
        // Creating a sample tree
        /*
                  1
                /   \
               2     3
             /  \   / \
            4   5  6   7
        */

       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 1;  // Level for which sum is required

        System.out.println("Sum of nodes at level " + k + " = " + sumAtKthLevel(root, k));
    }
}
    