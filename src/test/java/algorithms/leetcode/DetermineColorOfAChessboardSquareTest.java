package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DetermineColorOfAChessboardSquareTest {

    private DetermineColorOfAChessboardSquare determineColorOfAChessboardSquare;

    @BeforeEach
    void setUp() {
        determineColorOfAChessboardSquare = new DetermineColorOfAChessboardSquare();
    }

    @ParameterizedTest(name = "Params: coordinates=`{0}`, expected=`{1}`")
    @MethodSource("shouldDetermineColorOfAChessboardSquareParams")
    void shouldDetermineColorOfAChessboardSquare(String coordinates, boolean expected) {
        //when
        boolean result = determineColorOfAChessboardSquare.squareIsWhite(coordinates);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldDetermineColorOfAChessboardSquareParams() {
        return Stream.of(
                arguments("a1", false),
                arguments("h3", true),
                arguments("c7", false)
        );
    }
}