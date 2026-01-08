package BST;
import java.util.*;

import BST.B1.Node;
public class B2 {
    static class data{
        int data;
        data left;
        data right;

        data(int data){ // constructor or class name same hona chiye;
            this.data = data;
            // left = null;
            // right = null;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data> val){
            root.left = insert(root.left, val); //left Subtree
        }
        else{
            root.right = insert(root.right, val); // Right Subtree
        }
        return root;

    }
    // public static void inorder(Node root){
    //     inorder(root.left);
    //     System.out.println(root.data +"");
    //     inorder(root.right);
    // }
    public static boolean Search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data> key){ // left subtree
            return Search(root.left,key);
        }
        else if(root.data == key ){
            return true;

        }
        else{
            return Search(root.right, key);

        }
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data +"");
        inorder(root.right);
    }
    
     // Main function
     public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(Search(root, 1)){
            System.out.println("Found");
        }
        else{
            System.out.println("not Found");
        }
     }
    
}
