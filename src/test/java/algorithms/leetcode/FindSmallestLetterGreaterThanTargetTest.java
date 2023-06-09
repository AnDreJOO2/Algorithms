package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindSmallestLetterGreaterThanTargetTest {

    private FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget;

    @BeforeEach
    void setUp() {
        findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
    }

    @ParameterizedTest(name = "Params: letters=`{0}`, target=`{1}` expected=`{2}`")
    @MethodSource("shouldFindSmallestLetterGreaterThanTargetParams")
    void shouldFindSmallestLetterGreaterThanTarget(char[] letters, char target, char expected) {
        //when
        char result = findSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindSmallestLetterGreaterThanTargetParams() {
        return Stream.of(
                arguments(new char[]{'c', 'f', 'j'}, 'a', 'c'),
                arguments(new char[]{'c', 'f', 'j'}, 'c', 'f'),
                arguments(new char[]{'x', 'x', 'y', 'y'}, 'z', 'x')
        );
    }
}
