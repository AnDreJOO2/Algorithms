package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/subsets/">https://leetcode.com/problems/subsets/</a>
 * @date 02.05.2023
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(subsets, nums, new ArrayList<>(), 0);
        return subsets;
    }

    private void backtrack(List<List<Integer>> subsets, int[] nums, List<Integer> currentSubset, int start) {
        subsets.add(new ArrayList<>(currentSubset));
        for (int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            backtrack(subsets, nums, currentSubset, i + 1);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

}
