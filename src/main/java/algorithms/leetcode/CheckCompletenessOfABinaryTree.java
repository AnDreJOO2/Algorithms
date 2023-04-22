package algorithms.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @link <a href="https://leetcode.com/problems/check-completeness-of-a-binary-tree/">https://leetcode.com/problems/check-completeness-of-a-binary-tree/</a>
 * @date 22.04.2023
 */
public class CheckCompletenessOfABinaryTree {

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

    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean end = false;
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode == null) {
                end = true;
            } else {
                if (end) {
                    return false;
                }
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
        return true;
    }
}
// BFS