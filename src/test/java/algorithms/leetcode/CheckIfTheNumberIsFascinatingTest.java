package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckIfTheNumberIsFascinatingTest {

    private CheckIfTheNumberIsFascinating underTest;

    @BeforeEach
    void setUp() {
        underTest = new CheckIfTheNumberIsFascinating();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldCheckIfTheNumberIsFascinatingParams")
    void shouldCheckIfTheNumberIsFascinating(int n, boolean expected) {
        //when
        boolean result = underTest.isFascinating(n);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCheckIfTheNumberIsFascinatingParams() {
        return Stream.of(
                arguments(192, true),
                arguments(100, false)
        );
    }
}
