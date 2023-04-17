package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static algorithms.leetcode.RangeSumOfBST.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RangeSumOfBSTTest {

    private RangeSumOfBST rangeSumOfBST;

    @BeforeEach
    void setUp() {
        rangeSumOfBST = new RangeSumOfBST();
    }

    @ParameterizedTest(name = "Params: TreeNode=`{0}`, low=`{1}`, high=`{2}`, expected=`{3}`")
    @MethodSource("shouldSumRangeOfBSTParams")
    void shouldSumRangeOfBST(TreeNode given, int low, int high, int expected) {
        //when
        int result = rangeSumOfBST.rangeSumBST(given, low, high);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldSumRangeOfBSTParams() {
        TreeNode treeNode1 = new TreeNode(10);
        treeNode1.left = new TreeNode(5);
        treeNode1.right = new TreeNode(15);
        treeNode1.left.left = new TreeNode(3);
        treeNode1.left.right = new TreeNode(7);
        treeNode1.right.right = new TreeNode(18);

        TreeNode treeNode2 = new TreeNode(10);
        treeNode2.left = new TreeNode(5);
        treeNode2.right = new TreeNode(15);
        treeNode2.left.left = new TreeNode(3);
        treeNode2.left.right = new TreeNode(7);
        treeNode2.right.left = new TreeNode(13);
        treeNode2.right.right = new TreeNode(18);
        treeNode2.left.left.left = new TreeNode(1);
        treeNode2.left.right.left = new TreeNode(6);

        return Stream.of(
                arguments(treeNode1, 7, 15, 32),
                arguments(treeNode2, 6, 10, 23)
        );
    }
}