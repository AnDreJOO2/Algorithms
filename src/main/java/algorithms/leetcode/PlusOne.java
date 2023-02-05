package algorithms.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/plus-one/">https://leetcode.com/problems/plus-one/</a>
 * @date 05.02.2023
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] extendedArray = new int[digits.length + 1];
        extendedArray[0] = 1;
        return extendedArray;
    }

}
