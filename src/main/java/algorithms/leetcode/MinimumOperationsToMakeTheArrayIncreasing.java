package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/">https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/</a>
 * @date 05.08.2023
 */
public class MinimumOperationsToMakeTheArrayIncreasing {

    public int minOperations(int[] nums) {
        int operations = 0;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (last >= nums[i]) {
                operations += last - nums[i] + 1;
                last++;
            } else {
                last = nums[i];
            }
        }
        return operations;
    }

}
