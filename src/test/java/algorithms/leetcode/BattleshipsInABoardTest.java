package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BattleshipsInABoardTest {

    private BattleshipsInABoard battleshipsInABoard;

    @BeforeEach
    void setUp() {
        battleshipsInABoard = new BattleshipsInABoard();
    }

    @ParameterizedTest(name = "Params: board=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateBattleshipsInABoardParams")
    void shouldCalculateBattleshipsInABoard(char[][] board, int expected) {
        //when
        int result = battleshipsInABoard.countBattleships(board);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCalculateBattleshipsInABoardParams() {
        return Stream.of(
                arguments(new char[][]{
                        {'X', '.', '.', 'X'},
                        {'.', '.', '.', 'X'},
                        {'.', '.', '.', 'X'},
                        {'.', '.', '.', '.'}
                }, 2),
                arguments(new char[][]{
                        {'.'}
                }, 0)
        );
    }
}