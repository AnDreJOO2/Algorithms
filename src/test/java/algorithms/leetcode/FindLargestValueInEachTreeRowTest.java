package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static algorithms.leetcode.FindLargestValueInEachTreeRow.TreeNode;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindLargestValueInEachTreeRowTest {

    private FindLargestValueInEachTreeRow findLargestValueInEachTreeRow;

    @BeforeEach
    void setUp() {
        findLargestValueInEachTreeRow = new FindLargestValueInEachTreeRow();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindLargestValueInEachTreeRowParams")
    void shouldFindLargestValueInEachTreeRow(TreeNode input, List<Integer> expected) {
        //when
        List<Integer> result = findLargestValueInEachTreeRow.largestValues(input);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindLargestValueInEachTreeRowParams() {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(2);
        treeNode1.left.left = new TreeNode(5);
        treeNode1.left.right = new TreeNode(3);
        treeNode1.right.right = new TreeNode(9);
        List<Integer> expected1 = List.of(1, 3, 9);

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);
        List<Integer> expected2 = List.of(1, 3);

        return Stream.of(
                arguments(treeNode1, expected1),
                arguments(treeNode2, expected2)
        );
    }

}