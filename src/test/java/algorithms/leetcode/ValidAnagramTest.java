package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    private ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {

        validAnagram = new ValidAnagram();
    }

    @Test
    void isAnagramShouldReturnTrue() {

        assertThat(validAnagram.isAnagram("anagram", "nagaram")).isTrue();
        assertThat(validAnagram.isAnagram("ab", "ba")).isTrue();
        assertThat(validAnagram.isAnagram("aab", "aba")).isTrue();
    }

    @Test
    void isAnagramShouldReturnFalse() {

        assertThat(validAnagram.isAnagram("aa", "bb")).isFalse();
        assertThat(validAnagram.isAnagram("abba", "abb")).isFalse();
        assertThat(validAnagram.isAnagram("rat", "cat")).isFalse();
    }
}
