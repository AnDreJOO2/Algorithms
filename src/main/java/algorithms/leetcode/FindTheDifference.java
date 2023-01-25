package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/find-the-difference/">https://leetcode.com/problems/find-the-difference/</a>
 * @date 25.01.2023
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        return (char) (addAsciiChars(t) - addAsciiChars(s));
    }

    public int addAsciiChars(String text) {
        int value = 0;
        for (Character c : text.toCharArray()) {
            value += c;
        }
        return value;
    }
}
