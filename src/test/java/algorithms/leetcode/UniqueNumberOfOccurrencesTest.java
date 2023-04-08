package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class UniqueNumberOfOccurrencesTest {

    private UniqueNumberOfOccurrences uniqueNumberOfOccurrences;

    @BeforeEach
    void setUp() {
        uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();
    }

    @ParameterizedTest(name = "Params: input=`{0}`")
    @MethodSource("shouldCheckIfNumberOfOccurrencesIsTrueParams")
    void shouldCheckIfNumberOfOccurrencesIsTrue(int[] input) {
        //when
        boolean result = uniqueNumberOfOccurrences.uniqueOccurrences(input);
        //then
        assertThat(result)
                .isTrue();
    }

    @ParameterizedTest(name = "Params: input=`{0}`")
    @MethodSource("shouldCheckIfNumberOfOccurrencesIsFalseParams")
    void shouldCheckIfNumberOfOccurrencesIsFalse(int[] input) {
        //when
        boolean result = uniqueNumberOfOccurrences.uniqueOccurrences(input);
        //then
        assertThat(result)
                .isFalse();
    }

    static Stream<Arguments> shouldCheckIfNumberOfOccurrencesIsTrueParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 2, 1, 1, 3}),
                arguments(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0})

        );
    }

    static Stream<Arguments> shouldCheckIfNumberOfOccurrencesIsFalseParams() {
        return Stream.of(
                arguments(new int[]{0, 1})
        );
    }
}