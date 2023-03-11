package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static algorithms.leetcode.BinaryTreeInorderTraversal.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeInorderTraversalTest {

    private BinaryTreeInorderTraversal binaryTreeInorderTraversal;

    @BeforeEach
    void setUp() {
        binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
    }

    @Test
    void shouldPassInorderTraversalOnBinaryTree() {
        //given
        BinaryTreeInorderTraversal.TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        //when
        List<Integer> result = binaryTreeInorderTraversal.inorderTraversal(root);
        List<Integer> expected = List.of(1, 3, 2);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .containsExactlyElementsOf(expected)
                .hasSameElementsAs(expected);
    }
}