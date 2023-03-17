package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RepeatedDNASequencesTest {

    private RepeatedDNASequences repeatedDNASequences;

    @BeforeEach
    void setUp() {
        repeatedDNASequences = new RepeatedDNASequences();
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("params")
    void shouldFindRepeatedSequencesWithHashMapAlgorithm(String input, List<String> expected) {
        //when
        List<String> result = repeatedDNASequences.findRepeatedDnaSequences(input);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .hasSameElementsAs(expected)
                .containsExactlyElementsOf(expected);
    }

    @ParameterizedTest(name = "Params: input=`{0}`, expected=`{1}`")
    @MethodSource("params")
    void shouldFindRepeatedSequencesWithSetAlgorithm(String input, List<String> expected) {
        //when
        List<String> result = repeatedDNASequences.findRepeatedDnaSequencesTwo(input);
        //then
        assertThat(result)
                .isNotNull()
                .hasSize(expected.size())
                .hasSameElementsAs(expected)
                .containsExactlyElementsOf(expected);
    }

    static Stream<Arguments> params() {
        return Stream.of(
                arguments("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT", List.of("AAAAACCCCC", "CCCCCAAAAA")),
                arguments("AAAAAAAAAAAAA", List.of("AAAAAAAAAA"))
        );
    }
}