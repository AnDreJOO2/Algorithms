package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NumberOfValidWordsInASentenceTest {

    private NumberOfValidWordsInASentence numberOfValidWordsInASentence;

    @BeforeEach
    void setUp() {
        numberOfValidWordsInASentence = new NumberOfValidWordsInASentence();
    }

    @ParameterizedTest(name = "Params: sentence=`{0}`, expected=`{1}`")
    @MethodSource("shouldCountNumberOfValidWordsInASentenceParams")
    void shouldCalculateMinimumCostOfBuyingCandiesWithDiscount(String sentence, int expected) {
        //when
        int result = numberOfValidWordsInASentence.countValidWords(sentence);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountNumberOfValidWordsInASentenceParams() {
        return Stream.of(
                arguments("cat and  dog", 3),
                arguments("!this  1-s b8d!", 0),
                arguments("alice and  bob are playing stone-game10", 5),
                arguments(" , wn xhx5e2  9k !  fs uc5jc  u3  f5 lj x mkkouek, .g", 7)
        );
    }
}