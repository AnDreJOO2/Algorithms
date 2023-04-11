package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class JewelsAndStonesTest {

    private JewelsAndStones jewelsAndStones;

    @BeforeEach
    void setUp() {
        jewelsAndStones = new JewelsAndStones();
    }

    @ParameterizedTest(name = "Params: jewels=`{0}`, stones=`{1}`, expected=`{2}`")
    @MethodSource("shouldJewelsAndStonesReturnExpectedValueParams")
    void shouldJewelsAndStonesReturnExpectedValue(String jewels, String stones, int expected) {
        //when
        int result = jewelsAndStones.numJewelsInStones(jewels, stones);
        //then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> shouldJewelsAndStonesReturnExpectedValueParams() {
        return Stream.of(
                arguments("aA", "aAAbbbb", 3),
                arguments("z", "ZZ", 0)
        );
    }
}