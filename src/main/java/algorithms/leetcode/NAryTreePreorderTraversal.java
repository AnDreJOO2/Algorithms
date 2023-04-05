package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/">https://leetcode.com/problems/n-ary-tree-preorder-traversal/</a>
 * @date 05.04.2023
 */
public class NAryTreePreorderTraversal {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> nodes = new ArrayList<>();
        preorder(root, nodes);
        return nodes;
    }

    private void preorder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (Node node : root.children
        ) {
            preorder(node, list);
        }
    }
}
