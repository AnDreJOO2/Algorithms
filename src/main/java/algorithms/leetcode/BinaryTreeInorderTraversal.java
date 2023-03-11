package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">https://leetcode.com/problems/binary-tree-inorder-traversal/</a>
 * @date 11.03.2023
 */
public class BinaryTreeInorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> steps = new ArrayList<>();
        inorder(root, steps);
        return steps;
    }

    private void inorder(TreeNode node, List<Integer> steps) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            inorder(node.left, steps);
        }
        steps.add(node.val);
        if (node.right != null) {
            inorder(node.right, steps);
        }
    }

}


