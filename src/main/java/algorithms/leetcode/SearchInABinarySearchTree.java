package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/search-in-a-binary-search-tree/">https://leetcode.com/problems/search-in-a-binary-search-tree/</a>
 * @date 05.04.2023
 */
public class SearchInABinarySearchTree {

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

    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null) {
            if (root.val == val) {
                return root;
            }
            if (root.val < val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return null;
    }
}
