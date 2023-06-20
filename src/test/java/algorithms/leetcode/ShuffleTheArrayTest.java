package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ShuffleTheArrayTest {

    private ShuffleTheArray shuffleTheArray;

    @BeforeEach
    void setUp() {
        shuffleTheArray = new ShuffleTheArray();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, n=`{1}`, expected=`{2}`")
    @MethodSource("shouldShuffleTheArrayParams")
    void shouldShuffleTheArray(int[] nums, int n, int[] expected) {
        //when
        int[] result = shuffleTheArray.shuffle(nums, n);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldShuffleTheArrayParams() {
        return Stream.of(
                arguments(new int[]{2, 5, 1, 3, 4, 7}, 3, new int[]{2, 3, 5, 4, 1, 7}),
                arguments(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4, new int[]{1, 4, 2, 3, 3, 2, 4, 1}),
                arguments(new int[]{1, 1, 2, 2}, 2, new int[]{1, 2, 1, 2})
        );
    }
}
