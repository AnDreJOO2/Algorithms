package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/find-the-pivot-integer/">https://leetcode.com/problems/find-the-pivot-integer/</a>
 * @date 21.05.2023
 */
public class FindThePivotInteger {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int leftSum = 1;
        int rightSum = n;
        n--;
        int i = 2;
        while (i < n) {
            if (leftSum < rightSum) {
                leftSum += i;
                i++;
            } else {
                rightSum += n;
                n--;
            }
        }
        return leftSum == rightSum ? i : -1;
    }
}
