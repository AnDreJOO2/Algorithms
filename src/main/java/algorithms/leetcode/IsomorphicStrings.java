package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/isomorphic-strings/">https://leetcode.com/problems/isomorphic-strings/</a>
 * @date 04.05.2023
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sFrequency = new int[128];
        int[] tFrequency = new int[128];

        for (int i = 0; i < s.length(); i++) {
            if (sFrequency[s.charAt(i)] != tFrequency[t.charAt(i)]) {
                return false;
            }
            sFrequency[s.charAt(i)] = i + 1;
            tFrequency[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
