package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/">https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/</a>
 * @date 21.05.2023
 */
public class AverageValueOfEvenNumbersThatAreDivisibleByThree {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 && nums[i] % 2 == 0) {
                sum += nums[i];
                count++;
            }
        }
        if (count == 0) {
            count += 1;
        }
        return sum / count;
    }

}
