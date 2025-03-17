package Trees;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
            this.data = data;
            left = null;
            right = null;
    }
}
public class BinaryTree {
    TreeNode root;
    public static void InOrder(TreeNode root){
        if(root == null) return;
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    public static void PreOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void PostOrder(TreeNode root){
        if(root == null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.data+" ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);

        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        tree.root.right.right.left = new TreeNode(8);

        System.out.println("Preorder traversal of binary tree is ");
        PreOrder(tree.root);
        System.out.println("\nInorder traversal of binary tree is ");
        InOrder(tree.root);
        System.out.println("\nPostorder traversal of binary tree is ");
        PostOrder(tree.root);
        System.out.println("\nLevel order traversal of binary tree is ");
        levelOrder(tree.root);
    }
}
