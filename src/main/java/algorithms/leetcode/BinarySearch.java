package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/binary-search/">https://leetcode.com/problems/binary-search/</a>
 * @date 24.02.2023
 */
public class BinarySearch {

    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }

        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (nums[middleIndex] == target) {
                return middleIndex;
            }

            if (nums[middleIndex] < target) {
                startIndex = middleIndex + 1;
            }
            if (nums[middleIndex] > target) {
                endIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
