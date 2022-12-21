package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/length-of-last-word/">https://leetcode.com/problems/length-of-last-word/</a>
 * @date 22.12.2022
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
