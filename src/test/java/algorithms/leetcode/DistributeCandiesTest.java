package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DistributeCandiesTest {
    private DistributeCandies distributeCandies;

    @BeforeEach
    void setUp() {
        distributeCandies = new DistributeCandies();
    }

    @ParameterizedTest(name = "Params: candyType=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateMaximumDistributeCandiesParams")
    void shouldCalculateMaximumDistributeCandies(int[] candyType, int expected) {
        //when
        int result = distributeCandies.distributeCandies(candyType);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCalculateMaximumDistributeCandiesParams() {
        return Stream.of(
                arguments(new int[]{1, 1, 2, 2, 3, 3}, 3),
                arguments(new int[]{1, 1, 2, 3}, 2),
                arguments(new int[]{6, 6, 6, 6}, 1)
        );
    }
}