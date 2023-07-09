package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/">https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/</a>
 * @date 09.07.2023
 */
public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentMax = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                currentMax++;
            } else if (ch == ')') {
                maxDepth = Math.max(maxDepth, currentMax);
                currentMax--;
            }
        }
        return maxDepth;
    }
}
