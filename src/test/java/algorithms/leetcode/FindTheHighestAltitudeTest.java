package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindTheHighestAltitudeTest {

    private FindTheHighestAltitude findTheHighestAltitude;

    @BeforeEach
    void setUp() {
        findTheHighestAltitude = new FindTheHighestAltitude();
    }

    @ParameterizedTest(name = "Params: gain=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindTheHighestAltitudeParams")
    void shouldFindTheHighestAltitude(int[] gain, int expected) {
        //when
        int result = findTheHighestAltitude.largestAltitude(gain);
        //then
        assertThat(result)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindTheHighestAltitudeParams() {
        return Stream.of(
                arguments(new int[]{-5, 1, 5, 0, -7}, 1),
                arguments(new int[]{-4, -3, -2, -1, 4, 3, 2}, 0)
        );
    }
}
