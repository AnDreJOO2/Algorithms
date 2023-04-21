package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/sort-array-by-parity/">https://leetcode.com/problems/sort-array-by-parity/</a>
 * @date 21.04.2023
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                swap(nums, position, i);
                position++;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int indexOne, int indexTwo) {
        int temp = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = temp;
    }
}
