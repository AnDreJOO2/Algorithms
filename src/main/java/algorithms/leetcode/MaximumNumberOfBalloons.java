package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-number-of-balloons/">https://leetcode.com/problems/maximum-number-of-balloons/</a>
 * @date 17.05.2023
 */
public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] frequencies = new int[26];
        for (char ch : text.toCharArray()) {
            frequencies[ch - 'a']++;
        }
        return Math.min(Math.min(frequencies['b' - 'a'], frequencies['a' - 'a']),
                Math.min(Math.min(frequencies['l' - 'a'] / 2, frequencies['o' - 'a'] / 2), frequencies['n' - 'a']));
    }
}