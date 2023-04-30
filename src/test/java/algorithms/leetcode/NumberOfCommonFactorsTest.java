package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfCommonFactorsTest {

    private NumberOfCommonFactors numberOfCommonFactors;

    @BeforeEach
    void setUp() {
        numberOfCommonFactors = new NumberOfCommonFactors();
    }

    @ParameterizedTest(name = "Params: a=`{0}`, b=`{1}`, expected={2}")
    @MethodSource("shouldCountNumberOfCommonFactorsParams")
    void shouldCountNumberOfCommonFactors(int a, int b, int expected) {
        //when
        int result = numberOfCommonFactors.commonFactors(a, b);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountNumberOfCommonFactorsParams() {
        return Stream.of(
                arguments(12, 6, 4),
                arguments(25, 30, 2)
        );
    }
}