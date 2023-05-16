package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/">https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/</a>
 * @date 16.05.2023
 */
public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fourth = Integer.MIN_VALUE;
        while (num > 0) {
            if (num % 10 > first) {
                fourth = third;
                third = second;
                second = first;
                first = num % 10;
            } else if (num % 10 > second) {
                fourth = third;
                third = second;
                second = num % 10;
            } else if (num % 10 > third) {
                fourth = third;
                third = num % 10;
            } else {
                fourth = num % 10;
            }
            num /= 10;
        }
        return (10 * fourth + first) + (10 * third + second);
    }
}
