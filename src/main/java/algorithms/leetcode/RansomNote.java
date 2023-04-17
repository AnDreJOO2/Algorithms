package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/ransom-note/">https://leetcode.com/problems/ransom-note/</a>
 * @date 18.04.2023
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        char[] chars = new char[128];
        for (char ch : magazine.toCharArray()) {
            chars[ch]++;
        }
        for (char ch : ransomNote.toCharArray()) {
            if (chars[ch] == 0) {
                return false;
            } else {
                chars[ch]--;
            }
        }
        return true;
    }
}
