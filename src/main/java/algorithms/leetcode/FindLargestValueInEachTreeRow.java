package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/find-largest-value-in-each-tree-row/">https://leetcode.com/problems/find-largest-value-in-each-tree-row/</a>
 * @date 16.04.2023
 */
public class FindLargestValueInEachTreeRow {

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

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> largest = new ArrayList<>();
        findLargest(largest, root, 0);
        return largest;
    }

    private void findLargest(List<Integer> largest, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (largest.size() == level) {
            largest.add(node.val);
        } else {
            if (node.val > largest.get(level)) {
                largest.set(level, node.val);
            }
        }
        findLargest(largest, node.left, level + 1);
        findLargest(largest, node.right, level + 1);
    }
}
