package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BoatsToSavePeopleTest {

    private BoatsToSavePeople boatsToSavePeople;

    @BeforeEach
    void setUp() {
        this.boatsToSavePeople = new BoatsToSavePeople();
    }

    @ParameterizedTest(name = "Params: people=`{0}`, limit=`{1}`, expectedBoats:`{2}`")
    @MethodSource("calculateBoatsToSavePeopleParams")
    void shouldCalculateBoatsToSavePeople(int[] people, int limit, int expectedBoats) {
        //when
        int result = boatsToSavePeople.numRescueBoats(people, limit);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expectedBoats);
    }


    static Stream<Arguments> calculateBoatsToSavePeopleParams() {
        return Stream.of(
                arguments(new int[]{1, 2}, 3, 1),
                arguments(new int[]{3, 2, 2, 1}, 3, 3),
                arguments(new int[]{3, 5, 3, 4}, 5, 4)
        );
    }
}