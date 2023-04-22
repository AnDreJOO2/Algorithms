package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static algorithms.leetcode.CheckCompletenessOfABinaryTree.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckCompletenessOfABinaryTreeTest {

    private CheckCompletenessOfABinaryTree checkCompletenessOfABinaryTree;

    @BeforeEach
    void setUp() {
        checkCompletenessOfABinaryTree = new CheckCompletenessOfABinaryTree();
    }

    @ParameterizedTest(name = "Params: root=`{0}`, expected=`{1}`")
    @MethodSource("shouldCheckCompletenessOfABinaryTreeParams")
    void shouldCheckCompletenessOfABinaryTree(TreeNode root, boolean expected) {
        //when
        boolean result = checkCompletenessOfABinaryTree.isCompleteTree(root);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCheckCompletenessOfABinaryTreeParams() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.right = new TreeNode(3);
        treeNode1.left.left = new TreeNode(4);
        treeNode1.left.right = new TreeNode(5);
        treeNode1.right.left = new TreeNode(6);

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);
        treeNode2.left.left = new TreeNode(4);
        treeNode2.left.right = new TreeNode(5);
        treeNode2.right.right = new TreeNode(7);

        return Stream.of(
                arguments(treeNode1, true),
                arguments(treeNode2, false)
        );
    }
}