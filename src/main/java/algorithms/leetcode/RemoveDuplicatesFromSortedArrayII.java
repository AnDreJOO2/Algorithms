package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/</a>
 * @date 23.04.2023
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {

        int size = 0;
        int position = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                size++;
            } else {
                size = 0;
            }
            if (size < 2) {
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
}
