package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/valid-perfect-square/">https://leetcode.com/problems/valid-perfect-square/</a>
 * @date 09.04.2023
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long start = 2;
        long end = num / 2;
        while (start <= end) {
            long middle = start + (end - start) / 2;
            if (middle * middle == num) {
                return true;
            } else if (middle * middle > num) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return false;
    }
}
// binary search solution
