package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LastStoneWeightTest {

    private LastStoneWeight lastStoneWeight;

    @BeforeEach
    void setUp() {
        lastStoneWeight = new LastStoneWeight();
    }

    @ParameterizedTest(name = "Params: stones=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindLastStoneWeightParams")
    void shouldFindLastStoneWeight(int[] stones, int expected) {
        //when
        int result = lastStoneWeight.lastStoneWeight(stones);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindLastStoneWeightParams() {
        return Stream.of(
                arguments(new int[]{2, 7, 4, 1, 8, 1}, 1),
                arguments(new int[]{2, 2}, 0)
        );
    }
}