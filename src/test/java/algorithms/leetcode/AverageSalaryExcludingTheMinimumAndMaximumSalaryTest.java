package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

    private AverageSalaryExcludingTheMinimumAndMaximumSalary averageSalaryExcludingTheMinimumAndMaximumSalary;

    @BeforeEach
    void setUp() {
        averageSalaryExcludingTheMinimumAndMaximumSalary = new AverageSalaryExcludingTheMinimumAndMaximumSalary();
    }

    @ParameterizedTest(name = "Params: salary=`{0}`, expected=`{1}`")
    @MethodSource("shouldCalculateAverageSalaryExcludingTheMinimumAndMaximumSalaryParams")
    void shouldCalculateAverageSalaryExcludingTheMinimumAndMaximumSalary(int[] salary, double expected) {
        //when
        double result = averageSalaryExcludingTheMinimumAndMaximumSalary.average(salary);
        //then
        assertThat(result)
                .isNotNull()
                .isEqualTo(expected);
    }


    static Stream<Arguments> shouldCalculateAverageSalaryExcludingTheMinimumAndMaximumSalaryParams() {
        return Stream.of(
                arguments(new int[]{4000, 3000, 1000, 2000}, 2500.00000),
                arguments(new int[]{1000, 2000, 3000}, 2000.00000)
        );
    }
}