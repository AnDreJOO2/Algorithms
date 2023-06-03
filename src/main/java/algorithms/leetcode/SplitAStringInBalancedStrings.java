package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/left-and-right-sum-differences/">https://leetcode.com/problems/left-and-right-sum-differences/</a>
 * @date 03.06.2023
 */
public class SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {

        int count = 0;
        int countL = 0;
        int countR = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'R') {
                countR++;
            } else {
                countL++;
            }

            if (countL == countR) {
                count++;
            }
        }
        return count;
    }
}
