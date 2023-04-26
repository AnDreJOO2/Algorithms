package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-segments-in-a-string/">https://leetcode.com/problems/number-of-segments-in-a-string/</a>
 * @date 26.04.2023
 */
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int count = 0;
        int pointer = 0;
        while (pointer < s.length()) {
            while (pointer < s.length() && s.charAt(pointer) == ' ') {
                pointer++;
            }

            while (pointer < s.length() && s.charAt(pointer) != ' ') {
                pointer++;
            }
            if (s.charAt(pointer - 1) != ' ' && (pointer == s.length() || s.charAt(pointer) == ' ')) {
                count++;
            }
        }
        return count;
    }

}
