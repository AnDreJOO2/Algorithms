package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfSegmentsInAStringTest {

    private NumberOfSegmentsInAString numberOfSegmentsInAString;

    @BeforeEach
    void setUp() {
        numberOfSegmentsInAString = new NumberOfSegmentsInAString();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountNumberOfSegmentsInAStringParams")
    void shouldCountNumberOfSegmentsInAString(String s, int expected) {
        //when
        int result = numberOfSegmentsInAString.countSegments(s);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountNumberOfSegmentsInAStringParams() {
        return Stream.of(
                arguments("Hello, my name is John", 5),
                arguments("Hello", 1)
        );
    }
}