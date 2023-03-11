package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static algorithms.leetcode.BinaryTreePreorderTraversal.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreePreorderTraversalTest {

    private BinaryTreePreorderTraversal binaryTreePreorderTraversal;

    @BeforeEach
    void setUp() {
        binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();
    }

    @Test
    void shouldPassPreorderTraversalOnBinaryTree() {
        //given
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        //when
        List<Integer> result = binaryTreePreorderTraversal.preorderTraversal(root);
        List<Integer> expected = List.of(1, 2, 3);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .containsExactlyElementsOf(expected)
                .hasSameElementsAs(expected);
    }
}