package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AvailableCapturesForRookTest {

    private AvailableCapturesForRook underTest;

    @BeforeEach
    void setUp() {
        underTest = new AvailableCapturesForRook();
    }

    @ParameterizedTest(name = "Params: board=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountAvailableCapturesForRookParams")
    void shouldCountAvailableCapturesForRook(char[][] board, int expected) {
        //when
        int result = underTest.numRookCaptures(board);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCountAvailableCapturesForRookParams() {
        return Stream.of(
                arguments(new char[][]{
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                }, 3),
                arguments(new char[][]{
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                        {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                }, 0),
                arguments(new char[][]{
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'B', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                }, 3)
        );
    }
}
