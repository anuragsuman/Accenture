package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    // Inverting a binary tree using level order traversal iteratively
    public TreeNode invertTree(TreeNode root){

        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();

            // swap
            TreeNode tempNode = temp.left;
            temp.left = temp.right;
            temp.right = tempNode;

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        return root;
    }

    // Inverting binary tree recursively using post order traversal
    public TreeNode invertTreeRec(TreeNode root){
        if(root == null) return null;

        TreeNode left = invertTreeRec(root.left);
        TreeNode right = invertTreeRec(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        //invertBinaryTree.invertTree(root);
        invertBinaryTree.invertTreeRec(root);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

