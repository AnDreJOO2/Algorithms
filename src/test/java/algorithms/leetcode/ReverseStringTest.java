package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTest {

    private ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    void reverseStringShouldReverseTheString() {
        char[] beforeArray1 = {'h', 'e', 'l', 'l', 'o'};
        char[] afterArray1 = {'o', 'l', 'l', 'e', 'h'};
        reverseString.reverseString(beforeArray1);
        assertThat(beforeArray1).startsWith(afterArray1);

        char[] beforeArray2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] afterArray2 = {'h', 'a', 'n', 'n', 'a', 'H'};
        reverseString.reverseString(beforeArray2);
        assertThat(beforeArray2).startsWith(afterArray2);

    }
}
