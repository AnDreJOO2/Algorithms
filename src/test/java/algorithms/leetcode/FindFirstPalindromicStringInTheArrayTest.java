package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindFirstPalindromicStringInTheArrayTest {

    private FindFirstPalindromicStringInTheArray findFirstPalindromicStringInTheArray;

    @BeforeEach
    void setUp() {
        findFirstPalindromicStringInTheArray = new FindFirstPalindromicStringInTheArray();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindFirstPalindromicStringInTheArrayParams")
    void shouldFindFirstPalindromicStringInTheArray(String[] words, String expected) {
        //when
        String result = findFirstPalindromicStringInTheArray.firstPalindrome(words);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindFirstPalindromicStringInTheArrayParams() {
        return Stream.of(
                arguments(new String[]{"abc", "car", "ada", "racecar", "cool"}, "ada"),
                arguments(new String[]{"notapalindrome", "racecar"}, "racecar"),
                arguments(new String[]{"def", "ghi"}, "")
        );
    }
}
