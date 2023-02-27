package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/rotate-array/">https://leetcode.com/problems/rotate-array/</a>
 * @date 27.02.2023
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        rotateArray(nums, 0, nums.length - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, nums.length - 1);
    }

    private void rotateArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
