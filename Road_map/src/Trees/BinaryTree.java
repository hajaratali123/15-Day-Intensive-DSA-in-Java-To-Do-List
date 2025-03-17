package Trees;


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

    public static void PreOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
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
    }
}
