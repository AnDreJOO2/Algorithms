package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">https://leetcode.com/problems/binary-tree-preorder-traversal/</a>
 * @date 11.03.2023
 */
public class BinaryTreePreorderTraversal {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> steps = new ArrayList<>();
        preorder(root, steps);
        return steps;
    }

    private void preorder(TreeNode node, List<Integer> steps) {
        if (node == null) {
            return;
        }
        steps.add(node.val);
        if (node.left != null) {
            preorder(node.left, steps);
        }
        if (node.right != null) {
            preorder(node.right, steps);
        }
    }
}
