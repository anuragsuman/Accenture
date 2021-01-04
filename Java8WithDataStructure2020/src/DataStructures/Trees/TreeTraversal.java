package DataStructures.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {

    public static List<Integer> inOrderTraversal(TreeNode root){

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();

        if(root == null){
            return output;
        }

        TreeNode current = root;

        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            output.add(current.val);
            current = current.right;
        }

        return output;
    }

    public static void preOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();

        if(root == null)
            return;

        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            System.out.println(current.val + " ");
            if(current.right != null){
                stack.push(current.right);
            }

            if(current.left != null){
                stack.push(current.left);
            }
        }
    }



    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        List<Integer> result = inOrderTraversal(root);

        for(int i : result){
            System.out.println(i);
        }
        System.out.println();
        preOrder(root);

    }



}
