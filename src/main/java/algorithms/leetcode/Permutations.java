package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/permutations/">https://leetcode.com/problems/permutations/</a>
 * @date 07.04.2023
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(permutations, nums, 0);
        return permutations;
    }

    private void backtrack(List<List<Integer>> permutations, int[] nums, int index) {
        if (index == nums.length - 1) {
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                tempList.add(nums[i]);
            }
            permutations.add(tempList);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            backtrack(permutations, nums, index + 1);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int indexOne, int indexTwo) {
        int temp = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = temp;
    }

}
