package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/combination-sum-iii/">https://leetcode.com/problems/combination-sum-iii/</a>
 * @date 23.03.2023
 */
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtracking(k, n, 0, result, combination);
        return result;
    }

    private void backtracking(int k, int n, int start, List<List<Integer>> result, List<Integer> combination) {
        if (n == 0 && combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        } else if (n < 0 && combination.size() == k) {
            return;
        }
        for (int i = start; i < 9; i++) {
            combination.add(i + 1);
            backtracking(k, n - i - 1, i + 1, result, combination);
            combination.remove(combination.size() - 1);
        }
    }
}
