package BST;
import java.util.*;
//Delete a node;
public class B3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){ //constructor
            this.data = data;

        }
    
        
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val); // left subtree

        }
        else{
            root.right =insert(root.right, val); // right subtree

        }
        return root;
    }
    public static void inorder(Node root ){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data +"");
        inorder(root.right);

    } 
    // delete a node;
    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left =delete(root.left, val);
        }
        else if(root.data<val){
            root.right = delete(root.right, val);
        }
        else{
            // root.data == val;
            // CASE 1;
            if(root.left ==null && root.right == null){
                return null;
            }
            // CASE 2;
            if(root.left == null){
                return root.right;

            }
            else if(root.right == null){
                return root.left;
            }

            // CASE 3;
            Node IS = inorderSuccessor(root.right);
            root.data =IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while (root.left == null) {
            root = root.left;
            
        }
        return root;
    }
    //main function;
     public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0; i<val.length;i++){
            root = insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
        delete(root, 4);
        inorder(root);
     }
}
