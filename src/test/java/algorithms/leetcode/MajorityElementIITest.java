package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MajorityElementIITest {

    private MajorityElementII majorityElementII;

    @BeforeEach
    void setUp() {
        majorityElementII = new MajorityElementII();
    }

    @ParameterizedTest(name = "Params: nums=`{0}`, expectedList=`{1}`")
    @MethodSource("shouldFindMajorityElementIIParams")
    void shouldFindMajorityElementII(int[] nums, List<Integer> expected) {
        //when
        List<Integer> result = majorityElementII.majorityElement(nums);
        //then
        assertThat(result)
                .isNotNull()
                .hasSameSizeAs(expected)
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldFindMajorityElementIIParams() {
        return Stream.of(
                arguments(new int[]{3, 2, 3}, List.of(3)),
                arguments(new int[]{1}, List.of(1)),
                arguments(new int[]{1, 2}, List.of(1, 2))
        );
    }
}