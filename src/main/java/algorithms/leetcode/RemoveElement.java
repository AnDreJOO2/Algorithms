package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/remove-element/description/">https://leetcode.com/problems/remove-element/description/</a>
 * @date 03.02.2023
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }

        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[size] = nums[i];
                size += 1;
            }
        }
        return size;
    }

}
