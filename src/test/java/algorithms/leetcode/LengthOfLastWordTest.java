package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthOfLastWordTest {

    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void setUp() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void lengthOfLastWordShouldPassTheTest() {

        assertThat(lengthOfLastWord.lengthOfLastWord("Hello World")).isEqualTo(5);
        assertThat(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
        assertThat(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
    }
}
