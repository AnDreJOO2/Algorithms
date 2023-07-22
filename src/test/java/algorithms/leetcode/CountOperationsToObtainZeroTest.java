package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CountOperationsToObtainZeroTest {

    private CountOperationsToObtainZero countOperationsToObtainZero;

    @BeforeEach
    void setUp() {
        countOperationsToObtainZero = new CountOperationsToObtainZero();
    }

    @ParameterizedTest(name = "Params: num1=`{0}`, num2=`{1}`, expected=`{2}`")
    @MethodSource("shouldCountOperationsToObtainZeroParams")
    void shouldCountOperationsToObtainZero(int num1, int num2, int expected) {
        //when
        int result = countOperationsToObtainZero.countOperations(num1, num2);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }

    static Stream<Arguments> shouldCountOperationsToObtainZeroParams() {
        return Stream.of(
                arguments(2, 3, 3),
                arguments(10, 10, 1));
    }
}
