package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/is-subsequence/">https://leetcode.com/problems/is-subsequence/</a>
 * @date 24.03.2023
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        return sPointer == s.length();
    }
}

// TC: O(n), SC: O(1)
