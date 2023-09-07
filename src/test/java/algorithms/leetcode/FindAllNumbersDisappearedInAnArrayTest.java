package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindAllNumbersDisappearedInAnArrayTest {

    private FindAllNumbersDisappearedInAnArray underTest;

    @BeforeEach
    void setUp() {
        underTest = new FindAllNumbersDisappearedInAnArray();
    }

    @ParameterizedTest(name = "Params: current=`{0}`, expected=`{1}`")
    @MethodSource("shouldFindDisappearedNumbersParams")
    void shouldFindDisappearedNumbers(int[] nums, List<Integer> expected) {
        //when
        List<Integer> result = underTest.findDisappearedNumbers(nums);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);

    }

    static Stream<Arguments> shouldFindDisappearedNumbersParams() {
        return Stream.of(
                arguments(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6)),
                arguments(new int[]{1, 1}, List.of(2))
        );
    }
}
