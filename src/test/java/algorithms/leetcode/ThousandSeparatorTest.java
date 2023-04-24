package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ThousandSeparatorTest {

    private ThousandSeparator thousandSeparator;

    @BeforeEach
    void setUp() {
        thousandSeparator = new ThousandSeparator();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldThousandSeparatorReturnCorrectFormatParams")
    void shouldThousandSeparatorReturnCorrectFormat(int n, String expected) {
        //when
        String result = thousandSeparator.thousandSeparator(n);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(result)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldThousandSeparatorReturnCorrectFormatParams() {
        return Stream.of(
                arguments(987, "987"),
                arguments(1234, "1.234"),
                arguments(1234667, "1.234.667")
        );
    }
}