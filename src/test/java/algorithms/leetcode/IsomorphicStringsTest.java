package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class IsomorphicStringsTest {

    private IsomorphicStrings isomorphicStrings;

    @BeforeEach
    void setUp() {
        isomorphicStrings = new IsomorphicStrings();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, t=`{1}`, expected=`{2}`")
    @MethodSource("shouldCheckIfStringsAreIsomorphicParams")
    void shouldCheckIfStringsAreIsomorphic(String s, String t, boolean expected) {
        //when
        boolean result = isomorphicStrings.isIsomorphic(s, t);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCheckIfStringsAreIsomorphicParams() {
        return Stream.of(
                arguments("egg", "add", true),
                arguments("foo", "bar", false),
                arguments("paper", "title", true)
        );
    }
}