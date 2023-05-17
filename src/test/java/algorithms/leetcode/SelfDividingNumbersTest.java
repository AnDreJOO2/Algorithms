package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SelfDividingNumbersTest {

    private SelfDividingNumbers selfDividingNumbers;

    @BeforeEach
    void setUp() {
        selfDividingNumbers = new SelfDividingNumbers();
    }

    @ParameterizedTest(name = "Params: left=`{0}`, left=`{1}`, expected=`{2}`")
    @MethodSource("shouldFindSelfDividingNumbersParams")
    void shouldFindSelfDividingNumbers(int left, int right, List<Integer> expected) {
        //when
        List<Integer> result = selfDividingNumbers.selfDividingNumbers(left, right);
        //then
        assertThat(result)
                .isNotNull()
                .containsExactlyInAnyOrderElementsOf(expected)
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldFindSelfDividingNumbersParams() {
        return Stream.of(
                arguments(1, 22, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)),
                arguments(47, 85, List.of(48, 55, 66, 77))
        );
    }
}