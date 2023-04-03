package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MoveZeroesTest {

    private MoveZeroes moveZeroes;

    @BeforeEach
    void setUp() {
        moveZeroes = new MoveZeroes();
    }

    @ParameterizedTest(name = "Params: beforeMoving=`{0}`, afterMoving=`{1}`")
    @MethodSource("shouldMoveZeroesParams")
    void shouldMoveZeroesWithFirstSolution(int[] nums, int[] expected) {
        //when
        moveZeroes.moveZeroes(nums);
        //then
        assertThat(nums)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactly(expected);
    }

    @ParameterizedTest(name = "Params: beforeMoving=`{0}`, afterMoving=`{1}`")
    @MethodSource("shouldMoveZeroesParams")
    void shouldMoveZeroesWithSecondSolution(int[] nums, int[] expected) {
        //when
        moveZeroes.moveZeroesTwo(nums);
        //then
        assertThat(nums)
                .isNotNull()
                .hasSameSizeAs(expected)
                .containsExactly(expected);

    }

    static Stream<Arguments> shouldMoveZeroesParams() {
        return Stream.of(arguments(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}), arguments(new int[]{0}, new int[]{0}));
    }
}