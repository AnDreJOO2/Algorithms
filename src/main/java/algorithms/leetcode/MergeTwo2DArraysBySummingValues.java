package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/">https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/</a>
 * @date 16.08.2023
 */
public class MergeTwo2DArraysBySummingValues {

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0;
        int j = 0;
        int size = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                i++;
                continue;
            }
            if (nums1[i][0] < nums2[j][0]) {
                size++;
                i++;
            } else {
                size++;
                j++;
            }
        }
        while (i < nums1.length) {
            size++;
            i++;
        }
        while (j < nums2.length) {
            size++;
            j++;
        }
        i = 0;
        j = 0;
        int k = 0;
        int[][] result = new int[size][2];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                result[k][0] = nums1[i][0];
                result[k][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
                k++;
                continue;
            }
            if (nums1[i][0] < nums2[j][0]) {
                result[k][0] = nums1[i][0];
                result[k][1] = nums1[i][1];
                i++;
            } else {
                result[k][0] = nums2[j][0];
                result[k][1] = nums2[j][1];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            result[k][0] = nums1[i][0];
            result[k][1] = nums1[i][1];
            i++;
            k++;
        }
        while (j < nums2.length) {
            result[k][0] = nums2[j][0];
            result[k][1] = nums2[j][1];
            j++;
            k++;
        }
        return result;
    }

}


