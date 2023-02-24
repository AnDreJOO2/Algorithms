package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ToLowerCaseTest {

    private ToLowerCase toLowerCase;

    @BeforeEach
    void setUp() {
        toLowerCase = new ToLowerCase();
    }

    @Test
    void shouldReturnStringWithLowerCase() {
        //given
        String input = "Hello";
        String expected = "hello";
        // when
        String result = toLowerCase.toLowerCase(input);
        // then
        assertThat(result).isEqualTo(expected);

    }
}
