package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/">https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/</a>
 * @date 08.09.2023
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        boolean[] checked = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            checked[nums[i]] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!checked[i]) {
                numbers.add(i);
            }
        }
        return numbers;
    }

}
