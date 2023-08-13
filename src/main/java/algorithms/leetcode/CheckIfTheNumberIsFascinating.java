package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/check-if-the-number-is-fascinating/">https://leetcode.com/problems/check-if-the-number-is-fascinating/</a>
 * @date 13.08.2023
 */
public class CheckIfTheNumberIsFascinating {
    public boolean isFascinating(int n) {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};

        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(n * 2);
        sb.append(n * 3);
        for (char ch : sb.toString().toCharArray()) {
            if (ch == '0' || nums[ch - '1']-- == 0) {
                return false;
            }

        }
        return true;
    }

}

