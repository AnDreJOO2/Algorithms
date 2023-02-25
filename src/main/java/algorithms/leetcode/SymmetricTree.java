package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/symmetric-tree/">https://leetcode.com/problems/symmetric-tree/</a>
 * @date 25.02.2023
 */
public class SymmetricTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return isEqual(root.left, root.right);
    }

    public boolean isEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 == null || t2 == null) {
            return false;
        }

        return t1.val == t2.val && isEqual(t1.left, t2.right) && isEqual(t1.right, t2.left);
    }

}
