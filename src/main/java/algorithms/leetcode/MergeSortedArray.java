package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/merge-sorted-array/">https://leetcode.com/problems/merge-sorted-array/</a>
 * @date 05.02.2023
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = nums1.length - 1;
        while (0 < m && 0 < n) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                m -= 1;
            } else {
                nums1[i] = nums2[n - 1];
                n -= 1;
            }
            i -= 1;
        }
        // remains elements
        while (0 < m) {
            nums1[i] = nums1[m - 1];
            m -= 1;
            i -= 1;
        }
        while (0 < n) {
            nums1[i] = nums2[n - 1];
            n -= 1;
            i -= 1;
        }

    }

}
