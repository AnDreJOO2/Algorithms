package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciNumberTest {

    private FibonacciNumber fibonacciNumber;

    @BeforeEach
    void setUp() {
        fibonacciNumber = new FibonacciNumber();
    }

    @Test
    void fibShouldPassTheTest() {
        assertThat(fibonacciNumber.fib(0)).isEqualTo(0);
        assertThat(fibonacciNumber.fib(1)).isEqualTo(1);
        assertThat(fibonacciNumber.fib(2)).isEqualTo(1);
        assertThat(fibonacciNumber.fib(3)).isEqualTo(2);
        assertThat(fibonacciNumber.fib(4)).isEqualTo(3);
        assertThat(fibonacciNumber.fib(5)).isEqualTo(5);
        assertThat(fibonacciNumber.fib(6)).isEqualTo(8);
        assertThat(fibonacciNumber.fib(7)).isEqualTo(13);
    }

}
