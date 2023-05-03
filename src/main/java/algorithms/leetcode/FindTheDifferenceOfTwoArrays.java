package algorithms.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @link <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/">https://leetcode.com/problems/find-the-difference-of-two-arrays/</a>
 * @date 03.05.2023
 */
public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> differences = new ArrayList<>(2);
        Set<Integer> nums1Set = new HashSet<>(nums1.length);
        Set<Integer> nums2Set = new HashSet<>(nums2.length);
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2Set.add(nums2[i]);
        }

        List<Integer> tempList = new ArrayList<>();
        for (Integer number : nums1Set) {
            if (!nums2Set.contains(number)) {
                tempList.add(number);
            }
        }
        differences.add(tempList);

        tempList = new ArrayList<>();
        for (Integer number : nums2Set) {
            if (!nums1Set.contains(number)) {
                tempList.add(number);
            }
        }
        differences.add(tempList);
        return differences;
    }
}
