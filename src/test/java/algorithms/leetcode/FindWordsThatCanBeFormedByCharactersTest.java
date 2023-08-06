package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindWordsThatCanBeFormedByCharactersTest {

    private FindWordsThatCanBeFormedByCharacters underTest;

    @BeforeEach
    void setUp() {
        underTest = new FindWordsThatCanBeFormedByCharacters();
    }

    @ParameterizedTest(name = "Params: words=`{0}`, chars=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountLengthOfWordsThatCanBeFormedByCharactersParams")
    void shouldCountLengthOfWordsThatCanBeFormedByCharacters(String[] words, String chars, int expected) {
        //when
        int result = underTest.countCharacters(words, chars);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountLengthOfWordsThatCanBeFormedByCharactersParams() {
        return Stream.of(
                arguments(new String[]{"cat", "bt", "hat", "tree"}, "atach", 6),
                arguments(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr", 10)
        );
    }
}
