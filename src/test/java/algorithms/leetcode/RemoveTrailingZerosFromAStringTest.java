package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveTrailingZerosFromAStringTest {

    private RemoveTrailingZerosFromAString removeTrailingZerosFromAString;

    @BeforeEach
    void setUp() {
        removeTrailingZerosFromAString = new RemoveTrailingZerosFromAString();
    }

    @ParameterizedTest(name = "Params: num=`{0}`, expected=`{1}`")
    @MethodSource("shouldRemoveTrailingZerosFromAStringParams")
    void shouldRemoveTrailingZerosFromAString(String num, String expected) {
        //when
        String result = removeTrailingZerosFromAString.removeTrailingZeros(num);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldRemoveTrailingZerosFromAStringParams() {
        return Stream.of(
                arguments("51230100", "512301"),
                arguments("123", "123")

        );
    }

}
