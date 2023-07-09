package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountGoodTripletsTest {

    private CountGoodTriplets countGoodTriplets;

    @BeforeEach
    void setUp() {
        countGoodTriplets = new CountGoodTriplets();
    }

    @ParameterizedTest(name = "Params: arr=`{0}`, a=`{1}`, b=`{2}`, c=`{3}`, expected=`{4}`")
    @MethodSource("shouldCountGoodTripletsParams")
    void shouldCountGoodTriplets(int[] arr, int a, int b, int c, int expected) {
        //when
        int result = countGoodTriplets.countGoodTriplets(arr, a, b, c);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountGoodTripletsParams() {
        return Stream.of(
                arguments(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3, 4),
                arguments(new int[]{1, 1, 2, 2, 3}, 0, 0, 1, 0)
        );
    }
}
