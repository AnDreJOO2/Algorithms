package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/climbing-stairs/">https://leetcode.com/problems/climbing-stairs/</a>
 * @date 04.04.2023
 */
public class ClimbingStairs {
    public int climbStairsRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairsRecursion(n - 2) + climbStairsRecursion(n - 1);
    }

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n - 1];
    }
}
// fibonacci