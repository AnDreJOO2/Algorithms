package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ConsecutiveCharactersTest {

    private ConsecutiveCharacters consecutiveCharacters;

    @BeforeEach
    void setUp() {
        consecutiveCharacters = new ConsecutiveCharacters();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountConsecutiveCharactersParams")
    void shouldCountConsecutiveCharacters(String s, int expected) {
        //when
        int result = consecutiveCharacters.maxPower(s);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountConsecutiveCharactersParams() {
        return Stream.of(
                arguments("leetcode", 2),
                arguments("abbcccddddeeeeedcba", 5)
        );
    }
}