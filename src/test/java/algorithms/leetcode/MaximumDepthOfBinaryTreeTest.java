package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static algorithms.leetcode.MaximumDepthOfBinaryTree.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;

class MaximumDepthOfBinaryTreeTest {

    private MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;

    @BeforeEach
    void setUp() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
    }

    @Test
    void shouldCalculateMaximumDepthOfBinaryTree() {
        //given
        TreeNode givenNode = new TreeNode(3);
        givenNode.left = new TreeNode(9);
        givenNode.right = new TreeNode(20);
        givenNode.right.left = new TreeNode(15);
        givenNode.right.right = new TreeNode(7);
        //when
        int result = maximumDepthOfBinaryTree.maxDepth(givenNode);
        int expectedDepth = 3;
        //then
        assertThat(result).isEqualTo(expectedDepth);
    }
}