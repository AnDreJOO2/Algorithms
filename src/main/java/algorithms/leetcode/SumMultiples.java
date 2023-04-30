package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/sum-multiples/">https://leetcode.com/problems/sum-multiples/</a>
 * @date 30.04.2023
 */
public class SumMultiples {
    public int sumOfMultiples(int n) {
        int sum = 0;
        while (n > 0) {
            if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
                sum += n;
            }
            n--;
        }
        return sum;
    }
}
