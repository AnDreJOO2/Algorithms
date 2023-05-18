package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/divide-array-into-equal-pairs/">https://leetcode.com/problems/divide-array-into-equal-pairs/</a>
 * @date 18.05.2023
 */
public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        int[] frequencies = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            frequencies[nums[i]]++;
        }
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
