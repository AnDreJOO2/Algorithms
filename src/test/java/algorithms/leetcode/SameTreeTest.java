package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SameTreeTest {

    private SameTree sameTree;

    @BeforeEach
    void setUp() {
        sameTree = new SameTree();
    }

    @Test
    void isSameTreeShouldPassTheTest() {

        //given
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(1);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = new SameTree.TreeNode(2);
        q.right = new SameTree.TreeNode(1);

        //then
        assertThat(sameTree.isSameTree(p, q)).isEqualTo(true);
    }

    @Test
    void isSameTreeShouldNotPassTheTest() {

        //given
        SameTree.TreeNode p = new SameTree.TreeNode(1);
        p.left = new SameTree.TreeNode(2);
        p.right = new SameTree.TreeNode(1);

        SameTree.TreeNode q = new SameTree.TreeNode(1);
        q.left = new SameTree.TreeNode(1);
        q.right = new SameTree.TreeNode(2);

        //then
        assertThat(sameTree.isSameTree(p, q)).isEqualTo(false);
    }
}