package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/">https://leetcode.com/problems/binary-tree-postorder-traversal/</a>
 * @date 11.03.2023
 */
public class BinaryTreePostorderTraversal {
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> steps = new ArrayList<>();
        postorder(root, steps);
        return steps;
    }

    private void postorder(TreeNode node, List<Integer> steps) {

        if (node == null) {
            return;
        }
        if (node.left != null) {
            postorder(node.left, steps);
        }
        if (node.right != null) {
            postorder(node.right, steps);
        }
        steps.add(node.val);
    }
}
