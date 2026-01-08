package TREE;

import TREE.T1.BinaryTree;


    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode (int val){this.val= val;}
        TreeNode (int val,TreeNode left,TreeNode right){
            this.val =val;
            this.left = left;
            this.right = right;
        }

    }
    //IsIdentical Function
    class Sollution{
        public boolean IsIdentical(TreeNode root, TreeNode subRoot){
            if(root == null && subRoot == null){
                return true;
            }
            if(root == null || subRoot == null){
                return false;
            }
            if(root.val == subRoot.val){
                return IsIdentical(root.left,subRoot.left)&& IsIdentical(root.right,subRoot.right);
            }
            return false;

        }
        public boolean isSubtree( TreeNode root , TreeNode subRoot){
            if(subRoot == null){
                return true;
            }
            if(root == null){
                return false;
            }
            if(root.val == subRoot.val){
                if(IsIdentical(root, subRoot)){
                    return false;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
        public static void main(String[] args) {
            int Node [] = {3,4,5,1,2};
            int subNode [] = {4,1,2};
            TreeNode root = BinaryTree.buildTree(nodes); 
            IsIdentical(root,subRoot);
        }
    }

