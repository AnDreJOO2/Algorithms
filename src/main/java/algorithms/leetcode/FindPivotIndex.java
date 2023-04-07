package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/find-pivot-index/">https://leetcode.com/problems/find-pivot-index/</a>
 * @date 07.04.2022
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftHalf = 0;
        for (int n : nums) {
            sum += n;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftHalf * 2 == sum - nums[i]) {
                return i;
            }
            leftHalf += nums[i];
        }
        return -1;
    }
}
