package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class KidsWithTheGreatestNumberOfCandiesTest {

    private KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies;

    @BeforeEach
    void setUp() {
        kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();
    }

    @ParameterizedTest(name = "Params: candies=`{0}`, extraCandies =`{1}`, expected =`{2}`")
    @MethodSource("shouldFindLargestValueInEachTreeRowParams")
    void shouldFindLargestValueInEachTreeRow(int[] candies, int extraCandies, List<Boolean> expected) {
        //when
        List<Boolean> result = kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindLargestValueInEachTreeRowParams() {
        return Stream.of(
                arguments(new int[]{2, 3, 5, 1, 3}, 3, List.of(true, true, true, false, true)),
                arguments(new int[]{4, 2, 1, 1, 2}, 1, List.of(true, false, false, false, false)),
                arguments(new int[]{12, 1, 12}, 10, List.of(true, false, true))
        );
    }
}