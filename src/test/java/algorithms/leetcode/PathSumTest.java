package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PathSumTest {

    private PathSum pathSum;

    @BeforeEach
    void setUp() {
        pathSum = new PathSum();
    }

    @Test
    void hasPathSumShouldReturnTrue() {
        PathSum.TreeNode treeNode = new PathSum.TreeNode(5);
        treeNode.left = new PathSum.TreeNode(4);
        treeNode.right = new PathSum.TreeNode(8);
        treeNode.right.left = new PathSum.TreeNode(13);
        treeNode.right.right = new PathSum.TreeNode(4);
        treeNode.right.right.right = new PathSum.TreeNode(1);
        treeNode.left.left = new PathSum.TreeNode(11);
        treeNode.left.left.left = new PathSum.TreeNode(7);
        treeNode.left.left.right = new PathSum.TreeNode(2);

        assertThat(pathSum.hasPathSum(treeNode, 22)).isTrue();
    }

    @Test
    void hasPathSumShouldReturnFalse() {
        PathSum.TreeNode treeNode = new PathSum.TreeNode(1);
        treeNode.left = new PathSum.TreeNode(2);
        treeNode.right = new PathSum.TreeNode(3);

        assertThat(pathSum.hasPathSum(treeNode, 5)).isFalse();
    }
}
