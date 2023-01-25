package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheDifferenceTest {

    private FindTheDifference findTheDifference;

    @BeforeEach
    void setUp() {
        findTheDifference = new FindTheDifference();
    }

    @Test
    void findTheDifferenceShouldPassTheTest() {

        assertThat(findTheDifference.findTheDifference("abcd", "abcde")).isEqualTo('e');
        assertThat(findTheDifference.findTheDifference("", "y")).isEqualTo('y');
    }

    @Test
    void findTheDifferenceShouldNotPassTheTest() {

        assertThat(findTheDifference.findTheDifference("abcde", "abcde")).isNotEqualTo('e');
        assertThat(findTheDifference.findTheDifference("asd", "asde")).isNotEqualTo('d');
    }
}
