package algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/two-out-of-three/">https://leetcode.com/problems/two-out-of-three/</a>
 * @date 13.05.2023
 */
public class TwoOutOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> twoOutOfTree = new ArrayList<>();
        int[][] frequency = new int[3][100];
        for (int i = 0; i < nums1.length; i++) {
            if (frequency[0][nums1[i] - 1] == 0) {
                frequency[0][nums1[i] - 1]++;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (frequency[1][nums2[i] - 1] == 0) {
                frequency[1][nums2[i] - 1]++;
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            if (frequency[2][nums3[i] - 1] == 0) {
                frequency[2][nums3[i] - 1]++;
            }
        }
        for (int i = 0; i < frequency[0].length; i++) {
            if (frequency[0][i] + frequency[1][i] + frequency[2][i] > 1) {
                twoOutOfTree.add(i + 1);
            }
        }
        return twoOutOfTree;
    }
}
