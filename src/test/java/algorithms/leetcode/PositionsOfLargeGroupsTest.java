package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PositionsOfLargeGroupsTest {

    private PositionsOfLargeGroups underTest;

    @BeforeEach
    void setUp() {
        underTest = new PositionsOfLargeGroups();
    }

    @ParameterizedTest(name = "Params: s=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindPositionsOfLargeGroupsParams")
    void shouldFindPositionsOfLargeGroups(String s, List<List<Integer>> expected) {
        //when
        List<List<Integer>> result = underTest.largeGroupPositions(s);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactlyElementsOf(expected)
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldFindPositionsOfLargeGroupsParams() {
        return Stream.of(
                arguments("abbxxxxzzy", List.of(
                        List.of(3, 6)
                )),
                arguments("abc", List.of(

                )),
                arguments("abcdddeeeeaabbbcd", List.of(
                        List.of(3, 5),
                        List.of(6, 9),
                        List.of(12, 14)
                ))
        );
    }
}
