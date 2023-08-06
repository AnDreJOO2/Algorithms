package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LemonadeChangeTest {

    private LemonadeChange underTest;

    @BeforeEach
    void setUp() {
        underTest = new LemonadeChange();
    }

    @ParameterizedTest(name = "Params: bills=`{0}`, expected=`{1}`")
    @MethodSource("shouldCheckIfCustomerGetsChangeParams")
    void shouldCheckIfCustomerGetsChange(int[] bills, boolean expected) {
        //when
        boolean result = underTest.lemonadeChange(bills);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCheckIfCustomerGetsChangeParams() {
        return Stream.of(
                arguments(new int[]{5, 5, 5, 10, 20}, true),
                arguments(new int[]{5, 5, 10, 10, 20}, false)
        );
    }
}
