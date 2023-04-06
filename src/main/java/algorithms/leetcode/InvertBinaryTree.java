package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/invert-binary-tree/">https://leetcode.com/problems/invert-binary-tree/</a>
 * @date 06.04.2023
 */
public class InvertBinaryTree {

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

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode node) {
        if (node == null) {
            return;
        }

        invert(node.left);
        invert(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
// postorder
