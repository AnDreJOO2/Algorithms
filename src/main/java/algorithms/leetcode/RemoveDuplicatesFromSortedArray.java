package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">https://leetcode.com/problems/remove-duplicates-from-sorted-array/</a>
 * @date 02.02.2023
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int last_duplicated_index = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != nums[i + 1]) {
                last_duplicated_index += 1;
            }
            nums[last_duplicated_index] = nums[i + 1];
        }
        return last_duplicated_index + 1;

    }
}
