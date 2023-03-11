package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static algorithms.leetcode.BinaryTreePostorderTraversal.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreePostorderTraversalTest {

    private BinaryTreePostorderTraversal binaryTreePostorderTraversal;

    @BeforeEach
    void setUp() {
        binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();
    }

    @Test
    void shouldPassPostorderTraversalOnBinaryTree() {
        //given
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        //when
        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(root);
        List<Integer> expected = List.of(3, 2, 1);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .containsExactlyElementsOf(expected)
                .hasSameElementsAs(expected);
    }
}