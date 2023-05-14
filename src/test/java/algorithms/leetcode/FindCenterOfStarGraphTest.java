package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindCenterOfStarGraphTest {

    private FindCenterOfStarGraph findCenterOfStarGraph;

    @BeforeEach
    void setUp() {
        findCenterOfStarGraph = new FindCenterOfStarGraph();
    }

    @ParameterizedTest(name = "Params: edges=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindCenterOfStarGraphParams")
    void shouldFindCenterOfStarGrap(int[][] edges, int expected) {
        //when
        int result = findCenterOfStarGraph.findCenter(edges);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindCenterOfStarGraphParams() {
        return Stream.of(
                arguments(new int[][]{
                        new int[]{1, 2},
                        new int[]{2, 3},
                        new int[]{4, 2}
                }, 2),
                arguments(new int[][]{
                        new int[]{1, 2},
                        new int[]{5, 1},
                        new int[]{1, 3},
                        new int[]{1, 4}
                }, 1)
        );
    }
}