package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class WordSearchTest {

    private WordSearch wordSearch;

    @BeforeEach
    void setUp() {
        wordSearch = new WordSearch();
    }

    @ParameterizedTest(name = "Params: board=`{0}`, word=`{1}`, expected=`{2}`")
    @MethodSource("shouldSearchWordParams")
    void shouldSearchWord(char[][] board, String word, boolean expected) {
        //when
        boolean result = wordSearch.exist(board, word);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldSearchWordParams() {
        return Stream.of(
                arguments(new char[][]{
                        new char[]{'A', 'B', 'C', 'E'},
                        new char[]{'S', 'F', 'C', 'S'},
                        new char[]{'A', 'D', 'E', 'E'}
                }, "ABCCED", true),
                arguments(new char[][]{
                        new char[]{'A', 'B', 'C', 'E'},
                        new char[]{'S', 'F', 'C', 'S'},
                        new char[]{'A', 'D', 'E', 'E'}
                }, "SEE", true),
                arguments(new char[][]{
                        new char[]{'A', 'B', 'C', 'E'},
                        new char[]{'S', 'F', 'C', 'S'},
                        new char[]{'A', 'D', 'E', 'E'}
                }, "ABCB", false)
        );
    }
}