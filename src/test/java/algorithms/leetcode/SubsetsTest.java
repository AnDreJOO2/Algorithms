package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SubsetsTest {

    private Subsets subsets;

    @BeforeEach
    void setUp() {
        subsets = new Subsets();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindAllSubsetsParams")
    void shouldFindAllSubsets(int[] nums, List<List<Integer>> expected) {
        //when
        List<List<Integer>> result = subsets.subsets(nums);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactlyInAnyOrderElementsOf(expected);
    }


    static Stream<Arguments> shouldFindAllSubsetsParams() {
        return Stream.of(
                arguments(new int[]{1, 2, 3},
                        List.of(
                                List.of(),
                                List.of(1),
                                List.of(2),
                                List.of(1, 2),
                                List.of(3),
                                List.of(1, 3),
                                List.of(2, 3),
                                List.of(1, 2, 3)
                        )),
                arguments(new int[]{0},
                        List.of(
                                List.of(),
                                List.of(0)
                        ))
        );
    }
}