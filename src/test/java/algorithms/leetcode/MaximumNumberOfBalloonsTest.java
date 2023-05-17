package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MaximumNumberOfBalloonsTest {

    private MaximumNumberOfBalloons maximumNumberOfBalloons;

    @BeforeEach
    void setUp() {
        maximumNumberOfBalloons = new MaximumNumberOfBalloons();
    }

    @ParameterizedTest(name = "Params: text=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountMaximumNumberOfBalloonsParams")
    void shouldCountMaximumNumberOfBalloons(String text, int expected) {
        //when
        int result = maximumNumberOfBalloons.maxNumberOfBalloons(text);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldCountMaximumNumberOfBalloonsParams() {
        return Stream.of(
                arguments("nlaebolko", 1),
                arguments("loonbalxballpoon", 2),
                arguments("leetcode", 0)
        );
    }
}