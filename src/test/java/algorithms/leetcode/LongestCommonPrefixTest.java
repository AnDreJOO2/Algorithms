package algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefixOne_should_pass_the_test() {
        assertThat(longestCommonPrefix.longestCommonPrefixOne(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
        assertThat(longestCommonPrefix.longestCommonPrefixOne(new String[]{"dog", "racecar", "car"})).isEqualTo("");
        assertThat(longestCommonPrefix.longestCommonPrefixOne(new String[]{"ab", "a"})).isEqualTo("a");
    }

    @Test
    void longestCommonPrefixTwo_should_pass_the_test() {
        assertThat(longestCommonPrefix.longestCommonPrefixTwo(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
        assertThat(longestCommonPrefix.longestCommonPrefixTwo(new String[]{"dog", "racecar", "car"})).isEqualTo("");
        assertThat(longestCommonPrefix.longestCommonPrefixTwo(new String[]{"ab", "a"})).isEqualTo("a");
    }
}
