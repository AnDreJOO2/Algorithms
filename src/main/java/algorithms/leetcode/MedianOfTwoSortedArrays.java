package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">https://leetcode.com/problems/median-of-two-sorted-arrays/</a>
 * @date 31.01.2023
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] sortedArray = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                sortedArray[k] = nums1[i];
                i++;
            } else {
                sortedArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        // rest of elements
        while (i < nums1.length) {
            sortedArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            sortedArray[k] = nums2[j];
            j++;
            k++;
        }

        if (sortedArray.length % 2 == 0) {
            return (double) (sortedArray[(sortedArray.length / 2) - 1] + sortedArray[sortedArray.length / 2]) / 2;
        } else {
            return sortedArray[sortedArray.length / 2];
        }

    }
}
