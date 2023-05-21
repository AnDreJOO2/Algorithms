package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Largest3SameDigitNumberInStringTest {

    private Largest3SameDigitNumberInString largest3SameDigitNumberInString;

    @BeforeEach
    void setUp() {
        largest3SameDigitNumberInString = new Largest3SameDigitNumberInString();
    }

    @ParameterizedTest(name = "Params: num=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindLargest3SameDigitNumberInStringParams")
    void shouldFindLargest3SameDigitNumberInString(String num, String expected) {
        //when
        String result = largest3SameDigitNumberInString.largestGoodInteger(num);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldFindLargest3SameDigitNumberInStringParams() {
        return Stream.of(
                arguments("6777133339", "777"),
                arguments("2300019", "000"),
                arguments("42352338", "")
        );
    }

}