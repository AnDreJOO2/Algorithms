package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/move-zeroes/">https://leetcode.com/problems/move-zeroes/</a>
 * @date 04.04.2023
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        if (nums == null) {
            return;
        }

        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[position] = nums[i];
                position++;
            }
        }
        for (int i = position; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroesTwo(int[] nums) {

        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, position, i);
                position++;
            }
        }
    }

    private void swap(int[] nums, int indexOne, int indexTwo) {
        int temp = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = temp;
    }

}
