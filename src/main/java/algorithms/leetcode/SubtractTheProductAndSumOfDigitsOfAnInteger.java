package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/</a>
 * @date 03.05.2023
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int multiply = 0;
        if (n > 0) {
            multiply = 1;
        }
        int sum = 0;

        while (n > 9) {
            multiply *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        multiply *= n;
        sum += n;
        return multiply - sum;
    }
}
