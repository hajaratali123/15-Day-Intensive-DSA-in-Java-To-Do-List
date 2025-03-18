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
    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
public class BinaryTree {
    static int maxDiameter = 0;

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
    public static int TreeHeight(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(TreeHeight(root.left), TreeHeight(root.right));
    }
    public  static int CountNodes(TreeNode root){
        if(root == null) return 0;
        return 1 + CountNodes(root.left) + CountNodes(root.right);
    }
    public static int SumNodes(TreeNode root){
        if(root == null) return 0;
        return root.data+SumNodes(root.left) + SumNodes(root.right);
    }
    public static int findMax(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
    }
    public static int findMin(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(findMin(root.left), findMin(root.right)));
    }
    public static boolean IsBalanced(TreeNode root){
        if(root == null) return true;
        if(Math.abs(findMin(root.left) - findMax(root.right)) > 1) return false;
        return IsBalanced(root.left) && IsBalanced(root.right);
    }
    public static boolean isBalanced2(TreeNode root){
        return height(root)!=-1;

    }
    public static int height(TreeNode root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight-rightHeight)>1) return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static TreeNode findLCA(TreeNode root, int p, int q){
        if(root == null || root.data==p || root.data ==q) return root;
        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);
        return (left != null && right != null) ? root : (left != null ? left : right);
    }
    public static int diameter(TreeNode root){
        height2(root);
        return  maxDiameter;

    }
    private static int height2(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left, right);
    }
    public static boolean isIdentical(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null || root1.data!=root2.data) return false;
        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
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
        System.out.println("\nHeight of tree is " + TreeHeight(tree.root));
        System.out.println("\nCount nodes of binary tree is " + CountNodes(tree.root));
        System.out.println("\nSum nodes of binary tree is " + SumNodes(tree.root));
        System.out.println("\nFind max of binary tree is " + findMax(tree.root));
        System.out.println("\nFind min of binary tree is " + findMin(tree.root));
        System.out.println("\n is balanced traversal of binary tree is "+IsBalanced(tree.root));
        System.out.println("\n is isBalanced2 "+isBalanced2(tree.root));

        System.out.println("\nLowest Common Ancestor (LCA) in a Binary TreeLCA of 4 and 5: " + findLCA(tree.root, 4, 5)); // Output: 2
        System.out.println("LCA of 6 and 8: " + findLCA(tree.root, 6, 8)); // Output: 3
        System.out.println("LCA of 4 and 8: " + findLCA(tree.root, 4, 8)); // Output: 1
        System.out.println("\n The diameter of binary tree is " + diameter(tree.root));
        System.out.println("\n The trees are isIdentical " + isIdentical(tree.root,tree.root));
        System.out.println("\n The trees are isIdentical " + isIdentical(tree.root,tree.root.left));
        System.out.println("\n The trees are isIdentical " + isIdentical(tree.root,tree.root.right));



    }
}
