package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/">https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/</a>
 * @date 06.06.2023
 */
public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != difference) {
                return false;
            }
        }
        return true;
    }
}
