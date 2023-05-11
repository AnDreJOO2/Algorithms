package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FirstLetterToAppearTwiceTest {

    private FirstLetterToAppearTwice firstLetterToAppearTwice;

    @BeforeEach
    void setUp() {
        firstLetterToAppearTwice = new FirstLetterToAppearTwice();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindFirstLetterToAppearTwiceParams")
    void shouldFindFirstLetterToAppearTwice(String s, char expected) {
        // when
        char result = firstLetterToAppearTwice.repeatedCharacter(s);
        // then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldFindFirstLetterToAppearTwiceParams() {
        return Stream.of(
                arguments("abccbaacz", 'c'),
                arguments("abcdd", 'd')
        );
    }
}