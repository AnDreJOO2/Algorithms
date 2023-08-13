package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckIfStringIsAPrefixOfArrayTest {

    private CheckIfStringIsAPrefixOfArray underTest;

    @BeforeEach
    void setUp() {
        underTest = new CheckIfStringIsAPrefixOfArray();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, words=`{1}`, expected={2}")
    @MethodSource("shouldCheckIfStringIsAPrefixOfArrayParams")
    void shouldCheckIfStringIsAPrefixOfArray(String s, String[] words, boolean expected) {
        //when
        boolean result = underTest.isPrefixString(s, words);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCheckIfStringIsAPrefixOfArrayParams() {
        return Stream.of(
                arguments("iloveleetcode", new String[]{"i", "love", "leetcode", "apples"}, true),
                arguments("iloveleetcode", new String[]{"apples", "i", "love", "leetcode"}, false)
        );
    }
}
