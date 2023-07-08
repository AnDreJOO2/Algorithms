package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/">https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/</a>
 * @date 08.07.2023
 */
public class GenerateAStringWithCharactersThatHaveOddCounts {

    public String generateTheString(int n) {
        char[] chars = new char[n];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = 'a';
        }
        if (n % 2 == 0) {
            chars[chars.length - 1] = 'b';
        }
        return String.valueOf(chars);
    }
}
