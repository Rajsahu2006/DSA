package BST;
import java.util.*;
// Print Root to Leaf Path;

public class B5 {
    static class Node{
        int data;
        Node left;
        Node right;

        //create constructor;
        Node(int data){
            this.data = data;
        }
    }

    //insert the node 
    public static Node insert(Node root,int val){
        if(root== null){
            root = new Node(val);
            return root;

        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;

    }
    // inorder function
    public static void inorder(Node root){
        if(root== null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data +"");
        inorder(root.right);
    }
    //Root2leaf Path;
    public static void printPath(ArrayList<Integer> path){
        for(int i= 0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    // root2leaf
    public static void printRoot2leaf(Node root,ArrayList<Integer>path){
        if(root== null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{
            printRoot2leaf(root.left,path);
            printRoot2leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    // main function
    public static void main (String args[]){
        int val[]={8,5,3,6,10,11,14};
        Node root = null;
        for(int i = 0; i<val.length;i++){
            root = insert(root, val[i]);
        }
        inorder(root);
        System.out.println();
        printRoot2leaf(root, new ArrayList<>());
    }
    
}
            
