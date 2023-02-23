package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/summary-ranges/">https://leetcode.com/problems/summary-ranges/</a>
 * @date 23.02.2023
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> ranges = new ArrayList<>();
        if (nums.length == 0) {
            return ranges;
        }
        if (nums.length == 1) {
            ranges.add(String.valueOf(nums[0]));
            return ranges;
        }

        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == end) {
                end = nums[i];
                continue;
            }
            if (start == end) {
                ranges.add(String.valueOf(start));
            } else {
                ranges.add(start + "->" + end);
            }
            start = nums[i];
            end = nums[i];

        }
        if (start == end) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "->" + end);
        }
        return ranges;
    }

    public List<String> summaryRangesTwo(int[] nums) {

        List<String> ranges = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ranges;
        }

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
        }

        return ranges;

    }

}
