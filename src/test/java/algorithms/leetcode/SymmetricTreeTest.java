package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static algorithms.leetcode.SymmetricTree.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;

class SymmetricTreeTest {

    private SymmetricTree symmetricTree;

    @BeforeEach
    void setUp() {
        symmetricTree = new SymmetricTree();
    }

    @Test
    void isSymmetricShouldReturnTrue() {
        //given
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);
        // when
        boolean result = symmetricTree.isSymmetric(treeNode);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void isSymmetricShouldReturnFalse() {
        //given
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(3);
        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        // when
        boolean result = symmetricTree.isSymmetric(treeNode);
        // then
        assertThat(result).isFalse();
    }
}
