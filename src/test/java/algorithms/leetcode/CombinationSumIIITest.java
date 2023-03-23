package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CombinationSumIIITest {

    private CombinationSumIII combinationSumIII;

    @BeforeEach
    void setUp() {
        combinationSumIII = new CombinationSumIII();
    }

    @ParameterizedTest(name = "Params: k=`{0}`, n=`{1}`, expected=`{2}`")
    @MethodSource("params")
    void shouldReturnListWithAllUniqueCombinations(int k, int n, List<List<Integer>> expected) {
        //when
        List<List<Integer>> result = combinationSumIII.combinationSum3(k, n);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .isEqualTo(expected)
                .containsExactlyElementsOf(expected);
    }

    static Stream<Arguments> params() {
        return Stream.of(
                arguments(3, 7, List.of(List.of(1, 2, 4))),
                arguments(3, 9, List.of(List.of(1, 2, 6), List.of(1, 3, 5), List.of(2, 3, 4)))
        );
    }


}