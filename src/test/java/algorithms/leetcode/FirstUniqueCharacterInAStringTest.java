package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FirstUniqueCharacterInAStringTest {

    private FirstUniqueCharacterInAString firstUniqueCharacterInAString;

    @BeforeEach
    void setUp() {
        firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindFirstUniqueCharacterInAStringParams")
    void shouldFindFirstUniqueCharacterInAString(String input, int expected) {
        //when
        int result = firstUniqueCharacterInAString.firstUniqChar(input);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindFirstUniqueCharacterInAStringParams() {
        return Stream.of(
                arguments("leetcode", 0),
                arguments("loveleetcode", 2),
                arguments("aabb", -1)
        );
    }
}