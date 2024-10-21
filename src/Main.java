import BinaryTree.easy.TreeNode;
import BinaryTree.easy.bTree_94;
import Stack.easy.stack_20;
import Stack.easy.stack_3174;


public class Main {
    public static void main(String[] args) {
        // Write testcases here

        // Generating Root with ChatGPT
        // Level 1 (root)
        TreeNode root = new TreeNode(1);

        // Level 2
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left = node2;
        root.right = node3;

        // Level 3
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node2.left = node4;
        node2.right = node5;

        // node3 has only right child
        TreeNode node8 = new TreeNode(8);
        node3.right = node8;

        // Level 4
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node5.left = node6;
        node5.right = node7;

        // Level 5
        TreeNode node9 = new TreeNode(9);
        node7.right = node9;

        bTree_94 solution = new bTree_94();
        solution.inorderTraversal(root);

    }
}