package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindLuckyIntegerInAnArrayTest {

    private FindLuckyIntegerInAnArray findLuckyIntegerInAnArray;

    @BeforeEach
    void setUp() {
        findLuckyIntegerInAnArray = new FindLuckyIntegerInAnArray();
    }

    @ParameterizedTest(name = "Params: arr=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindLargestLuckyIntegerInAnArrayParams")
    void shouldFindLargestLuckyIntegerInAnArray(int[] arr, int expected) {
        //when
        int result = findLuckyIntegerInAnArray.findLucky(arr);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindLargestLuckyIntegerInAnArrayParams() {
        return Stream.of(
                arguments(new int[]{2, 2, 3, 4}, 2),
                arguments(new int[]{1, 2, 2, 3, 3, 3}, 3),
                arguments(new int[]{2, 2, 2, 3, 3}, -1)
        );
    }
}