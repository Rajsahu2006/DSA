package TREE;

public class T4 { // Node class
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
        System.out.print(root.data + "\n");
        Inorder(root.right);
    }
    //postorder terversal
    public static void postorder(Node root) {
        if (root == null) {
            return ;
        }
        postorder(root.left);
        //System.out.println(root.data + "");
        postorder(root.right);
        System.out.print(root.data + "\n");
    }  

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);

    //Inorder(root);
    postorder(root);
    }
}
    

