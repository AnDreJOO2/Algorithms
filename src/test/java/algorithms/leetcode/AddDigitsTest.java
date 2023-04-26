package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AddDigitsTest {

    private AddDigits addDigits;

    @BeforeEach
    void setUp() {
        addDigits = new AddDigits();
    }

    @ParameterizedTest(name = "Params: num =`{0}`, expected=`{1}`")
    @MethodSource("shouldAddDigitsParams")
    void shouldAddDigits(int num, int expected) {
        //when
        int result = addDigits.addDigits(num);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldAddDigitsParams() {
        return Stream.of(
                arguments(38, 2),
                arguments(0, 0)
        );
    }
}