package algorithms.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/mean-of-array-after-removing-some-elements/">https://leetcode.com/problems/mean-of-array-after-removing-some-elements/</a>
 * @date 18.04.2023
 */
public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int toCut = (int) (arr.length * 0.05);
        int sum = 0;
        for (int i = toCut; i < arr.length - toCut; i++) {
            sum += arr[i];
        }
        return (double) sum / (arr.length - (toCut * 2));
    }
}
