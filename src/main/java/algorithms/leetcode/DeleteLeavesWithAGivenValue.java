package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/delete-leaves-with-a-given-value/">https://leetcode.com/problems/delete-leaves-with-a-given-value/</a>
 * @date 20.05.2023
 */
public class DeleteLeavesWithAGivenValue {
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

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }
        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }
        if (root.left == null && root.right == null && root.val == target) {
            root = null;
            return root;
        }
        return root;
    }

}
