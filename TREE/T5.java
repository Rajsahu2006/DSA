package TREE;
import java.util.*;
public class T5 {
   // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary tree builder class
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Inorder traversal
    public static void Inorder(Node root) {
        if (root == null) {
            return ;
        }
         Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static void Levelorder(Node root){
        if (root ==null){
            return;
        }
        Queue<Node> q = new LinkedList();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){ //next line 
                System.out.println();
                if(q. isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{

                System.out.println(currNode.data +" ");
                if (currNode.left != null){ //left child
                    q.add(currNode.left);
                }
                if( currNode.right !=null){ //riggt child
                    q.add(currNode.right);
                }
                    
                }
                

            }
        }
       
    


    
//Main function

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1 ,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);

    Levelorder(root);
    }

}   

