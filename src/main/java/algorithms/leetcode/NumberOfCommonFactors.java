package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-common-factors/">https://leetcode.com/problems/number-of-common-factors/</a>
 * @date 30.04.2023
 */
public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int count = 0;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int i = 1;
        while (i <= b) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
