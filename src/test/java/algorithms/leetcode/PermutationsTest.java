package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PermutationsTest {

    private Permutations permutations;

    @BeforeEach
    void setUp() {
        permutations = new Permutations();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindPermutationsParams")
    void shouldFindPermutations(int[] input, List<List<Integer>> expected) {
        //when
        List<List<Integer>> result = permutations.permute(input);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .isEqualTo(expected)
                .containsExactlyElementsOf(expected);
    }

    static Stream<Arguments> shouldFindPermutationsParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, List.of(
                        List.of(1, 2, 3),
                        List.of(1, 3, 2),
                        List.of(2, 1, 3),
                        List.of(2, 3, 1),
                        List.of(3, 2, 1),
                        List.of(3, 1, 2)
                )),
                arguments(new int[]{0, 1}, List.of(
                        List.of(0, 1),
                        List.of(1, 0)
                )),
                arguments(new int[]{1}, List.of(
                        List.of(1)
                ))
        );
    }
}