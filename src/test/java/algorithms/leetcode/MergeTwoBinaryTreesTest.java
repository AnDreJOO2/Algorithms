package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static algorithms.leetcode.MergeTwoBinaryTrees.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeTwoBinaryTreesTest {

    private MergeTwoBinaryTrees mergeTwoBinaryTrees;

    @BeforeEach
    void setUp() {
        mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
    }

    @ParameterizedTest(name = "Params: root1=`{0}`, root2=`{1}`, expected=`{2}`")
    @MethodSource("shouldMergeTwoBinaryTreesParams")
    void shouldMergeTwoBinaryTrees(TreeNode root1, TreeNode root2, TreeNode expected) {
        //when
        TreeNode result = mergeTwoBinaryTrees.mergeTrees(root1, root2);
        //then
        assertThat(result)
                .isNotNull()
                .extracting("val")
                .isEqualTo(expected.val);
    }

    static Stream<Arguments> shouldMergeTwoBinaryTreesParams() {
        TreeNode test1Root1 = new TreeNode(1);
        test1Root1.left = new TreeNode(3);
        test1Root1.right = new TreeNode(2);
        test1Root1.left.left = new TreeNode(5);

        TreeNode test1Root2 = new TreeNode(2);
        test1Root2.left = new TreeNode(1);
        test1Root2.right = new TreeNode(3);
        test1Root2.left.right = new TreeNode(4);
        test1Root2.right.right = new TreeNode(7);

        TreeNode test1Expected = new TreeNode(3);
        test1Expected.left = new TreeNode(4);
        test1Expected.right = new TreeNode(5);
        test1Expected.left.left = new TreeNode(5);
        test1Expected.left.right = new TreeNode(4);
        test1Expected.right.right = new TreeNode(7);

        TreeNode test2Root1 = new TreeNode(1);

        TreeNode test2Root2 = new TreeNode(1);
        test2Root2.left = new TreeNode(2);

        TreeNode test2Expected = new TreeNode(2);
        test2Expected.left = new TreeNode(2);

        return Stream.of(
                arguments(test1Root1, test1Root2, test1Expected),
                arguments(test2Root1, test2Root2, test2Expected)
        );
    }
}