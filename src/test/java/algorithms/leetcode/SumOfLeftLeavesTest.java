package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static algorithms.leetcode.SumOfLeftLeaves.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumOfLeftLeavesTest {

    private SumOfLeftLeaves sumOfLeftLeaves;

    @BeforeEach
    void setUp() {
        sumOfLeftLeaves = new SumOfLeftLeaves();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindLargestValueInEachTreeRowParams")
    void shouldFindLargestValueInEachTreeRow(TreeNode root, int expected) {
        //when
        int result = sumOfLeftLeaves.sumOfLeftLeaves(root);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindLargestValueInEachTreeRowParams() {
        TreeNode treeNode1 = new TreeNode(3);
        treeNode1.left = new TreeNode(9);
        treeNode1.right = new TreeNode(20);
        treeNode1.right.left = new TreeNode(15);
        treeNode1.right.right = new TreeNode(7);

        TreeNode treeNode2 = new TreeNode(1);

        return Stream.of(
                arguments(treeNode1, 24),
                arguments(treeNode2, 0)
        );
    }
}