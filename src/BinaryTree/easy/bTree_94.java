package BinaryTree.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class bTree_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        recursive(root, res);
        return res;
    }

    private void recursive(TreeNode root, List<Integer> list){
        if(root == null) return;

        recursive(root.left, list);
        list.add(root.val);
        recursive(root.right, list);
    }


    public List<Integer> iterative(TreeNode root) {
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;

    }
}
