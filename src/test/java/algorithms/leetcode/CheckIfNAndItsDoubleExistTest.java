package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CheckIfNAndItsDoubleExistTest {

    private CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist;

    @BeforeEach
    void setUp() {
        checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
    }

    @ParameterizedTest(name = "Params: arr=`{0}`, expected =`{1}`")
    @MethodSource("shouldCheckIfNAndItsDoubleExistParams")
    void shouldCheckIfNAndItsDoubleExist(int[] arr, boolean expected) {
        //when
        boolean result = checkIfNAndItsDoubleExist.checkIfExist(arr);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCheckIfNAndItsDoubleExistParams() {
        return Stream.of(
                arguments(new int[]{10, 2, 5, 3}, true),
                arguments(new int[]{3, 1, 7, 11}, false)
        );
    }
}