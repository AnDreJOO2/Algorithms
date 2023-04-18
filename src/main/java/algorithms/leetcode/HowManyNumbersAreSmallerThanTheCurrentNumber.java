package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/</a>
 * @date 18.04.2023
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    array[i]++;
                }
            }
        }
        return array;
    }
}
// brute force