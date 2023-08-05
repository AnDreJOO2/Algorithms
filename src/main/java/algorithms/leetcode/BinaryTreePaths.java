package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/binary-tree-paths/">https://leetcode.com/problems/binary-tree-paths/</a>
 * @date 05.08.2023
 */
public class BinaryTreePaths {

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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        preorder(paths, "", root);
        return paths;
    }

    private void preorder(List<String> paths, String current, TreeNode node) {
        if (node == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (current.equals("")) {
            sb.append(node.val);
        } else {
            sb.append(current);
            sb.append("->");
            sb.append(node.val);
        }
        if (node.left != null) {
            preorder(paths, sb.toString(), node.left);
        }
        if (node.right != null) {
            preorder(paths, sb.toString(), node.right);
        }
        if (node.left == null && node.right == null) {
            paths.add(sb.toString());
        }
    }
}
