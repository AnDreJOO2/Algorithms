package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BinaryTreePathsTest {

    private BinaryTreePaths binaryTreePaths;

    @BeforeEach
    void setUp() {
        binaryTreePaths = new BinaryTreePaths();
    }

    @ParameterizedTest(name = "Params: root=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindBinaryTreePathsParams")
    void shouldFindBinaryTreePaths(BinaryTreePaths.TreeNode root, List<String> expected) {
        //when
        List<String> result = binaryTreePaths.binaryTreePaths(root);
        //then
        assertThat(result).isNotNull().containsExactlyElementsOf(expected).isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindBinaryTreePathsParams() {
        BinaryTreePaths.TreeNode treeNode1 = new BinaryTreePaths.TreeNode(1);
        treeNode1.left = new BinaryTreePaths.TreeNode(2);
        treeNode1.right = new BinaryTreePaths.TreeNode(3);
        treeNode1.left.right = new BinaryTreePaths.TreeNode(5);

        BinaryTreePaths.TreeNode treeNode2 = new BinaryTreePaths.TreeNode(1);

        return Stream.of(arguments(treeNode1, List.of("1->2->5", "1->3")), arguments(treeNode2, List.of("1")));
    }
}
