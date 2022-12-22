package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void fizzBuzzShouldPassTheTest() {

        assertThat(fizzBuzz.fizzBuzz(3)).isEqualTo(Arrays.asList("1", "2", "Fizz"));
        assertThat(fizzBuzz.fizzBuzz(5)).isEqualTo(Arrays.asList("1", "2", "Fizz", "4", "Buzz"));
        assertThat(fizzBuzz.fizzBuzz(15)).isEqualTo(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
    }

    @Test
    void fizzBuzzShouldNotPassTheTest() {

        assertThat(fizzBuzz.fizzBuzz(3)).isNotEqualTo(Arrays.asList("1", "2", "3"));
        assertThat(fizzBuzz.fizzBuzz(5)).isNotEqualTo(Arrays.asList("1", "2", "Fizz", "4", "5"));
        assertThat(fizzBuzz.fizzBuzz(15)).isNotEqualTo(Arrays.asList("1", "2", "3", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "15"));
    }
}
