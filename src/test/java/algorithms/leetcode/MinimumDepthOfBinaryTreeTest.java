package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static algorithms.leetcode.MinimumDepthOfBinaryTree.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;

class MinimumDepthOfBinaryTreeTest {

    private MinimumDepthOfBinaryTree minimumDepthOfBinaryTree;

    @BeforeEach
    void setUp() {
        this.minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
    }

    @Test
    void shouldCalculateMinimumDepthOfBinaryTree() {
        //given
        TreeNode givenNode = new TreeNode(3);
        givenNode.left = new TreeNode(9);
        givenNode.right = new TreeNode(20);
        givenNode.right.left = new TreeNode(15);
        givenNode.right.right = new TreeNode(7);
        //when
        int result = minimumDepthOfBinaryTree.minDepth(givenNode);
        int expectedDepth = 2;
        //then
        assertThat(result).isEqualTo(expectedDepth);
    }
}