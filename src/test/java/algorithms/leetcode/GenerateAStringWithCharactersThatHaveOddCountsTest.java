package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GenerateAStringWithCharactersThatHaveOddCountsTest {

    private GenerateAStringWithCharactersThatHaveOddCounts generateAStringWithCharactersThatHaveOddCounts;

    @BeforeEach
    void setUp() {
        generateAStringWithCharactersThatHaveOddCounts = new GenerateAStringWithCharactersThatHaveOddCounts();
    }

    @ParameterizedTest(name = "Params: n=`{0}`, expected=`{1}`")
    @MethodSource("shouldGenerateAStringWithCharactersThatHaveOddCountsParams")
    void shouldGenerateAStringWithCharactersThatHaveOddCounts(int n, String expected) {
        //when
        String result = generateAStringWithCharactersThatHaveOddCounts.generateTheString(n);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldGenerateAStringWithCharactersThatHaveOddCountsParams() {
        return Stream.of(
                arguments(4, "aaab"),
                arguments(2, "ab"),
                arguments(7, "aaaaaaa")
        );
    }
}
