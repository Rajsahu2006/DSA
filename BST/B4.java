package BST;
import java.util.*;

import BST.B2.data;
// Print in range of a BST;
public class B4 {
    static class Node{ 
        int data;
        Node left;
        Node right;

        Node( int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
// Insert a Node;
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data> val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    // Inorder Treversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + "");
        inorder(root.right);
    }

    // Print in Range ;
    public static void PrintInRange(Node root,int x,int y){
        if(root == null){
            return;
        }
        if(root.data>= x && root.data<= y){
            PrintInRange(root.left, x, y);
            System.out.print(root.data +"");
            PrintInRange(root.right, x, y);
        }
        // Case 2;
        else if(root.data<= x){
            PrintInRange(root.right, x, y);
        }
        //Case 3;
        else{
            PrintInRange(root.left, x, y);
        }
    }
    // main function

    public static void main(String[] args) {
        int val[] ={8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i< val.length; i++){ 
            root = insert(root,val[i]);
        }
        inorder(root);
        System.out.println();
        PrintInRange(root, 4, 10);
        
    }
}    

