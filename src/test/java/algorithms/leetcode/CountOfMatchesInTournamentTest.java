package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountOfMatchesInTournamentTest {

    private CountOfMatchesInTournament countOfMatchesInTournament;

    @BeforeEach
    void setUp() {
        countOfMatchesInTournament = new CountOfMatchesInTournament();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountOfMatchesInTournamentParams")
    void shouldCountOfMatchesInTournament(int n, int expected) {
        //when
        int result = countOfMatchesInTournament.numberOfMatches(n);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCountOfMatchesInTournamentParams() {
        return Stream.of(
                arguments(7, 6),
                arguments(14, 13)
        );
    }
}