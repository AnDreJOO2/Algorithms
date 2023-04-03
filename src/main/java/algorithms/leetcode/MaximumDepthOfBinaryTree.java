package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">https://leetcode.com/problems/maximum-depth-of-binary-tree/</a>
 * @date 03.04.2023
 */
public class MaximumDepthOfBinaryTree {

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

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

}
