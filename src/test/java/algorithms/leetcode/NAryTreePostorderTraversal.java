package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/n-ary-tree-postorder-traversal/">https://leetcode.com/problems/n-ary-tree-postorder-traversal/</a>
 * @date 05.04.2023
 */
public class NAryTreePostorderTraversal {
    class Node {
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

    public List<Integer> postorder(Node root) {
        List<Integer> nodes = new ArrayList<>();
        postorder(root, nodes);
        return nodes;
    }

    private void postorder(Node root, List<Integer> nodes) {
        if (root == null) {
            return;
        }

        for (Node node : root.children) {
            postorder(node, nodes);
        }
        nodes.add(root.val);
    }
}
