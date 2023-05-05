package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/find-lucky-integer-in-an-array/">https://leetcode.com/problems/find-lucky-integer-in-an-array/</a>
 * @date 04.05.2023
 */
public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        int[] frequencies = new int[500];
        for (int i = 0; i < arr.length; i++) {
            frequencies[arr[i] - 1]++;
        }
        int max = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == i + 1) {
                max = Math.max(max, i + 1);
            }
        }
        return max == 0 ? -1 : max;
    }
}
