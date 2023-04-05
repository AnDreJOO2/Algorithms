package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static algorithms.leetcode.SearchInABinarySearchTree.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;

class SearchInABinarySearchTreeTest {

    private SearchInABinarySearchTree searchInABinarySearchTree;

    @BeforeEach
    void setUp() {
        searchInABinarySearchTree = new SearchInABinarySearchTree();
    }

    @Test
    void shouldSearchInABinarySearchTree() {
        //given
        TreeNode givenTree = new TreeNode(4);
        TreeNode expectedTree = new TreeNode(2);

        givenTree.left = expectedTree;
        givenTree.left.left = new TreeNode(1);
        givenTree.left.right = new TreeNode(3);
        givenTree.right = new TreeNode(7);

        int givenVal = 2;
        //when
        TreeNode result = searchInABinarySearchTree.searchBST(givenTree, givenVal);
        //then
        assertThat(result).isEqualTo(expectedTree);
    }
}