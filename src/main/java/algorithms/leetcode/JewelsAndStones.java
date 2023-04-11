package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/jewels-and-stones/">https://leetcode.com/problems/jewels-and-stones/</a>
 * @date 11.04.2023
 */
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        char[] j_chars = new char[128];
        for (char ch : jewels.toCharArray()) {
            j_chars[ch]++;
        }
        int value = 0;
        for (char ch : stones.toCharArray()) {
            if (j_chars[ch] > 0) {
                value++;
            }
        }
        return value;
    }
}
