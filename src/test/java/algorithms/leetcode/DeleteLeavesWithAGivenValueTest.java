package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static algorithms.leetcode.DeleteLeavesWithAGivenValue.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DeleteLeavesWithAGivenValueTest {

    private DeleteLeavesWithAGivenValue deleteLeavesWithAGivenValue;

    @BeforeEach
    void setUp() {
        deleteLeavesWithAGivenValue = new DeleteLeavesWithAGivenValue();
    }

    @ParameterizedTest(name = "Params: root=`{0}`, target=`{1}`, expected=`{2}`")
    @MethodSource("shouldDeleteLeavesWithAGivenValueParams")
    void shouldDeleteLeavesWithAGivenValue(TreeNode root, int target, TreeNode expected) {
        //when
        TreeNode result = deleteLeavesWithAGivenValue.removeLeafNodes(root, target);
        //then
        assertThat(result)
                .isNotNull()
                .extracting("val")
                .isEqualTo(expected.val);
    }

    static Stream<Arguments> shouldDeleteLeavesWithAGivenValueParams() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.left.left = new TreeNode(2);
        treeNode1.right = new TreeNode(3);
        treeNode1.right.left = new TreeNode(2);
        treeNode1.right.right = new TreeNode(4);

        TreeNode expected1 = new TreeNode(1);
        expected1.left = new TreeNode(2);
        expected1.right = new TreeNode(3);
        expected1.right.left = new TreeNode(2);

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(3);
        treeNode2.left.left = new TreeNode(3);
        treeNode2.left.right = new TreeNode(2);
        treeNode2.right = new TreeNode(3);

        TreeNode expected2 = new TreeNode(1);
        expected2.left = new TreeNode(3);
        expected2.left.right = new TreeNode(2);

        TreeNode treeNode3 = new TreeNode(1);
        treeNode3.left = new TreeNode(2);
        treeNode3.left.left = new TreeNode(2);
        treeNode3.left.left.left = new TreeNode(2);

        TreeNode expected3 = new TreeNode(1);

        return Stream.of(
                arguments(treeNode1, 2, expected1),
                arguments(treeNode2, 3, expected2),
                arguments(treeNode3, 2, expected3)
        );
    }
}