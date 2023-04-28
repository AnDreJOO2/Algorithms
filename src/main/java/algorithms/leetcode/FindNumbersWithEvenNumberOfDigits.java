package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">https://leetcode.com/problems/find-numbers-with-even-number-of-digits/</a>
 * @date 28.04.2023
 */
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int occurrences = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] > 9) {
                count++;
                nums[i] /= 10;
            }
            count++;
            if (count % 2 == 0) {
                occurrences++;
            }
        }
        return occurrences;
    }
}
