package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/separate-the-digits-in-an-array/">https://leetcode.com/problems/separate-the-digits-in-an-array/</a>
 * @date 20.04.2023
 */
public class SeparateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        int[] digits = new int[sb.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sb.charAt(i) - '0';
        }
        return digits;
    }
}
